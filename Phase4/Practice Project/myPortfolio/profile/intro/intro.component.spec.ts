import{ async, ComponentFixture, TestBed } from'@angular/core/testing';

import{ IntroComponent } from'./intro.component';

describe('IntroComponent', () => {
  letcomponent:IntroComponent;
  letfixture:ComponentFixture<IntroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IntroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture=TestBed.createComponent(IntroComponent);
    component=fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});




