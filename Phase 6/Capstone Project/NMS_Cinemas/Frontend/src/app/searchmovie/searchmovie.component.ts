import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from '../Movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-searchmovie',
  templateUrl: './searchmovie.component.html',
  styleUrls: ['./searchmovie.component.css']
})
export class SearchmovieComponent implements OnInit {

  movies:Movie[]
  searchedMovies:Movie[]=[]
  constructor(private movieService:MovieService, private router:Router) { }

  ngOnInit(): void {
    this.movieService.getMovies().subscribe(x=>this.movies=x);
  }

  searchValue: string='';
  getValue(val:string)
  {
    console.warn(val);
    this.searchValue = val;
  }

  searchMovie()
  {
    var i;
    for(i=0; i<this.movies.length; i++)
    {
      if(this.movies[i].name == this.searchValue)
      {
        this.searchedMovies.push(this.movies[i])
      }
    }
  }

  bookMovie(m:Movie)
  {
    this.movieService.bookMovie = m;
    this.router.navigateByUrl("movieDetails")
  }

}
