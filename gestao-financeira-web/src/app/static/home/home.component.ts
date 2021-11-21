import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  routings = [
    {icon:'home',nome:'Inicio',rota:'home'},
    {icon:'assignment',nome:'Finanças Pessoais',rota:'/home/painel-financas-pessoais'},
    {icon:'assignment',nome:'Gestão',rota:'/home/painel-gestao'},
    {icon:'assignment',nome:'Investimentos',rota:'/home/painel-investimentos'},
    {icon:'assignment',nome:'Config',rota:''}
  ];

  itemsCard = [
    {nome:'Finanças Pessoais', link: '/home/painel-financas-pessoais',
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
    {nome:'Investimentos', link: '/home/painel-investimentos'}
  ]

  constructor(public route: ActivatedRoute) {}

  ngOnInit(): void {
  }

}


