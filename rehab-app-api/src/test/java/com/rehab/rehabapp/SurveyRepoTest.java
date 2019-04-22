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

import com.rehab.rehabapp.models.Survey;
import com.rehab.rehabapp.repositories.SurveyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class SurveyRepoTest {

	@Resource
	private TestEntityManager entityManager;
	@Resource
	private SurveyRepository surveyRepo;
	
	@Test
	public void shouldFindByCauseName() {
		Survey survey = surveyRepo.save(new Survey("child welfare", ""));
		Long surveyId = survey.getId();
		
		entityManager.persist(survey );
		entityManager.flush();
		entityManager.clear();
		
		Optional<Survey> causeToFind = surveyRepo.findById(surveyId);
		Survey surveyFromDatabase = surveyRepo.findByName("child welfare");
		assertThat(surveyFromDatabase.getName(), is("child welfare"));
	}
	
}