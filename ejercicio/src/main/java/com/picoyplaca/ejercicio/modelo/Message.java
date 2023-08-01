package com.picoyplaca.ejercicio.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private String messageResult;
    private boolean result;

    public Message(){
    }

    public Message(String messageResult, boolean result){
        this.messageResult = messageResult;
        this.result = result;
    }

}
