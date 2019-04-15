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

import com.rehab.rehabapp.models.Question;
import com.rehab.rehabapp.repositories.QuestionRepository;
import com.rehab.rehabapp.repositories.SurveyRepository;

@CrossOrigin
@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	@Resource
	QuestionRepository questionRepo;
	
	@Resource
	SurveyRepository surveyRepo;
	
	@GetMapping("")
	public Collection<Question> getQuestions() {
		return (Collection<Question>) questionRepo.findAll();
	}
	
	@GetMapping("/{questionId}")
	public Question getQuestion(@PathVariable Long questionId) {
		return questionRepo.findById(questionId).get();
	}
	
	@PostMapping("/addQuestion")
	public Collection<Question> addQuestion(@RequestBody String newQuestion) throws JSONException{
		JSONObject json = new JSONObject(newQuestion);
		questionRepo.save(new Question(json.getString("name")));
		return (Collection<Question>) questionRepo.findAll();
	}
	
	@PostMapping("/nameToId")
	public Long convertNameToId(@RequestBody String questionName) throws JSONException {
		JSONObject json = new JSONObject(questionName);
		Long questionId = questionRepo.findByName(json.getString("name")).getId();
		return questionId;
	}
}

