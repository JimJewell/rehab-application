package com.rehab.rehabapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rehab.rehabapp.models.AnswerChoice;
import com.rehab.rehabapp.models.Survey;

public interface AnswerChoicesRepository extends CrudRepository<AnswerChoice, Long> {

	AnswerChoice findByAnswerChoice(String answerChoice);

}
