// Gives you a day of the week based on your chosen number (1-7)

package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Choose a number (1-7):");
        int chosenDay = scanner.nextInt();
        scanner.close();

        if(chosenDay>=1 && chosenDay<=7)
            System.out.println("That day is " + daysOfWeek[chosenDay-1]);
        else
            System.out.println("That ain't what I asked for, pal");

    }
}
