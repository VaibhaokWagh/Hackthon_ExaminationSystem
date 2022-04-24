package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Reportcard;
import com.lti.app.pojo.Users;

public interface ReportCardRepo
{
	public List<Users> getReportcard(String rid);
	public boolean addReportCard(Reportcard rep);
	public List<Users> getSingleReport(String userid);
}
