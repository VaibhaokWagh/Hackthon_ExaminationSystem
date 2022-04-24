package com.lti.app.repository;

import com.lti.app.pojo.Users;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo implements UserRepo1 {

	@Autowired
	EntityManager eMan;
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		eMan.persist(user);
	}

}
