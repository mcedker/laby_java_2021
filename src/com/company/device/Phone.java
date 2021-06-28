package com.company.device;

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
}
