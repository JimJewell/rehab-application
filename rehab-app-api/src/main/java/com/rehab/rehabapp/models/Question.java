	package com.rehab.rehabapp.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Question{

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String value;
	
	private LocalDate date;
	
	@ManyToOne
	@JsonIgnore
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
	
	public Question(String name, String value, Survey survey, LocalDate date) {
		this.name = name;
		this.value = value;
		this.survey = survey;
		this.date = date;
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
	
	public LocalDate getDate() {
		return date;
	}

	public void addSurveyToQuestion(Survey survey) {
		this.survey = survey;
	}
	
	public boolean checkSurveyForQuestion(Survey survey) {
		return this.survey.equals(survey);
	}
	
}
