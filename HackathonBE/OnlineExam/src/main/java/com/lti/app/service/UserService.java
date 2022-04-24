package com.lti.app.service;

import com.lti.app.pojo.Users;
import com.lti.app.repository.UserRepo1;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements UserService1{
    @Autowired
    UserRepo1 uRepo;
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		uRepo.addUser(user);
	}
	
}
