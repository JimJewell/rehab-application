package com.rehab.rehabapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rehab.rehabapp.models.Survey;

@Repository
public interface SurveyRepository extends CrudRepository<Survey, Long> {

	Survey findByName(String name);

}
