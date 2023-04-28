package Gambler;

import java.util.Random;

public class Gambler {

    private int stake; // The gambler's stake
    private int bet; // The amount the gambler bets on each game
    private Random random; // A random number generator

    public Gambler(int stake, int bet) {
        this.stake = stake;
        this.bet = bet;
        this.random = new Random();
    }

    public void play() {
        // Start playing games until the gambler is broke or has reached their goal
        while (stake > 0 && stake < 200) {
            // Roll the dice
            int outcome = random.nextInt(2);

            if (outcome == 0) { // The gambler lost the game
                stake -= bet;
            } else { // The gambler won the game
                stake += bet;
            }
        }

        // Print the final result
        if (stake == 0) {
            System.out.println("You are broke");
        } else {
            System.out.println("You reached your goal");
        }
    }
}