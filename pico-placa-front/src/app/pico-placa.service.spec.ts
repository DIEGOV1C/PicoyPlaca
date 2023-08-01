import { TestBed } from '@angular/core/testing';

import { PicoPlacaService } from './pico-placa.service';

describe('PicoPlacaService', () => {
  let service: PicoPlacaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PicoPlacaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
