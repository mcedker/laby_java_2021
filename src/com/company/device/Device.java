package com.company.device;

abstract public class Device {

    public final String producer;
    public final String model;
    public final Integer yearOfProduction;

    public Device(String producer,String model, Integer yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString(){ return "Urządzenie: producent: " + this.producer + ", model: " + this.model + ", rok produkcji: " + this.yearOfProduction;}

    abstract public void turnOn();

}
