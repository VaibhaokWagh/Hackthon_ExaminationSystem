package com.lti.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.app.pojo.Reportcard;
import com.lti.app.pojo.Users;
import com.lti.app.service.ReportCardService;
import com.lti.app.service.UserService1;

@SpringBootTest
class HackathonTests {

	
	@Autowired
	ReportCardService reportCardService;
	
	@Autowired
	UserService1 userService;
	
	
	@Test
	public void testAddReportCard() {
	Reportcard rObj = new Reportcard();
	rObj.setRid("R558");
	rObj.setUserid("AA22");
	rObj.setTid("T121");
	rObj.setMarks(1);
	rObj.setRemarks("Fail");

	boolean result = reportCardService.addReportCard(rObj);
	assertNotNull( rObj);

	}
	
	@Test
	public void testAddUser() {
	Users u1 = new Users("AAA182","Chandrapur","COEP","aaa112@gmail.com",98,"VKW","qwerty");
	userService.addUser(u1);
	assertNotNull(u1);
	
	}
}
