package com.lti.app.service;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Questions;
import com.lti.app.repository.AddsingleQuestionRepo;

@Service
@Transactional
public class AddSingleQuestionServiceImpl implements AddSingleQuestionService {

	@Autowired
	AddsingleQuestionRepo aRepo;
	
	
	@Override
	public void addSingleQuestion(Questions question) {
		// TODO Auto-generated method stub
		aRepo.addSingleQuestion(question);
	}

	
	@Override
    public Questions findQuestion(String qid) {
        Questions pp= aRepo.findQuestion(qid);
 
        return pp;
    }

	@Override
	public boolean deleteQuestionById(String qid) {
		// TODO Auto-generated method stub
		
        Questions pp= aRepo.findQuestion(qid);
        
		return aRepo.deleteQuestion(pp);
	}
	
	@Override
	public List<Questions> getallquestions()
	{
		return aRepo.getallquestions();
	}



}
