import { Component } from '@angular/core';

import { Register } from 'src/app/models/register.interface';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {

    userReg!: Register;
    constructor(private authSrv: AuthService){
    }
    onSumbit(form: NgForm){
      try{
        this.authSrv.singup(form.value).subscribe();
      }catch(error){
        console.error(error);
      }
    }
}
