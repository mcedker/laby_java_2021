package com.company;

import com.company.device.Car;
import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {



        Animal dog = new Animal("tiger");

        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        Human andrzejek = new Human(2000.0, "Andrzej", "Pozdrawiam", 87);
        andrzejek.pet = dog;
        Phone ajfon = new Phone("aple", "jedenascie", 1984, "IOS", 12.3);

        Car Gruz = new Car("E36", "BMWEJ",1997, 3500);

        //andrzejek.mobilePhone = ajfon;

        Double mySalary = andrzejek.getSalary();

        Double newSalary = mySalary*1.2;

        andrzejek.setSalary(newSalary);
        andrzejek.setCar(Gruz);
        System.out.println("Czlowiek: " + andrzejek);
        System.out.println("Telefon: " +ajfon);
        System.out.println("Samochod: " + Gruz);
        System.out.println("Zwierzatko: " +dog);

        //System.out.println(new Car("E36","BMWEJ", 213000.0).equals(Gruz));
        //System.out.println(new Car("E36","BMWEJ", 213000.0).equals(new Car("E36","BMWEJ", 213000.0)));
        //System.out.println(Gruz);

        System.out.println(ajfon.toString());
        System.out.println(andrzejek.toString());
        System.out.println(Gruz.toString());
        System.out.println(dog.toString());

        Gruz.turnOn();
        ajfon.turnOn();

    }

    @Override
    public boolean equals(Object obj){
        return (this == obj);
    }

}

