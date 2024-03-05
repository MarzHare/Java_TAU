// Class Fruit. Getters and setters for fruit calories. Method to make fruit juice

package chapter10.fruitmarket;

public class Fruit {
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
