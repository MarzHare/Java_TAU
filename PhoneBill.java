// Calculate total cell phone bill

package chapter5;

import java.util.Scanner;

public class PhoneBill {
    static double overMinCharge = 0.25;
    static double tax = 0.15;

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        // Input plan fee and number of mins
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        scanner.close();

        // 0.25 extra for each min over plan (overage)
        double extraOverage = extraOverage(overageMinutes, overMinCharge);

        // 15% tax
        double extraTax = extraTax(planFee + extraOverage, tax);

        // Calculate final total and print it
        total(planFee, extraOverage, extraTax);
    }

    public static double extraOverage(int mins, double charge){
        return mins * charge;
    }

    public static double extraTax(double fee, double tax){
        return fee * tax;
    }

    public static void total(double fee, double overage, double tax){
        double total = fee+overage+tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", fee));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
