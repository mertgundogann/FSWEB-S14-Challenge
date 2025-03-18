package org.example.models;

public class Hamburger {
    //Hamburger sınıfı içerisinde 4 tane değişken tanımlamalısınız. name, meat, price, breadRollType price değişkeni double olmalı. Kalanları String olarak tanımlayabilirsiniz.
    //
    //Hamburger'in üzerine başka malzemeler eklenebilir. Bunları şu isimlerle tutmalıyız. addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name ve addition4Price. İsim tutan değişkenler String olmalı, price tutan değişkenler double olarak tanımlanmalı.
    //
    //Hamburger sınıfı içerisine malzemelerin eklenmesi için 5 tane daha metod eklemeliyiz. 4 tanesi ilgili malzemenin eklenmesi için. 1 tane de tüm eklenen malzemelerin görüntülenmesi için.
    //
    //Metodları şu isimle adlandırabilirsiniz. addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4 ve itemizeHamburger
    //
    //addHamburgerAddition metodları 2 tane parametre almalı malzemenin ismi ve ücreti ve hiçbir değer dönmemeli. itemizeHamburger hem tüm malzemeleri ekrana basmalı. Hem de toplam ücreti(hamburger + tüm malzemeler) değer olarak dönmeli.
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(double price, String meat, String name, String breadRollType) {
        this.price = price;
        this.meat = meat;
        this.name = name;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;
        System.out.println(this.name + " hamburger  " + this.breadRollType + " şununla  " + this.meat + " meat");

        if (addition1Name != null) {
            totalPrice += addition1Price;
            System.out.println("Eklendi " + addition1Name + " ek malzemesi " + addition1Price);
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
            System.out.println("Eklendi " + addition2Name + " ek malzemesi " + addition2Price);
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
            System.out.println("Eklendi " + addition3Name + " ek malzemesi " + addition3Price);
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
            System.out.println("Eklendi " + addition4Name + " ek malzemesi " + addition4Price);
        }


        return totalPrice;

    }
}
