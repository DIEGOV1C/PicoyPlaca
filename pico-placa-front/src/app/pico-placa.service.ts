import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PicoPlacaService {
  private apiUrl = 'http://localhost:8080/api/validar-pico-placa';

  constructor(private http: HttpClient) { }

  validarPicoPlaca(placa: any): Observable<boolean> {
    return this.http.post<boolean>(this.apiUrl, placa);
  }
}
