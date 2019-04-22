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

import com.rehab.rehabapp.models.AnswerChoice;
import com.rehab.rehabapp.repositories.AnswerChoicesRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class AnswerRepoTest {

	@Resource
	private TestEntityManager entityManager;
	@Resource
	private AnswerChoicesRepository answerRepo;
	
	@Test
	public void shouldFindByCauseName() {
		AnswerChoice answerChoice = answerRepo.save(new AnswerChoice("answerChoice", 0));
		Long answerChoiceId = answerChoice.getId();
		
		entityManager.persist(answerChoice);
		entityManager.flush();
		entityManager.clear();
		
		Optional<AnswerChoice> answerToFind = answerRepo.findById(answerChoiceId);
		AnswerChoice answerFromDatabase = answerRepo.findByAnswerChoice("answerChoice");
		assertThat(answerFromDatabase.getAnswerChoice(), is("answerChoice"));
	}
	
}
