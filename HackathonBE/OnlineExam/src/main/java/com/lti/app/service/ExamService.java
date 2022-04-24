package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Questions;
import com.lti.app.pojo.Topic;

public interface ExamService
{
	public List<Questions> getQuestions(String tid);
	public List<Topic> getTopic();
}
