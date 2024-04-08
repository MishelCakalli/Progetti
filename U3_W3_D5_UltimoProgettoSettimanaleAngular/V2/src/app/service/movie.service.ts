import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movie } from '../models/movie.interface';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private apiUrl = environment.apiURL;

  constructor(private http: HttpClient) { }

  getMoviesPopular(): Observable<Movie[]> {
    return this.http.get<Movie[]>(`${this.apiUrl}movies-popular`);
  }

}
