package Gambler;

public class CalculativeGambler {
    public static void main(String[] args) {
        int stake = 100; // Starting stake
        int bet = 1; // Betting $1 per game
        Random random = new Random(); // Creating a new instance of the Random class

        while (stake > 0 && stake < 200) { // Looping until the gambler is broke or has won 100%
            // Roll the dice
            int outcome = random.nextInt(2); // Generating a random integer between 0 and 1 (inclusive)

            if (outcome == 0) { // The gambler lost the game
                stake -= bet; // Decreasing the gambler's stake by the amount of the bet
            } else { // The gambler won the game
                stake += bet; // Increasing the gambler's stake by the amount of the bet
            }

            double winPercent = ((double) (stake - 100) / 100) * 100; // Calculating the percentage of winnings or losses

            if (winPercent >= 50 || winPercent <= -50) { // If the gambler has won or lost 50% or more of their stake, they resign for the day
                break;
            }
        }

        if (stake == 0) { // The gambler has lost all their money
            System.out.println("You are broke!");
        } else if (stake == 200) { // The gambler has won 100% of their stake
            System.out.println("You have won! Congrats!");
        } else { // The gambler has resigned for the day
            System.out.println("You have resigned for the day!");
        }
    }
}
