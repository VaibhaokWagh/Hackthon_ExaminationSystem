package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Users;
import com.lti.app.pojo.Users;

public interface UserLoginRepo {
	public  Users searchUserById(String userid);
	public void updateuser(Users user);
}
