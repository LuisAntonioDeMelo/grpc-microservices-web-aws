import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Categoria } from '../models/models'
import { environment } from '../../environments/environment'

@Injectable({
  providedIn: 'root'
})
export class EstadoService {

  constructor(private http:HttpClient) { }

  get():Observable<any[]> {
    return this.http.get<any[]>(`${environment.url}/estados`)
  }
}
