import{ Component, OnInit } from'@angular/core';
import{ NgxSpinnerService } from'ngx-spinner';

@Component({
  selector:'app-profile',
  templateUrl:'./profile.component.html',
  styleUrls: ['./profile.component.scss']
})
exportclassProfileComponentimplementsOnInit {

  constructor(
    privatespinner:NgxSpinnerService
  ) { }
  ngOnInit() {
    this.spinner.show();
    setTimeout(() => {
        this.spinner.hide();
    }, 2000);
  }

}
