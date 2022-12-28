import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) {
  }

  getAllProType() {
    return this.http.get('/api/proType/getAll');
  }

  getByProType(product: any) {
    return this.http.post('/api/product/getByProType', product);
  }

  // deleteProType(proType: any) {
  //   return this.http.delete('/api/proType/delete');
  // }
}
