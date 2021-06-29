package com.company.creatures;

import com.company.Human;

import java.io.File;

abstract public class Animal {
    final String species;
    private Double weight;
    String name;
    File pic;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
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

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void feed() {
        if (this.weight > 0) {
            this.weight += 1;
            System.out.println("Obecna waga: " + this.weight);
        } else
            System.out.println("Zwierze nie zyje");
    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 2;
            System.out.println("Obecna waga: " + this.weight);
        } else
            System.out.println("Zwierze nie zyje");
    }
    @Override
    public String toString(){
        return this.name + " " +this.species +" wazy: "+this.weight +" kg";
    }

    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.pet == this)
            if(buyer.getCash() > price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                seller.pet = null;
                buyer.pet = this;
                System.out.println(buyer.getName() + " kupił od " + seller.getName() + " " + this.name);
            }
    }

    public void feed(double foodWeight){
        this.weight += foodWeight*0.4;
    }
}


