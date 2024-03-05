// Experimenting with the class Fruit and its subclasses Apple and Banana

package chapter10.fruitmarket;

public class Market {

    public static void main(String[] args){
        Fruit banana = new Banana();
        System.out.println("Type Fruit / Instance Banana -- banana is " + banana.getCalories() + "cals");
        banana.makeJuice();
        ((Banana) banana).peel();
        System.out.println("Type(cast) Banana / Instance Banana -- banana is " + banana.getCalories() + "cals");

        Apple pinkLady = new Apple();
        pinkLady.makeJuice();
        pinkLady.removeSeeds();
        System.out.println("Type Apple / Instance Apple -- pink lady is " + pinkLady.getCalories() + "cals");


        Fruit reinette = new Fruit();
        System.out.println("Type Fruit / Instance Fruit -- reinette is " + reinette.getCalories() + "cals");
        reinette.makeJuice();
        reinette = new Apple();
        System.out.println("Type Fruit / Instance Apple -- reinette is " + reinette.getCalories() + "cals");
        reinette.makeJuice();
        ((Apple) reinette).removeSeeds();
        System.out.println("Type(cast) Apple / Instance Apple -- reinette is " + reinette.getCalories() + "cals");
    }
}
