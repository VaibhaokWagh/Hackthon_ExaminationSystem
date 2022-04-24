import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Questions } from './questions';
import { Reportcard } from './reportcard';
import { Users } from './users';

@Injectable({
  providedIn: 'root'
})
export class ExamServiceService {

  httpBaseUrl = "http://localhost:9098/rest/api";

  constructor(private myhttp:HttpClient,private router: Router) { }

  getTopics()
  {
    return this.myhttp.get(this.httpBaseUrl +"/getTopic");
  }
  getQuestions(tid:string)
  {
    return this.myhttp.get(this.httpBaseUrl +"/getQuestions/"+tid);
  }
  getReportCard(rid:any)
  {
    return this.myhttp.get(this.httpBaseUrl +"/reportcard/" +rid);
  }
  postReportCard(report:Reportcard)
  {
    return this.myhttp.post(this.httpBaseUrl +"/reportcard",report);
  }

  getSingleReportcard(userid:any)
  {
    return this.myhttp.get(this.httpBaseUrl +"/singlereportcard/" +userid);
  }

  saveUser(user:Users)
  {
    return this.myhttp.post(this.httpBaseUrl +"/users",user);
  }

  loginstudent(uniqid:string)
  {
    return this.myhttp.get(this.httpBaseUrl+"/userslogin/"+uniqid);
  }

  logoutButton()
  { 
    sessionStorage.removeItem('userid');
    alert("Logging out");
    this.router.navigate(['homepage']);
  }

  upload(formData: FormData) {
    let url='http://localhost:9098/rest/api/uploadcsv';
    return this.myhttp.post(url, formData);
  }

  getAlluestions(qs:Questions)
  {
    return this.myhttp.post(this.httpBaseUrl+"/addsinglequestion",qs);
  }

  deleteQuestion(qid:string)
  {
    return this.myhttp.delete(this.httpBaseUrl+"/deletequestion/"+qid)
  }

  ShowAllQuestion()
  {
    return this.myhttp.get(this.httpBaseUrl+"/getallquestions");
  }

  getAllCities()
  {
    return this.myhttp.get(this.httpBaseUrl +"/getAllCities");
  }

  searchStudent(city:string,tname:string)
  {
    return this.myhttp.get(this.httpBaseUrl +"/searchstudents/" +city +"/" +tname);
  }
  forgetpassword(uniqid:string){
    return this.myhttp.get(this.httpBaseUrl+"/forgetpass/"+uniqid);
  }
  updatepassword(user :Users){
    return this.myhttp.put(this.httpBaseUrl+"/validatepassword/",user)
  }
}
