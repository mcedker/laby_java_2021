package com.company;

import java.io.File;

public class Animal {
    final String species;
    private Double weight;
    String name;
    File pic;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = 20.0;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "tiger":
                this.weight = 25.0;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed() {
        if (this.weight > 0) {
            this.weight += 1;
            System.out.println("Obecna waga: " + this.weight);
        } else
            System.out.println("Zwierze nie zyje");
    }

    void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 2;
            System.out.println("Obecna waga: " + this.weight);
        } else
            System.out.println("Zwierze nie zyje");
    }

}
