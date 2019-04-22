package com.rehab.rehabapp;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rehab.rehabapp.models.SubmittedQuestion;
import com.rehab.rehabapp.models.Survey;
import com.rehab.rehabapp.repositories.SubmittedQuestionRepository;
import com.rehab.rehabapp.repositories.SurveyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class QuestionRepoTest {

	@Resource
	private TestEntityManager entityManager;
	@Resource
	private SubmittedQuestionRepository questionRepo;
	
	@Test
	public void shouldFindByCauseName() {
		SubmittedQuestion question = questionRepo.save(new SubmittedQuestion("question"));
		Long questionId = question.getId();
		
		entityManager.persist(question);
		entityManager.flush();
		entityManager.clear();
		
		Optional<SubmittedQuestion> questionToFind = questionRepo.findById(questionId);
		SubmittedQuestion questionFromDatabase = questionRepo.findByName("question");
		assertThat(questionFromDatabase.getName(), is("question"));
	}
	
}
