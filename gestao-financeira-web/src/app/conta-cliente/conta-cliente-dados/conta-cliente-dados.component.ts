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
}
