import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { EvidenceComponent } from './components/evidence/evidence.component';
import { RelatedComponent } from './components/related/related.component';
import { AdviseComponent } from './components/advise/advise.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ActivePostsComponent } from './components/active-posts/active-posts.component';
import { InactivePostsComponent } from './components/inactive-posts/inactive-posts.component';
import { PostCardComponent } from './components/post-card/post-card.component';
const routes: Route[] = [
  {
      path: '',
      component: HomeComponent,
  },
  {
      path: 'activePosts',
      component: ActivePostsComponent,
  },
  {
      path: 'inactivePosts',
      component: InactivePostsComponent,
  },
  
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EvidenceComponent,
    RelatedComponent,
    AdviseComponent,
    NavbarComponent,
    ActivePostsComponent,
    InactivePostsComponent,
    PostCardComponent
  ],
    imports: [BrowserModule, RouterModule.forRoot(routes)],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
