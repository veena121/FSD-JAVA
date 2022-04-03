import{ Injectable } from'@angular/core';
import{ Observable } from'rxjs';
import{ HttpClient } from'@angular/common/http';
import{ environment } from'../../environments/environment';

@Injectable({
    providedIn:'root'
  })
  exportclassProfileService {
    baseUrl=environment.baseUrl;

  constructor(
    privatehttp:HttpClient
  ) { }

  contactus(data:any):Observable<any> {
    returnthis.http.post('http://localhost:4200/contact',data);
  }
  }

