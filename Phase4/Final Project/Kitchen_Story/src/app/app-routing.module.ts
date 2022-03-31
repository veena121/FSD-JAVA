import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { OrderdetailspageComponent } from './orderdetailspage/orderdetailspage.component';
import { PaymentpageComponent } from './paymentpage/paymentpage.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { ShowproductComponent } from './showproduct/showproduct.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserpageComponent } from './userpage/userpage.component';

const routes: Routes = [
  // {"path":"add",component:AddproductComponent},
  {"path":"show",component:ShowproductComponent},
  {"path":"adminLogin",component:AdminloginComponent},
  {"path":"userLogin",component:UserloginComponent},
  {"path":"userPage",component:UserpageComponent,
        children:[{"path":"searchProduct",component:SearchproductComponent},
                  {"path":"paymentPage",component:PaymentpageComponent},
                  {"path":"paymentPage/orderDetailsPage",component:OrderdetailspageComponent}]},
  {"path":"adminPage",component:AdminpageComponent,
        children:[{"path":"showProduct",component:ShowproductComponent},
        {"path":"addProduct",component:AddproductComponent}]},
  {"path":"adminPage/logout",component:UserloginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
