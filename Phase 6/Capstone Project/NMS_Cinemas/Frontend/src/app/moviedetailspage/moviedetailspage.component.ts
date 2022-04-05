import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking } from '../Booking';
import { BookingService } from '../booking.service';
import { Movie } from '../Movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-moviedetailspage',
  templateUrl: './moviedetailspage.component.html',
  styleUrls: ['./moviedetailspage.component.css']
})
export class MoviedetailspageComponent implements OnInit {

  movie:Movie;
  ticket:number=0;
  timeOptions:string[]
  options:any=[]
  myRadio:string
  bookedMovie:Booking=new Booking();

  constructor(private movieService:MovieService, private bookingService:BookingService, private router:Router) { }

  ngOnInit(): void {
    this.movie = this.movieService.bookMovie;
    var array = this.movieService.bookMovie.show_timings.split(',');
    this.timeOptions = array;
    console.log(this.timeOptions)
    var i=0;
    for(i=0; i<this.timeOptions.length; i++)
    {
      this.options.push({name:this.timeOptions[i], value:this.timeOptions[i], checked:false})
    }
    console.log(this.options)
  }

  buyNow(movie:Movie)
  {
    var i;
    for(i=0; i<this.options.length; i++)
    {
      if(this.options[i].checked==this.options[i].name)
      {
        this.myRadio=this.options[i].value
        break;
      }
    }
    
    this.bookedMovie.movieName = movie.name
    this.bookedMovie.noOfTickets = this.ticket
    this.bookedMovie.showTiming = this.myRadio
    this.bookedMovie.uid = 101
    this.bookedMovie.billAmount = this.ticket * movie.price
    this.bookingService.booking = this.bookedMovie
    this.router.navigateByUrl("paymentsPage");
  }

}
