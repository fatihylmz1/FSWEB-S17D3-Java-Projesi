package com.example.workintech.zoo.zoo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Koala {
    private Long id;
    private String name;
    private double weight;
    private double sleepHour;
    private String gender;
}
