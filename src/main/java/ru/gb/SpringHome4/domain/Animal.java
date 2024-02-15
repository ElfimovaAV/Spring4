package ru.gb.SpringHome4.domain;

import lombok.Data;

@Data
public class Animal {
    private Long id;
    private String name;
    private int population;

    public Animal(String name, int population) {
        this.name = name;
        this.population = population;
    }
}
