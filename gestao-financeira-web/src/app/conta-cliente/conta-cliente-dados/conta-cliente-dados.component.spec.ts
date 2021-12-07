import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContaClienteDadosComponent } from './conta-cliente-dados.component';

describe('ContaClienteDadosComponent', () => {
  let component: ContaClienteDadosComponent;
  let fixture: ComponentFixture<ContaClienteDadosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContaClienteDadosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContaClienteDadosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
