import { Component } from '@angular/core';
import { Post } from 'src/app/components/post';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  posts!: Post[];

    constructor() {
        this.getPosts().then((posts) => {
            this.posts = posts;
            console.log(this.posts);
            
        });
    }

    async getPosts() {
        let response = await fetch('assets/db.json');
        let data = await response.json();
        return data;
    }
}
