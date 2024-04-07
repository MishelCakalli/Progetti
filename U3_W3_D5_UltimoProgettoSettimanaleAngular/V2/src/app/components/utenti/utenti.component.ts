import { Component, OnInit } from '@angular/core';

//import { PostService } from 'src/app/service/movie.service';

@Component({
    selector: 'app-utenti',
    templateUrl: './utenti.component.html',
    styleUrls: ['./utenti.component.scss'],
})
export class UtentiComponent {


    // constructor(private postSrv: PostService) {}

    // ngOnInit() {
    //     console.log('ngOnInit attivato');
    //     this.postSrv.getPosts().subscribe((data) => {
    //         this.posts = data;
    //     });
    // }

    // enablePost(id: number, index: number) {
    //     this.postSrv.updatePost(id, { completed: true }).subscribe();
    //     this.posts.splice(index, 1);
    // }

    // deletePost(id: number, index: number) {
    //     this.postSrv.deletePost(id).subscribe();
    //     this.posts.splice(index, 1);
    // }
}
