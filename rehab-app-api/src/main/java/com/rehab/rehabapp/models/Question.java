	package com.rehab.rehabapp.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany (mappedBy="questions")
	private List<AnswerChoice> answerChoices;
	
	@ManyToMany
	@JsonIgnore
	private Collection <Survey> surveys;

	public Question() {
	}
	
	public Question(String name) {
		this.name = name;
		this.answerChoices = new ArrayList<AnswerChoice>();
		this.surveys = new ArrayList<Survey>();
	}

	public Question(String name, String value) {
		this.name = name;
		this.value = value;
		this.answerChoices = new ArrayList<AnswerChoice>();
		this.surveys = new ArrayList<Survey>();
	}
	
	public Question(String name, Survey survey) {
		this.name = name;
		this.surveys = new ArrayList<Survey>();
		surveys.add(survey);
		this.answerChoices = new ArrayList<AnswerChoice>();
	}
	
	public Question(String name, String value, Survey survey, LocalDate date) {
		this.name = name;
		this.value = value;
		this.surveys = new ArrayList<Survey>();
		surveys.add(survey);
		this.date = date;
		this.answerChoices = new ArrayList<AnswerChoice>();
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

	public Collection <Survey> getSurveys() {
		return surveys;
			}
	
	public LocalDate getDate() {
		return date;
	}

	public void addSurveyToQuestion(Survey survey) {
		surveys.add(survey);
	}
	
	public boolean checkSurveyForQuestion(Survey survey) {
		return surveys.contains(survey);
	}
	
	public List<AnswerChoice> getAnswerChoices() {
		return answerChoices;
	}
}
