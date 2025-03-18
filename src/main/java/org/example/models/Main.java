package org.example.models;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger(3.56,"Beef", "Kuzu", "İnce");

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger(5.67,"Vegan","Vegan","İnce");

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(13.0,"Kuzu","Kuzu hamburgeri", "Kalın");

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();
}}