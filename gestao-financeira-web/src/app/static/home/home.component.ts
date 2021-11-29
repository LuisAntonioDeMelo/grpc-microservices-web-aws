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
    {icon:'assignment',nome:'Finanças Pessoais',rota:'/home/painel-financas-pessoais'},
    {icon:'assignment',nome:'Gestão',rota:'/home/painel-gestao'},
    {icon:'assignment',nome:'Investimentos',rota:'/home/painel-investimentos'},
    {icon:'assignment',nome:'Config',rota:'/home'}
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


