package com.rehab.rehabapp.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SubmittedQuestion {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String value;

	private LocalDate date;
	@ManyToOne
	@JsonIgnore
	private SubmittedSurvey submittedSurvey;


	public SubmittedQuestion() {
	}

	public SubmittedQuestion(String name) {
		this.name = name;
		this.date = LocalDate.now();

	}

	public SubmittedQuestion(String name, String value) {
		this.name = name;
		this.value = value;
		this.date = LocalDate.now();
	}

	public SubmittedQuestion(String name, String value, SubmittedSurvey submittedSurvey) {
		this.name = name;
		this.value = value;
		this.submittedSurvey = submittedSurvey;
		this.date = LocalDate.now();

	}
	
	public SubmittedQuestion(String name, String value, SubmittedSurvey submittedSurvey, LocalDate date) {
		this.name = name;
		this.value = value;
		this.submittedSurvey = submittedSurvey;
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

	public SubmittedSurvey getSubmittedSurvey() {
		return submittedSurvey;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void addSubmittedSurveyToSubmittedQuestion(SubmittedSurvey submittedSurvey) {
		this.submittedSurvey = submittedSurvey;
	}

	public boolean checkSubmittedSurveyForSubmitedQuestion(SubmittedSurvey submittedSurvey) {
		return this.submittedSurvey.equals(submittedSurvey);
	}

}