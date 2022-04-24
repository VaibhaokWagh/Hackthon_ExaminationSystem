package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.lti.app.pojo.Users;
import com.lti.app.repository.UserLoginRepo;
@Service
@Transactional
public class UserServiceLoginRepo implements UserServiceLogin{

	@Autowired
	private UserLoginRepo ur;
	
	@Override
	public Users searchUserById(String userid) {
		// TODO Auto-generated method stub
		return ur.searchUserById(userid);
	}
	@Override
	public void updateuser(Users user) {
		// TODO Auto-generated method stub
		ur.updateuser(user);
	}

}
