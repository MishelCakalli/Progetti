import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { FiatComponent } from './components/fiat/fiat.component';
import { FordComponent } from './components/ford/ford.component';
import { AudiComponent } from './components/audi/audi.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LogoAutoHomeComponent } from './components/logo-auto-home/logo-auto-home.component';
import { AutoEvidenzaComponent } from './components/auto-evidenza/auto-evidenza.component';
import { FooterComponent } from './components/footer/footer.component';

const routes: Route[] = [
  {
      path: '',
      component: HomeComponent,
  },
  {
      path: 'fiat',
      component: FiatComponent,
  },
  {
      path: 'ford',
      component:FordComponent,
  },
  {
    path: 'audi',
    component: AudiComponent,
    
},
  
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FiatComponent,
    FordComponent,
    AudiComponent,
    NavbarComponent,
    LogoAutoHomeComponent,
    AutoEvidenzaComponent,
    FooterComponent
  ],
  imports: [BrowserModule, RouterModule.forRoot(routes)],
    providers: [],
    bootstrap: [AppComponent],
})
export class AppModule { }
