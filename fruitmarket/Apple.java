// Subclass Apple. Adds seed removal method, sets calories and overrides juice with apple juice

package chapter10.fruitmarket;

public class Apple extends Fruit{
    public Apple(){
        setCalories(95);
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

    public void removeSeeds(){
        System.out.println("No cyanide in my apple, please");
    }
}
