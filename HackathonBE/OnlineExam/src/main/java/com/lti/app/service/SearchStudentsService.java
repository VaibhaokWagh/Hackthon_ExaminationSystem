package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Users;

public interface SearchStudentsService
{
	public List<Users> SearchStudents(String city, String tname);

	public List<String> getAllCities();
}
