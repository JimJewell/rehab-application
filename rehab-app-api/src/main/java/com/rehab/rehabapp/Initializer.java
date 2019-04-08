package com.rehab.rehabapp;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.rehab.rehabapp.models.AnswerChoice;
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
		// Lower Extremity Assessment Answers // 
		AnswerChoice answerChoicesLowerExtremity1 = new AnswerChoice ("Extreme difficulty or unable to perform activity (0 points)", 0 );
		AnswerChoice answerChoicesLowerExtremity2 = new AnswerChoice ("Quite a bit of difficulty (1 point)", 1);	 
		AnswerChoice answerChoicesLowerExtremity3 = new AnswerChoice ("Moderate difficulty (2 point)", 2);
		AnswerChoice answerChoicesLowerExtremity4 = new AnswerChoice ("A little bit of difficulty (3 point)", 3);
		AnswerChoice answerChoicesLowerExtremity5 = new AnswerChoice ("No difficulty (4 point)", 4); 
		
		// Physical Function Assessment Answers // 
		AnswerChoice answerChoicesPhysicalFunction1 = new AnswerChoice ("No difficulty", 4);
		AnswerChoice answerChoicesPhysicalFunction2 = new AnswerChoice ("Mild difficulty", 3);
		AnswerChoice answerChoicesPhysicalFunction3 = new AnswerChoice ("Moderate difficulty", 2);
		AnswerChoice answerChoicesPhysicalFunction4 = new AnswerChoice ("Severe difficulty", 1);
		AnswerChoice answerChoicesPhysicalFunction5 = new AnswerChoice ("Unable", 0);
		
		// Neck Assessment Answers // 
		AnswerChoice answerChoiceNeckAssessmentPain1 = new AnswerChoice ("I have no pain at the moment", 5);
		AnswerChoice answerChoiceNeckAssessmentPain2 = new AnswerChoice ("The pain is very mild at the moment", 4);
		AnswerChoice answerChoiceNeckAssessmentPain3 = new AnswerChoice ("The pain is moderate at the moment", 3);
		AnswerChoice answerChoiceNeckAssessmentPain4 = new AnswerChoice ("The pain is fairly severe at the moment", 2);
		AnswerChoice answerChoiceNeckAssessmentPain5 = new AnswerChoice ("The pain is very severe at the moment", 1);
		AnswerChoice answerChoiceNeckAssessmentPain6 = new AnswerChoice ("The pain is the worst imaginable at the moment", 0);
		
		AnswerChoice answerChoiceNeckAssessmentPersonal1 = new AnswerChoice ("I can look after myself normally without causing extra pain", 0);
		AnswerChoice answerChoiceNeckAssessmentPersonal2 = new AnswerChoice ("I can look after myself normally but it causes extra pain", 1);
		AnswerChoice answerChoiceNeckAssessmentPersonal3 = new AnswerChoice ("It is painful to look after myself and I am slow and careful", 2);
		AnswerChoice answerChoiceNeckAssessmentPersonal4 = new AnswerChoice ("I need some help but manage most of my personal care", 3);
		AnswerChoice answerChoiceNeckAssessmentPersonal5 = new AnswerChoice ("I need help everyday in most aspects of self care", 4);
		AnswerChoice answerChoiceNeckAssessmentPersonal6 = new AnswerChoice ("I do not get dressesd; I wash with difficulty and stay in bed", 5);
		
		AnswerChoice answerChoiceNeckAssessmentLifting1 = new AnswerChoice ("I can lift heaving weights without extra pain", 5);
		AnswerChoice answerChoiceNeckAssessmentLifting2 = new AnswerChoice ("I can lift heavy weights but it gives extra pain", 4);
		AnswerChoice answerChoiceNeckAssessmentLifting3 = new AnswerChoice ("Pain prevents me from lifting heavy weights off the floor, but I can manage if they are conveniently positioned, e.g. on a table", 3);
		AnswerChoice answerChoiceNeckAssessmentLifting4 = new AnswerChoice ("Pain prevents me from lifting heavy weights but I can manage light to medium weights if they are conveniently positioned", 2);
		AnswerChoice answerChoiceNeckAssessmentLifting5 = new AnswerChoice ("I can lift only very light weights", 1);
		AnswerChoice answerChoiceNeckAssessmentLifting6 = new AnswerChoice ("I cannot lift or carry anything at all", 0); 
		
		AnswerChoice answerChoiceNeckAssessmentReading1 = new AnswerChoice ("I can read as much as I want to with no pain in  my neck", 5);
		AnswerChoice answerChoiceNeckAssessmentReading2 = new AnswerChoice ("I can read as much as I want to with slight pain in my neck", 4);
		AnswerChoice answerChoiceNeckAssessmentReading3 = new AnswerChoice ("I can read as much as I want with moderate pain in my neck", 3);
		AnswerChoice answerChoiceNeckAssessmentReading4 = new AnswerChoice ("Pain prevents me from lifting heavy weights but I can manage light to medium weights if they are conveniently positioned", 2);
		AnswerChoice answerChoiceNeckAssessmentReading5 = new AnswerChoice ("I can lift only very light weights", 1);
		AnswerChoice answerChoiceNeckAssessmentReading6 = new AnswerChoice ("I cannot lift or carry anything at all", 0);
		
		AnswerChoice answerChoiceNeckAssessmentHeadaches1 = new AnswerChoice ("I have no headaches at all", 5);
		AnswerChoice answerChoiceNeckAssessmentHeadaches2 = new AnswerChoice ("I have slight headaches which come infrequently", 4);
		AnswerChoice answerChoiceNeckAssessmentHeadaches3 = new AnswerChoice ("I have moderate headaches which come infrequently", 3);
		AnswerChoice answerChoiceNeckAssessmentHeadaches4 = new AnswerChoice ("I have moderate headaches which come frequently", 2);
		AnswerChoice answerChoiceNeckAssessmentHeadaches5 = new AnswerChoice ("I have severe headaches which come frequently", 1);
		AnswerChoice answerChoiceNeckAssessmentHeadaches6 = new AnswerChoice ("I have headaches all the time", 0);
		
		AnswerChoice answerChoiceNeckAssessmentConcentration1 = new AnswerChoice ("I can concentrate fully when I want to with no difficulty", 5);
		AnswerChoice answerChoiceNeckAssessmentConcentration2 = new AnswerChoice ("I can concentrate fully when I want to with slight difficulty", 4);
		AnswerChoice answerChoiceNeckAssessmentConcentration3 = new AnswerChoice ("I have a fair degree of difficulty in concentrating when I want to", 3);
		AnswerChoice answerChoiceNeckAssessmentConcentration4 = new AnswerChoice ("I have a lot of difficulty in concentrating when I want to", 2);
		AnswerChoice answerChoiceNeckAssessmentConcentration5 = new AnswerChoice ("I have a great deal of difficulty in concentrating wheN I want to", 1);
		AnswerChoice answerChoiceNeckAssessmentConcentration6 = new AnswerChoice ("I cannot concentrate at all", 0);
		
		AnswerChoice answerChoiceNeckAssessmentWork1 = new AnswerChoice ("I can do as much as I want to", 5);
		AnswerChoice answerChoiceNeckAssessmentWork2 = new AnswerChoice ("I can only do my usual work, but no more", 4);
		AnswerChoice answerChoiceNeckAssessmentWork3 = new AnswerChoice ("I can do most of my usual work, but no more", 3);
		AnswerChoice answerChoiceNeckAssessmentWork4 = new AnswerChoice ("I cannot do my usual work", 2);
		AnswerChoice answerChoiceNeckAssessmentWork5 = new AnswerChoice ("I can hardly do any work at all", 1);
		AnswerChoice answerChoiceNeckAssessmentWork6 = new AnswerChoice ("I cannot do any work at all", 0);
		
		AnswerChoice answerChoiceNeckAssessmentDriving1 = new AnswerChoice ("I can drive my car without any neck pain", 5);
		AnswerChoice answerChoiceNeckAssessmentDriving2 = new AnswerChoice ("I can drive my car as long as I want with slight neck pain", 4);
		AnswerChoice answerChoiceNeckAssessmentDriving3 = new AnswerChoice ("I can drive my car as long as I want with moderate neck pain", 3);
		AnswerChoice answerChoiceNeckAssessmentDriving4 = new AnswerChoice ("I cannot drive my car as long as I want because of neck pain", 2);
		AnswerChoice answerChoiceNeckAssessmentDriving5 = new AnswerChoice ("I can hardly drive at all because of severe neck pain ", 1);
		AnswerChoice answerChoiceNeckAssessmentDriving6 = new AnswerChoice ("I cannot drive my car at all", 0);
		
		AnswerChoice answerChoiceNeckAssessmentSleeping1 = new AnswerChoice ("I have no trouble sleeping", 5);
		AnswerChoice answerChoiceNeckAssessmentSleeping2 = new AnswerChoice ("My sleep is slightly disturbed (less than 1 hr. of sleep loss)", 4);
		AnswerChoice answerChoiceNeckAssessmentSleeping3 = new AnswerChoice ("My sleep is mildly disturbed (1-2 hrs of sleep loss)", 3);
		AnswerChoice answerChoiceNeckAssessmentSleeping4 = new AnswerChoice ("My sleep is moderately disturbed (2-3 hrs of sleep loss)", 2);
		AnswerChoice answerChoiceNeckAssessmentSleeping5 = new AnswerChoice ("My sleep is greatly disturbed (3-5 hrs of sleep loss) ", 1);
		AnswerChoice answerChoiceNeckAssessmentSleeping6 = new AnswerChoice ("My sleep is completely disturbed (5-7 hrs of sleep loss)", 0);
		
		AnswerChoice answerChoiceNeckAssementRecreation1 = new AnswerChoice ("I am able to engage in all my recreation activities with no neck pain", 5);
		AnswerChoice answerChoiceNeckAssementRecreation2 = new AnswerChoice ("I am able to engage in all my recreation activities, with some neck pain", 4);
		AnswerChoice answerChoiceNeckAssementRecreation3 = new AnswerChoice ("I am able to engage in most, but not all, of my usual recreation activities because of neck pain", 3);
		AnswerChoice answerChoiceNeckAssementRecreation4 = new AnswerChoice ("I am able to engage in a few of my usual recreation activities because of neck pain", 2);
		AnswerChoice answerChoiceNeckAssementRecreation5 = new AnswerChoice ("I can hardly do any recreation activities because of neck pain", 1);
		AnswerChoice answerChoiceNeckAssementRecreation6 = new AnswerChoice ("I cannot do any recreation activities at all", 0);

		
		
		
		
		
		
		
     

		
		Survey surveyLower = new Survey("Lower Extremity Assessment");
		Survey surveyPhysical = new Survey("Physical Function Assessment");
		Survey surveyNeck = new Survey("Neck Assessment");
		Survey survey3 = new Survey("Upper Extremity Assessment");
        Survey survey4 = surveyRepo.save(new Survey("Low Back Pain Assessment"));
		
		Question lowerQuestion1 = new Question("Your usual work, housework, or school activites?", surveyLower );
		Question lowerQuestion2 = new Question("Your usual hobbies, sports, or recreational activities?", surveyLower);
		Question lowerQuestion3 = new Question("Getting into or out of bath?", surveyLower );
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
        Question question33 = questionRepo.save(new Question("Sitting", survey4));
        Question question34 = questionRepo.save(new Question("Standing", survey4));
        Question question35 = questionRepo.save(new Question("Sleeping", survey4));
        Question question36 = questionRepo.save(new Question("Social Life", survey4));
        Question question37 = questionRepo.save(new Question("Traveling", survey4));
        Question question38 = questionRepo.save(new Question("Employment/Homemaking", survey4));

		answerChoiceNeckAssementRecreation1.addQuestionToAnswerChoice(lowerQuestion1);
		answerChoiceNeckAssementRecreation1.addQuestionToAnswerChoice(lowerQuestion2);
		answerChoiceNeckAssementRecreation1.addQuestionToAnswerChoice(lowerQuestion3);
		answerChoiceNeckAssementRecreation1.addQuestionToAnswerChoice(lowerQuestion4);
		answerChoiceNeckAssementRecreation1.addQuestionToAnswerChoice(lowerQuestion5);


		
		
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
