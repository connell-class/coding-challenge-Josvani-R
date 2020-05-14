import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Item } from '../model/item';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private http: HttpClient) { }

  set(item:Item): Promise<Item> {
    return this.http
    .post<Item>(environment.base_url+'/lists',item).toPromise();
  }

  removeItem(id: number): Promise<Item>{
    return this.http.delete<Item>(environment.base_url+'/item?id=' + id).toPromise();
  }

  getByListId(id: number):Promise<Item>{
    return this.http.get<Item>(environment.base_url+'/item?id='+ id).toPromise();
  }
  update(item:Item): Promise<Item>{
    return this.http.post<Item>(environment.base_url+'/update',item).toPromise();
  }

}
