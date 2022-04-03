import{ BrowserModule } from'@angular/platform-browser';
import{ NgModule } from'@angular/core';

import{ AppComponent } from'./app.component';
import{ RouterModule, Routes, ExtraOptions } from'@angular/router';
import{ ProfileComponent } from'./profile/profile.component';
import{ ProfileModule } from'profile.module.ts';
import{ HttpClientModule } from'@angular/common/http';
import {FormsModule,ReactiveFormsModule} from'@angular/forms';

constroutes:Routes= [
  {
    path:'',
    component:ProfileComponent
  }
];

constconfig:ExtraOptions= {
  useHash:true,
};

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes, config),
    ProfileModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
exportclassAppModule{ }

