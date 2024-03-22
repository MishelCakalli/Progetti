import { Component } from '@angular/core';
import { Post } from 'src/app/models/post.interface';

@Component({
  selector: 'app-logo-auto-home',
  templateUrl: './logo-auto-home.component.html',
  styleUrls: ['./logo-auto-home.component.scss']
})
export class LogoAutoHomeComponent {
  post!: Post;
  posts!: Post[];
  printedLogos: Set<URL> = new Set<URL>();

  constructor() {
      this.evidencePost();
  }

  async evidencePost() {
      const response = await fetch('../../assets/db.json');
      const data = await response.json();
      this.posts = data;
     
  }
  isUniqueLogo(logoUrl: URL): boolean {
    return !this.printedLogos.has(logoUrl);
  }

  addPrintedLogo(logoUrl: URL) {
    this.printedLogos.add(logoUrl);
  }
}
  
  

