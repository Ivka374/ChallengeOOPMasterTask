package com.company;

public class DeluxeBurger extends Burger{
    private int additionsTotal;

    public DeluxeBurger(String breadRollType, String meat, String name, double price) {
        super(breadRollType, meat, name, price);
        super.addAddition("chips", 1.5);
        super.addAddition("drink", 2);
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("You cannot add anymore additions");
    }
}
