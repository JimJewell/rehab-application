package com.rehab.rehabapp.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AnswerChoice {

	@Id
	@GeneratedValue
	private Long id;

	private String answerChoice;

	private int value;

	@ManyToMany
	@JsonIgnore
	private Collection <Question> questions;
		
	public AnswerChoice() {}
	
	public AnswerChoice(String answerChoice, int value) {
		this.answerChoice = answerChoice;
		this.value = value;
		this.questions = new ArrayList<Question>();

	}

	public Long getId() {
		return id;
	}

	public String getAnswerChoice() {
		return answerChoice;
	}

	public int getValue() {
		return value;
	}

	public void addQuestionToAnswerChoice(Question question) {
		questions.add(question);
	}

	public Collection<Question> getQuestions() {
		return questions;
	}
	
	
}