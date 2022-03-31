import { Component, OnInit } from '@angular/core';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-orderdetailspage',
  templateUrl: './orderdetailspage.component.html',
  styleUrls: ['./orderdetailspage.component.css']
})
export class OrderdetailspageComponent implements OnInit {

  constructor(private productService:ProductService) { }

  ngOnInit(): void {
  }

  products:Product = this.productService.productDetails;
}
