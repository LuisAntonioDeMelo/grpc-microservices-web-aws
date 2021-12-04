import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cliente-lista',
  templateUrl: './cliente-lista.component.html',
  styleUrls: ['./cliente-lista.component.css']
})
export class ClienteListaComponent implements OnInit {

  constructor(
    private snack: MatSnackBar,
    private router: Router,
    private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  editar(){
    this.router.navigate(['/home/painel-gestao/cliente/cliente-form']);
  }

}
