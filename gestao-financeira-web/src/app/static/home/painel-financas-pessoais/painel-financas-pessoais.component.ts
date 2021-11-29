import { Component, OnInit } from '@angular/core'
import { ActivatedRoute } from '@angular/router'
import { Subject } from 'rxjs'

@Component({
  selector: 'app-painel-financas-pessoais',
  templateUrl: './painel-financas-pessoais.component.html',
  styleUrls: ['./painel-financas-pessoais.component.css'],
})
export class PainelFinancasPessoaisComponent implements OnInit {
  constructor(public route: ActivatedRoute) {}
  items = [
    { nome: 'Lançamentos', link: '/home/painel-financas-pessoais/lancamentos' },
    { nome: 'Orçamentos', link: '/home/painel-financas-pessoais/painel-gestao' },
    {
      nome: 'Conta Cliente',
      link: 'painel-financas-pessoais/painel-investimentos',
    },
  ]

  ngOnInit(): void {}
}
