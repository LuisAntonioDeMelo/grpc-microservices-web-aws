import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { ClienteService } from 'src/app/services/cliente.service';

@Component({
  selector: 'app-cliente-lista',
  templateUrl: './cliente-lista.component.html',
  styleUrls: ['./cliente-lista.component.css']
})
export class ClienteListaComponent implements OnInit {

  cliente:any

  constructor(
    private snack: MatSnackBar,
    private router: Router,
    private fb: FormBuilder,
    private clienteService: ClienteService,
    private auth: AuthService,
    ) { }

  ngOnInit(): void {
    const idCliente = this.auth.currentUserValue.id;
    this.clienteService.getPorId(idCliente).subscribe(res => {
      console.log(res)
      this.cliente = res;
    })
  }

  editar(){
    this.router.navigate(['/home/painel-gestao/cliente/cliente-form']);
  }

}
