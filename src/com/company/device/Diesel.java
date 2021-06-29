package com.company.device;

public class Diesel extends Car{
    public Diesel(String model, String producer, Integer yearOfProduction, Double value)
    {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Tankuje ropke");
    }
}