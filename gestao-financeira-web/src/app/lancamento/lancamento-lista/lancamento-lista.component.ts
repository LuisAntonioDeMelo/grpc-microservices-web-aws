import { AuthService } from './../../services/auth.service';
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
    'diaVencimento',
    'valor',
    'categoria',
    'observação',
    'editar',
    'excluir',
  ]
  dataSource = []

  formPesquisa: FormGroup = this.fb.group({
    codigo: [null, []],
    tipoLancamento: [null, ''],
    dataVencimento: [null, ''],
    dataPagamento: [null, '']
  })

  idPessoa:number;

  constructor(
    private fb: FormBuilder,
    private lancamentoService: LancamentoService,
    private categoriaService: CategoriaService,
    private snack: MatSnackBar,
    private authService:AuthService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.idPessoa = this.authService.currentUserValue.idPessoa;
    this.categoriaService.get()
      .subscribe((categorias) => (this.categorias = categorias))

    this.lancamentoService.get(this.idPessoa).subscribe((lancamentos) => {
        console.log(lancamentos)
        this.lancamentos = lancamentos
        this.dataSource = lancamentos
      })
  }

  public pesquisar() {
    console.log(this.idPessoa)
    this.lancamentoService.get(this.idPessoa).subscribe((lancamentos) => {
        this.lancamentos = lancamentos
        this.dataSource = lancamentos
      })
  }

  novo(){
    this.router.navigate(['/home/painel-financas-pessoais/lancamentos/lancamento-form']);
  }
  limpar(){}

  editar(lancamento: Lancamento) {
    this.router.navigate(['/home/painel-financas-pessoais/lancamentos/lancamento-form', lancamento.codigo]);
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

  // ngOnDestroy(): void {
  //   this.unsubscribed$.next()
  // }

   setNameCategoria(value ){
     console.log(value)
      return  this.categorias.find(c => c.codigo == value)
  }



}
