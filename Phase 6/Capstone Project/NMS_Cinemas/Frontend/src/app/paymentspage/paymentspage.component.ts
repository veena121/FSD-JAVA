import { Component, OnInit } from '@angular/core';
import { Booking } from '../Booking';
import { BookingService } from '../booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-paymentspage',
  templateUrl: './paymentspage.component.html',
  styleUrls: ['./paymentspage.component.css']
})
export class PaymentspageComponent implements OnInit {

  constructor(private bookingService:BookingService, private router:Router) { }

  ngOnInit(): void {
  }

  currentBooking:Booking = this.bookingService.booking

  saveBooking(booking:Booking)
  {
    this.bookingService.addBooking(booking).subscribe(
      (data)=>{console.log(data);
      });
    this.router.navigateByUrl("confirmationPage")
  }

}
