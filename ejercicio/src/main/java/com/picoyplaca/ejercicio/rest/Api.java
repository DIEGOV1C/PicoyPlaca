package com.picoyplaca.ejercicio.rest;

import com.picoyplaca.ejercicio.controlador.Logica;
import com.picoyplaca.ejercicio.modelo.Message;
import com.picoyplaca.ejercicio.modelo.Placa;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/api/validar-pico-placa")
    public Message validarPicoPlaca(@RequestBody Placa placa) {
        Logica logica = new Logica();
        return logica.validatePermission(placa);
    }

}