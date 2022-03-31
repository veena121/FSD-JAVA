import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderdetailspageComponent } from './orderdetailspage.component';

describe('OrderdetailspageComponent', () => {
  let component: OrderdetailspageComponent;
  let fixture: ComponentFixture<OrderdetailspageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrderdetailspageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OrderdetailspageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
