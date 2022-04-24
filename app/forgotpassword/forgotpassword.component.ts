import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ExamServiceService } from '../exam-service.service';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {

  users:any;
  password:string = "";
  userid:string = "";
  newpassword:string="";

  
  resetpassword = false;
  confirm = false;


    validateEmail(){
      this.forgetpass.forgetpassword(this.userid).subscribe();
      alert('An OTP has been sent to the registered email id')
      this.resetpassword = true;
    }
    validatepassword(){
      
        this.forgetpass.loginstudent(this.userid).subscribe(
          (data)=>{
            this.users=data;
            if(this.users==null){
            console.log(data);
            alert('Invalid UserId or Password')}
            else if(this.users.password==this.password){
              console.log(data);
              console.log(this.users);
              console.log(this.users.password);
            alert('You can now reset password')
            this.confirm = true;
          
          }
            else
            alert('Invalid userId or Password')
          }
        )
        }
        updatepassword(){
          this.users.password=this.newpassword;
          this.forgetpass.updatepassword(this.users).subscribe();
          alert("Password has been successfully changed ")
          this.router.navigate(['login']);
        }
    
  


  constructor(private forgetpass:ExamServiceService,private router:Router) { }

  ngOnInit(): void {
  }

}
