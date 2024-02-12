package com.example.workintech.zoo.zoo.entity;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter

public class Kangaroo {
    private Long id;
    private String name;
    private double weight;
    private double height;
    private String gender;
    private boolean isAggressive;

}
