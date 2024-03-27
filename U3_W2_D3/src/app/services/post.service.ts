import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Post } from '../models/post.interface';
import { Subject, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class PostService {

  apiURL = 'https://dummyjson.com/docs/products';
  favoritesSub = new Subject<number>();
  favoritesCounter = 0;

  constructor(private http: HttpClient) {}

  getData() {
      return this.http.get<Post[]>(this.apiURL).pipe(
          catchError((err) => {
              return throwError(this.getErrorMessage(err.status));
          })
      );
  }

  getErrorMessage(status: number) {
      let message = '';
      switch (status) {
          case 404:
              message = 'Elementi non trovati';
              break;

          default:
              message = 'Qualcosa non ha funzionato nella chiamata';
              break;
      }
      return message;
  }
}
