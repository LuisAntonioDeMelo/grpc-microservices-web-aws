import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RedimentosComponent } from './redimentos.component';

describe('RedimentosComponent', () => {
  let component: RedimentosComponent;
  let fixture: ComponentFixture<RedimentosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RedimentosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RedimentosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
