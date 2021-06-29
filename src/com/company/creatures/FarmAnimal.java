package com.company.creatures;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species, String name) {
        super(species, name);
    }

    public void beEaten(){
        this.setWeight(0);
    }

}

