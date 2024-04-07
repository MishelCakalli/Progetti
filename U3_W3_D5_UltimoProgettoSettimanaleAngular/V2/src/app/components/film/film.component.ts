import { Component, OnInit } from '@angular/core';
import { MovieService } from 'src/app/service/movie.service';
import { Movie } from 'src/app/models/movie.interface';

@Component({
  selector: 'app-film',
  templateUrl: './film.component.html',
  styleUrls: ['./film.component.scss'],
})
export class FilmComponent implements OnInit {
  movies: Movie[] = [];
  favorites: Movie[] = [];

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.getPopularMovies();
    this.loadFavorites();
  }

  getPopularMovies(): void {
    this.movieService.getMoviesPopular()
      .subscribe(movies => {
        this.movies = movies;
      });
  }

  loadFavorites(): void {
    const favoritesFromStorage = localStorage.getItem('favorites');
    if (favoritesFromStorage) {
      this.favorites = JSON.parse(favoritesFromStorage);
    }
  }

  toggleFavorite(movie: Movie) {
    if (this.isInFavorites(movie)) {
      this.removeFromFavorites(movie);
    } else {
      this.addToFavorites(movie);
    }
  }

  addToFavorites(movie: Movie) {
    this.favorites.push(movie);
    localStorage.setItem('favorites', JSON.stringify(this.favorites));
  }

  removeFromFavorites(movie: Movie) {
    const index = this.favorites.findIndex(fav => fav.id === movie.id);
    if (index !== -1) {
      this.favorites.splice(index, 1);
      localStorage.setItem('favorites', JSON.stringify(this.favorites));
    }
  }

  isInFavorites(movie: Movie): boolean {
    return this.favorites.some(fav => fav.id === movie.id);
  }
}
