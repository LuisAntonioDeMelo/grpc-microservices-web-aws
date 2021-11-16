import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CargoListaComponent } from './cargo-lista.component';

describe('CargoListaComponent', () => {
  let component: CargoListaComponent;
  let fixture: ComponentFixture<CargoListaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CargoListaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CargoListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
