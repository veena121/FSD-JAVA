import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-searchproduct',
  templateUrl: './searchproduct.component.html',
  styleUrls: ['./searchproduct.component.css']
})
export class SearchproductComponent implements OnInit {

  constructor(private productService:ProductService, private router:Router) { }

  ngOnInit(): void {
  }

  products:Product[]=[];
  buyProduct:Product;
  searchValue: string='';
  getValue(val:string)
  {
    console.warn(val);
    this.searchValue = val;
  }

  searchProduct():Product[]
  {
    console.log(this.searchValue);
    this.products = this.productService.searchProduct(this.searchValue);
    return this.products;
  }

  attachValues(id:number)
  {
    var i;
    for(i=0;i<this.products.length;i++)
    {
      if(this.products[i].id==id)
      {
        this.buyProduct = this.products[i];
        this.productService.productDetails = this.buyProduct;
        console.log(this.productService.productDetails);
        break;
      }
    }
    this.router.navigateByUrl('userPage/paymentPage');
  }
}
