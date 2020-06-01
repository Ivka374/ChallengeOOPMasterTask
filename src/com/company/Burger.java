package com.company;

public class Burger {
    private String breadRollType;
    private String meat;
    private String name;
    private double basePrice;
    private int additionsTotal = 0;
    private Addition addition1, addition2, addition3, addition4;

    public int getAdditionsTotal() {
        return additionsTotal;
    }

    public Burger(String breadRollType, String meat, String name, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
    }

    public void addAddition(String name, double price){
        Addition addition = new Addition(name, price);
        switch (additionsTotal){
            case 0:
                addition1 = addition;
                additionsTotal++;
                break;
            case 1:
                addition2 = addition;
                additionsTotal++;
                break;
            case 2:
                addition3 = addition;
                additionsTotal++;
                break;
            case 3:
                addition4 = addition;
                additionsTotal++;
                break;
        }
    }

    public void receipt(){
        System.out.println("Base prise: " + basePrice);
        additionsReceipt();
        double totalPrice = calculateTotal();
        System.out.println("Total: ..................." + (totalPrice + basePrice));
    }

    public void additionsReceipt(){
        switch (additionsTotal){
            default:
                System.out.println("There are no additions");
                break;
            case 4:
                System.out.println("Addition '" + addition4.getName() + "' .................." + addition4.getPrice());
            case 3:
                System.out.println("Addition '" + addition3.getName() + "' .................." + addition3.getPrice());
            case 2:
                System.out.println("Addition '" + addition2.getName() + "' .................." + addition2.getPrice());
            case 1:
                System.out.println("Addition '" + addition1.getName() + "' .................." + addition1.getPrice());
        }
    }

    public double calculateTotal(){
        double total = 0;
        switch (additionsTotal){
            case 4:
                total += addition4.getPrice();
            case 3:
                total += addition3.getPrice();
            case 2:
                total += addition2.getPrice();
            case 1:
                total += addition1.getPrice();
        }
        return total;
    }
}
