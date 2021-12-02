import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  usuario:any;

  routings = [
    {icon:'home',nome:'Inicio',rota:'/home'},
    {icon:'data_thresholding',nome:'Finanças Pessoais',rota:'/home/painel-financas-pessoais'},
    {icon:'hail',nome:'Gestão Cliente',rota:'/home/painel-gestao'},
    {icon:'request_quote',nome:'Investimentos',rota:'/home/painel-investimentos'},
    {icon:'settings',nome:'Configuração',rota:'/home'}
  ];

  itemsCard = [
    {icon:'data_thresholding', nome:'Finanças Pessoais', link: '/home/painel-financas-pessoais',
      submenu: [
        {titulo:'Lançamentos'},
        {titulo: 'Orçamentos'},
        // {titulo: 'Conta Cliente'},
        {titulo: 'Extrato de Gastos'}
      ]
    },
    {icon:'hail',nome:'Gestão Cliente', link: '/home/painel-gestao',
    submenu: [
      {titulo:'Cliente'},
      {titulo: 'Contas Cliente'},
      // {titulo: 'Departamentos'},
      // {titulo: 'Cargos'},
      // {titulo: 'Fornecedores'}
    ]},
    {icon:'request_quote',nome:'Investimentos', link: '/home/painel-investimentos',
      submenu: [
        {titulo: 'Produtos '},
        {titulo: 'Vendas'}
      ]
    }
  ]

  constructor(
    private router: Router,
    private auth: AuthService,
    public route: ActivatedRoute) {}


  public logout() {
    this.auth.logout();
    this.router.navigate(['/login'])
  }

  ngOnInit(): void {
    this.usuario = this.auth.currentUserValue;
    console.log("@: "+ this.auth.currentUserValue)
  }

}


