import { Component, OnInit, ViewChild } from '@angular/core'
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms'

import { LancamentoService } from '../services/lancamento.service'
import { CategoriaService } from '../services/categoria.service'
import { PessoaService } from '../services/pessoa.service'
import { Lancamento, Categoria, Pessoa, TipoLancamento } from '../models/models'
import { Subject } from 'rxjs'
import { MatSnackBar } from '@angular/material/snack-bar'
import { takeUntil } from 'rxjs/operators'
import { OnDestroy } from '@angular/core'
import { Router } from '@angular/router'

@Component({
  selector: 'app-lancamento',
  templateUrl: './lancamento.component.html',
})
export class LancamentoComponent implements OnInit, OnDestroy {
  ngOnInit(): void {

  }
  ngOnDestroy(): void {

  }

}
