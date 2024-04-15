import { Component,OnInit } from '@angular/core';
import { Post } from 'src/app/models/post.interface';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrls: ['./audi.component.scss']
})
export class AudiComponent {
  posts: Post[] = [];
  randomCars: Post[] = [];


  constructor() {}

  ngOnInit() {
    this.evidencePost();
  }

  async evidencePost() {
    try {
      const response = await fetch('../../assets/db.json');
      const data: Post[] = await response.json();
      this.posts = data;
      this.randomCars = this.extractRandomItems(data, 2);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }

  extractRandomItems(array: Post[], count: number): Post[] {
    const shuffled = array.sort(() => 0.5 - Math.random());
    return shuffled.slice(0, count);
  }

  
}
