import{ async, ComponentFixture, TestBed } from'@angular/core/testing';

import{ ProfileComponent } from'./profile.component';

describe('ProfileComponent', () => {
  letcomponent:ProfileComponent;
  letfixture:ComponentFixture<ProfileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProfileComponent ]
    })
    .compileComponents();
  }));
  beforeEach(() => {
    fixture=TestBed.createComponent(ProfileComponent);
    component=fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

