package com.lti.app.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users
{
	@Id
	private String userid;
	private String email;
	private String password;
	private String city;
	private long mobile_number;
	private String college;
	private String fullname;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "userid")
//	private List<Reportcard> reportcard;
//
//	public List<Reportcard> getReportcard()
//	{
//		return reportcard;
//	}
//
//	public void setReportcard(List<Reportcard> reportcard)
//	{
//		this.reportcard = reportcard;
//	}

	public Users()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String userid, String email, String password, String city, long mobile_number, String college,
			String fullname)
	{
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.city = city;
		this.mobile_number = mobile_number;
		this.college = college;
		this.fullname = fullname;
	}

	public String getUserid()
	{
		return userid;
	}

	public void setUserid(String userid)
	{
		this.userid = userid;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public long getMobile_number()
	{
		return mobile_number;
	}

	public void setMobile_number(long mobile_number)
	{
		this.mobile_number = mobile_number;
	}

	public String getCollege()
	{
		return college;
	}

	public void setCollege(String college)
	{
		this.college = college;
	}

	public String getFullname()
	{
		return fullname;
	}

	public void setFullname(String fullname)
	{
		this.fullname = fullname;
	}

	@Override
	public String toString()
	{
		return "Users [userid=" + userid + ", email=" + email + ", password=" + password + ", city=" + city
				+ ", mobile_number=" + mobile_number + ", college=" + college + ", fullname=" + fullname + "]";
	}

}
