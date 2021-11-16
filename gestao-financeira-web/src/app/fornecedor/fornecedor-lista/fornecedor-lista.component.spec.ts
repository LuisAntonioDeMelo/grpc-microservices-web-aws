import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FornecedorListaComponent } from './fornecedor-lista.component';

describe('FornecedorListaComponent', () => {
  let component: FornecedorListaComponent;
  let fixture: ComponentFixture<FornecedorListaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FornecedorListaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FornecedorListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
