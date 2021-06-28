package com.company;

import com.company.device.Car;
import com.company.device.Phone;

import java.util.Date;

public class Human {
    String name;
    String surname;
    int age;
    String sex;
    public Phone mobilePhone;
    Animal pet;
    private Car car;
    private double salary;
    private double cash = 0.0;

    public Human(Double salary, String name, String surname, int age){
        this.salary = salary;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
//
    public double getSalary(){
        System.out.println("pobrana wartosc wynagrodzenia: " + this.salary);
        System.out.println("pobrana wartosc wynagrodzenia: " + new Date());
        return salary;
    }
//
    public void setSalary(Double salary){
        if (salary < 0.0){
            System.out.println("za darmo nicht robic");
        }
        else {
            System.out.println("dane wyslane do ksiegowego");
            System.out.println("aneks do odebrania u pani hani");
            System.out.println("ZUS JUZ WIE");
            this.salary = salary;
        }
    }
//
    public Car getCar(){
        return this.car;
    }

    public void setMobilePhone(Phone phone)
    {
        this.mobilePhone = phone;
    }
//
    public void setCar(Car car2)
    {
        if(this.salary>car2.value)
        {
            System.out.println("udalo sie zakupic za gotowke");
            this.car = car2;
        }
        else if(this.salary>car2.value/12 && this.salary <car2.value)
        {
            System.out.println("zakupiono na kredyt");
            this.car = car2;
        }
        else
            System.out.println("nie stac Cie na ten samochod");
    }
//
    @Override
    public String toString(){ return this.name + " " + this.surname + " " +this.age+"l"; }

    public void sell(Human seller, Human buyer, Double price)
    {
        System.out.println("D is silent");
    }

    public double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
    public String getName() {
        return this.name;
    }


}
