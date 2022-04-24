package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Reportcard;
import com.lti.app.pojo.Users;

public interface ReportCardService
{
	public List<Users> getReportcard(String rid);
	public boolean addReportCard(Reportcard rep);
	public List<Users> getSingleReport(String userid);
}
