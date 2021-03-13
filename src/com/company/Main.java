package com.company;

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

        Human andrzejek = new Human();
        andrzejek.pet = dog;
        Phone ajfon = new Phone("aple", "jedenascie", "ios", 15.4);
        //ajfon.producer ="apple";


        andrzejek.mobilePhone = ajfon;
    }

}
