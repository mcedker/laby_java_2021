package com.company.device;

import com.company.Human;

public class Phone extends Device{
    String operationSystem;
    Double screenSize;


    public Phone(String producer, String model, Integer yearOfProduction, String operationSystem, Double screenSize) {
        super(producer, model, yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }


    @Override
    public String toString(){
        return this.producer + " " + this.model + " " +this.operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Dzien doberek!");
        System.out.println("Wlaczamsie!");
        System.out.println("Wlaczamsie!");
        System.out.println("!");
        System.out.println("juz");
    }

    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.mobilePhone == this)
            if(buyer.getCash() > price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                seller.mobilePhone = null;
                buyer.mobilePhone = this;
                System.out.println(buyer.getName() + " kupił od " + seller.getName() + " " + this.model + " od " + this.producer);
            }
    }
}
