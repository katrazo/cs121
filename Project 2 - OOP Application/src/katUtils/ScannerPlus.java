package katUtils;

import java.util.Scanner;

/**
 * Useful functions for using a Scanner, namely with System.in.
 */
public class ScannerPlus {
    protected Scanner userInput = new Scanner(System.in);

    /**
     * Used to pause the continuation of code until the user presses ENTER. The String pause is never used.
     */
    public void pause() {
        String pause = userInput.nextLine();
    }

    /**
     * Prints a prompt for the user and accepts a generic String input.
     * @param prompt The message to print in the console.
     * @param toLowerCase If true, lower-cases the user input before returning it.
     * @return The line the user types into the console.
     */
    public String promptUser(String prompt, boolean toLowerCase) {
        System.out.println(prompt);
        String toReturn = userInput.nextLine();
        if (toLowerCase)
            toReturn = toReturn.toLowerCase();
        return toReturn;
    }

    /**
     * An overloaded version of promptUser that simply returns a lowercase version of what the user inputs.
     * @return
     */
    public String promptUser() {
        return userInput.nextLine().toLowerCase();
    }
}
