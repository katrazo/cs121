import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input; // userInput is initialized to a String first
        int inputNum; // If the input isn't q, parse it to an int
        int numOfGuesses = 0;

        /* Math.random() = random double from 0.00 to 0.99
         * Math.random() * 100 = random double from 0.00 to 99.00
         * Math.random() * 100 + 1 = random double from 1.00 to 100.00
         */
        int numToGuess = (int)(Math.random() * 100 + 1);

        // Initial Prompt
        System.out.println("Guess a number between 1 and 100, or enter \"q\" if you give up:");

        // Always true; will break manually if the user gets the number right or quits
        // This is because if I check for a number and the user typed "q" then it will crash
        while(true) {
            input = userInput.next();
            numOfGuesses++;

            // "q"
            if (input.equals("q")) {
                System.out.println("Quitter! The number was " + numToGuess + ".");
                break;
            }
            else {
                inputNum = Integer.parseInt(input);
                if (inputNum == numToGuess) {
                    System.out.println("Correct!\nNumber of guesses: " + numOfGuesses);
                    break;
                }
                else if (inputNum < numToGuess)
                    System.out.println("Too low. Guess again:");
                else
                    System.out.println("Too high. Guess again:");
            }
        }
    }
}
