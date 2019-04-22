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

import com.rehab.rehabapp.models.SubmittedSurvey;
import com.rehab.rehabapp.repositories.SubmittedSurveyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class SubSurveyRepoTest {

	@Resource
	private TestEntityManager entityManager;
	@Resource
	private SubmittedSurveyRepository surveyRepo;
	
	@Test
	public void shouldFindByCauseName() {
		SubmittedSurvey survey = surveyRepo.save(new SubmittedSurvey("survey", null, null));
		Long surveyId = survey.getId();
		
		entityManager.persist(survey);
		entityManager.flush();
		entityManager.clear();
		
		Optional<SubmittedSurvey> surveyToFind = surveyRepo.findById(surveyIdids);
		SubmittedSurvey surveyFromDatabase = surveyRepo.findByName("survey");
		assertThat(surveyFromDatabase.getName(), is("question"));
	}
	
}
