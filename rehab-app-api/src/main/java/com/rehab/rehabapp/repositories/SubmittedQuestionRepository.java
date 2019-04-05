package com.rehab.rehabapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rehab.rehabapp.models.SubmittedQuestion;

@Repository
public interface SubmittedQuestionRepository extends CrudRepository<SubmittedQuestion, Long> {

    SubmittedQuestion findByName(String name);

}
