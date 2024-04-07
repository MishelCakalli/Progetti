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
  favorites: any[] = [];

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.getPopularMovies();
  }

  getPopularMovies(): void {
    this.movieService.getMoviesPopular()
      .subscribe(movies => {
        this.movies = movies;
      });
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
  }

  removeFromFavorites(movie: any) {
    const index = this.favorites.indexOf(movie);
    if (index !== -1) {
      this.favorites.splice(index, 1);
    }
  }

  isInFavorites(movie: any): boolean {
    return this.favorites.includes(movie);
  }
}
