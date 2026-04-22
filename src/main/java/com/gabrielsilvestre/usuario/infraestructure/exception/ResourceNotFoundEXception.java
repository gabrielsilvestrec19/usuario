package com.gabrielsilvestre.usuario.infraestructure.exception;

public class ResourceNotFoundEXception extends RuntimeException{

    public ResourceNotFoundEXception(String mensagem){
        super(mensagem);
    }
    public ResourceNotFoundEXception(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
