import { Component, OnInit } from '@angular/core'
import { ActivatedRoute } from '@angular/router'

@Component({
  selector: 'app-painel-gestao',
  templateUrl: './painel-gestao.component.html',
  styleUrls: ['./painel-gestao.component.css'],
})
export class PainelGestaoComponent implements OnInit {

  itemsGestao = [
    { nome: 'Clientes', link: '/painel-gestao/clientes' },
    { nome: 'Fornecedores', link: '/painel-gestao/fornecedores' },
    { nome: 'Funcionarios', link: '/painel-gestao/funcionarios' },
    { nome: 'Departamentos', link: '/painel-gestao/departamentos' },
    { nome: 'Cargos', link: '/painel-gestao/cargos' },
  ]
  constructor(public route: ActivatedRoute) {}

  ngOnInit(): void {}
}
