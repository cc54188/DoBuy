import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {HelloAngularComponent} from "./hello-angular/hello-angular.component";
import {JumpHomeComponent} from "./jump-home/jump-home.component";
import {ProductsComponent} from "./products/products.component";

const routes: Routes = [
  {
    path: '',  //
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'hello',
    component: HelloAngularComponent
  },
  // 這邊開始是跳蚤小拍賣
  {
    path: 'home',
    component: JumpHomeComponent
  },
  {
    path: 'products',
    component: ProductsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
