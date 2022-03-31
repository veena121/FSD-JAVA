import { Injectable } from '@angular/core';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }

  products:Product[] = [];
  searchedproducts:Product[] = [];
  productDetails:Product;

  addProduct(product:Product)
  {
    this.products.push(product);
  }

  getAllProducts():Product[]
  {
    return this.products;
  }

  removeProduct(product:Product)
  {
    this.products.forEach((value,index)=>{
      if(value==product) this.products.splice(index,1);
  });
  }

  searchProduct(product:string):Product[]
  {
    this.searchedproducts.slice(0,this.searchedproducts.length)
    var i:number;
    for(i=0;i<this.products.length;i++)
    {
      if(this.products[i].name==product)
      {
        this.searchedproducts.push(this.products[i]);
      }
    }
    return this.searchedproducts;
  }
}
