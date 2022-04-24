package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Reportcard;
import com.lti.app.pojo.Users;
import com.lti.app.repository.ReportCardRepo;

@Service
@Transactional
public class ReportCardServiceImpl implements ReportCardService
{

	@Autowired
	ReportCardRepo rRepo;
	
	@Override
	public List<Users> getReportcard(String rid)
	{
		// TODO Auto-generated method stub
		return rRepo.getReportcard(rid);
	}

	@Override
	public boolean addReportCard(Reportcard rep)
	{
		// TODO Auto-generated method stub
		rRepo.addReportCard(rep);
		return true;
	}

	@Override
	public List<Users> getSingleReport(String userid)
	{
		// TODO Auto-generated method stub
		return rRepo.getSingleReport(userid);
	}

}
