import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  as:AdminService;
  constructor(adminServ: AdminService,private router:Router, private appcomp:AppComponent) { 
    this.as = adminServ;
  }

  ngOnInit(): void {
  }

  gotoAdminPage(){
    this.router.navigate(['/adminPage']);
    this.appcomp.displayLoginNav=false;
  }
}
