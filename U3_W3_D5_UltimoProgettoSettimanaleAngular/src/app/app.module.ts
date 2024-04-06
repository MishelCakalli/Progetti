import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { RegistratiComponent } from './components/registrati/registrati.component';
import { MovieComponent } from './components/movie/movie.component';
import { UtentiComponent } from './components/utenti/utenti.component';
import { ProfiloComponent } from './components/profilo/profilo.component';

const routes: Route[] = [
  {
      path: '',
      component: HomeComponent,
  },
  {
      // path: 'activePosts',
      // component: ActivePostsComponent,
      // canActivate: [AuthGuard]
  },

];


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    LoginComponent,
    RegisterComponent,
    RegistratiComponent,
    MovieComponent,
    UtentiComponent,
    ProfiloComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes),FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
