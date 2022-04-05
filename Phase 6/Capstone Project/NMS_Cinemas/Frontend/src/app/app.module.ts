import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { ListmoviesComponent } from './listmovies/listmovies.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserpageComponent } from './userpage/userpage.component';
import { UpdatemovieComponent } from './updatemovie/updatemovie.component';
import { SearchmovieComponent } from './searchmovie/searchmovie.component';
import { UsermovielistComponent } from './usermovielist/usermovielist.component';
import { MoviedetailspageComponent } from './moviedetailspage/moviedetailspage.component';
import { PaymentspageComponent } from './paymentspage/paymentspage.component';
import { ConfirmationPageComponent } from './confirmation-page/confirmation-page.component';

@NgModule({
  declarations: [
    AppComponent,
    AddmovieComponent,
    ListmoviesComponent,
    AdminloginComponent,
    AdminpageComponent,
    UserloginComponent,
    UserpageComponent,
    UpdatemovieComponent,
    SearchmovieComponent,
    UsermovielistComponent,
    MoviedetailspageComponent,
    PaymentspageComponent,
    ConfirmationPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
