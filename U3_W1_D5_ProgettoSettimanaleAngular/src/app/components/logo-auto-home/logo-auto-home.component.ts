import { Component,OnInit } from '@angular/core';
import { Post } from 'src/app/models/post.interface';

@Component({
  selector: 'app-logo-auto-home',
  templateUrl: './logo-auto-home.component.html',
  styleUrls: ['./logo-auto-home.component.scss']
})
export class LogoAutoHomeComponent implements OnInit {
  posts: Post[] = [];
  randomCars: Post[] = [];
  brandLogos: string[] = [];
  printedLogos: Set<string> = new Set<string>();

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
      this.brandLogos = this.extractBrandLogos(data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }

  extractRandomItems(array: Post[], count: number): Post[] {
    const shuffled = array.sort(() => 0.5 - Math.random());
    return shuffled.slice(0, count);
  }

  extractBrandLogos(array: Post[]): string[] {
    return Array.from(new Set(array.map(post => post.brandLogo)));
  }

  isUniqueLogo(logoUrl: string): boolean {
    return !this.printedLogos.has(logoUrl);
  }

  addPrintedLogo(logoUrl: string) {
    this.printedLogos.add(logoUrl);
  }
}
  

