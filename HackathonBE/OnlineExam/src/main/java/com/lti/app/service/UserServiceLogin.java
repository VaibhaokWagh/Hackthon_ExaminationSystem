package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Users;

public interface UserServiceLogin {
	public Users searchUserById(String userid);
	public void updateuser(Users user);
}
