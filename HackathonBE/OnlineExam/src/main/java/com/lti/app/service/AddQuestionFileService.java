package com.lti.app.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QSort;
import org.springframework.stereotype.Service;

import com.lti.app.pojo.Questions;
import com.lti.app.repository.AddQuestionFileRepo;

@Service
public class AddQuestionFileService {

	@Autowired
	private AddQuestionFileRepo ques;
	
	String line="";
	public void saveQuestions(String fname) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("src/main/resources/"+fname));
			while((line=br.readLine())!=null) {
				String [] data=line.split(",");
				Questions q=new Questions();
				q.setQid(data[0]);
				q.setQname(data[1]);
				q.setOption1(data[2]);
				q.setOption2(data[3]);
				q.setOption3(data[4]);
				q.setOption4(data[5]);
				q.setCorrect_Ans(data[6]);
				q.setTid(data[7]);
				ques.save(q);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
