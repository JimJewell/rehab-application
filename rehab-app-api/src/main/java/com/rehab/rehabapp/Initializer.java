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
		Survey surveyLower = new Survey("Lower Extremity Assessment");
		Survey surveyPhysical = new Survey("Physical Function Assessment");
		Survey surveyNeck = new Survey("Neck Assessment");
		
		Question lowerQuestion1 = new Question("Your usual work, housework, or school activites?", surveyLower);
		Question lowerQuestion2 = new Question("Your usual hobbies, sports, or recreational activities?", surveyLower);
		Question lowerQuestion3 = new Question("Getting into or out of bath?", surveyLower);
		Question lowerQuestion4 = new Question("Walking between rooms?", surveyLower);
		Question lowerQuestion5 = new Question("Putting on shoes or socks?", surveyLower);
		Question lowerQuestion6 = new Question("Squating?", surveyLower);
		Question lowerQuestion7 = new Question("Lifting an object, like a bag of groceries from the floor?", surveyLower);
		Question lowerQuestion8 = new Question("Performing light activities around your home?", surveyLower);
		Question lowerQuestion9 = new Question("Performing heavy activities around your home?", surveyLower);
		Question lowerQuestion10= new Question("Getting into or out of a car?", surveyLower);
		Question lowerQuestion11 = new Question("Walking 2 blocks?", surveyLower);
		Question lowerQuestion12 = new Question("Walking a mile?", surveyLower);
		Question lowerQuestion13 = new Question("Going up or down 10 stairs (about 1 flight of stairs)?", surveyLower);
		Question lowerQuestion14 = new Question("Standing for 1 hour?", surveyLower);
		Question lowerQuestion15 = new Question("Sitting for 1 hour?", surveyLower);
		Question lowerQuestion16 = new Question("Running on even ground?", surveyLower);
		Question lowerQuestion17 = new Question("Running on uneven ground?", surveyLower);
		Question lowerQuestion18 = new Question("Making sharp turns while running fast?", surveyLower);
		Question lowerQuestion19 = new Question("Hopping?", surveyLower);
		Question lowerQuestion20 = new Question("Rolling over in bed?", surveyLower);
		
		Question neckQuestion1 = new Question("Pain Intensity?", surveyNeck);
		Question neckQuestion2 = new Question("Personal Care?", surveyNeck);
		Question neckQuestion3 = new Question("Lifting?", surveyNeck);
		Question neckQuestion4 = new Question("Reading?", surveyNeck);
		Question neckQuestion5 = new Question("Headaches?", surveyNeck);
		Question neckQuestion6 = new Question("Concentration?", surveyNeck);
		Question neckQuestion7 = new Question("Work?", surveyNeck);
		Question neckQuestion8 = new Question("Driving?", surveyNeck);
		Question neckQuestion9 = new Question("Sleeping?", surveyNeck);
		Question neckQuestion10 = new Question("Recreation?", surveyNeck);
		
		Question physcialQuestion1 = new Question("Do chores such as vacuuming or yard work?", surveyPhysical);
		Question physcialQuestion2 = new Question("Go up and down stairs at a normal pace?", surveyPhysical);
		Question physcialQuestion3 = new Question("Walk for at least 15 minutes?", surveyPhysical);
		Question physcialQuestion4 = new Question("Run errands and shop?", surveyPhysical);
		Question physcialQuestion5 = new Question("Doing two hours of physical labor?", surveyPhysical);
		Question physcialQuestion6 = new Question("Doing moderate work around the house like vacuuming or sweeping floors?", surveyPhysical);
		Question physcialQuestion7 = new Question("Lifting or carrying groceries?", surveyPhysical);
		Question physcialQuestion8 = new Question("Heavy work around the house like scrubbing floors, or lifting or moving heavy furniture?", surveyPhysical);
		
		surveyRepo.save(surveyLower);
		surveyRepo.save(surveyNeck);
		surveyRepo.save(surveyPhysical);
		
		questionRepo.save(lowerQuestion1); 
		questionRepo.save(lowerQuestion2);
		questionRepo.save(lowerQuestion3);
		questionRepo.save(lowerQuestion4);
		questionRepo.save(lowerQuestion5);
		questionRepo.save(lowerQuestion6); 
		questionRepo.save(lowerQuestion7);
		questionRepo.save(lowerQuestion8);
		questionRepo.save(lowerQuestion9);
		questionRepo.save(lowerQuestion10);
		questionRepo.save(lowerQuestion11);
		questionRepo.save(lowerQuestion12);
		questionRepo.save(lowerQuestion13);
		questionRepo.save(lowerQuestion14);
		questionRepo.save(lowerQuestion15);
		questionRepo.save(lowerQuestion16);
		questionRepo.save(lowerQuestion17);
		questionRepo.save(lowerQuestion18);
		questionRepo.save(lowerQuestion19);
		questionRepo.save(lowerQuestion20);
		
		questionRepo.save(neckQuestion1);
		questionRepo.save(neckQuestion2);
		questionRepo.save(neckQuestion3);
		questionRepo.save(neckQuestion4);
		questionRepo.save(neckQuestion5);
		questionRepo.save(neckQuestion6); 
		questionRepo.save(neckQuestion7); 
		questionRepo.save(neckQuestion8); 
		questionRepo.save(neckQuestion9); 
		questionRepo.save(neckQuestion10); 
		
		questionRepo.save(physcialQuestion1); 
		questionRepo.save(physcialQuestion2);
		questionRepo.save(physcialQuestion3);
		questionRepo.save(physcialQuestion4);
		questionRepo.save(physcialQuestion5);
		questionRepo.save(physcialQuestion6); 
		questionRepo.save(physcialQuestion7);
		questionRepo.save(physcialQuestionn8);
	}
}
