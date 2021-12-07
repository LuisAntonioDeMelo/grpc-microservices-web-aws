import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContaClienteFormComponent } from './conta-cliente-form.component';

describe('ContaClienteFormComponent', () => {
  let component: ContaClienteFormComponent;
  let fixture: ComponentFixture<ContaClienteFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContaClienteFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContaClienteFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
