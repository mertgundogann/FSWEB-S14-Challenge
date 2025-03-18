package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips = "CURVY";
    private String drink = "COKE";
    public DeluxeBurger(double price, String meat, String name, String breadRollType) {
        super(19.10, meat, name, breadRollType);
    }
    public String getCips(){
        return cips;
    }
    public String getDrink(){
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        System.out.println("Added " + cips + " for an extra 0");
        System.out.println("Added " + drink + " for an extra 0");
        return totalPrice;
    }
}
