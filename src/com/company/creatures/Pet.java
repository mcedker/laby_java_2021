package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species, String name) {
        super(species, name);
    }

    public void feed() {
        if (this.getWeight() > 0) {
            this.setWeight(this.getWeight() + 1);
            System.out.println("Obecna waga: " + this.getWeight());
        } else
            System.out.println("Zwierze nie zyje");
    }


}
