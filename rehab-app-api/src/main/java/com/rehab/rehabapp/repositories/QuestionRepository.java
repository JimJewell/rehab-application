package com.rehab.rehabapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rehab.rehabapp.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

	Question findByName(String name);

}
