import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  constructor(private router: Router, private appcomp: AppComponent) { }

  ngOnInit(): void {
  }

  gotoUserPage(){
    this.router.navigate(['/userPage']);
    this.appcomp.displayLoginNav=false;
  }
}
