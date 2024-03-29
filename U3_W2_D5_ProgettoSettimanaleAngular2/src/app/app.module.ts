import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { ListDoneComponent } from './components/list-done/list-done.component';
import { ListMissingComponent } from './components/list-missing/list-missing.component';
import { UserPageComponent } from './components/user-page/user-page.component';
import { ListCardComponent } from './components/list-card/list-card.component';
import { NavbarComponent } from './components/navbar/navbar.component';

const routes: Route[] = [
  {
      path: '',
      component: HomeComponent,
  },
  {
      path: 'listDone',
      component: ListDoneComponent,
  },
  {
      path: 'listMissing',
      component: ListMissingComponent,
  },
  {
      path: 'userPage',
      component: UserPageComponent,
  },

];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListDoneComponent,
    ListMissingComponent,
    UserPageComponent,
    ListCardComponent,
    NavbarComponent
  ],
  imports: [BrowserModule, RouterModule.forRoot(routes)],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
