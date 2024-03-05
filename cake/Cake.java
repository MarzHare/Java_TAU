// Class Cake. Getters and setters for cake flavour and price

package chapter9.cake;

public class Cake {

    public Cake(String flavour){
        setFlavour(flavour);
        setPrice(9.99);
    }
    private String flavour;
    private double price;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
