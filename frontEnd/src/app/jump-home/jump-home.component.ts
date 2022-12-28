import { Component, OnInit } from '@angular/core';
import {ProType} from "../models/protype";
import {ActivatedRoute, Router} from "@angular/router";
import {DataService} from "../services/data.service";
import {GlobalService} from "../services/global.service";

@Component({
  selector: 'app-jump-home',
  templateUrl: './jump-home.component.html',
  styleUrls: ['./jump-home.component.scss']
})
export class JumpHomeComponent implements OnInit {

  proTypeList: Array<ProType> = [];
  url: string = '/api'

  constructor(protected router: Router,
              private activatedRoute: ActivatedRoute,
              private ds: DataService,
              private gd: GlobalService) { }
// 一進來就查詢所有商品種類回前端
  ngOnInit(): void {
    this.ds.getAllProType().subscribe((res: any)=> {
      console.log('res', res);
      
      this.proTypeList = res;
      console.log('proTypeArr:', this.proTypeList);
    })
  }

  getProducts(proType: string): void {
    this.gd.proType = proType;
    this.router.navigate(['products']);
  }

}
