import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ContaClienteService {

  constructor(private http:HttpClient) { }

  get(codigo:number):Observable<any[]> {
    return this.http.get<any[]>(`${environment.url}/conta-cliente/listar/${codigo}`)
  }

  getPorId(id:number):Observable<any[]> {
    return this.http.get<any[]>(`${environment.url}/conta-cliente/${id}`)
  }


  salvar(cliente: any):Observable<any> {
    return this.http.post(`${environment.url}/conta-cliente/salvar`,cliente)
  }
}
