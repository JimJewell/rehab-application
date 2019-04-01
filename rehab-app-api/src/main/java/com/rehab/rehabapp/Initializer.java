package com.rehab.rehabapp;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.collectionmasteryapi.models.Actress;
import org.wecancodeit.collectionmasteryapi.models.Clip;
import org.wecancodeit.collectionmasteryapi.models.Movie;
import org.wecancodeit.collectionmasteryapi.models.Rating;
import org.wecancodeit.collectionmasteryapi.models.Tag;
import org.wecancodeit.collectionmasteryapi.repositories.ActressRepository;
import org.wecancodeit.collectionmasteryapi.repositories.ClipRepository;
import org.wecancodeit.collectionmasteryapi.repositories.MovieRepository;
import org.wecancodeit.collectionmasteryapi.repositories.TagRepository;

import com.rehab.rehabapp.models.Question;
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
		Question question1 = new Question("Your usual work, housework, or school activites");
		Question question2 = new Question("Your usual hobbies, sports, or recreational activities");
		Question question3 = new Question("Getting into or out of shower");
		Question question4 = new Question("Walking between rooms");
		Question question5 = new Question("Putting on shoes");
		
		questionRepo.save(question1); 
		questionRepo.save(question2);
		questionRepo.save(question3);
		questionRepo.save(question4);
		questionRepo.save(question5);
	}
}
