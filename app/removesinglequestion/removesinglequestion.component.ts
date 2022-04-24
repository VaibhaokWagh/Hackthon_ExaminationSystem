import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ExamServiceService } from '../exam-service.service';

@Component({
  selector: 'app-removesinglequestion',
  templateUrl: './removesinglequestion.component.html',
  styleUrls: ['./removesinglequestion.component.css']
})
export class RemovesinglequestionComponent implements OnInit {

  questions:any;
  q:string|undefined;

  constructor(private qs:ExamServiceService,private router:Router) { }

  ngOnInit(): void {
    this.qs.ShowAllQuestion().subscribe(
      (data)=>{
        console.log(data);
        this.questions=data;
      },
      (error)=>
      {
        console.log(error);
      }
    )

  }

  deleteQuestion(qid:string)
  {
    this.qs.deleteQuestion(qid).subscribe(
      (data)=>{
        console.log(data)
        alert("Deleted")
      },
      (error)=>console.log(error)
      )
    
  }
  back()
  {
    this.router.navigate(['adminpage']);
  }

}
