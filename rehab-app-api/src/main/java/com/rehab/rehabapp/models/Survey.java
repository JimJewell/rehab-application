package com.rehab.rehabapp.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Survey{

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	private String date;
	
	@OneToMany(mappedBy="survey")
	private Collection<Question> questions;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public Survey() {
	}

	public Survey(String name, String date) {
		this.name = name;
		this.questions = new ArrayList<Question>();
	}
	
	public Survey(String name, Question...questions) {
		this.name = name;
		this.questions = Arrays.asList(questions);
	}
	
	public void addQuestionToSubmission(Question question) {
		questions.add(question);
	}
	
	public boolean checkQuestionInSubmission(Question question) {
		return questions.contains(question);
	}
	
}
