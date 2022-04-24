package com.lti.app.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
public class Topic
{
	@Id
	private String tid;
	private String tname;
	private int tlevel;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "tid",nullable = true)
//	private List<Questions> question;
//
//	public List<Questions> getQuestion()
//	{
//		return question;
//	}
//
//	public void setQuestion(List<Questions> question)
//	{
//		this.question = question;
//	}

	public Topic()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(String tid, String tname, int tlevel)
	{
		super();
		this.tid = tid;
		this.tname = tname;
		this.tlevel = tlevel;
	}

	public String getTid()
	{
		return tid;
	}

	public void setTid(String tid)
	{
		this.tid = tid;
	}

	public String getTname()
	{
		return tname;
	}

	public void setTname(String tname)
	{
		this.tname = tname;
	}

	public int getTlevel()
	{
		return tlevel;
	}

	public void setTlevel(int tlevel)
	{
		this.tlevel = tlevel;
	}

	@Override
	public String toString()
	{
		return "Topic [tid=" + tid + ", tname=" + tname + ", tlevel=" + tlevel + "]";
	}

}
