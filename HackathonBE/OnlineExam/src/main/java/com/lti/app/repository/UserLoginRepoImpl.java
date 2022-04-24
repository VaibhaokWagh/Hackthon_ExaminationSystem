package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Users;
@Repository
public class UserLoginRepoImpl implements UserLoginRepo{

	@Autowired
	EntityManager eMan;
	
	@Override
	public Users searchUserById(String userid) {
		Users u=eMan.find(Users.class,userid);
		//System.out.println(u);
		//Query qry=eMan.createQuery("from User");
		return u;
		
	}
	@Override
	public void updateuser(Users user) {
		eMan.merge(user);
		
	}

}
