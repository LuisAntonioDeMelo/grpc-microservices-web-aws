import { Component, OnInit } from '@angular/core'
import { FormBuilder, FormGroup, Validators } from '@angular/forms'
import { MatSnackBar } from '@angular/material/snack-bar'
import { ActivatedRoute, Router } from '@angular/router'
import { AuthService } from 'src/app/services/auth.service'
import { ClienteService } from 'src/app/services/cliente.service'
import { ContaClienteService } from 'src/app/services/conta-cliente.service'

@Component({
  selector: 'app-conta-cliente-form',
  templateUrl: './conta-cliente-form.component.html',
  styleUrls: ['./conta-cliente-form.component.css'],
})
export class ContaClienteFormComponent implements OnInit {
  id:any

  contaClienteForm: FormGroup = this.fb.group({
    banco: [null, [Validators.required]],
    numeroConta: [null, [Validators.required]],
    saldo: [null, [Validators.required]],
    digito: [null, [Validators.required]],
    tipoConta: [null, [Validators.required]],
  })
  cliente:any;

  constructor(
    private fb: FormBuilder,
    private clienteService: ClienteService,
    private auth: AuthService,
    private contaClienteService: ContaClienteService,
    private snack: MatSnackBar,
    private router: Router,
    private route:ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.carregarCliente(this.auth.currentUserValue.idPessoa);
    this.id =  this.route.snapshot.params.id;

    if(this.id){
      this.contaClienteService.getPorId(this.id).subscribe(conta => {
        this.carregarConta(conta)
      })
    }

  }

  carregarCliente(idPessoa) {
    this.clienteService.getPorId(idPessoa).subscribe((c) => {
      console.log(c)
      this.cliente = c
    })
  }

  carregarConta(conta){
    this.contaClienteForm.patchValue({
      banco: conta.banco,
      numeroConta: conta.numeroConta,
      saldo: conta.saldo,
      digito: conta.digito,
      tipoConta: conta.conta
    })
  }

  limpar() {}

  salvar() {
    if (this.contaClienteForm.valid) {
      let contaCliente = this.contaClienteForm.value;
      this.contaClienteService.salvar({
        id:this.id,
        clienteId: this.cliente.id,
        banco: contaCliente.banco,
        numeroConta: contaCliente.numeroConta,
        saldo: contaCliente.saldo,
        digito: contaCliente.digito,
        conta: contaCliente.tipoConta
      }).subscribe(
        (ok) => {
          this.notificacao('Conta Salva com Sucesso.')
          setTimeout(() => {
            this.router.navigate(['/home/painel-gestao/conta-cliente']);
          }, 200);
        },
        (error) => {
          console.log(error)
          this.notificacao('Erro ao Salvar - :' + error.message)
        },
      )
    }else {
      this.notificacao('Preencha todos os campos ');
    }
  }


  notificacao(msg: string) {
    this.snack.open(msg, 'ok', { duration: 3000 })
  }
}
