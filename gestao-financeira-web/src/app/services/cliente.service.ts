import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Categoria } from '../models/models'
import { environment } from '../../environments/environment'

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private http:HttpClient) { }

  get():Observable<any[]> {
    return this.http.get<any[]>(`${environment.url}/clientes`)
  }

  getPorId(id:number):Observable<any[]> {
    return this.http.get<any[]>(`${environment.url}/clientes/${id}`)
  }

}
