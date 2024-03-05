// A Redo of the Phone Bill Calculator (PhoneBill)

package chapter6;

public class PhoneBillRedo {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBillRedo(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }

    public PhoneBillRedo(int id){
        setId(id);
        baseCost = 79.99;
        allottedMinutes = 800;
        usedMinutes = 800;
    }
    public PhoneBillRedo(int id, double baseCost, int allottedMinutes, int usedMinutes){
        setId(id);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setUsedMinutes(usedMinutes);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    double calculateOverage(){
        if(usedMinutes <= allottedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageMinutes * overageRate;
    }

    double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    void printBill(){
        System.out.println("ID: " + id);
        System.out.println("Base rate: $" + baseCost);
        System.out.println("Overage fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }

}
