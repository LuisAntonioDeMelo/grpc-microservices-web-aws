import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtivosFinanceirosComponent } from './ativos-financeiros.component';

describe('AtivosFinanceirosComponent', () => {
  let component: AtivosFinanceirosComponent;
  let fixture: ComponentFixture<AtivosFinanceirosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AtivosFinanceirosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AtivosFinanceirosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
