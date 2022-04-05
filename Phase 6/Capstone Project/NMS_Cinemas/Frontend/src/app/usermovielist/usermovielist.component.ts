import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookingService } from '../booking.service';
import { Movie } from '../Movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-usermovielist',
  templateUrl: './usermovielist.component.html',
  styleUrls: ['./usermovielist.component.css']
})
export class UsermovielistComponent implements OnInit {
  movies:Movie[]
  retrievedImage:any;
  base64Data:any;
  retrieveResponse:any;
  constructor(private service:MovieService, private router:Router, private bookingService:BookingService) { }

  ngOnInit(): void {
    this.service.getMovies().subscribe(x=>this.movies=x);
  }

  bookMovie(m:Movie)
  {
    this.service.bookMovie = m;
    this.router.navigateByUrl("movieDetails")
  }

}
