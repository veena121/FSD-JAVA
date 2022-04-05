import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from '../Movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-listmovies',
  templateUrl: './listmovies.component.html',
  styleUrls: ['./listmovies.component.css']
})
export class ListmoviesComponent implements OnInit {

  movies:Movie[]
  retrievedImage:any;
  base64Data:any;
  retrieveResponse:any;
  constructor(private service:MovieService, private router:Router) { }

  ngOnInit(): void {
    this.service.getMovies().subscribe(x=>this.movies=x);
  }

  updateMovie(mov:Movie)
  {
    this.service.updateMovie = mov;
    console.log(mov.mid);
    this.router.navigateByUrl('update/');
  }

  deleteMovie(id:number)
  {
    console.log(id)
    this.service.deleteMovie(id).subscribe(
      (data)=>{console.log(data);
      });
  }
}
