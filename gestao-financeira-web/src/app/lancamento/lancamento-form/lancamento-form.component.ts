import { AuthService } from 'src/app/services/auth.service';
import { ClienteService } from './../../services/cliente.service';
import { Component, OnInit, ViewChild } from '@angular/core'
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms'
import { MatSnackBar } from '@angular/material/snack-bar/'
import {
  Lancamento,
  Categoria,
  Pessoa,
  TipoLancamento,
} from 'src/app/models/models'
import { CategoriaService } from 'src/app/services/categoria.service'
import { LancamentoService } from 'src/app/services/lancamento.service'

@Component({
  selector: 'app-lancamento-form',
  templateUrl: './lancamento-form.component.html',
  styleUrls: ['./lancamento-form.component.css'],
})
export class LancamentoFormComponent implements OnInit {
  lancamentos: Lancamento[]
  categorias: Categoria[]
  tipoLancamento: typeof TipoLancamento = TipoLancamento
  idPessoa:any

  @ViewChild('form') form: NgForm

  constructor(
    private fb: FormBuilder,
    private lancamentoService: LancamentoService,
    private categoriaService: CategoriaService,
    private clienteService:ClienteService,
    private snack: MatSnackBar,
    private authService: AuthService
  ) {}

  ngOnInit(): void {
    this.categoriaService.get().subscribe(res => {
      this.categorias = res;
    })
    this.idPessoa = this.authService.currentUserValue.idPessoa
  }

  lancamentoForm: FormGroup = this.fb.group({
    codigo: [null, []],
    tipoLancamento: [null, [Validators.required]],
    dataVencimento: [null, [Validators.required]],
    dataPagamento: [null, [Validators.required]],
    descricao: ['', [Validators.required]],
    valor: [null, [Validators.required]],
    categoria: ['', [Validators.required]],
    observacao: ['', [Validators.required]],
  })

  public salvar() {
    if (this.lancamentoForm.valid) {
      let values = this.lancamentoForm.value
      values.clienteId = this.idPessoa;
      console.log(values)
      this.lancamentoService.add(values).subscribe(
        (ok) => {
          this.notificacao('Lançamento Salvo com Sucesso.')
        },
        (error) => {
          console.log(error)
          this.notificacao('Erro ao Salvar - :' + error.message)
        },
      )
    }else {
      this.notificacao('Preencha todos os campos ');
    }
   // this.limpar()
  }

  editar(lancamento: Lancamento) {
    this.lancamentoForm.setValue(lancamento)
  }

  public limpar() {
    this.lancamentoForm.patchValue({
      tipoLancamento: '',
      dataVencimento: '',
      dataPagamento: '',
      descricao: '',
      valor: '',
      categoria: '',
      observacao: '',
    })
    this.lancamentoForm.reset()
    this.form.resetForm()
  }

  notificacao(msg: string) {
    this.snack.open(msg, 'ok', { duration: 3000 })
  }
}
