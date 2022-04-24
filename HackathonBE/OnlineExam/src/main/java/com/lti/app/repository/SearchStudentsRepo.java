package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Users;

public interface SearchStudentsRepo
{
	public List<Users> SearchStudents(String city, String tname);
	public List<String> getAllCities();
}
