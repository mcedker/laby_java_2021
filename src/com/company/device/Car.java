package com.company.device;

public class Car {
    final String model;
    final String producer;
    public double value;

    public Car(String model, String producer, double value)
    {
        this.producer=producer;
        this.model=model;
        this.value=value;
    }
    public String toString(){
        return this.producer + " " + this.model + " jest wart: " + this.value;
    }

}
