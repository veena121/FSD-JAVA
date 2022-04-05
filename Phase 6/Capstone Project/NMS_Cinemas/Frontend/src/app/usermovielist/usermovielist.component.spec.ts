import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsermovielistComponent } from './usermovielist.component';

describe('UsermovielistComponent', () => {
  let component: UsermovielistComponent;
  let fixture: ComponentFixture<UsermovielistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UsermovielistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UsermovielistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
