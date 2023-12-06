import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String guess = "";
        int correctGuesses = 0;
        String computerColor;

        for (int i = 1; i <= 10; i++) {
            computerColor = computerGuess();
            System.out.println(i + ". What color has the computer chosen?");
            guess = userInput.next();
            System.out.println(">The computer chose " + computerColor);
            if (guess.equals(computerColor))
                correctGuesses++;
        }

        System.out.println("You got " + correctGuesses + " out of 10 correct");
    }

    public static String computerGuess () {
        int espColor = (int)(Math.random() * 5);
        if (espColor == 0)
            return "red";
        else if (espColor == 1)
            return "green";
        else if (espColor == 2)
            return "blue";
        else if (espColor == 3)
            return "orange";
        else // is (espColor == 4)
            return "yellow";
        // The method needs a return statement outside an "if"/"else if" condition or else it won't compile
    }
}
