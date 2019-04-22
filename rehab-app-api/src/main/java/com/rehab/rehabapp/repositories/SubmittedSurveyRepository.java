package com.rehab.rehabapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rehab.rehabapp.models.SubmittedSurvey;

@Repository
public interface SubmittedSurveyRepository extends CrudRepository<SubmittedSurvey, Long> {

	SubmittedSurvey findByName(String name);

}
