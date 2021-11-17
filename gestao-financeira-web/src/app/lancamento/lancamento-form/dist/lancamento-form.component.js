"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.LancamentoFormComponent = void 0;
var core_1 = require("@angular/core");
var forms_1 = require("@angular/forms");
var models_1 = require("src/app/models/models");
var LancamentoFormComponent = /** @class */ (function () {
    function LancamentoFormComponent(fb, lancamentoService, categoriaService, clienteService, snack) {
        this.fb = fb;
        this.lancamentoService = lancamentoService;
        this.categoriaService = categoriaService;
        this.clienteService = clienteService;
        this.snack = snack;
        this.tipoLancamento = models_1.TipoLancamento;
        this.lancamentoForm = this.fb.group({
            codigo: [null, []],
            tipoLancamento: [null, [forms_1.Validators.required]],
            dataVencimento: [null, [forms_1.Validators.required]],
            dataPagamento: [null, [forms_1.Validators.required]],
            descricao: ['', [forms_1.Validators.required]],
            valor: [null, [forms_1.Validators.required]],
            categoria: ['', [forms_1.Validators.required]],
            pessoa: ['', [forms_1.Validators.required]],
            observacao: ['', [forms_1.Validators.required]]
        });
    }
    LancamentoFormComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.clienteService.get().subscribe(function (res) {
            _this.clientes = res;
        });
        this.categoriaService.get().subscribe(function (res) {
            _this.categorias = res;
        });
    };
    LancamentoFormComponent.prototype.salvar = function () {
        var _this = this;
        if (this.lancamentoForm.valid) {
            var values = this.lancamentoForm.value;
            this.lancamentoService.add(values).subscribe(function (ok) {
                _this.notificacao('Lançamento Salvo com Sucesso.');
            }, function (error) {
                console.log(error);
                _this.notificacao('Erro ao Salvar - :' + error.message);
            });
        }
        this.limpar();
    };
    LancamentoFormComponent.prototype.editar = function (lancamento) {
        this.lancamentoForm.setValue(lancamento);
    };
    LancamentoFormComponent.prototype.limpar = function () {
        this.lancamentoForm.patchValue({
            tipoLancamento: '',
            dataVencimento: '',
            dataPagamento: '',
            descricao: '',
            valor: '',
            categoria: '',
            pessoa: '',
            observacao: ''
        });
        this.lancamentoForm.reset();
        this.form.resetForm();
    };
    LancamentoFormComponent.prototype.notificacao = function (msg) {
        this.snack.open(msg, 'ok', { duration: 3000 });
    };
    __decorate([
        core_1.ViewChild('form')
    ], LancamentoFormComponent.prototype, "form");
    LancamentoFormComponent = __decorate([
        core_1.Component({
            selector: 'app-lancamento-form',
            templateUrl: './lancamento-form.component.html',
            styleUrls: ['./lancamento-form.component.css']
        })
    ], LancamentoFormComponent);
    return LancamentoFormComponent;
}());
exports.LancamentoFormComponent = LancamentoFormComponent;
