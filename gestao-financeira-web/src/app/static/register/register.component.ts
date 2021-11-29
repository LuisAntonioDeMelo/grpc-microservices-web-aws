import { UserService } from './../../services/user.service'
import { Component, OnInit } from '@angular/core'
import { FormGroup, FormBuilder, Validators } from '@angular/forms'
import { MatSnackBar } from '@angular/material/snack-bar'
import { Router } from '@angular/router'
import { first } from 'rxjs/operators'
import { AuthService } from 'src/app/services/auth.service'
import { User } from 'src/app/models/models'

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  registerForm: FormGroup
  loading = false
  submitted = false

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private auth: AuthService,
    private userService: UserService,
    private snack: MatSnackBar,
  ) {
    if (this.auth.currentUserValue) {
      this.router.navigate(['/home'])
    }
  }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      username: ['', Validators.required],
      nome: ['', Validators.required],
      email: ['', Validators.required],
      confirmPassword: ['', Validators.required],
      password: ['', [Validators.required, Validators.minLength(6)]],
    })
  }
  get f() {
    return this.registerForm.controls
  }

  onSubmit() {
    this.submitted = true

    if (this.registerForm.invalid) {
      this.snack.open('Informe os dados corretamente', 'Error', { duration: 3000, panelClass: ['red-snackbar'] })
      return
    }
    console.log('@'+ this.registerForm.value);

    if(this.f.password.value !== this.f.confirmPassword.value){
      this.snack.open(
        'A senha informada não corresponde!',
        'Error',
        { duration: 3000 , panelClass: ['red-snackbar']}
      )
      return;
    }
    // "nome", "id", "senha", "ativo", "login"
    let register: User = {
      login: this.f.username.value,
      nome: this.f.nome.value,
      senha: this.f.password.value,
      ativo: true,
      id: null
    }

    this.loading = true
    this.userService
      .register(register)
      .pipe(first())
      .subscribe(
        (data) => {
          this.snack.open('Registration successful... Redirecionando', 'OK', { duration: 3000 , panelClass: ['blue-snackbar']})
          setTimeout(()=> {
            this.router.navigate(['/login'])
          },3000)
          this.router.navigate(['/login'])
        },
        (error) => {
          this.snack.open('Não foi possivél realizar registro', 'Error', { duration: 3000 })
          this.loading = false
        },
      )
  }
}
