import { AuthGuard } from './helpers/auth.guard';
import { RegisterComponent } from './static/register/register.component'
import { LoginComponent } from './static/login/login.component'
import { DepartamentoComponent } from './departamento/departamento.component'
import { CargoComponent } from './cargo/cargo.component'
import { FornecedorComponent } from './fornecedor/fornecedor.component'
import { FuncionarioComponent } from './funcionario/funcionario.component'
import { LancamentoListaComponent } from './lancamento/lancamento-lista/lancamento-lista.component'
import { LancamentoFormComponent } from './lancamento/lancamento-form/lancamento-form.component'
import { PainelInvestimentosComponent } from './static/home/painel-investimentos/painel-investimentos.component'
import { PainelGestaoComponent } from './static/home/painel-gestao/painel-gestao.component'
import { PainelFinancasPessoaisComponent } from './static/home/painel-financas-pessoais/painel-financas-pessoais.component'
import { NgModule } from '@angular/core'
import { Routes, RouterModule } from '@angular/router'
import { LancamentoComponent } from './lancamento/lancamento.component'
import { HomeComponent } from './static/home/home.component'
import { ClienteComponent } from './cliente/cliente.component'


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: '**', redirectTo: '/home' },
  {
    path: 'home',
    component: HomeComponent,
    canActivate: [AuthGuard],
    data: {
      breadcrumb: 'Inicio',
    },
    children: [
      {
        path: 'painel-financas-pessoais',
        component: PainelFinancasPessoaisComponent,
        canActivate: [AuthGuard],
        data: {
          breadcrumb: 'Painel Finanças Pessoais',
        },
        children: [
          {
            path: 'lancamentos',
            component: LancamentoComponent,
            data: {
              breadcrumb: 'Lancamentos',
            },
            children: [
              {
                path: '',
                component: LancamentoListaComponent,
                data: {
                  breadcrumb: 'Listar Lançamentos',
                },
              },
              {
                path: 'lancamento-form',
                component: LancamentoFormComponent,
                data: {
                  breadcrumb: 'Formulário',
                },
              },
            ],
          },
        ],
      },
      {
        path: 'painel-gestao',
        component: PainelGestaoComponent,
        canActivate: [AuthGuard],
        data: {
          breadcrumb: 'Painel Gestão Sistema',
        },
        children: [
          {
            path: 'clientes',
            component: ClienteComponent,
            data: {
              breadcrumb: 'Clientes',
            },
            children: [
              {
                path: '',
                component: LancamentoListaComponent,
                data: {
                  breadcrumb: 'Listar Clientes',
                },
              },
              {
                path: 'cliente-form',
                component: LancamentoFormComponent,
                data: {
                  breadcrumb: 'Formulário',
                },
              },
            ],
          },
          {
            path: 'funcionarios',
            component: FuncionarioComponent,
            data: {
              breadcrumb: 'Funcionarios',
            },
            children: [
              {
                path: '',
                component: LancamentoListaComponent,
                data: {
                  breadcrumb: 'Listar Funcionarios',
                },
              },
              {
                path: 'Funcionario-form',
                component: LancamentoFormComponent,
                data: {
                  breadcrumb: 'Formulário',
                },
              },
            ],
          },
          {
            path: 'fornecedores',
            component: FornecedorComponent,
            data: {
              breadcrumb: 'Fornecedores',
            },
            children: [
              {
                path: '',
                component: LancamentoListaComponent,
                data: {
                  breadcrumb: 'Listar Fornecedores',
                },
              },
              {
                path: 'fornecedor-form',
                component: LancamentoFormComponent,
                data: {
                  breadcrumb: 'Formulário',
                },
              },
            ],
          },
          {
            path: 'cargos',
            component: CargoComponent,
            data: {
              breadcrumb: 'Cargos',
            },
            children: [
              {
                path: '',
                component: LancamentoListaComponent,
                data: {
                  breadcrumb: 'Listar Cargos',
                },
              },
              {
                path: 'cargo-form',
                component: LancamentoFormComponent,
                data: {
                  breadcrumb: 'Formulário',
                },
              },
            ],
          },
          {
            path: 'departamentos',
            component: DepartamentoComponent,
            data: {
              breadcrumb: 'Departamentos',
            },
            children: [
              {
                path: '',
                component: LancamentoListaComponent,
                data: {
                  breadcrumb: 'Listar Lançamentos',
                },
              },
              {
                path: 'lancamento-form',
                component: LancamentoFormComponent,
                data: {
                  breadcrumb: 'Formulário',
                },
              },
            ],
          },
        ],
      },
    ],
  },
]

// { path: 'painel-gestao', component: PainelGestaoComponent },
// { path: 'painel-investimentos', component: PainelInvestimentosComponent },

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
