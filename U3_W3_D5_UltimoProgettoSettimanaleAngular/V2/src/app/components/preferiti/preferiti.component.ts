import { Component } from '@angular/core';

@Component({
  selector: 'app-preferiti',
  templateUrl: './preferiti.component.html',
  styleUrls: ['./preferiti.component.scss'],
})
export class PreferitiComponent {
  favorites: any[] = [];

  constructor() {
    // Inizializza l'array dei preferiti o recuperalo dallo storage
    const favoritesFromStorage = localStorage.getItem('favorites');
    if (favoritesFromStorage) {
      this.favorites = JSON.parse(favoritesFromStorage);
    }
  }

  toggleFavorite(movie: any) {
    if (this.isInFavorites(movie)) {
      this.removeFromFavorites(movie);
    } else {
      this.addToFavorites(movie);
    }
  }

  addToFavorites(movie: any) {
    this.favorites.push(movie);
    localStorage.setItem('favorites', JSON.stringify(this.favorites));
  }

  removeFromFavorites(movie: any) {
    const index = this.favorites.indexOf(movie);
    if (index !== -1) {
      this.favorites.splice(index, 1);
      localStorage.setItem('favorites', JSON.stringify(this.favorites));
    }
  }

  isInFavorites(movie: any): boolean {
    return this.favorites.includes(movie);
  }
}
