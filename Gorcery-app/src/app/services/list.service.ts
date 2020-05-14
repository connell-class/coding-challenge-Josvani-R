import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http"
import { List } from '../model/List';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class ListService {

  constructor(private http: HttpClient) {}

  set(list: List): Promise<List> {
    return this.http
    .post<List>(environment.base_url+'/lists',list).toPromise();

  }

  getAll(): Promise<List>{
    return this.http.get<List>(environment.base_url+'/lists').toPromise();
  }

  removeList(id: number): Promise<List>{
    return this.http.delete<List>(environment.base_url+'/list?id=' + id).toPromise();
  }

  getById(id: number):Promise<List>{
    return this.http.get<List>(environment.base_url+'/items?id='+ id).toPromise();
  }

  update(list:List): Promise<List>{
    return this.http.post<List>(environment.base_url+'/update',list).toPromise();
  }

}
