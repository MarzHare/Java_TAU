// Subclass Banana. Adds peeling method, sets calories and overrides juice with banana juice

package chapter10.fruitmarket;

public class Banana extends Fruit {
    public Banana(){
        setCalories(110);
    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }

    public void peel(){
        System.out.println("I'm peeling my banana");
    }
}
