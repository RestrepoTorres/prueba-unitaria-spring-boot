package com.api.rest.exception;

public class ResourceNotFoundExeption extends RuntimeException {
    public ResourceNotFoundExeption(String message){
        super(message);
    }
}
