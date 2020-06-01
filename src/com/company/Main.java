package com.company;

public class Main {

    public static void main(String[] args) {
        DeluxeBurger deluxeBurger = new DeluxeBurger("white", "pork", "Porky Billy", 2.50);
        deluxeBurger.receipt();
        Burger burger = new Burger("white", "lamb", "Excuisite meat", 3);
        burger.addAddition("salad", 1.5);
        burger.addAddition("mustard", 0.5);
        burger.addAddition("ice-cream", 1.5);
        burger.addAddition("fries", 1);
        burger.addAddition("ketchup", 0.5); // does not count because it is over the addition limit -> works
        burger.receipt();
        HealthyBurger healthyBurger = new HealthyBurger("fish", "Taste the sea", 3);
        healthyBurger.addAddition("salad", 1.5);
        healthyBurger.addAddition("mustard", 0.5);
        healthyBurger.addAddition("ice-cream", 1.5);
        healthyBurger.addAddition("fries", 1);
        healthyBurger.addAddition("ketchup", 0.5);
        healthyBurger.receipt();
    }
}
