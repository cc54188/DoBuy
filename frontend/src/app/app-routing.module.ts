import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';

const routes: Routes = [
  {
    path:'',
    component: HomePageComponent
  }
//   {
//     // 首頁
//     path: '',
//     loadChildren: () => import('./entry/entry-page.module').then(m => m.EntryPageModule)
//    },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
