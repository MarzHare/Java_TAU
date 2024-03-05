/*
    Based on the class Cake and its subclasses BirthdayCake and WeddingCake,
    prints out prices and flavours for different cakes
*/
package chapter9.cake;

public class TasteTester {
    public static void main(String[] args){

        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        weddingCake.setPrice(400);

        System.out.println("I picked the " + birthdayCake.getFlavour() + " birthday cake and it cost £"
                + birthdayCake.getPrice());
        System.out.println("Aziraphale and Crowley's wedding cake was an exquisite " + weddingCake.getFlavour()
                + " flavour, and it cost £" + weddingCake.getPrice());
    }
}
