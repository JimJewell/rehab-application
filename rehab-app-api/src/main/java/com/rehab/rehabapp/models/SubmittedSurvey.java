package com.rehab.rehabapp.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SubmittedSurvey{

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	private String date;
	
	@OneToMany(mappedBy="submittedSurvey")
	private Collection<SubmittedQuestion> submittedQuestions;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<SubmittedQuestion> getSubmittedQuestions() {
		return submittedQuestions;
	}

	public SubmittedSurvey() {
	}

	public SubmittedSurvey(String name) {
		this.name = name;
		this.submittedQuestions = new ArrayList<SubmittedQuestion>();
	}
	
	public void addSubmittedQuestionToSubmission(SubmittedQuestion submittedQuestion) {
		submittedQuestions.add(submittedQuestion);
	}
	
	public boolean checkSubmittedQuestionInSubmission(SubmittedQuestion submittedQuestion) {
		return submittedQuestions.contains(submittedQuestion);
	}
	
}