package com.company;

public class HealthyBurger extends Burger {
    private Addition extra1, extra2;
    private int extraAdditions = 0;

    public HealthyBurger(String meat, String name, double price) {
        super("brown rye bread roll", meat, name, price);
    }

    @Override
    public void additionsReceipt() {
        super.additionsReceipt();
        switch (extraAdditions) {
            case 2:
                System.out.println("Addition '" + extra2.getName() + "' .................." + extra2.getPrice());
            case 1:
                System.out.println("Addition '" + extra1.getName() + "' .................." + extra1.getPrice());
        }
    }

    @Override
    public void addAddition(String name, double price) {
        switch (getAdditionsTotal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                super.addAddition(name, price);
                break;
            case 4:
                Addition addition = new Addition(name, price);
                switch (extraAdditions) {
                    case 0:
                        extra1 = addition;
                        extraAdditions++;
                        break;
                    case 1:
                        extra2 = addition;
                        extraAdditions++;
                        break;
                }
        }
    }

    @Override
    public double calculateTotal() {
        double extraPrice = 0;
        switch(extraAdditions) {
            case 2:
                extraPrice += extra2.getPrice();
            case 1:
                extraPrice += extra1.getPrice();
            default:
                extraPrice += super.calculateTotal();
        }
        return extraPrice;
    }
}
