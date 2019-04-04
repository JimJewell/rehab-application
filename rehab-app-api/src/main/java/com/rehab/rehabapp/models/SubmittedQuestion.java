package com.rehab.rehabapp.models;

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

	@ManyToOne
	@JsonIgnore
	private SubmittedSurvey submittedSurvey;

	public SubmittedQuestion() {
	}

	public SubmittedQuestion(String name) {
		this.name = name;
	}

	public SubmittedQuestion(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public SubmittedQuestion(String name, SubmittedSurvey submittedSurvey) {
		this.name = name;
		this.submittedSurvey = submittedSurvey;
	}

	public SubmittedQuestion(String name, String value, SubmittedSurvey submittedSurvey) {
		this.name = name;
		this.value = value;
		this.submittedSurvey = submittedSurvey;
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

	public void addSubmittedSurveyToSubmittedQuestion(SubmittedSurvey submittedSurvey) {
		this.submittedSurvey = submittedSurvey;
	}

	public boolean checkSubmittedSurveyForSubmitedQuestion(SubmittedSurvey submittedSurvey) {
		return this.submittedSurvey.equals(submittedSurvey);
	}

}