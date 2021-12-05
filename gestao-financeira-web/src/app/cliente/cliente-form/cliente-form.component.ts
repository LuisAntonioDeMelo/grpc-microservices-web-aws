import { EstadoService } from './../../services/estado.service';
import { CidadeService } from './../../services/cidade.service';
import { ClienteService } from './../../services/cliente.service';
import { Component, OnInit } from '@angular/core'
import { FormBuilder, FormGroup, Validators } from '@angular/forms'
import { MatSnackBar } from '@angular/material/snack-bar'
import { Router } from '@angular/router'
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-cliente-form',
  templateUrl: './cliente-form.component.html',
  styleUrls: ['./cliente-form.component.css'],
})
export class ClienteFormComponent implements OnInit {
  cidades = [];
  estados = [];
  dias = [
    5,
    10,
    15,
    20
  ]

  clienteForm: FormGroup = this.fb.group({
    id: [null, []],
    idPessoa : [null, []],
    nome: [null, [Validators.required]],
    email: [null, [Validators.required]],
    telefone: [null, [Validators.required]],
    cpf: [null, [Validators.required]],
    rg: [null, [Validators.required]],
    cidade: [null, ''],
    estado: [null, ''],
    diaVencimento: [null, ''],
    limite: [null,''],
    logradouro:[null, [Validators.required]],
    numero:[null, [Validators.required]],
    complemento:[null, [Validators.required]],
    bairro:[null, [Validators.required]],
    cep: [null, [Validators.required]],
  })

  constructor(
    private snack: MatSnackBar,
    private router: Router,
    private fb: FormBuilder,
    private clienteService: ClienteService,
    private auth: AuthService,
    private cidadeService:CidadeService,
    private estadoService: EstadoService
  ) {}

  ngOnInit(): void {
    this.clienteForm.get('idPessoa').setValue(this.auth.currentUserValue.idPessoa);
    this.clienteForm.get('nome').setValue(this.auth.currentUserValue.nome);
    this.cidadeService.get().subscribe(res => {
      console.log(res)
      this.cidades = res;
    })
    this.estadoService.get().subscribe(res => {
      this.estados = res;
    })
    this.clienteService.getPorId(this.auth.currentUserValue.idPessoa).subscribe(res => {
      console.log(res)
      this.clienteForm.setValue(res);
    })

  }

  public limpar() {
    this.clienteForm.patchValue({
      id: '',
      nome: '',
      email: '',
      telefone: '',
      cpf: '',
      rg: '',
      cidade: '',
      estado: '',
      diaVencimento:'',
      limite:'',
      logradouro:'',
      numero:'',
      complemento:'',
      bairo:'',
      cep:''
    })
    this.clienteForm.reset()
  }

  salvar() {
    if(this.clienteForm.valid){
      let cliente = this.clienteForm.value;
      console.log(cliente);
      this.clienteService.salvar(cliente).subscribe(
        res=> {
          this.notificacao('Dados do cliente foram alterados');
        },
        (error) => {
          this.notificacao('Ocorreu um erro ao atualizar os dados do cliente');
        }
      );
    }
    this.notificacao('Insira os dados corretamente')
    return;
  }

  retornarUser(){
    this.router.navigate(['/home/painel-gestao/cliente']);
  }

  notificacao(msg: string) {
    this.snack.open(msg, 'ok', { duration: 3000 })
  }
}
