import { Component, OnInit } from '@angular/core';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-showproduct',
  templateUrl: './showproduct.component.html',
  styleUrls: ['./showproduct.component.css']
})
export class ShowproductComponent implements OnInit {

  constructor(private service:ProductService) { }

  products:Product[];

  ngOnInit(): void {
    this.products = this.service.getAllProducts();
    console.log(this.service.getAllProducts);
  }

  onClick(product:Product)
  {
    this.service.removeProduct(product);
  }

}
