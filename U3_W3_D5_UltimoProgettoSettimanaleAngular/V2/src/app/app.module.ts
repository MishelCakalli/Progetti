import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FilmComponent } from './components/film/film.component';
import { UtentiComponent } from './components/utenti/utenti.component';
import { PostCardComponent } from './components/post-card/post-card.component';
import { HomeComponent } from './components/home/home.component';
import { HighlightDirective } from './directives/highlight.directive';
import { UsersComponent } from './components/users/users.component';
import { UserDetailsComponent } from './components/user-details/user-details.component';
import { EllipsisPipe } from './pipes/ellipsis.pipe';
import { DettagliComponent } from './components/dettagli/dettagli.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { TokenInterceptor } from './auth/token.interceptor';
import { AuthGuard } from './auth/auth.guard';
import { PreferitiComponent } from './components/preferiti/preferiti.component';

const routes: Route[] = [
    {
        path: '',
        component: HomeComponent,
    },
    {
        path: 'film',
        component: FilmComponent,
        canActivate: [AuthGuard]
    },
    {
        path: 'utenti',
        component: UtentiComponent,
        canActivate: [AuthGuard]
    },
    {
        path: 'dettagli',
        component: DettagliComponent,
        canActivate: [AuthGuard]
    },
    {
        path: 'preferiti',
        component: PreferitiComponent,
        canActivate: [AuthGuard]
    },
    {
        path: 'users',
        component: UsersComponent,
        canActivate: [AuthGuard],
        children: [
            {
                path: ':id',
                component: UserDetailsComponent,
            },
        ],
    },
    {
        path: 'login',
        component: LoginComponent,
    },
    {
        path: 'register',
        component: RegisterComponent,
    },
    
];

@NgModule({
    declarations: [
        AppComponent,
        HeaderComponent,
        NavbarComponent,
        FilmComponent,
        UtentiComponent,
        PostCardComponent,
        HomeComponent,
        HighlightDirective,
        UsersComponent,
        UserDetailsComponent,
        EllipsisPipe,
        DettagliComponent,
        LoginComponent,
        RegisterComponent,
        PreferitiComponent,
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        RouterModule.forRoot(routes),
        FormsModule,
        ReactiveFormsModule,
    ],
    providers: [
        {
            provide: HTTP_INTERCEPTORS,
            useClass: TokenInterceptor,
            multi: true
        }
    ],
    bootstrap: [AppComponent],
})
export class AppModule {}
