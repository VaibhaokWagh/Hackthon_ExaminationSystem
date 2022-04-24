import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ExamServiceService } from '../exam-service.service';

@Component({
  selector: 'app-addcsvquestions',
  templateUrl: './addcsvquestions.component.html',
  styleUrls: ['./addcsvquestions.component.css']
})
export class AddcsvquestionsComponent implements OnInit {
  file:any
  constructor(private fileservice:ExamServiceService,private router:Router) { }

  ngOnInit(): void {
  }

  onFileChange(event:any){
    this.file=event.target.files[0];
  }
  upload() {
    let formData: FormData = new FormData();
    formData.append('file', this.file);
    console.log(formData.get('file'));
  
    this.fileservice.upload(formData).subscribe(data => {
      alert("Questions added successfully");
    })
  }
  back()
  {
    this.router.navigate(['adminpage']);
  }


}
