package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Questions;

public interface AddsingleQuestionRepo {

	public void addSingleQuestion(Questions question);
	
	public boolean deleteQuestion(Questions question);
	
	public Questions findQuestion(String qid);
	
	public List<Questions> getallquestions();
}
