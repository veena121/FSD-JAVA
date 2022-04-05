import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Booking } from './Booking';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  url:string="http://localhost:8969/myapi/bookings/add";

  booking:Booking;
  constructor(private http:HttpClient) { }

  addBooking(bk:Booking)
  {
    console.log(bk)
    return this.http.post<Booking>(this.url,bk);
  }
}
