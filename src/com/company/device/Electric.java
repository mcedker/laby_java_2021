package com.company.device;

public class Electric extends Car{
    public Electric(String model, String producer, Integer yearOfProduction, Double value)
    {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("BZZZ LADUJE PRADEM");
    }
}