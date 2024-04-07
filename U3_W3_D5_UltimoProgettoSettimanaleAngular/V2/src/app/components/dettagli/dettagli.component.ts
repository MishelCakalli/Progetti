import { Component, OnInit } from '@angular/core';


import { ActivatedRoute } from '@angular/router';

@Component({
    selector: 'app-dettagli',
    templateUrl: './dettagli.component.html',
    styleUrls: ['./dettagli.component.scss'],
})
export class DettagliComponent {//implements OnInit 
    // post!: Post;a

    // constructor(private postSrv: PostService, private router: ActivatedRoute) {}

    // ngOnInit(): void {
    //     this.router.params.subscribe((params) => {
    //         const id = +params['id'];
    //         this.postSrv.getPost(id).subscribe((data) => {
    //             this.post = data;
    //         });
    //     });
    // }
}
