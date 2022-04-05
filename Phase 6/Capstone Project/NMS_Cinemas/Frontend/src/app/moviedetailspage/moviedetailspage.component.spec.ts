import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MoviedetailspageComponent } from './moviedetailspage.component';

describe('MoviedetailspageComponent', () => {
  let component: MoviedetailspageComponent;
  let fixture: ComponentFixture<MoviedetailspageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MoviedetailspageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MoviedetailspageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
