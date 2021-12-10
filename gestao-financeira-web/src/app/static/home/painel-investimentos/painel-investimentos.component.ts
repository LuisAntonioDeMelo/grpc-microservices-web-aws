import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-painel-investimentos',
  templateUrl: './painel-investimentos.component.html',
  styleUrls: ['./painel-investimentos.component.css']
})
export class PainelInvestimentosComponent implements OnInit {

  constructor(public route: ActivatedRoute) {}
  items = [
    {icon:'savings', nome: 'Ativos Financeiros', link: '/home/painel-investimentos/ativos' },
    // { nome: 'Orçamentos', link: '/home/painel-financas-pessoais/painel-gestao' },
    // {
    //   nome: 'Redimentos',
    //   link: 'painel-financas-pessoais/painel-investimentos',
    // },
  ]

  ngOnInit(): void {
  }

}
