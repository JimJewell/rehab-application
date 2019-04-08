package com.rehab.rehabapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class AnswerChoice {

	
	@Id
	@GeneratedValue
	private Long id;
	
	private String answerChoice;
	
	private String value;

	public AnswerChoice() {}
	
	public AnswerChoice(String answerChoice, String value) {
		this.answerChoice = answerChoice;
		this.value = value;
		
		
	}

	public Long getId() {
		return id;
	}

	public String getAnswerChoice() {
		return answerChoice;
	}

	public String getValue() {
		return value;
	} 
	
	
}
