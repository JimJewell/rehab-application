package com.rehab.rehabapp;



import java.util.Arrays;
import java.util.List;

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
		
		 List<String> answerChoices1 = Arrays.asList(new String [] {"Extreme difficulty or unable to perform activity (0 points)", "Quite a bit of difficulty (1 point)","Moderate difficulty (2 point)","A little bit of difficulty (3 point)","No difficulty (4 point)"} ); 
		 List<String> answerChoices2 = answerChoices1;
		 List<String> answerChoices3 = answerChoices1;
		 List<String> answerChoices4 = answerChoices1;
		 List<String> answerChoices5 = answerChoices1;
		 
     

		
		Survey surveyLower = new Survey("Lower Extremity Assessment");
		Survey surveyPhysical = new Survey("Physical Function Assessment");
		Survey surveyNeck = new Survey("Neck Assessment");
		Survey survey3 = new Survey("Upper Extremity Assessment");
        Survey survey4 = surveyRepo.save(new Survey("Low Back Pain Assessment"));
		
		Question lowerQuestion1 = new Question("Your usual work, housework, or school activites?", surveyLower, answerChoices1);
		Question lowerQuestion2 = new Question("Your usual hobbies, sports, or recreational activities?", surveyLower, answerChoices1);
		Question lowerQuestion3 = new Question("Getting into or out of bath?", surveyLower, answerChoices1);
		Question lowerQuestion4 = new Question("Walking between rooms?", surveyLower, answerChoices1);
		Question lowerQuestion5 = new Question("Putting on shoes or socks?", surveyLower, answerChoices1);
		Question lowerQuestion6 = new Question("Squating?", surveyLower, answerChoices1);
		Question lowerQuestion7 = new Question("Lifting an object, like a bag of groceries from the floor?", surveyLower, answerChoices1);
		Question lowerQuestion8 = new Question("Performing light activities around your home?", surveyLower, answerChoices1);
		Question lowerQuestion9 = new Question("Performing heavy activities around your home?", surveyLower, answerChoices1);
		Question lowerQuestion10= new Question("Getting into or out of a car?", surveyLower, answerChoices1);
		Question lowerQuestion11 = new Question("Walking 2 blocks?", surveyLower, answerChoices1);
		Question lowerQuestion12 = new Question("Walking a mile?", surveyLower, answerChoices1);
		Question lowerQuestion13 = new Question("Going up or down 10 stairs (about 1 flight of stairs)?", surveyLower, answerChoices1);
		Question lowerQuestion14 = new Question("Standing for 1 hour?", surveyLower, answerChoices1);
		Question lowerQuestion15 = new Question("Sitting for 1 hour?", surveyLower, answerChoices1);
		Question lowerQuestion16 = new Question("Running on even ground?", surveyLower, answerChoices1);
		Question lowerQuestion17 = new Question("Running on uneven ground?", surveyLower, answerChoices1);
		Question lowerQuestion18 = new Question("Making sharp turns while running fast?", surveyLower, answerChoices1);
		Question lowerQuestion19 = new Question("Hopping?", surveyLower, answerChoices1);
		Question lowerQuestion20 = new Question("Rolling over in bed?", surveyLower, answerChoices1);
		
		Question neckQuestion1 = new Question("Pain Intensity?", surveyNeck, answerChoices2);
		Question neckQuestion2 = new Question("Personal Care?", surveyNeck, answerChoices2);
		Question neckQuestion3 = new Question("Lifting?", surveyNeck, answerChoices2);
		Question neckQuestion4 = new Question("Reading?", surveyNeck, answerChoices2);
		Question neckQuestion5 = new Question("Headaches?", surveyNeck, answerChoices2);
		Question neckQuestion6 = new Question("Concentration?", surveyNeck, answerChoices2);
		Question neckQuestion7 = new Question("Work?", surveyNeck, answerChoices2);
		Question neckQuestion8 = new Question("Driving?", surveyNeck, answerChoices2);
		Question neckQuestion9 = new Question("Sleeping?", surveyNeck, answerChoices2);
		Question neckQuestion10 = new Question("Recreation?", surveyNeck, answerChoices2);
		
		Question physcialQuestion1 = new Question("Do chores such as vacuuming or yard work?", surveyPhysical, answerChoices3);
		Question physcialQuestion2 = new Question("Go up and down stairs at a normal pace?", surveyPhysical, answerChoices3);
		Question physcialQuestion3 = new Question("Walk for at least 15 minutes?", surveyPhysical, answerChoices3);
		Question physcialQuestion4 = new Question("Run errands and shop?", surveyPhysical, answerChoices3);
		Question physcialQuestion5 = new Question("Doing two hours of physical labor?", surveyPhysical, answerChoices3);
		Question physcialQuestion6 = new Question("Doing moderate work around the house like vacuuming or sweeping floors?", surveyPhysical, answerChoices3);
		Question physcialQuestion7 = new Question("Lifting or carrying groceries?", surveyPhysical, answerChoices3);
		Question physcialQuestion8 = new Question("Heavy work around the house like scrubbing floors, or lifting or moving heavy furniture?", surveyPhysical, answerChoices3);
		
		// Upper Extremity Assessment //
        Question question11 = new Question("Open a tight or new jar", survey3, answerChoices4);
        Question question12 = new Question("Do heavy household chores (e.g., wash walls, floors)", survey3, answerChoices4);
        Question question13 = new Question("Carry a shopping bag or briefcase", survey3, answerChoices4);
        Question question14 = new Question("Wash your back", survey3, answerChoices4);
        Question question15 = new Question("Use a knife to cut food", survey3, answerChoices4);
        Question question16 = new Question("Recreational activities in which you take force or impact through your arm, shoulder or hand(e.g., golf, hammering, tennis.etc)", survey3, answerChoices4);
        Question question17 = new Question("Extend your arm, shoulder or hand problem interfered with your nomral social activities with family, friends, neighbors, etc?", survey3, answerChoices4);
        Question question18 = new Question("Limitations in your work or other regular daily activities as a resultof your arm, shoulder or hand problem?", survey3, answerChoices4);
        Question question19 = new Question("Severity of arm, shoudler or hand pain?", survey3, answerChoices4);
        Question question20 = new Question("Presence of tingling (pins and needles) in your arm, shoulder or hand", survey3, answerChoices4);
        Question question21 = new Question("Difficulty you've had sleeping because of your pain in your arm, shoulder or hand?", survey3, answerChoices4);
        Question question22 = new Question("Using your usual technique for your work", survey3, answerChoices4);
        Question question23 = new Question("Doing your usual work because of arm, shoulder or hand pain", survey3, answerChoices4);
        Question question24 = new Question("Spending your usual amount of time doing your work", survey3, answerChoices4);
        Question question25 = new Question("Using your usual technique for playing", survey3, answerChoices4);
        Question question26 = new Question("Playing because of arm, shoulder or hand pain", survey3, answerChoices4);
        Question question27 = new Question("Playing as well as you would like", survey3, answerChoices4);
        Question question28 = new Question("Spending your usual amount of time practicing or playing", survey3, answerChoices4);
        
        // Low Back Pain Assessment //
        Question question29 = questionRepo.save(new Question("Pain Intensity", survey4, answerChoices5));
        Question question30 = questionRepo.save(new Question("Washing and Dressing", survey4, answerChoices5));
        Question question31 = questionRepo.save(new Question("Lifting", survey4, answerChoices5));
        Question question32 = questionRepo.save(new Question("Walking", survey4, answerChoices5));
        Question question33 = questionRepo.save(new Question("Sitting", survey4, answerChoices5));
        Question question34 = questionRepo.save(new Question("Standing", survey4, answerChoices5));
        Question question35 = questionRepo.save(new Question("Sleeping", survey4, answerChoices5));
        Question question36 = questionRepo.save(new Question("Social Life", survey4, answerChoices5));
        Question question37 = questionRepo.save(new Question("Traveling", survey4, answerChoices5));
        Question question38 = questionRepo.save(new Question("Employment/Homemaking", survey4, answerChoices5));

		
		surveyRepo.save(surveyLower);
		surveyRepo.save(surveyNeck);
		surveyRepo.save(surveyPhysical);
		surveyRepo.save(survey3);
		
		
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
		questionRepo.save(physcialQuestion8);
		
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
