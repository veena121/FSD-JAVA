import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor() { }

  admin = {"username":"admin@kitchenstory.com","password":"kitchenstory@123"}

  login(uname:string,password:string)
  {
    if(this.admin.username==uname && this.admin.password==password)
    {
      return true;
    }
    return false;
  }
}
