package com.rehab.rehabapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Question{

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String value;
	
	@ManyToOne
	private Survey survey;

	public Question() {
	}
	
	public Question(String name) {
		this.name = name;
	}

	public Question(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public Question(String name, Survey survey) {
		this.name = name;
		this.survey = survey;
	}
	
	public Question(String name, String value, Survey survey) {
		this.name = name;
		this.value = value;
		this.survey = survey;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public Survey getSurvey() {
		return survey;
	}
	
	public void addSurveyToQuestion(Survey survey) {
		this.survey = survey;
	}
	
	public boolean checkSurveyForQuestion(Survey survey) {
		return this.survey.equals(survey);
	}
	
}
