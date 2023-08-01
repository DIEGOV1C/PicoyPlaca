import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PicoPlacaComponent } from './pico-placa/pico-placa.component';

const routes: Routes = [
  { path: '', component: PicoPlacaComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
