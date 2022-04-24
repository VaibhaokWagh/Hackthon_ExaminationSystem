package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Questions;
import com.lti.app.pojo.Topic;
import com.lti.app.repository.ExamRepo;

@Service
@Transactional
public class ExamServiceImpl implements ExamService
{
	@Autowired
	ExamRepo eRepo;
	
	@Override
	public List<Questions> getQuestions(String tid)
	{
		// TODO Auto-generated method stub
		return eRepo.getQuestions(tid);
	}

	@Override
	public List<Topic> getTopic()
	{
		// TODO Auto-generated method stub
		return eRepo.getTopic();
	}
}
