import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private router:Router, private appcomp:AppComponent) { }

  ngOnInit(): void {
  }

  gotoAdminPage(){
    this.router.navigate(['/adminPage']);
    this.appcomp.displayLoginNav=false;
  }
}
