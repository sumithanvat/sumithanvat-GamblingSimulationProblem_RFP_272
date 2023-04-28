package Gambler;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int stake = 100; // Starting stake
        int bet = 1; // Betting $1 per game
        Random random = new Random(); // Random number generator

        while (stake > 0) {
            // Roll the dice
            int outcome = random.nextInt(2);

            if (outcome == 0) { // The gambler lost the game
                stake -= bet;
            } else { // The gambler won the game
                stake += bet;
            }
        }

        System.out.println("You are broke!");

    }
}
