package com.example.workintech.zoo.zoo.exceptions;

import lombok.Data;

@Data
public class KangarooNotFoundException extends RuntimeException{
    public KangarooNotFoundException(String message) {
        super(message);
    }
}