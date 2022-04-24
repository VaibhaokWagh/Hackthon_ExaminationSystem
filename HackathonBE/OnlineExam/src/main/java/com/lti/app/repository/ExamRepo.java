package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Questions;
import com.lti.app.pojo.Topic;

public interface ExamRepo
{
	public void addQuestion();
	public List<Questions> getQuestions(String tid);
	public List<Topic> getTopic();
}
