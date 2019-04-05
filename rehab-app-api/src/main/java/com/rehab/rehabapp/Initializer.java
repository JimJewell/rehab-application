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
		Survey survey2 = new Survey("Second Survey");
		Survey survey3 = new Survey("Upper Extremity Assessment");
		Survey survey4 = surveyRepo.save(new Survey("Low Back Pain Assessment"));
		
		Question question1 = new Question("Your usual work, housework, or school activites", survey1);
		Question question2 = new Question("Your usual hobbies, sports, or recreational activities", survey1);
		Question question3 = new Question("Getting into or out of shower", survey1);
		Question question4 = new Question("Walking between rooms", survey1);
		Question question5 = new Question("Putting on shoes", survey1);
		
		
		Question question6 = new Question("Your usual work, housework, or school activites", survey2);
		Question question7 = new Question("Your usual hobbies, sports, or recreational activities", survey2);
		Question question8 = new Question("Getting into or out of shower", survey2);
		Question question9 = new Question("Walking between rooms", survey2);
		Question question10 = new Question("Putting on shoes", survey2);
		
		// Upper Extremity Assessment //
		Question question11 = new Question("Open a tight or new jar", survey3);
		Question question12 = new Question("Do heavy household chores (e.g., wash walls, floors)", survey3);
		Question question13 = new Question("Carry a shopping bag or briefcase", survey3);
		Question question14 = new Question("Wash your back", survey3);
		Question question15 = new Question("Use a knife to cut food", survey3);
		Question question16 = new Question("Recreational activities in which you take force or impact through your arm, shoulder or hand(e.g., golf, hammering, tennis.etc)", survey3);
		Question question17 = new Question("Extend your arm, shoulder or hand problem interfered with your nomral social activities with family, friends, neighbors, etc?", survey3);
		Question question18 = new Question("Limitations in your work or other regular daily activities as a resultof your arm, shoulder or hand problem?", survey3);
		Question question19 = new Question("Severity of arm, shoudler or hand pain?", survey3);
		Question question20 = new Question("Presence of tingling (pins and needles) in your arm, shoulder or hand", survey3);
		Question question21 = new Question("Difficulty you've had sleeping because of your pain in your arm, shoulder or hand?", survey3);
		Question question22 = new Question("Using your usual technique for your work", survey3);
		Question question23 = new Question("Doing your usual work because of arm, shoulder or hand pain", survey3);
		Question question24 = new Question("Spending your usual amount of time doing your work", survey3);
		Question question25 = new Question("Using your usual technique for playing", survey3);
		Question question26 = new Question("Playing because of arm, shoulder or hand pain", survey3);
		Question question27 = new Question("Playing as well as you would like", survey3);
		Question question28 = new Question("Spending your usual amount of time practicing or playing", survey3);
		
		// Low Back Pain Assessment //
		Question question29 = questionRepo.save(new Question("Pain Intensity", survey4));
		Question question30 = questionRepo.save(new Question("Washing and Dressing", survey4));
		Question question31 = questionRepo.save(new Question("Lifting", survey4));
		Question question32 = questionRepo.save(new Question("Walking", survey4));
		
		
		surveyRepo.save(survey1);
		surveyRepo.save(survey2);
		surveyRepo.save(survey3);
	
		
		
		questionRepo.save(question1); 
		questionRepo.save(question2);
		questionRepo.save(question3);
		questionRepo.save(question4);
		questionRepo.save(question5);
		questionRepo.save(question6); 
		questionRepo.save(question7);
		questionRepo.save(question8);
		questionRepo.save(question9);
		questionRepo.save(question10);
		questionRepo.save(question11);
		questionRepo.save(question12);
		questionRepo.save(question13);
		questionRepo.save(question14);
		questionRepo.save(question15);
		questionRepo.save(question16);
		questionRepo.save(question17);
		questionRepo.save(question18);
		questionRepo.save(question19);
		questionRepo.save(question20);
		questionRepo.save(question21);
		questionRepo.save(question22);
		questionRepo.save(question23);
		questionRepo.save(question24);
		questionRepo.save(question25);
		questionRepo.save(question26);
		questionRepo.save(question27);
		questionRepo.save(question28);
		
	
		
		
	}
}
