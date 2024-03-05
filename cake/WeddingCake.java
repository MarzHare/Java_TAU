// Subclass WeddingCake. Adds "tiers" to Cake, and gives it a flavour

package chapter9.cake;

public class WeddingCake extends Cake {
    public WeddingCake(){
        super("cinnamon bun");
    }
    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
