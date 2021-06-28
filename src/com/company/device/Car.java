package com.company.device;

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

}
