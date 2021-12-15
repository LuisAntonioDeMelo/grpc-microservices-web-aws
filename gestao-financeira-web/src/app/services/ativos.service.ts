import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

const api ='https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=15&page=1&sparkline=false'


@Injectable({
  providedIn: 'root'
})
export class AtivosService {

  constructor(private http:HttpClient) { }

  obterCoins():Observable<any>{
    this.http.get(api).subscribe(e => console.log(e))
    return this.http.get<any[]>(api)
  }

  get(idCliente):Observable<any[]> {
    return this.http.get<any[]>(`${environment.url}/ativos/listar/${idCliente}`)
  }

  adicionar(ativo){
    return this.http.post<any>(`${environment.url}/ativos`,ativo)  }
}
