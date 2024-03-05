// Outputs a sentence using user inputs

package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        // 1. Ask for season
        System.out.println("Input a season.");
        String season = scanner.next();

        // 2. Ask for whole number
        System.out.println("Input a whole number.");
        int number = scanner.nextInt();

        // 3. Ask for adjective
        System.out.println("Input an adjective.");
        String adjective = scanner.next();
        scanner.close();

        // 4. Display sentence
        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
