import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from './Movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  url:string="http://localhost:8969/myapi/movies/add";
  url2:string="http://localhost:8969/myapi/movies/add/Image";
  url3:string="http://localhost:8969/myapi/movies/";
  url4:string="http://localhost:8969/myapi/movies/update"
  url5:string="http://localhost:8969/myapi/movies/delete"

  updateMovie:Movie;
  bookMovie:Movie;

  constructor(private http:HttpClient) { }

  getMovies():Observable<Movie[]>
  {
      return this.http.get<Movie[]>(this.url3);
  }

  addMovie(m:Movie)
  {
    return this.http.post<Movie>(this.url,m);
  }

  addImage(img:any)
  {
    return this.http.post(this.url2, img, {observe:'response'})
  }

  updateMovieFunc(m:Movie)
  {
    return this.http.post<Movie>(this.url4,m);
  }

  deleteMovie(id:number)
  {
    return this.http.post<number>(this.url5,id)
  }
}
