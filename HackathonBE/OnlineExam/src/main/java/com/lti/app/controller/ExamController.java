package com.lti.app.controller;

import java.util.List;

import org.apache.commons.text.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lti.app.pojo.Questions;
import com.lti.app.pojo.Reportcard;
import com.lti.app.pojo.Topic;
import com.lti.app.pojo.Users;
import com.lti.app.service.AddQuestionFileService;
import com.lti.app.service.AddSingleQuestionService;
import com.lti.app.service.EmailService;
import com.lti.app.service.ExamService;
import com.lti.app.service.ReportCardService;
import com.lti.app.service.SearchStudentsService;
import com.lti.app.service.UserService1;
import com.lti.app.service.UserServiceLogin;

//@CrossOrigin("http://localhost:4200")

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class ExamController
{
	@Autowired
	ExamService eService;

	@GetMapping("/getQuestions/{tid}")
	public List<Questions> getQuestions(@PathVariable(name = "tid") String tid)
	{

		return eService.getQuestions(tid);
	}

	@GetMapping("/getTopic")
	public List<Topic> getTopics()
	{
		return eService.getTopic();
	}

	@Autowired
	ReportCardService rService;

	@GetMapping("/reportcard/{rid}")
	public List<Users> getReportcard(@PathVariable(name = "rid") String rid)
	{
		return rService.getReportcard(rid);
	}

	@PostMapping("/reportcard")
	public boolean addProduct(@RequestBody Reportcard rep)
	{
		rService.addReportCard(rep);
		return true;
	}
	
	@GetMapping("/singlereportcard/{userid}")
	public List<Users> getSingleReport(@PathVariable(name = "userid") String userid)
	{
		return rService.getSingleReport(userid);
	}

	@Autowired
	UserService1 uservice;

	@PostMapping("/users")
	public boolean addUser(@RequestBody Users user)
	{
		uservice.addUser(user);
		return true;
	}

	@Autowired
	UserServiceLogin us;

	@GetMapping("/userslogin/{userid}")
	public Users searchUsers(@PathVariable(name = "userid") String userid)
	{
		return us.searchUserById(userid);
	}

	@Autowired
	private AddQuestionFileService qs;

	/*
	 * @RequestMapping(path="upload") public void setDataInDb(){ qs.saveQuestions();
	 * }
	 */
	@PostMapping(value = "/uploadcsv")
	public void postImage(@RequestParam("file") MultipartFile file)
	{

		String fileName = file.getOriginalFilename();
		qs.saveQuestions(fileName);

	}
	
	@Autowired
	AddSingleQuestionService aService;
	
	@PostMapping("/addsinglequestion")
	public boolean addQuestion(@RequestBody Questions question)
	{
        aService.addSingleQuestion(question);
		return true;
	}
	
	@DeleteMapping("/deletequestion/{qid}")
	public boolean deleteQuestion(@PathVariable(name="qid") String qid)
	{     // Questions question=aService.searchProductbyId(qid);
	  return aService.deleteQuestionById(qid);
	}
	
	@GetMapping("/getallquestions")
	public List<Questions> getallquestions()
	{
		return aService.getallquestions();
	
	}
	
	@Autowired
	SearchStudentsService sService;

	@GetMapping("/searchstudents/{city}/{tname}")
	public List<Users> SearchStudents(@PathVariable(name = "city") String city, @PathVariable(name = "tname") String tname)
	{
		return sService.SearchStudents(city, tname);
	}
	
	@GetMapping("/getAllCities")
	public List<String> getAllCities()
	{
		return sService.getAllCities();
	}
	
	@Autowired
	private EmailService service;
	
	@GetMapping("/forgetpass/{userid}")
	public boolean triggerMail(@PathVariable(name="userid") String uniqid) {
		Users u=us.searchUserById(uniqid);
		RandomStringGenerator rsg = new RandomStringGenerator.Builder()
			    .selectFrom("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray())
			    .build();
		String newPass=rsg.generate(10);
		String toMail = u.getEmail();
		u.setPassword(newPass);
		us.updateuser(u);
		service.sendSimpleEmail(toMail, "Your new password set to : "+newPass, "Exam Portal New Password");
		return true;
	}
	@PutMapping("/validatepassword")
		public void updateuser(@RequestBody Users u) {
		us.updateuser(u);	
	}
}
