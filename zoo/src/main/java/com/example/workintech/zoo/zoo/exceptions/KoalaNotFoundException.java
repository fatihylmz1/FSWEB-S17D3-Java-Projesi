package com.example.workintech.zoo.zoo.exceptions;

import lombok.Data;

@Data
public class KoalaNotFoundException extends RuntimeException{
    public KoalaNotFoundException(String message) {
        super(message);
    }
}
