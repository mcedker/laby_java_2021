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
        Phone ajfon = new Phone("aple", "jedenascie", "ios", 15.4);

        Car Gruz = new Car("E36", "BMWEJ",213000.0);

        andrzejek.mobilePhone = ajfon;

        Double mySalary = andrzejek.getSalary();

        Double newSalary = mySalary*1.2;

        andrzejek.setSalary(newSalary);
        andrzejek.setCar(Gruz);
        System.out.println("Czlowiek: " + andrzejek);
        System.out.println("Telefon: " +ajfon);
        System.out.println("Samochod: " + Gruz);
        System.out.println("Zwierzatko: " +dog);

        System.out.println(new Car("E36","BMWEJ", 213000.0).equals(Gruz));
        System.out.println(new Car("E36","BMWEJ", 213000.0).equals(new Car("E36","BMWEJ", 213000.0)));
        System.out.println(Gruz);
    }

    @Override
    public boolean equals(Object obj){
        return (this == obj);
    }

}

