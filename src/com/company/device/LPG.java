package com.company.device;

public class LPG extends Car{
    public LPG(String model, String producer, Integer yearOfProduction, Double value)
    {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Gaz tylko do kuchenek");
    }
}
