import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './pages/about/about.component';
import { AdminLoginComponent } from './pages/admin-login/admin-login.component';
import { AdminComponent } from './pages/admin/admin.component';
import { ContactComponent } from './pages/contact/contact.component';
import { FeedbackComponent } from './pages/feedback/feedback.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { MenuComponent } from './pages/menu/menu.component';
import { MenupageComponent } from './pages/menupage/menupage.component';
import { RegistrationComponent } from './pages/registration/registration.component';
import { RestaRegisterComponent } from './pages/resta-register/resta-register.component';
import { RestoLoginComponent } from './pages/resto-login/resto-login.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'menu',component:MenuComponent},
  {path:'menu/:id',component:MenupageComponent},
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactComponent},
  {path:'login', component:LoginComponent},
  {path:'registration',component:RegistrationComponent},
  {path:'feedback',component:FeedbackComponent},
  {path:'resto-login',component:RestoLoginComponent},
  {path:'admin-login',component:AdminLoginComponent},
  {path:'resta-register',component:RestaRegisterComponent},
  {path:'admin',component:AdminComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
