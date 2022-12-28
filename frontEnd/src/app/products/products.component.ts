import { Component, OnInit } from '@angular/core';
import {DataService} from "../services/data.service";
import {Router} from "@angular/router";
import {GlobalService} from "../services/global.service";
import {Product} from "../models/product";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnInit {

  productList: Array<Product> = [];
  proType: string = '';

  constructor(private ds: DataService,
              private router: Router,
              protected gd: GlobalService) {
    this.proType = this.gd.proType;
    console.log('type:', this.gd.proType)
  }

  ngOnInit(): void {
    const body = {"proType": this.gd.proType};
    this.ds.getByProType(body).subscribe((res: any)=> {
      this.productList = res.data.products;
    })
  }

}
