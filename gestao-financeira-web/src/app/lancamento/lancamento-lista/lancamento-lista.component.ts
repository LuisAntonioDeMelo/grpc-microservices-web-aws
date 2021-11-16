import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm, FormGroup, Validators, FormBuilder } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';
import { Lancamento, Categoria, Pessoa, TipoLancamento } from 'src/app/models/models';
import { CategoriaService } from 'src/app/services/categoria.service';
import { LancamentoService } from 'src/app/services/lancamento.service';
import { PessoaService } from 'src/app/services/pessoa.service';

@Component({
  selector: 'app-lancamento-lista',
  templateUrl: './lancamento-lista.component.html',
  styleUrls: ['./lancamento-lista.component.css']
})
export class LancamentoListaComponent implements OnInit {

  lancamentos: Lancamento[]
  categorias: Categoria[]
  pessoas: Pessoa[]
  tipoLancamento: typeof TipoLancamento = TipoLancamento

  @ViewChild('form') form: NgForm

  private unsubscribed$: Subject<any> = new Subject()

  displayedColumns: string[] = [
    'codigo',
    'descricao',
    'dataPagamento',
    'dataVencimento',
    'valor',
    'categoria',
    'pessoa',
    'observação',
    'editar',
    'excluir',
  ]
  dataSource = []

  formPesquisa: FormGroup = this.fb.group({
    codigo: [null, []],
    tipoLancamento: [null, [Validators.required]],
    dataVencimento: [null, [Validators.required]],
    dataPagamento: [null, [Validators.required]]
  })

  constructor(
    private fb: FormBuilder,
    private lancamentoService: LancamentoService,
    private categoriaService: CategoriaService,
    private pesssoaService: PessoaService,
    private snack: MatSnackBar,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.lancamentoService
      .get()
      .pipe(takeUntil(this.unsubscribed$))
      .subscribe((lancamentos) => {
        this.lancamentos = lancamentos
        this.dataSource = lancamentos
      })

    this.categoriaService
      .get()
      .subscribe((categorias) => (this.categorias = categorias))

    this.pesssoaService.get().subscribe((pessoas) => (this.pessoas = pessoas))
  }

  public pesquisa() {
    this.lancamentoService
      .get()
      .pipe(takeUntil(this.unsubscribed$))
      .subscribe((lancamentos) => {
        this.lancamentos = lancamentos
        this.dataSource = lancamentos
      })
  }

  novo(){
    this.router.navigate(['/painel-financas-pessoais/lancamentos/lancamento-form']);
  }
  limpar(){}

  editar(lancamento: Lancamento) {
    this.router.navigate(['/painel-financas-pessoais/lancamentos/lancamento-form/', lancamento.codigo]);
  }

  excluir(lancamento: Lancamento) {
    this.lancamentoService.delete(lancamento.codigo).subscribe(
      (ok) => {
        this.notificacao('Foi excluido com sucesso.')
      },
      (error) => this.notificacao(error.message),
    )
  }

  notificacao(msg: string) {
    this.snack.open(msg, 'ok', { duration: 3000 })
  }

  ngOnDestroy(): void {
    this.unsubscribed$.next()
  }
}
