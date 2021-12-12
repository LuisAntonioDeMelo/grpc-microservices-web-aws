import { ContaClienteService } from './../../services/conta-cliente.service'
import { AuthService } from './../../services/auth.service'
import { ClienteService } from './../../services/cliente.service'
import { Component, OnInit } from '@angular/core'
import { Router } from '@angular/router'

@Component({
  selector: 'app-conta-cliente-dados',
  templateUrl: './conta-cliente-dados.component.html',
  styleUrls: ['./conta-cliente-dados.component.css'],
})
export class ContaClienteDadosComponent implements OnInit {
  cliente: any
  contas = []
  bancos = [
    { id:1 , nome: "Caixa Econômica Federal" },
    { id:2 , nome: "Banco do Brasil" },
    { id:3 , nome: "Bradesco" },
    { id:4 , nome: "NU Bank" },
    { id:5 , nome: "Banco Inter" },
    { id:6 , nome: "Santander" },
    { id:7 , nome: "Banco PAN"}
  ]

  constructor(
    private router: Router,
    private clienteService: ClienteService,
    private auth: AuthService,
    private contaClienteService: ContaClienteService,
  ) {}

  ngOnInit(): void {
    const idPessoa = this.auth.currentUserValue.idPessoa
    this.clienteService.getPorId(idPessoa).subscribe((c: any) => {
      this.cliente = c
      this.carregarContas(c.id)
    })
  }

  carregarCliente(idPessoa) {
    this.clienteService.getPorId(idPessoa).subscribe((c) => (this.cliente = c))
  }

  carregarContas(idCliente) {
    this.contaClienteService
      .get(idCliente)
      .subscribe((contas) => {
        console.log(contas)
        this.contas = contas
      })
  }

  setBanco(value) {
    return this.bancos.find(b => b.id === value).nome;
  }

  tipoConta(value){
    return value === 1? 'Corrente ': 'Poupança'
  }
}
