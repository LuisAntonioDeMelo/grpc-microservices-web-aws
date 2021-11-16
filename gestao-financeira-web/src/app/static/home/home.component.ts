import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  itemsCard = [
    {nome:'Finanças Pessoais', link: '/painel-financas-pessoais',
      submenu: [
        {titulo:'Lançamentos'},
        {titulo: 'Orçamentos'},
        {titulo: 'Conta Cliente'},
        {titulo: 'Extrato de Gastos'}
      ]
    },
    {nome:'Gestão Sistema', link: '/painel-gestao',
    submenu: [
      {titulo:'Clientes'},
      {titulo: 'Funcionários'},
      {titulo: 'Departamentos'},
      {titulo: 'Cargos'},
      {titulo: 'Fornecedores'}
    ]},
    {nome:'Investimentos', link: '/painel-investimentos'}
  ]

  constructor(public route: ActivatedRoute) {}

  ngOnInit(): void {
  }

}


