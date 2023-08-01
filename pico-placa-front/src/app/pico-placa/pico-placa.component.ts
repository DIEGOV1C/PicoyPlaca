// pico-placa.component.ts
import { Component } from '@angular/core';
import { PicoPlacaService } from '../pico-placa.service';

@Component({
  selector: 'app-pico-placa',
  templateUrl: './pico-placa.component.html',
  styleUrls: ['./pico-placa.component.css']
})
export class PicoPlacaComponent {

  license: string = '';
  dateRestriction: Date;
  hourRestriction: Date;
  resultMessage: any;

  constructor(private picoPlacaService: PicoPlacaService) {
    this.dateRestriction = new Date();
    this.hourRestriction = new Date();
  }

  validarPicoPlaca() {
    this.resultMessage = null;
    if (this.license.length == 7) {
      this.picoPlacaService.validarPicoPlaca({
        license: this.license,
        dateRestriction: this.dateRestriction,
        hourRestriction: this.hourRestriction
      })
        .subscribe((message: any) => {
          console.log(message)
          if (!message.result) {
            this.resultMessage = message.messageResult;
          } else {
            this.resultMessage = 'El vehiculo puede circular';
          }
        });
    } else {
      this.resultMessage = 'La placa debe tener 7 dígitos';
    }
  }

}