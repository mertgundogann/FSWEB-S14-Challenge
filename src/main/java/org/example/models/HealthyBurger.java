package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    public HealthyBurger(double price, String meat, String name, String breadRollType) {
        super(price, "Tofu", name, breadRollType);
    }
    public void addHealthyAddition1(String name,double price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }
    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }

        return totalPrice;
    }
}
