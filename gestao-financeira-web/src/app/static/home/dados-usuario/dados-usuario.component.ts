import { ContaClienteService } from 'src/app/services/conta-cliente.service'
import {
  AfterViewInit,
  ChangeDetectorRef,
  Component,
  OnInit,
} from '@angular/core'
import { _MatTabGroupBase } from '@angular/material/tabs'
import { AtivosService } from 'src/app/services/ativos.service'
import { AuthService } from 'src/app/services/auth.service'
import { ClienteService } from 'src/app/services/cliente.service'
import { LancamentoService } from 'src/app/services/lancamento.service'

@Component({
  selector: 'app-dados-usuario',
  templateUrl: './dados-usuario.component.html',
  styleUrls: ['./dados-usuario.component.css'],
})
export class DadosUsuarioComponent implements OnInit {
  cards = []

  constructor(
    private authService: AuthService,
    private lancamentoService: LancamentoService,
    private ativosService: AtivosService,
    private clienteService: ClienteService,
    private contaClienteService: ContaClienteService,
  ) {
    const id = this.authService.currentUserValue.idPessoa
    this.lancamentoService.get(id).subscribe((lancamentos) => {
      this.cards.push({
        icon: 'money',
        nome: 'Lançamentos Realizados',
        content: lancamentos.length,
        money: false,
      })
    })

    this.clienteService.getPorId(id).subscribe((cliente: any) => {
      this.ativosService.get(cliente.id).subscribe((ativos) => {
        this.cards.push({
          icon: 'money',
          nome: 'Ativos em Carteira',
          content: ativos.length,
          money: false,
        })
      })
    })
    this.clienteService.getPorId(id).subscribe((cliente: any) => {
      this.contaClienteService.get(cliente.id).subscribe((contas) => {
        let saldoContas = contas.reduce((soma, c) => soma + c.saldo ,0)
        this.cards.push({
          icon: 'money',
          nome: 'Saldo em Contas',
          content: saldoContas,
          money: true,
        })
      })
    })
  }

  ngOnInit(): void {}
}
