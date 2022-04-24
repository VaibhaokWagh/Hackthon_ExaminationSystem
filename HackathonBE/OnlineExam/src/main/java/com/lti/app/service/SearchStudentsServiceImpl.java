package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Users;
import com.lti.app.repository.SearchStudentsRepo;

@Service
@Transactional
public class SearchStudentsServiceImpl implements SearchStudentsService
{
	@Autowired
	SearchStudentsRepo sRepo;

	@Override
	public List<Users> SearchStudents(String city, String tname)
	{

		// TODO Auto-generated method stub
		return sRepo.SearchStudents(city,tname);
	}

	@Override
	public List<String> getAllCities()
	{
		// TODO Auto-generated method stub
		return sRepo.getAllCities();
	}

}
