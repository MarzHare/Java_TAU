// Subclass BirthdayCake. Adds "candles" to Cake and gives it a flavour

package chapter9.cake;

public class BirthdayCake extends Cake {

    public BirthdayCake(){
        super("red velvet");
    }

    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
