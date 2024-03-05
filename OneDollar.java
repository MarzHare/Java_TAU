/*
    Prints out number of pennies above or below 1 dollar, based on
    how many coins the user put in. If total == 1 dollar, user wins.
*/
package chapter3;

import java.util.Scanner;

public class OneDollar {
    public static void main(String args[]){
        // Initialise what we know
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int dollar = 100;

        // Get what we don't
        System.out.println("How many pennies:");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels:");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes:");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters:");
        int quarters = scanner.nextInt();

        scanner.close();

        // Output result
        int total = pennies + (nickels*nickel) +
                (dimes*dime) + (quarters*quarter);
        if(total == dollar)
            System.out.println("You win!");
        else if(total > dollar) {
            System.out.println("You went over by " + (total-dollar) + " cents");
        }
        else {
            System.out.println("You went under by " + (dollar-total) + " cents");
        }
    }
}
