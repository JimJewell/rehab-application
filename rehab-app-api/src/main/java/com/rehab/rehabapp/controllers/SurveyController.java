package com.rehab.rehabapp.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.collectionmasteryapi.models.Actress;
import org.wecancodeit.collectionmasteryapi.models.Rating;
import org.wecancodeit.collectionmasteryapi.models.Tag;
import org.wecancodeit.collectionmasteryapi.repositories.ActressRepository;
import org.wecancodeit.collectionmasteryapi.repositories.ClipRepository;
import org.wecancodeit.collectionmasteryapi.repositories.MovieRepository;
import org.wecancodeit.collectionmasteryapi.repositories.TagRepository;

import com.rehab.rehabapp.models.Question;
import com.rehab.rehabapp.models.Survey;
import com.rehab.rehabapp.repositories.QuestionRepository;
import com.rehab.rehabapp.repositories.SurveyRepository;

@CrossOrigin
@RestController
@RequestMapping("/surveys")
public class SurveyController {
	
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
		Survey survey = surveyRepo.save(new Survey(json.getString("name"), json.getString("date")));
		return (Collection<Survey>) surveyRepo.findAll();
	}
	
	@PostMapping("/nameToId")
	public Long convertNameToId(@RequestBody String surveyName) throws JSONException {
		JSONObject json = new JSONObject(surveyName);
		Long surveyId = surveyRepo.findByName(json.getString("surveyName")).getId();
		return surveyId;
	}
}
