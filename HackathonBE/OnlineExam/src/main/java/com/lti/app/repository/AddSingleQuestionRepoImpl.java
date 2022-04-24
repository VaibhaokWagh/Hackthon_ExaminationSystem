package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Questions;

@Repository
public class AddSingleQuestionRepoImpl implements AddsingleQuestionRepo{

	@Autowired
	EntityManager eMan;
	
	
	@Override
	public void addSingleQuestion(Questions question) {
		// TODO Auto-generated method stub
		eMan.persist(question);
	}


	@Override
	public boolean deleteQuestion(Questions question) {
		// TODO Auto-generated method stub
		eMan.remove(question);
		return true;
	}
	
	@Override
	public Questions findQuestion(String qid) {
		// TODO Auto-generated method stub
		Questions pp = eMan.find(Questions.class, qid);
		
		return pp;
	}
	
	@Override
	public List<Questions> getallquestions()
	{
		Query qry=eMan.createQuery("from Questions");
		return qry.getResultList();
	}

}
