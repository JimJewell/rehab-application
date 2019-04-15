package com.rehab.rehabapp.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Survey{

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	private LocalDate date;
	

	private ArrayList<Integer> sums;
	


	@ManyToMany(mappedBy="surveys")
	private Collection<Question> questions;
	
	@OneToMany(mappedBy="survey")
	private Collection<SubmittedSurvey> surveys;

	public Survey() {
	}
	
	public Survey(String name) {
		this.name = name;
		this.questions = new ArrayList<Question>();
		this.date = LocalDate.now();
		this.sums = new ArrayList<Integer>();
	}
	
	public Survey(String name, String date) {
		this.name = name;
		this.questions = new ArrayList<Question>();
		this.date = LocalDate.now();
		this.sums = new ArrayList<Integer>();
	}
	
	public Survey(String name, Question...questions) {
		this.name = name;
		this.questions = Arrays.asList(questions);
		this.date = LocalDate.now();
		this.sums = new ArrayList<Integer>();
	}
	
	public LocalDate getDate() {
		return date;
	}

	public Collection<SubmittedSurvey> getSurveys() {
		return surveys;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public ArrayList<Integer> getSums() {
		return sums;
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setSums(ArrayList<Integer> sums) {
		this.sums = sums;
	}

	public void AddSumToSums(int sum) {
		sums.add(sum);
	}
	
	public void addQuestionToSubmission(Question question) {
		questions.add(question);
	}
	
	public boolean checkQuestionInSubmission(Question question) {
		return questions.contains(question);
	}
	
}
