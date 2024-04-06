import { Component, OnInit } from '@angular/core';
// import { PostService } from 'src/app/service/movie.service';

import { NgForm } from '@angular/forms';
import { UserService } from 'src/app/service/user.service';
import { Router } from '@angular/router';

@Component({
    selector: 'app-preferiti',
    templateUrl: './preferiti.component.html',
    styleUrls: ['./preferiti.component.scss'],
})
export class PreferitiComponent{ //implements OnInit 

    // arrayUsers: any[] = [];

    // constructor(private postSrv: PostService, private userSrv: UserService, private router: Router) {}

    // ngOnInit(): void {
    //     this.userSrv.getUsers().subscribe((data) => {
    //         this.arrayUsers = data;
    //     });
    // }

    // save(form: NgForm) {
    //     this.postSrv.newPost(form.value).subscribe();
    //     this.router.navigate(['/']);
    // }
}
