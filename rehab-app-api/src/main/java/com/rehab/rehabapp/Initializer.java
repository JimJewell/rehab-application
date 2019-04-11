package com.rehab.rehabapp;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.rehab.rehabapp.models.AnswerChoice;
import com.rehab.rehabapp.models.Question;
import com.rehab.rehabapp.models.Survey;
import com.rehab.rehabapp.repositories.AnswerChoicesRepository;
import com.rehab.rehabapp.repositories.QuestionRepository;
import com.rehab.rehabapp.repositories.SurveyRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	QuestionRepository questionRepo;

	@Resource
	SurveyRepository surveyRepo;
	
	@Resource
	AnswerChoicesRepository answerChoicesRepo;

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
		
		AnswerChoice answerChoiceNeckAssessmentRecreation1 = new AnswerChoice ("I am able to engage in all my recreation activities with no neck pain", 5);
		AnswerChoice answerChoiceNeckAssessmentRecreation2 = new AnswerChoice ("I am able to engage in all my recreation activities, with some neck pain", 4);
		AnswerChoice answerChoiceNeckAssessmentRecreation3 = new AnswerChoice ("I am able to engage in most, but not all, of my usual recreation activities because of neck pain", 3);
		AnswerChoice answerChoiceNeckAssessmentRecreation4 = new AnswerChoice ("I am able to engage in a few of my usual recreation activities because of neck pain", 2);
		AnswerChoice answerChoiceNeckAssessmentRecreation5 = new AnswerChoice ("I can hardly do any recreation activities because of neck pain", 1);
		AnswerChoice answerChoiceNeckAssessmentRecreation6 = new AnswerChoice ("I cannot do any recreation activities at all", 0);
		
		AnswerChoice answerChoiceUpperExtremityDifficulty1 = new AnswerChoice ("Unable", 0);
		AnswerChoice answerChoiceUpperExtremityDifficulty2 = new AnswerChoice ("Severe Difficult", 1);
		AnswerChoice answerChoiceUpperExtremityDifficulty3 = new AnswerChoice ("Moderate Difficult", 2);
		AnswerChoice answerChoiceUpperExtremityDifficulty4 = new AnswerChoice ("Mild Difficult", 3);
		AnswerChoice answerChoiceUpperExtremityDifficulty5 = new AnswerChoice ("No Difficult", 4);
		AnswerChoice answerChoiceUpperExtremitySeverity1 = new AnswerChoice ("Extreme", 0);
		AnswerChoice answerChoiceUpperExtremitySeverity2 = new AnswerChoice ("Severe", 1);
		AnswerChoice answerChoiceUpperExtremitySeverity3 = new AnswerChoice ("Moderate", 2);
		AnswerChoice answerChoiceUpperExtremitySeverity4 = new AnswerChoice ("Mild", 3);
		AnswerChoice answerChoiceUpperExtremitySeverity5 = new AnswerChoice ("No/None", 4);
		
		AnswerChoice answerChoiceLowBackPainAssessmentPainIntensity1 = new AnswerChoice ("The pain comes and goes and is very mild.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentPainIntensity2 = new AnswerChoice ("The pain is mild and does not vary much.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentPainIntensity3 = new AnswerChoice ("The pain comes and goes and is moderate.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentPainIntensity4 = new AnswerChoice ("The pain is moderate and does not vary much", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentPainIntensity5 = new AnswerChoice ("The pain comes and goes and is severe.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentPainIntensity6 = new AnswerChoice ("The pain is severe and not vary much.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentWashing1 = new AnswerChoice ("I do not have to change my aproach to avoid pain.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentWashing2 = new AnswerChoice ("I do not normally change my approach even though it causes me pain.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentWashing3 = new AnswerChoice ("It increases the pain, but I manage not to cahnge my way of doing it.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentWashing4 = new AnswerChoice ("It increases the pain and I find it necessary to change my way of doing it.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentWashing5 = new AnswerChoice ("Because of pain, I am unable to do some washing and dressing without help.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentWashing6 = new AnswerChoice ("Because of pain, I am unable to do any washing and dressing without help.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentLifting1 = new AnswerChoice ("I can lift heavy weights without extra low back pain.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentLifting2 = new AnswerChoice ("I can lift heavy weights but it causes extra pain.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentLifting3 = new AnswerChoice ("Pain prevents me from lifting heavy weights off the floow.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentLifting4 = new AnswerChoice ("Pain prevents me from lifting heavy weights off the floor, but I can manage if they are conveniently positioned, such as on a table.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentLifting5 = new AnswerChoice ("Pain prevents me from lifting heavy weights, but I can manage light to medium weights if they are conveniently positioned.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentLifting6 = new AnswerChoice ("I can lift onli light weights at the most.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentWalking1 = new AnswerChoice ("I have no pain walking.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentWalking2 = new AnswerChoice ("I have some pain walking, but I can still walk my required normal distances.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentWalking3 = new AnswerChoice ("Pain prevents me from walking long distances.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentWalking4 = new AnswerChoice ("Pain prevents me from walking intermediate disctances.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentWalking5 = new AnswerChoice ("Pain prevents me from walking  even short distances.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentWalking6 = new AnswerChoice ("Pain prevents me from walking at all", 0);

		AnswerChoice answerChoiceLowBackPainAssessmentSitting1 = new AnswerChoice ("Sitting does not cause me any pain.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentSitting2 = new AnswerChoice ("I can sit as long as I need, provided I have my choice of sitting surfaces.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentSitting3 = new AnswerChoice ("Pain prevents me from sitting more than 1 hour.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentSitting4 = new AnswerChoice ("Pain prevents me from sitting more than 1/2 hour.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentSitting5 = new AnswerChoice ("Pain prevents me from sitting more than 10 minutes.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentSitting6 = new AnswerChoice ("Pain prevents me from sitting at all.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentStanding1 = new AnswerChoice ("I can stand as long as I want without pain.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentStanding2 = new AnswerChoice ("I have some pain while standing, but it does not increase with time.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentStanding3 = new AnswerChoice ("I cannot stand for longer than 1 hour without increasing pain.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentStanding4 = new AnswerChoice ("I cannot stand for longer than 1/2 hour without increasing pain.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentStanding5 = new AnswerChoice ("I cannot stand for longer than 10 minutes without increasing pain.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentStanding6 = new AnswerChoice ("I avoid standging because it increases the pain immediately.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentSleeping1 = new AnswerChoice ("I have no pain while in bed.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentSleeping2 = new AnswerChoice ("I have pain in bed, but it does not prevent me from sleeping well.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentSleeping3 = new AnswerChoice ("Because of pain, I sleep only 3/4 of normal time.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentSleeping4 = new AnswerChoice ("Because of pain, I sleep only 1/2 of normal time.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentSleeping5 = new AnswerChoice ("Because of pain, I sleep only 1/4 of normal time.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentSleeping6 = new AnswerChoice ("Pain prevents me from sleeping at all.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentSocialLife1 = new AnswerChoice ("My social life is normal and gives me no pain", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentSocialLife2 = new AnswerChoice ("My social life is normal, but increases the degree of pain.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentSocialLife3 = new AnswerChoice ("Pain prevents me fro participating in more energetic activities.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentSocialLife4 = new AnswerChoice ("Pain prevent me from going out often.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentSocialLife5 = new AnswerChoice ("Pain has restricted my social life to my home", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentSocialLife6 = new AnswerChoice ("I hardly have any social life because of pain.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentTraveling1 = new AnswerChoice ("I get no pain while traveling", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentTraveling2 = new AnswerChoice ("I get some pain while travling, but my usual forms do not make it any worse.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentTraveling3 = new AnswerChoice ("I get some pain while traveling, but it does not compel me to seek alternatives.", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentTraveling4 = new AnswerChoice ("I get extra pain while traveling that requires me to seek alternatives.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentTraveling5 = new AnswerChoice ("Pain restricts all forms of travel.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentTraveling6 = new AnswerChoice ("Pain prevents all forms of travel except that done lying down.", 0);
		
		AnswerChoice answerChoiceLowBackPainAssessmentEmployment1 = new AnswerChoice ("My normal job/homemaking duties do not cause pain.", 5);
		AnswerChoice answerChoiceLowBackPainAssessmentEmployment2 = new AnswerChoice ("My job/homemaking duties cause me pain, but I can still preform as required.", 4);
		AnswerChoice answerChoiceLowBackPainAssessmentEmployment3 = new AnswerChoice ("I can preform most of my job/homemaking duties, but pain prevents me from preforming more physically strssful activities", 3);
		AnswerChoice answerChoiceLowBackPainAssessmentEmployment4 = new AnswerChoice ("Pain prevents me from doing anything but light duties.", 2);
		AnswerChoice answerChoiceLowBackPainAssessmentEmployment5 = new AnswerChoice ("Pain prevents me from even light duties.", 1);
		AnswerChoice answerChoiceLowBackPainAssessmentEmployment6 = new AnswerChoice ("Pain prevents me from preforming any job/homemaking chores.", 0);

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
		
		Question physicalQuestion1 = new Question("Do chores such as vacuuming or yard work?", surveyPhysical);
		Question physicalQuestion2 = new Question("Go up and down stairs at a normal pace?", surveyPhysical);
		Question physicalQuestion3 = new Question("Walk for at least 15 minutes?", surveyPhysical);
		Question physicalQuestion4 = new Question("Run errands and shop?", surveyPhysical);
		Question physicalQuestion5 = new Question("Doing two hours of physical labor?", surveyPhysical);
		Question physicalQuestion6 = new Question("Doing moderate work around the house like vacuuming or sweeping floors?", surveyPhysical);
		Question physicalQuestion7 = new Question("Lifting or carrying groceries?", surveyPhysical);
		Question physicalQuestion8 = new Question("Heavy work around the house like scrubbing floors, or lifting or moving heavy furniture?", surveyPhysical);
		
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
        Question question235 = new Question("Doing your work as well as you would like", survey3);
        Question question24 = new Question("Spending your usual amount of time doing your work", survey3);
        Question question25 = new Question("Using your usual technique for playing", survey3);
        Question question26 = new Question("Playing because of arm, shoulder or hand pain", survey3);
        Question question27 = new Question("Playing as well as you would like", survey3);
        Question question28 = new Question("Spending your usual amount of time practicing or playing", survey3);
        
        // Low Back Pain Assessment //
        Question lowBackQuestion29 = new Question("Pain Intensity", survey4);
        Question lowBackQuestion30 = new Question("Washing and Dressing", survey4);
        Question lowBackQuestion31 = new Question("Lifting", survey4);
        Question lowBackQuestion32 = new Question("Walking", survey4);
        Question lowBackQuestion33 = new Question("Sitting", survey4);
        Question lowBackQuestion34 = new Question("Standing", survey4);
        Question lowBackQuestion35 = new Question("Sleeping", survey4);
        Question lowBackQuestion36 = new Question("Social Life", survey4);
        Question lowBackQuestion37 = new Question("Traveling", survey4);
        Question lowBackQuestion38 = new Question("Employment/Homemaking", survey4);

        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion1);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion1);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion1);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion1);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion1);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion2);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion2);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion2);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion2);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion2);

        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion3);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion3);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion3);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion3);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion3);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion4);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion4);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion4);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion4);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion4);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion5);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion5);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion5);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion5);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion5);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion6);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion6);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion6);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion6);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion6);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion7);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion7);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion7);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion7);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion7);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion8);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion8);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion8);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion8);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion8);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion9);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion9);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion9);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion9);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion9);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion10);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion10);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion10);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion10);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion10);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion11);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion11);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion11);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion11);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion11);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion12);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion12);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion12);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion13);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion13);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion13);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion13);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion13);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion14);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion14);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion14);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion14);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion14);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion15);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion15);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion15);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion15);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion15);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion16);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion16);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion16);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion16);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion16);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion17);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion17);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion17);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion17);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion17);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion18);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion18);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion18);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion18);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion18);
        
        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion19);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion19);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion19);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion19);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion19);

        answerChoicesLowerExtremity1.addQuestionToAnswerChoice(lowerQuestion20);
        answerChoicesLowerExtremity2.addQuestionToAnswerChoice(lowerQuestion20);
        answerChoicesLowerExtremity3.addQuestionToAnswerChoice(lowerQuestion20);
        answerChoicesLowerExtremity4.addQuestionToAnswerChoice(lowerQuestion20);
        answerChoicesLowerExtremity5.addQuestionToAnswerChoice(lowerQuestion20);
        
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion1);
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion2);
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion3);
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion4);
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion5);
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion6);
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion7);
        answerChoicesPhysicalFunction1.addQuestionToAnswerChoice(physicalQuestion8);
        
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion1);
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion2);
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion3);
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion4);
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion5);
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion6);
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion7);
        answerChoicesPhysicalFunction2.addQuestionToAnswerChoice(physicalQuestion8);
        
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion1);
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion2);
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion3);
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion4);
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion5);
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion6);
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion7);
        answerChoicesPhysicalFunction3.addQuestionToAnswerChoice(physicalQuestion8);
        
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion1);
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion2);
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion3);
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion4);
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion5);
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion6);
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion7);
        answerChoicesPhysicalFunction4.addQuestionToAnswerChoice(physicalQuestion8);
        
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion1);
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion2);
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion3);
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion4);
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion5);
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion6);
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion7);
        answerChoicesPhysicalFunction5.addQuestionToAnswerChoice(physicalQuestion8);
        
        answerChoiceNeckAssessmentPain1.addQuestionToAnswerChoice(neckQuestion1);
        answerChoiceNeckAssessmentPain2.addQuestionToAnswerChoice(neckQuestion1);
        answerChoiceNeckAssessmentPain3.addQuestionToAnswerChoice(neckQuestion1);
        answerChoiceNeckAssessmentPain4.addQuestionToAnswerChoice(neckQuestion1);
        answerChoiceNeckAssessmentPain5.addQuestionToAnswerChoice(neckQuestion1);
        answerChoiceNeckAssessmentPain6.addQuestionToAnswerChoice(neckQuestion1);
        
        answerChoiceNeckAssessmentPersonal1.addQuestionToAnswerChoice(neckQuestion2);
        answerChoiceNeckAssessmentPersonal2.addQuestionToAnswerChoice(neckQuestion2);
        answerChoiceNeckAssessmentPersonal3.addQuestionToAnswerChoice(neckQuestion2);
        answerChoiceNeckAssessmentPersonal4.addQuestionToAnswerChoice(neckQuestion2);
        answerChoiceNeckAssessmentPersonal5.addQuestionToAnswerChoice(neckQuestion2);
        answerChoiceNeckAssessmentPersonal6.addQuestionToAnswerChoice(neckQuestion2);

        answerChoiceNeckAssessmentLifting1.addQuestionToAnswerChoice(neckQuestion3);
        answerChoiceNeckAssessmentLifting2.addQuestionToAnswerChoice(neckQuestion3);
        answerChoiceNeckAssessmentLifting3.addQuestionToAnswerChoice(neckQuestion3);
        answerChoiceNeckAssessmentLifting4.addQuestionToAnswerChoice(neckQuestion3);
        answerChoiceNeckAssessmentLifting5.addQuestionToAnswerChoice(neckQuestion3);
        answerChoiceNeckAssessmentLifting6.addQuestionToAnswerChoice(neckQuestion3);
       
        answerChoiceNeckAssessmentReading1.addQuestionToAnswerChoice(neckQuestion4);
        answerChoiceNeckAssessmentReading2.addQuestionToAnswerChoice(neckQuestion4);
        answerChoiceNeckAssessmentReading3.addQuestionToAnswerChoice(neckQuestion4);
        answerChoiceNeckAssessmentReading4.addQuestionToAnswerChoice(neckQuestion4);
        answerChoiceNeckAssessmentReading5.addQuestionToAnswerChoice(neckQuestion4);
        answerChoiceNeckAssessmentReading6.addQuestionToAnswerChoice(neckQuestion4);
                
        answerChoiceNeckAssessmentHeadaches1.addQuestionToAnswerChoice(neckQuestion5);
        answerChoiceNeckAssessmentHeadaches2.addQuestionToAnswerChoice(neckQuestion5);
        answerChoiceNeckAssessmentHeadaches3.addQuestionToAnswerChoice(neckQuestion5);
        answerChoiceNeckAssessmentHeadaches4.addQuestionToAnswerChoice(neckQuestion5);
        answerChoiceNeckAssessmentHeadaches5.addQuestionToAnswerChoice(neckQuestion5);
        answerChoiceNeckAssessmentHeadaches6.addQuestionToAnswerChoice(neckQuestion5);
 
        answerChoiceNeckAssessmentConcentration1.addQuestionToAnswerChoice(neckQuestion6);
        answerChoiceNeckAssessmentConcentration2.addQuestionToAnswerChoice(neckQuestion6);
        answerChoiceNeckAssessmentConcentration3.addQuestionToAnswerChoice(neckQuestion6);
        answerChoiceNeckAssessmentConcentration4.addQuestionToAnswerChoice(neckQuestion6);
        answerChoiceNeckAssessmentConcentration5.addQuestionToAnswerChoice(neckQuestion6);
        answerChoiceNeckAssessmentConcentration6.addQuestionToAnswerChoice(neckQuestion6);
        
        answerChoiceNeckAssessmentWork1.addQuestionToAnswerChoice(neckQuestion7);
        answerChoiceNeckAssessmentWork2.addQuestionToAnswerChoice(neckQuestion7);
        answerChoiceNeckAssessmentWork3.addQuestionToAnswerChoice(neckQuestion7);
        answerChoiceNeckAssessmentWork4.addQuestionToAnswerChoice(neckQuestion7);
        answerChoiceNeckAssessmentWork5.addQuestionToAnswerChoice(neckQuestion7);
        answerChoiceNeckAssessmentWork6.addQuestionToAnswerChoice(neckQuestion7);

        answerChoiceNeckAssessmentDriving1.addQuestionToAnswerChoice(neckQuestion8);
        answerChoiceNeckAssessmentDriving2.addQuestionToAnswerChoice(neckQuestion8);
        answerChoiceNeckAssessmentDriving3.addQuestionToAnswerChoice(neckQuestion8);
        answerChoiceNeckAssessmentDriving4.addQuestionToAnswerChoice(neckQuestion8);
        answerChoiceNeckAssessmentDriving5.addQuestionToAnswerChoice(neckQuestion8);
        answerChoiceNeckAssessmentDriving6.addQuestionToAnswerChoice(neckQuestion8);

        
        answerChoiceNeckAssessmentSleeping1.addQuestionToAnswerChoice(neckQuestion9);
        answerChoiceNeckAssessmentSleeping2.addQuestionToAnswerChoice(neckQuestion9);
        answerChoiceNeckAssessmentSleeping3.addQuestionToAnswerChoice(neckQuestion9);
        answerChoiceNeckAssessmentSleeping4.addQuestionToAnswerChoice(neckQuestion9);
        answerChoiceNeckAssessmentSleeping5.addQuestionToAnswerChoice(neckQuestion9);
        answerChoiceNeckAssessmentSleeping6.addQuestionToAnswerChoice(neckQuestion9);
 
        answerChoiceNeckAssessmentRecreation1.addQuestionToAnswerChoice(neckQuestion10);
        answerChoiceNeckAssessmentRecreation2.addQuestionToAnswerChoice(neckQuestion10);
        answerChoiceNeckAssessmentRecreation3.addQuestionToAnswerChoice(neckQuestion10);
        answerChoiceNeckAssessmentRecreation4.addQuestionToAnswerChoice(neckQuestion10);
        answerChoiceNeckAssessmentRecreation5.addQuestionToAnswerChoice(neckQuestion10);
        answerChoiceNeckAssessmentRecreation6.addQuestionToAnswerChoice(neckQuestion10);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question11);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question11);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question11);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question11);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question11);
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question12);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question12);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question12);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question12);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question12);
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question13);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question13);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question13);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question13);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question13);
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question14);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question14);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question14);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question14);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question14);
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question15);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question15);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question15);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question15);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question15);
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question16);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question16);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question16);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question16);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question16);
        
        answerChoiceUpperExtremitySeverity1.addQuestionToAnswerChoice(question17);
        answerChoiceUpperExtremitySeverity2.addQuestionToAnswerChoice(question17);
        answerChoiceUpperExtremitySeverity3.addQuestionToAnswerChoice(question17);
        answerChoiceUpperExtremitySeverity4.addQuestionToAnswerChoice(question17);
        answerChoiceUpperExtremitySeverity5.addQuestionToAnswerChoice(question17);
        
        answerChoiceUpperExtremitySeverity1.addQuestionToAnswerChoice(question18);
        answerChoiceUpperExtremitySeverity2.addQuestionToAnswerChoice(question18);
        answerChoiceUpperExtremitySeverity3.addQuestionToAnswerChoice(question18);
        answerChoiceUpperExtremitySeverity4.addQuestionToAnswerChoice(question18);
        answerChoiceUpperExtremitySeverity5.addQuestionToAnswerChoice(question18);
        
        answerChoiceUpperExtremitySeverity1.addQuestionToAnswerChoice(question19);
        answerChoiceUpperExtremitySeverity2.addQuestionToAnswerChoice(question19);
        answerChoiceUpperExtremitySeverity3.addQuestionToAnswerChoice(question19);
        answerChoiceUpperExtremitySeverity4.addQuestionToAnswerChoice(question19);
        answerChoiceUpperExtremitySeverity5.addQuestionToAnswerChoice(question19);
        
        answerChoiceUpperExtremitySeverity1.addQuestionToAnswerChoice(question20);
        answerChoiceUpperExtremitySeverity2.addQuestionToAnswerChoice(question20);
        answerChoiceUpperExtremitySeverity3.addQuestionToAnswerChoice(question20);
        answerChoiceUpperExtremitySeverity4.addQuestionToAnswerChoice(question20);
        answerChoiceUpperExtremitySeverity5.addQuestionToAnswerChoice(question20);
        
        answerChoiceUpperExtremitySeverity1.addQuestionToAnswerChoice(question21);
        answerChoiceUpperExtremitySeverity2.addQuestionToAnswerChoice(question21);
        answerChoiceUpperExtremitySeverity3.addQuestionToAnswerChoice(question21);
        answerChoiceUpperExtremitySeverity4.addQuestionToAnswerChoice(question21);
        answerChoiceUpperExtremitySeverity5.addQuestionToAnswerChoice(question21);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question22);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question22);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question22);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question22);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question22);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question23);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question23);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question23);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question23);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question23);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question235);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question235);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question235);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question235);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question235);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question24);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question24);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question24);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question24);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question24);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question25);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question25);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question25);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question25);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question25);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question26);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question26);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question26);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question26);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question26);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question27);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question27);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question27);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question27);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question27);
        
        answerChoiceUpperExtremityDifficulty1.addQuestionToAnswerChoice(question28);
        answerChoiceUpperExtremityDifficulty2.addQuestionToAnswerChoice(question28);
        answerChoiceUpperExtremityDifficulty3.addQuestionToAnswerChoice(question28);
        answerChoiceUpperExtremityDifficulty4.addQuestionToAnswerChoice(question28);
        answerChoiceUpperExtremityDifficulty5.addQuestionToAnswerChoice(question28);
        
        answerChoiceLowBackPainAssessmentPainIntensity1.addQuestionToAnswerChoice(lowBackQuestion29);
        answerChoiceLowBackPainAssessmentPainIntensity2.addQuestionToAnswerChoice(lowBackQuestion29);
        answerChoiceLowBackPainAssessmentPainIntensity3.addQuestionToAnswerChoice(lowBackQuestion29);
        answerChoiceLowBackPainAssessmentPainIntensity4.addQuestionToAnswerChoice(lowBackQuestion29);
        answerChoiceLowBackPainAssessmentPainIntensity5.addQuestionToAnswerChoice(lowBackQuestion29);
        answerChoiceLowBackPainAssessmentPainIntensity6.addQuestionToAnswerChoice(lowBackQuestion29);
        
        answerChoiceLowBackPainAssessmentWashing1.addQuestionToAnswerChoice(lowBackQuestion30);
        answerChoiceLowBackPainAssessmentWashing2.addQuestionToAnswerChoice(lowBackQuestion30);
        answerChoiceLowBackPainAssessmentWashing3.addQuestionToAnswerChoice(lowBackQuestion30);
        answerChoiceLowBackPainAssessmentWashing4.addQuestionToAnswerChoice(lowBackQuestion30);
        answerChoiceLowBackPainAssessmentWashing5.addQuestionToAnswerChoice(lowBackQuestion30);
        answerChoiceLowBackPainAssessmentWashing6.addQuestionToAnswerChoice(lowBackQuestion30);
        
        answerChoiceLowBackPainAssessmentLifting1.addQuestionToAnswerChoice(lowBackQuestion31);
        answerChoiceLowBackPainAssessmentLifting2.addQuestionToAnswerChoice(lowBackQuestion31);
        answerChoiceLowBackPainAssessmentLifting3.addQuestionToAnswerChoice(lowBackQuestion31);
        answerChoiceLowBackPainAssessmentLifting4.addQuestionToAnswerChoice(lowBackQuestion31);
        answerChoiceLowBackPainAssessmentLifting5.addQuestionToAnswerChoice(lowBackQuestion31);
        answerChoiceLowBackPainAssessmentLifting6.addQuestionToAnswerChoice(lowBackQuestion31);
        
        answerChoiceLowBackPainAssessmentWalking1.addQuestionToAnswerChoice(lowBackQuestion32);
        answerChoiceLowBackPainAssessmentWalking2.addQuestionToAnswerChoice(lowBackQuestion32);
        answerChoiceLowBackPainAssessmentWalking3.addQuestionToAnswerChoice(lowBackQuestion32);
        answerChoiceLowBackPainAssessmentWalking4.addQuestionToAnswerChoice(lowBackQuestion32);
        answerChoiceLowBackPainAssessmentWalking5.addQuestionToAnswerChoice(lowBackQuestion32);
        answerChoiceLowBackPainAssessmentWalking6.addQuestionToAnswerChoice(lowBackQuestion32);
        
        answerChoiceLowBackPainAssessmentSitting1.addQuestionToAnswerChoice(lowBackQuestion33);
        answerChoiceLowBackPainAssessmentSitting2.addQuestionToAnswerChoice(lowBackQuestion33);
        answerChoiceLowBackPainAssessmentSitting3.addQuestionToAnswerChoice(lowBackQuestion33);
        answerChoiceLowBackPainAssessmentSitting4.addQuestionToAnswerChoice(lowBackQuestion33);
        answerChoiceLowBackPainAssessmentSitting5.addQuestionToAnswerChoice(lowBackQuestion33);
        answerChoiceLowBackPainAssessmentSitting6.addQuestionToAnswerChoice(lowBackQuestion33);
        
        answerChoiceLowBackPainAssessmentStanding1.addQuestionToAnswerChoice(lowBackQuestion34);
        answerChoiceLowBackPainAssessmentStanding2.addQuestionToAnswerChoice(lowBackQuestion34);
        answerChoiceLowBackPainAssessmentStanding3.addQuestionToAnswerChoice(lowBackQuestion34);
        answerChoiceLowBackPainAssessmentStanding4.addQuestionToAnswerChoice(lowBackQuestion34);
        answerChoiceLowBackPainAssessmentStanding5.addQuestionToAnswerChoice(lowBackQuestion34);
        answerChoiceLowBackPainAssessmentStanding6.addQuestionToAnswerChoice(lowBackQuestion34);
        
        answerChoiceLowBackPainAssessmentSleeping1.addQuestionToAnswerChoice(lowBackQuestion35);
        answerChoiceLowBackPainAssessmentSleeping2.addQuestionToAnswerChoice(lowBackQuestion35);
        answerChoiceLowBackPainAssessmentSleeping3.addQuestionToAnswerChoice(lowBackQuestion35);
        answerChoiceLowBackPainAssessmentSleeping4.addQuestionToAnswerChoice(lowBackQuestion35);
        answerChoiceLowBackPainAssessmentSleeping5.addQuestionToAnswerChoice(lowBackQuestion35);
        answerChoiceLowBackPainAssessmentSleeping6.addQuestionToAnswerChoice(lowBackQuestion35);
        
        answerChoiceLowBackPainAssessmentSocialLife1.addQuestionToAnswerChoice(lowBackQuestion36);
        answerChoiceLowBackPainAssessmentSocialLife2.addQuestionToAnswerChoice(lowBackQuestion36);
        answerChoiceLowBackPainAssessmentSocialLife3.addQuestionToAnswerChoice(lowBackQuestion36);
        answerChoiceLowBackPainAssessmentSocialLife4.addQuestionToAnswerChoice(lowBackQuestion36);
        answerChoiceLowBackPainAssessmentSocialLife5.addQuestionToAnswerChoice(lowBackQuestion36);
        answerChoiceLowBackPainAssessmentSocialLife6.addQuestionToAnswerChoice(lowBackQuestion36);
        
        answerChoiceLowBackPainAssessmentTraveling1.addQuestionToAnswerChoice(lowBackQuestion37);
        answerChoiceLowBackPainAssessmentTraveling2.addQuestionToAnswerChoice(lowBackQuestion37);
        answerChoiceLowBackPainAssessmentTraveling3.addQuestionToAnswerChoice(lowBackQuestion37);
        answerChoiceLowBackPainAssessmentTraveling4.addQuestionToAnswerChoice(lowBackQuestion37);
        answerChoiceLowBackPainAssessmentTraveling5.addQuestionToAnswerChoice(lowBackQuestion37);
        answerChoiceLowBackPainAssessmentTraveling6.addQuestionToAnswerChoice(lowBackQuestion37);
        
        answerChoiceLowBackPainAssessmentEmployment1.addQuestionToAnswerChoice(lowBackQuestion38);
        answerChoiceLowBackPainAssessmentEmployment2.addQuestionToAnswerChoice(lowBackQuestion38);
        answerChoiceLowBackPainAssessmentEmployment3.addQuestionToAnswerChoice(lowBackQuestion38);
        answerChoiceLowBackPainAssessmentEmployment4.addQuestionToAnswerChoice(lowBackQuestion38);
        answerChoiceLowBackPainAssessmentEmployment5.addQuestionToAnswerChoice(lowBackQuestion38);
        answerChoiceLowBackPainAssessmentEmployment6.addQuestionToAnswerChoice(lowBackQuestion38);
		
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
		
		questionRepo.save(physicalQuestion1); 
		questionRepo.save(physicalQuestion2);
		questionRepo.save(physicalQuestion3);
		questionRepo.save(physicalQuestion4);
		questionRepo.save(physicalQuestion5);
		questionRepo.save(physicalQuestion6); 
		questionRepo.save(physicalQuestion7);
		questionRepo.save(physicalQuestion8);
		
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
        questionRepo.save(question235);
        questionRepo.save(question24);
        questionRepo.save(question25);
        questionRepo.save(question26);
        questionRepo.save(question27);
        questionRepo.save(question28);
        
        questionRepo.save(lowBackQuestion29);
        questionRepo.save(lowBackQuestion30);
        questionRepo.save(lowBackQuestion31);
        questionRepo.save(lowBackQuestion32);
        questionRepo.save(lowBackQuestion33);
        questionRepo.save(lowBackQuestion34);
        questionRepo.save(lowBackQuestion35);
        questionRepo.save(lowBackQuestion36);
        questionRepo.save(lowBackQuestion37);
        questionRepo.save(lowBackQuestion38);

        answerChoicesRepo.save(answerChoicesLowerExtremity1);
        answerChoicesRepo.save(answerChoicesLowerExtremity2);
        answerChoicesRepo.save(answerChoicesLowerExtremity3);
        answerChoicesRepo.save(answerChoicesLowerExtremity4);
        answerChoicesRepo.save(answerChoicesLowerExtremity5);
        
        answerChoicesRepo.save(answerChoicesPhysicalFunction1);
        answerChoicesRepo.save(answerChoicesPhysicalFunction2);
        answerChoicesRepo.save(answerChoicesPhysicalFunction3);
        answerChoicesRepo.save(answerChoicesPhysicalFunction4);
        answerChoicesRepo.save(answerChoicesPhysicalFunction5);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentPain1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPain2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPain3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPain4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPain5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPain6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentPersonal1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPersonal2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPersonal3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPersonal4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPersonal5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentPersonal6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentLifting1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentLifting2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentLifting3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentLifting4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentLifting5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentLifting6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentReading1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentReading2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentReading3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentReading4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentReading5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentReading6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentHeadaches1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentHeadaches2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentHeadaches3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentHeadaches4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentHeadaches5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentHeadaches6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentConcentration1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentConcentration2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentConcentration3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentConcentration4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentConcentration5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentConcentration6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentWork1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentWork2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentWork3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentWork4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentWork5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentWork6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentDriving1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentDriving2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentDriving3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentDriving4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentDriving5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentDriving6);
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentSleeping1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentSleeping2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentSleeping3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentSleeping4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentSleeping5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentSleeping6);  
        
        answerChoicesRepo.save(answerChoiceNeckAssessmentRecreation1);
        answerChoicesRepo.save(answerChoiceNeckAssessmentRecreation2);
        answerChoicesRepo.save(answerChoiceNeckAssessmentRecreation3);
        answerChoicesRepo.save(answerChoiceNeckAssessmentRecreation4);
        answerChoicesRepo.save(answerChoiceNeckAssessmentRecreation5);
        answerChoicesRepo.save(answerChoiceNeckAssessmentRecreation6);  
        
        answerChoicesRepo.save(answerChoiceUpperExtremityDifficulty1);
        answerChoicesRepo.save(answerChoiceUpperExtremityDifficulty2);
        answerChoicesRepo.save(answerChoiceUpperExtremityDifficulty3);
        answerChoicesRepo.save(answerChoiceUpperExtremityDifficulty4);
        answerChoicesRepo.save(answerChoiceUpperExtremityDifficulty5);
        
        answerChoicesRepo.save(answerChoiceUpperExtremitySeverity1);
        answerChoicesRepo.save(answerChoiceUpperExtremitySeverity2);
        answerChoicesRepo.save(answerChoiceUpperExtremitySeverity3);
        answerChoicesRepo.save(answerChoiceUpperExtremitySeverity4);
        answerChoicesRepo.save(answerChoiceUpperExtremitySeverity5);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentPainIntensity1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentPainIntensity2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentPainIntensity3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentPainIntensity4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentPainIntensity5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentPainIntensity6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWashing1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWashing2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWashing3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWashing4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWashing5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWashing6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentLifting1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentLifting2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentLifting3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentLifting4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentLifting5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentLifting6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWalking1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWalking2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWalking3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWalking4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWalking5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentWalking6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSitting1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSitting2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSitting3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSitting4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSitting5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSitting6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentStanding1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentStanding2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentStanding3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentStanding4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentStanding5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentStanding6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSleeping1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSleeping2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSleeping3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSleeping4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSleeping5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSleeping6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSocialLife1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSocialLife2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSocialLife3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSocialLife4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSocialLife5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentSocialLife6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentTraveling1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentTraveling2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentTraveling3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentTraveling4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentTraveling5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentTraveling6);
        
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentEmployment1);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentEmployment2);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentEmployment3);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentEmployment4);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentEmployment5);
        answerChoicesRepo.save(answerChoiceLowBackPainAssessmentEmployment6);
	}
}
