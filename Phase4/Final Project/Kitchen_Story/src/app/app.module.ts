import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ShowproductComponent } from './showproduct/showproduct.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { UserpageComponent } from './userpage/userpage.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { PaymentpageComponent } from './paymentpage/paymentpage.component';
import { OrderdetailspageComponent } from './orderdetailspage/orderdetailspage.component';

@NgModule({
  declarations: [
    AppComponent,
    AddproductComponent,
    ShowproductComponent,
    AdminpageComponent,
    UserpageComponent,
    AdminloginComponent,
    UserloginComponent,
    SearchproductComponent,
    PaymentpageComponent,
    OrderdetailspageComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
