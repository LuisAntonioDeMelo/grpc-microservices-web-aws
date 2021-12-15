import { Cliente } from './../../models/models';
import { ClienteService } from './../../services/cliente.service';
import { AtivosService } from './../../services/ativos.service'
import { ChangeDetectorRef, Component, OnInit } from '@angular/core'
import { FormBuilder, FormGroup, Validators } from '@angular/forms'
import { Router } from '@angular/router'
import { AuthService } from 'src/app/services/auth.service'
import { MatSnackBar } from '@angular/material/snack-bar'

@Component({
  selector: 'app-ativos',
  templateUrl: './ativos.component.html',
  styleUrls: ['./ativos.component.css'],
})
export class AtivosComponent implements OnInit {
  cliente:any

  formAtivos: FormGroup = this.fb.group({
    codigo: [null, []],
    quantidade: ['', [Validators.required]],
  })

  displayedColumns: string[] = [
    'codigo',
    'nome',
    'quantidade',
    'valorMoeda',
    'valorFracionado',
    'excluir',
  ]
  dataSource = []
  criptos: any[]
  ativos: any[]
  ativoSelecionado: any

  constructor(
    private fb: FormBuilder,
    private ativosService: AtivosService,
    private authService: AuthService,
    private router: Router,
    private snack: MatSnackBar,
    private clienteService:ClienteService,
    private changeDetectorRef: ChangeDetectorRef
  ) {

  }

  ngOnInit(): void {
    this.ativosService.obterCoins().subscribe((c) => (this.criptos = c))

    this.clienteService.getPorId(this.authService.currentUserValue.idPessoa).subscribe((cliente) => {
      this.cliente = cliente
      this.carregarAtivos(cliente);
     })
  }

  carregarAtivos(cliente ){
    this.ativosService.get(cliente.id).subscribe(ativos => {
      console.log(ativos)
      this.ativos = ativos
      this.dataSource = ativos
      this.changeDetectorRef.detectChanges();
    })
  }

  filtrarCoins(busca): void {
    let filtrados = this.criptos.filter((a) =>
      a.name.toLowerCase().includes(busca.toLowerCase()),
    )
    this.criptos = filtrados

    if (busca === '') {
      this.ativosService
        .obterCoins()
        .subscribe((coins) => (this.criptos = coins))
    }
  }

  add() {
    if (this.formAtivos.valid && this.ativoSelecionado) {
      const qtd = parseFloat(this.formAtivos.value.quantidade)
      const ativoProduto = {
        idCliente: this.cliente.id,
        codigo: this.ativoSelecionado.symbol,
        quantidade: qtd,
        nome: this.ativoSelecionado.name,
        valorMoeda: this.ativoSelecionado.current_price,
        valorFracionado: this.ativoSelecionado.current_price * qtd,
      }

      this.ativosService.adicionar(ativoProduto).subscribe((res) => {
        this.snack.open('Salvo com sucesso', 'ok', { duration: 3000 })
        this.carregarAtivos(this.cliente);
      },error => {
        this.snack.open('Ocorreu um erro ao salvar', 'Error', { duration: 3000 })
      })
    }else {
      this.snack.open('Selecione ao menos um ativo', 'Error', { duration: 3000 })
    }

  }

  limpar() {
    this.formAtivos.patchValue({
      codigo: '',
      quantidade: '',
    })
    this.carregarAtivos(this.cliente);
  }

  selecionar(itemSelecionado) {
    this.ativoSelecionado = itemSelecionado.selected.map(
      (item) => item.value,
    )[0]
    console.log(this.ativoSelecionado)
    this.formAtivos.patchValue({
      codigo: this.ativoSelecionado.name
    })
  }
}
