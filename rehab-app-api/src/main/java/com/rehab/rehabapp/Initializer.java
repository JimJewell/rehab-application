package com.rehab.rehabapp;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.rehab.rehabapp.models.Question;
import com.rehab.rehabapp.models.Survey;
import com.rehab.rehabapp.repositories.QuestionRepository;
import com.rehab.rehabapp.repositories.SurveyRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	QuestionRepository questionRepo;
	
	@Resource
	SurveyRepository surveyRepo;

	@Override
	public void run(String... args) throws Exception {
		Survey survey1 = new Survey("Initial Survey");
		
		Question question1 = new Question("Your usual work, housework, or school activites", survey1);
		Question question2 = new Question("Your usual hobbies, sports, or recreational activities", survey1);
		Question question3 = new Question("Getting into or out of shower", survey1);
		Question question4 = new Question("Walking between rooms", survey1);
		Question question5 = new Question("Putting on shoes", survey1);
		
		surveyRepo.save(survey1);
		
		questionRepo.save(question1); 
		questionRepo.save(question2);
		questionRepo.save(question3);
		questionRepo.save(question4);
		questionRepo.save(question5);
	}
}
