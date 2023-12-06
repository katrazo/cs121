package projectOne;
import java.util.Scanner;

public class CharacterBattle {
    // General Game variables
    static Scanner userInput = new Scanner(System.in); // Used for entering stats in the console
    static int maxRounds; // player-defined later, maximum number of rounds
    static int turns; // turns per round
    static int roundsWon1 = 0; // Rounds won by player 1
    static int roundsWon2 = 0; // Rounds won by player 2
    static String pause; // used to pause code until user presses enter (see method pause())

    // Character One
    static String name1; // Name of the 1st Player
    static int hp1; // Hit Points of the 1st Player
    static String moveName1; // The name of the first player's attack
    static int power1; // The hit points subtracted from the opposing player
    static int speed1; // Used to determine who goes first; higher speed attacks first on a turn

    // Character Two
    static String name2; // Name of the 1st Player
    static int hp2; // Hit Points of the 1st Player
    static String moveName2; // The name of the first player's attack
    static int power2; // The hit points subtracted from the opposing player
    static int speed2; // Used to determine who goes first; higher speed attacks first on a turn

    public static void main(String[] args) {
        System.out.print("Enter odd number of rounds: ");
        maxRounds = enterRounds();
        /* While:
         * 1: currentRounds <= maxRounds (We haven't gone through all the rounds)
         * 2: Player 1 hasn't won more than half the rounds (the integer dropping the decimal is intentional)
         * 3: Player 2 hasn't won more than half the rounds
         * Play the game
         */
        for (int currentRound = 1; currentRound <= maxRounds && (roundsWon1 <= maxRounds / 2 && roundsWon2 <= maxRounds); currentRound++) {
            System.out.println("Round " + currentRound + ":");
            System.out.println("----------------------");
            initRound();
            turns = 1;
            while (hp1 > 0 && hp2 > 0) {
                System.out.println("~~~~~~~~~~~~~~~");
                System.out.println("Turn " + turns + ":");
                playRound();
                turns++;
                System.out.println("~~~~~~~~~~~~~~~");
            }
            System.out.println("Player 1 has won " + roundsWon1 + " rounds.");
            System.out.println("Player 2 has won " + roundsWon2 + " rounds.");
            pause();
        }
        System.out.println("\n==============================");
        System.out.println("      The game is over!");
        System.out.println("==============================");
        // If player 2 won more
        if (roundsWon2 > roundsWon1) {
            System.out.println("Player 2 wins!");
            System.exit(200);
        }
        // If player 1 won more
        else {
            System.out.println("Player 1 wins!");
            System.exit(100);
        }
    }

    // Method for pausing gameplay until Enter is pressed
    public static void pause() {
        System.out.println("[Press Enter to continue.]");
        pause = userInput.nextLine();
    }

    // Method for safely parsing a String from the Scanner into an Integer
    // Recursion needed to retry scanning an Integer
    public static int scanInt() throws NumberFormatException {
        int toReturn;
        try {
            toReturn = Integer.parseInt(userInput.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.print("That is not a number. Please try again: ");
            toReturn = scanInt();
        }
        return toReturn;
    }

    // Method for entering number of rounds; recursion is needed in case the player enters an even number (or not a number).
    public static int enterRounds() {
            // If user enters non-parseable string value, the following line throws java.lang.NumberFormatException
            int rounds = scanInt();
            if (rounds % 2 == 1) {
                return rounds;
            }
            else {
                System.out.print(rounds + " is not an odd number. Please try again: ");
                enterRounds();
            }
        return -1; // methods with a return value need an unconditional return statement. This will never be used.
    }

    // Method for starting the round, including players entering their character information
    public static void initRound() {
        // Player 1 stats
        System.out.println("Player 1: Select a Character and enter its stats");
        System.out.print("Enter name: ");
        name1 = userInput.nextLine();
        System.out.print("Enter HP: ");
        hp1 = scanInt();
        System.out.print("Enter move name: ");
        moveName1 = userInput.nextLine();
        System.out.print("Enter move's power: ");
        power1 = scanInt();
        System.out.print("Enter attack speed: ");
        speed1 = scanInt();

        // Player 2 stats
        System.out.println("\nPlayer 2: Select a Character and enter its stats");
        System.out.print("Enter name: ");
        name2 = userInput.nextLine();
        System.out.print("Enter HP: ");
        hp2 = scanInt();
        System.out.print("Enter move name: ");
        moveName2 = userInput.nextLine();
        System.out.print("Enter move's power: ");
        power2 = scanInt();
        System.out.print("Enter attack speed: ");
        speed2 = scanInt();
    }

    // Method to ensure no one has reached 0 HP yet
    public static boolean isNotDead() {
        return hp1 > 0 && hp2 > 0;
    }

    // Method to see who died (if anyone did)
    // returns 1 if player 1 died, or 2 if player 2 died
    // returns 0 if no one is dead yet
    public static int whoDied() {
        if (!isNotDead()) {
            if (hp1 <= 0)
                return 1;
            else if (hp2 <= 0)
                return 2;
        }
        return 0;
    }

    // Method to determine if anyone is dead, and if so who, and crown that player winner of the round
    // Returns true if it did anything, or false if no one has died
    public static boolean checkForDeath() {
        // Player 2 died
        if (whoDied() == 2) {
            System.out.println("Player 1 (" + name1 + ") wins this round!");
            roundsWon1++;
            return true;
        }
        // Player 1 died
        else if (whoDied() == 1) {
            System.out.println("Player 2 (" + name2 + ") wins this round!");
            roundsWon2++;
            return true;
        }

        // No one died
        return false; // whoDied() == 0;
    }

    // Method for attack turns
    public static void playRound() {
        // Player 1, then Player 2
        if (speed1 > speed2) {
            // Player 1 attacks first
            System.out.println("Player 1 attacks first! " + name1 + " uses " + moveName1 + "!");
            hp2 -= power1;
            System.out.println(name2 + "'s HP is reduced to " + hp2);

            // If a player hasn't died
            if (!checkForDeath()) {
                // Player 2 attacks second
                System.out.println("Player 2 attacks second! " + name2 + " uses " + moveName2 + "!");
                hp1 -= power2;
                System.out.println(name1 + "'s HP is reduced to " + hp1);

                checkForDeath(); // return not needed; it'll do its thing if it has to
            }

            pause();
        }
        // Player 2, then Player 1
        else if (speed1 < speed2) {
            // Player 2 attacks first
            System.out.println("Player 2 attacks first! " + name2 + " uses " + moveName2 + "!");
            hp1 -= power2;
            System.out.println(name1 + "'s HP is reduced to " + hp1);

            // If a player hasn't died
            if (!checkForDeath()) {
                // Player 1 attacks second
                System.out.println("Player 1 attacks second! " + name1 + " uses " + moveName1 + "!");
                hp2 -= power1;
                System.out.println(name2 + "'s HP is reduced to " + hp2);

                checkForDeath(); // return not needed; it'll do its thing if it has to
            }
            
            pause();
        }
        // RNG used for who goes first
        else { // They must have equal speed
            int randomNum = (int)(Math.random() * 2 + 1);
            // Player 1, then Player 2
            if (randomNum == 1) {
                // Player 1 attacks first
                System.out.println("Player 1 attacks first! " + name1 + " uses " + moveName1 + "!");
                hp2 -= power1;
                System.out.println(name2 + "'s HP is reduced to " + hp2);

                // If a player hasn't died
                if (!checkForDeath()) {
                    // Player 2 attacks second
                    System.out.println("Player 2 attacks second! " + name2 + " uses " + moveName2 + "!");
                    hp1 -= power2;
                    System.out.println(name1 + "'s HP is reduced to " + hp1);

                    checkForDeath(); // return not needed; it'll do its thing if it has to
                }

                pause();
            }
            // Player 2, then Player 1
            else { // randomNum must be 2
                // Player 2 attacks first
                System.out.println("Player 2 attacks first! " + name2 + " uses " + moveName2 + "!");
                hp1 -= power2;
                System.out.println(name1 + "'s HP is reduced to " + hp1);

                // If a player hasn't died
                if (!checkForDeath()) {
                    // Player 1 attacks second
                    System.out.println("Player 1 attacks second! " + name1 + " uses " + moveName1 + "!");
                    hp2 -= power1;
                    System.out.println(name2 + "'s HP is reduced to " + hp2);

                    checkForDeath(); // return not needed; it'll do its thing if it has to
                }

                pause();
            }
        }
    }
}