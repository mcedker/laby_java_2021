package com.company.device;

public class Phone {


    public Phone(String producer, String model, String operationSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    String producer;
    String model;
    String operationSystem;
    Double screenSize;

    public String toString(){
        return this.producer + " " + this.model + " " +this.operationSystem;
    }
}
