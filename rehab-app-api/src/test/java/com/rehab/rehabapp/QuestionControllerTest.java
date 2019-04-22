package com.rehab.rehabapp;



import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.rehab.rehabapp.controllers.QuestionController;
import com.rehab.rehabapp.controllers.SurveyController;
import com.rehab.rehabapp.models.Question;
import com.rehab.rehabapp.repositories.QuestionRepository;
import com.rehab.rehabapp.repositories.SubmittedQuestionRepository;
import com.rehab.rehabapp.repositories.SubmittedSurveyRepository;
import com.rehab.rehabapp.repositories.SurveyRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(SurveyController.class)
public class QuestionControllerTest {
	
	@Autowired
	private WebApplicationContext context;
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	SubmittedQuestionRepository submitQuestionRepo;
    @MockBean
	SubmittedSurveyRepository submitSurveyRepo;
    @MockBean
	QuestionRepository questionRepo;
    @MockBean
	SurveyRepository surveyRepo;

    @InjectMocks
    private QuestionController QuesrionController;
    
    public void setup() {
    	this.mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    
    @Test
    public void givenQuestion_whenGetQuestions_theReturnJsonArray() throws Exception {
    	Question question = new Question("question", "");
    	List<Question> allQuestions = Arrays.asList(question);
    	given(questionRepo.findAll()).willReturn(allQuestions);
    	mvc.perform(get("/questions").contentType(MediaType.APPLICATION_JSON))
    	.andExpect(status().isOk())
    	.andExpect(jsonPath("$", hasSize(1)))
    	.andExpect(jsonPath("$[0].name", is(question.getName())));
    }
}