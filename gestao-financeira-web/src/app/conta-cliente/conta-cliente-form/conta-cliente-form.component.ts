import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-conta-cliente-form',
  templateUrl: './conta-cliente-form.component.html',
  styleUrls: ['./conta-cliente-form.component.css']
})
export class ContaClienteFormComponent implements OnInit {

  contaClienteForm: FormGroup = this.fb.group({
    banco: [null, []],
    numeroConta: [null, []],
    saldo: [null, ''],
    digito: [null, ''],
    tipoConta: [null, '']
  })

  constructor(
    private fb: FormBuilder,
  ) { }

  ngOnInit(): void {
  }

  limpar(){

  }

  salvar(){

  }


}
