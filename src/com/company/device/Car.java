package com.company.device;

import com.company.Human;

public class Car extends Device {
    public double value;

    public Car(String model, String producer, Integer yearOfProduction, double value)
    {
        super(producer, model, yearOfProduction);
        this.value=value;
    }
    @Override
    public String toString(){return this.producer + " " + this.model + " jest wart: " + this.value; }

    @Override
    public void turnOn() {
        System.out.println("*Kreci rozrusznikiem*");
        System.out.println("*Kreci rozrusznikiem*");
        System.out.println("*Kreci rozrusznikiem*");
        System.out.println("*Wrum*");
    }

    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getCar() == this)
            if(buyer.getCash() > price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                //seller.setCar(null);
                //buyer.setCar(this);
                System.out.println(buyer.getName() + " kupił od " + seller.getName() + " " + this.model + " od " + this.producer);
            }
            else
                System.out.println("Kupiec nie ma tyle kasy");
        else
            System.out.println("Sprzedajacy nie ma tego przedmiotu :(");
    }

}
