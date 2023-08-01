import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PicoPlacaComponent } from './pico-placa.component';

describe('PicoPlacaComponent', () => {
  let component: PicoPlacaComponent;
  let fixture: ComponentFixture<PicoPlacaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PicoPlacaComponent]
    });
    fixture = TestBed.createComponent(PicoPlacaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
