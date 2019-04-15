package com.rehab.rehabapp.controllers;

import java.time.LocalDate;
import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rehab.rehabapp.models.Question;
import com.rehab.rehabapp.models.SubmittedQuestion;
import com.rehab.rehabapp.models.SubmittedSurvey;
import com.rehab.rehabapp.models.Survey;
import com.rehab.rehabapp.repositories.QuestionRepository;
import com.rehab.rehabapp.repositories.SubmittedQuestionRepository;
import com.rehab.rehabapp.repositories.SubmittedSurveyRepository;
import com.rehab.rehabapp.repositories.SurveyRepository;

@CrossOrigin
@RestController
@RequestMapping("/surveys")
public class SurveyController {
	
	@Resource
	SubmittedQuestionRepository submitQuestionRepo;
	
	@Resource
	SubmittedSurveyRepository submitSurveyRepo;
	
	
	@Resource
	QuestionRepository questionRepo;
	
	@Resource
	SurveyRepository surveyRepo;
	
	@GetMapping("")
	public Collection<Survey> getSurveys() {
		return (Collection<Survey>) surveyRepo.findAll();
	}
	
	@GetMapping("/{surveyId}")
	public Survey getSurvey(@PathVariable Long surveyId) {
		return surveyRepo.findById(surveyId).get();
	}
	
	@PostMapping("/addSurvey")
	public Collection<Survey> addSurvey(@RequestBody String newSurvey) throws JSONException{
		JSONObject json = new JSONObject(newSurvey);
		Survey survey = surveyRepo.save(new Survey(json.getString("name")));
		JSONArray questionChoices = json.getJSONArray("questionChoices");
		
		JSONObject jsonOne;
		
		for (int i = 0 ; i < questionChoices.length() ; i++ ) {
		
			 jsonOne = (JSONObject) questionChoices.get(i);
			 long questionId = jsonOne.getLong("id"); 	
			 Question question = questionRepo.findById(questionId).get();
			 question.addSurveyToQuestion(survey);
			 questionRepo.save(question);
		}	
		
		return (Collection<Survey>) surveyRepo.findAll();
		
	}
	
	@PostMapping("/nameToId")
	public Long convertNameToId(@RequestBody String surveyName) throws JSONException {
		JSONObject json = new JSONObject(surveyName);
		Long surveyId = surveyRepo.findByName(json.getString("surveyName")).getId();
		return surveyId;
	}
	
	@PostMapping("/submit")
	public Survey submitSurvey(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String name = json.getString("name");
		Survey survey = surveyRepo.findByName(name);
		LocalDate date =  LocalDate.now();
		SubmittedSurvey submittedSurvey = submitSurveyRepo.save(new SubmittedSurvey(survey.getName(), survey, date));
		JSONArray questionCollections = json.getJSONArray("questions");
		
		JSONObject jsonOne;
		
		
		int sum = 0;
		
		for (int i = 0 ; i < questionCollections.length() ; i++ ) {			
			 jsonOne = (JSONObject) questionCollections.get(i);
			 String nameToMake = jsonOne.getString("name");
			 String value = jsonOne.getString("value");
			 sum += Integer.parseInt(jsonOne.getString("value"));
			 submitQuestionRepo.save(new SubmittedQuestion(nameToMake, value, submittedSurvey));			 
		}		
		submittedSurvey.addSumToSum(sum);
		submitSurveyRepo.save(submittedSurvey);
		
		survey.AddSumToSums(sum);
		surveyRepo.save(survey);
		
		return survey;
	}
}










