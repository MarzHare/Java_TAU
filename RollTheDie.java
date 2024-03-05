// Try to travel 20 spaces within 5 random die rolls

package chapter4;

import java.util.Random;

public class RollTheDie {
    public static void main(String args[]){

        int board = 20;
        int user = 0;

        for(int i=0; i<5; i++){
            // Generate random number between 1-6
            Random random = new Random();
            int die = random.nextInt(6) + 1;

            // Advance those spaces on the game board
            user = user + die;

            // After each roll, tell user which space they are in and how many are left to 20
            if(user<board){
                System.out.println("Roll " + (i+1) + ". You are in space " + user);
                System.out.println((board - user) + " more spaces to get to 20");
            }
            else if(user==board) {
                System.out.println("You win!");
                System.exit(0);
            }
            else {
                System.out.println("You went over 20...");
                System.exit(0);
            }
        }

        System.out.println("You didn't get to 20...");
    }
}
