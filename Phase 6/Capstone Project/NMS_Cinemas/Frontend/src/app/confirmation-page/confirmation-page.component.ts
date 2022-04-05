import { Component, OnInit } from '@angular/core';
import { Booking } from '../Booking';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-confirmation-page',
  templateUrl: './confirmation-page.component.html',
  styleUrls: ['./confirmation-page.component.css']
})
export class ConfirmationPageComponent implements OnInit {

  constructor(private bookingService:BookingService) { }

  ngOnInit(): void {
  }

  movie:Booking = this.bookingService.booking

}
