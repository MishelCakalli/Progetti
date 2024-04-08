import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { tap, catchError } from 'rxjs/operators';
import { JwtHelperService } from '@auth0/angular-jwt';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  apiURL = environment.apiURL;
  jwtHelper = new JwtHelperService();

  // Elementi per gestire la procedura di login
  private authSub = new BehaviorSubject<AuthData | null>(null);
  user$: Observable<AuthData | null> = this.authSub.asObservable();
  timeOut: any;

  constructor(private http: HttpClient, private router: Router) {}

  login(data: { email: string; password: string }): Observable<AuthData> {
    return this.http.post<AuthData>(`${this.apiURL}login`, data).pipe(
      tap((data) => {
        console.log('Auth data: ', data);
        this.authSub.next(data);
        localStorage.setItem('user', JSON.stringify(data));
        this.autoLogout(data);
      }),
      catchError(this.handleError)
    );
  }

  signup(data: Register): Observable<any> {
    return this.http.post(`${this.apiURL}register`, data).pipe(
      catchError(this.handleError)
    );
  }

  private handleError(error: any): Observable<any> {
    console.error(error);
    throw new Error('Errore durante la richiesta');
  }

  private autoLogout(data: AuthData) {
 
  }
}

export interface AuthData {
  token: string;
}

export interface Register {
}
