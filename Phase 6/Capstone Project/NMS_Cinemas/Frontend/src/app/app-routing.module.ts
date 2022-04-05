import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { ConfirmationPageComponent } from './confirmation-page/confirmation-page.component';
import { ListmoviesComponent } from './listmovies/listmovies.component';
import { MoviedetailspageComponent } from './moviedetailspage/moviedetailspage.component';
import { PaymentspageComponent } from './paymentspage/paymentspage.component';
import { SearchmovieComponent } from './searchmovie/searchmovie.component';
import { UpdatemovieComponent } from './updatemovie/updatemovie.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UsermovielistComponent } from './usermovielist/usermovielist.component';
import { UserpageComponent } from './userpage/userpage.component';

const routes: Routes = [
  {"path":"show",component:ListmoviesComponent},
  {"path":"adminLogin",component:AdminloginComponent},
  {"path":"userLogin",component:UserloginComponent},
  {"path":"adminPage",component:AdminpageComponent,
        children:[{"path":"showProduct",component:ListmoviesComponent},
        {"path":"addProduct",component:AddmovieComponent}]},
  {"path":"update/:id",component:UpdatemovieComponent},
  {"path":"userPage",component:UserpageComponent,
        children:[{"path":"searchMovie", component:SearchmovieComponent},
        {"path":"allMovie", component:UsermovielistComponent}]},
  {"path":"movieDetails", component:MoviedetailspageComponent},
  {"path":"paymentsPage", component:PaymentspageComponent},
  {"path":"confirmationPage", component:ConfirmationPageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
