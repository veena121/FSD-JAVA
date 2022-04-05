import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Movie } from '../Movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-updatemovie',
  templateUrl: './updatemovie.component.html',
  styleUrls: ['./updatemovie.component.css']
})
export class UpdatemovieComponent implements OnInit {

  constructor(private route:ActivatedRoute, private service:MovieService, private router:Router) { }
  movie:Movie;
  time:string[];
  options = [
    {name:'9AM To 11AM', value:'9AM-11AM', checked:false},
    {name:'12PM To 2PM', value:'12PM-2PM', checked:false},
    {name:'3PM To 5PM', value:'3PM-5PM', checked:false},
    {name:'6PM To 8PM', value:'6PM-8PM', checked:false}
  ]
  selectedFile:File;
  public onFileChanged(event:any) {
    this.selectedFile = event.target.files[0];
  }

  ngOnInit(): void {
    this.movie = this.service.updateMovie;
  }

  updateMovie()
  {
    this.time = this.options.filter(opt => opt.checked).map(opt => opt.value);
    var commaSeperatedTimings = this.time.toString();
    this.movie.show_timings = commaSeperatedTimings;

    this.service.updateMovieFunc(this.movie).subscribe(
      (data)=>{console.log(data);
        this.uploadImage();
      }
      );
  }

  uploadImage()
  {
    const uploadImageData = new FormData();
    uploadImageData.append('imageFile', this.selectedFile, this.movie.name);
    this.service.addImage(uploadImageData).subscribe(
      (data)=>{console.log(data);}
    )
  }
}
