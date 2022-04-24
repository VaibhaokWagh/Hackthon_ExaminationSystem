package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Questions;

public interface AddSingleQuestionService {
	
	public void addSingleQuestion(Questions question);

	public boolean deleteQuestionById(String qid);
	
	public Questions findQuestion(String qid);
	
	public List<Questions> getallquestions();

}
