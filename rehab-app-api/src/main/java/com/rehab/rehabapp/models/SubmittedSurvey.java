package com.rehab.rehabapp.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SubmittedSurvey{

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	private LocalDate date;
	
	private int sum;
	

	@OneToMany(mappedBy="submittedSurvey")
	private Collection<SubmittedQuestion> submittedQuestions;
	
	@ManyToOne
	@JsonIgnore
	private Survey survey;
	
	public SubmittedSurvey() {
	}

	public SubmittedSurvey(String name, Survey survey, LocalDate date) {
		this.name = name;
		this.submittedQuestions = new ArrayList<SubmittedQuestion>();
		this.date = date;
		this.survey = survey;
	}
	
	public Long getId() {
		return id;
	}
	public LocalDate getDate() {
		return date;
	}
	
	public int getSum() {
		return sum;
	}
	
	public Survey getSurvey() {
		return survey;
	}

	public String getName() {
		return name;
	}
	
	public void addSumToSum(int sum) {
		this.sum = sum;
	}

	public Collection<SubmittedQuestion> getSubmittedQuestions() {
		return submittedQuestions;
	}

	public void addSubmittedQuestionToSubmission(SubmittedQuestion submittedQuestion) {
		submittedQuestions.add(submittedQuestion);
	}
	
	public boolean checkSubmittedQuestionInSubmission(SubmittedQuestion submittedQuestion) {
		return submittedQuestions.contains(submittedQuestion);
	}
	
}