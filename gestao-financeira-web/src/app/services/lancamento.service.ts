import {tap} from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Lancamento } from '../models/models';
import { BehaviorSubject } from 'rxjs/internal/BehaviorSubject';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class LancamentoService {
  private lancamentosSubject$ :BehaviorSubject<any[]> = new BehaviorSubject<any[]>([]);
  private isCarregado: boolean = false;

  constructor(private http:HttpClient) {}

  get(idPessoa):Observable<any[]> {
    return this.http.get<any[]>(`${environment.url}/lancamentos/listar/${idPessoa}`);
  }

  add(lancamento):Observable<any> {
    return this.http.post<any>(`${environment.url}/lancamentos`,lancamento)
  }

  delete(codigo: number):Observable<any> {
    return this.http.delete(`${environment.url}/lancamentos/${codigo}`)
  }

}
