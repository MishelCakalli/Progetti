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

    constructor(private movieService: MovieService) { }

    ngOnInit(): void {
        this.getMovies();
    }

    getMovies(): void {
        this.movieService.getMovies()
            .subscribe(movies => {
                this.movies = movies;
            });
    }
}
