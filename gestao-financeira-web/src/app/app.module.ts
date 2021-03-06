import {HomeComponent} from './static/home/home.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MaterialModule } from './material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { LancamentoComponent } from './lancamento/lancamento.component';
import { MAT_DATE_LOCALE } from '@angular/material/core';
import { CategoriaComponent } from './categoria/categoria.component';
import { CargoComponent } from './cargo/cargo.component';
import { DepartamentoComponent } from './departamento/departamento.component';
import { ClienteComponent } from './cliente/cliente.component';
import { FornecedorComponent } from './fornecedor/fornecedor.component';
import { FuncionarioComponent } from './funcionario/funcionario.component';
import { PainelFinancasPessoaisComponent } from './static/home/painel-financas-pessoais/painel-financas-pessoais.component';
import { PainelInvestimentosComponent } from './static/home/painel-investimentos/painel-investimentos.component';
import { PainelGestaoComponent } from './static/home/painel-gestao/painel-gestao.component';
import { CardComponent } from './shared/card/card.component';
import { PageBreadComponent } from './shared/page-bread/page-bread.component';
import { LancamentoFormComponent } from './lancamento/lancamento-form/lancamento-form.component';
import { LancamentoListaComponent } from './lancamento/lancamento-lista/lancamento-lista.component';
import { FuncionarioFormComponent } from './funcionario/funcionario-form/funcionario-form.component';
import { FuncionarioListaComponent } from './funcionario/funcionario-lista/funcionario-lista.component';
import { CargoListaComponent } from './cargo/cargo-lista/cargo-lista.component';
import { CargoFormComponent } from './cargo/cargo-form/cargo-form.component';
import { DepartamentoFormComponent } from './departamento/departamento-form/departamento-form.component';
import { DepartamentoListaComponent } from './departamento/departamento-lista/departamento-lista.component';
import { FornecedorListaComponent } from './fornecedor/fornecedor-lista/fornecedor-lista.component';
import { FornecedorFormComponent } from './fornecedor/fornecedor-form/fornecedor-form.component';
import { ClienteFormComponent } from './cliente/cliente-form/cliente-form.component';
import { ClienteListaComponent } from './cliente/cliente-lista/cliente-lista.component';
import { CategoriaListaComponent } from './categoria/categoria-lista/categoria-lista.component';
import { CategoriaFormComponent } from './categoria/categoria-form/categoria-form.component';
import { LoginComponent } from './static/login/login.component';
import { RegisterComponent } from './static/register/register.component';
import { ErrorInterceptor } from './helpers/error.interceptor';
import { DadosUsuarioComponent } from './static/home/dados-usuario/dados-usuario.component';
import { ContaClienteComponent } from './conta-cliente/conta-cliente.component';
import { ContaClienteFormComponent } from './conta-cliente/conta-cliente-form/conta-cliente-form.component';
import { ContaClienteDadosComponent } from './conta-cliente/conta-cliente-dados/conta-cliente-dados.component';
import { AtivosFinanceirosComponent } from './ativos-financeiros/ativos-financeiros.component';
import { AtivosComponent } from './ativos-financeiros/ativos/ativos.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LancamentoComponent,
    CategoriaComponent,
    CargoComponent,
    DepartamentoComponent,
    ClienteComponent,
    FornecedorComponent,
    FuncionarioComponent,
    PainelFinancasPessoaisComponent,
    PainelInvestimentosComponent,
    PainelGestaoComponent,
    CardComponent,
    PageBreadComponent,
    LancamentoFormComponent,
    LancamentoListaComponent,
    FuncionarioFormComponent,
    FuncionarioListaComponent,
    CargoListaComponent,
    CargoFormComponent,
    DepartamentoFormComponent,
    DepartamentoListaComponent,
    FornecedorListaComponent,
    FornecedorFormComponent,
    ClienteFormComponent,
    ClienteListaComponent,
    CategoriaListaComponent,
    CategoriaFormComponent,
    LoginComponent,
    RegisterComponent,
    DadosUsuarioComponent,
    ContaClienteComponent,
    ContaClienteFormComponent,
    ContaClienteDadosComponent,
    AtivosFinanceirosComponent,
    AtivosComponent
 ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [
    { provide: MAT_DATE_LOCALE, useValue: 'pt-BR' },
    { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
