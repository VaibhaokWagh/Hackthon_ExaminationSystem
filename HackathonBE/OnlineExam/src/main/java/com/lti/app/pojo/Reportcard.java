package com.lti.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reportcard")
public class Reportcard
{
	@Id
	private String rid;
	private String userid;
	private String tid;
	private int marks;
	private String remarks;

	public Reportcard()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Reportcard(String rid, String userid, String tid, int marks, String remarks)
	{
		super();
		this.rid = rid;
		this.userid = userid;
		this.tid = tid;
		this.marks = marks;
		this.remarks = remarks;
	}

	public String getRid()
	{
		return rid;
	}

	public void setRid(String rid)
	{
		this.rid = rid;
	}

	public String getUserid()
	{
		return userid;
	}

	public void setUserid(String userid)
	{
		this.userid = userid;
	}

	public String getTid()
	{
		return tid;
	}

	public void setTid(String tid)
	{
		this.tid = tid;
	}

	public int getMarks()
	{
		return marks;
	}

	public void setMarks(int marks)
	{
		this.marks = marks;
	}

	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Override
	public String toString()
	{
		return "Reportcard [rid=" + rid + ", userid=" + userid + ", tid=" + tid + ", marks=" + marks + ", remarks="
				+ remarks + "]";
	}

}
