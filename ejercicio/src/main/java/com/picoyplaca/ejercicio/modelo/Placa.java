package com.picoyplaca.ejercicio.modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Placa {

    private String license;
    private Date dateRestriction;
    private Date hourRestriction;

}