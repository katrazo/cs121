import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] firstNames = new String[3];
        String[] lastNames = new String[3];
        int[] ages = new int[3];

        System.out.println("For the first array, please type " + firstNames.length + " first names.");
        System.out.println("This can be one at a time or all at once (separated by a space).");
        System.out.println("-----------------------------");
        for (int i = 0; i < firstNames.length; i++) {
            firstNames[i] = userInput.next();
        }

        String eatUnaccountedLineBreak = userInput.nextLine(); // For some reason this was being caught as the first entry of the following array.

        System.out.println("\nFor the second array, please type " + lastNames.length + " last names.");
        System.out.println("This can be one at a time or all at once (separated by a space).");
        System.out.println("-----------------------------");
        for (int i = 0; i < lastNames.length; i++) {
            lastNames[i] = userInput.next();
        }

        System.out.println("\nFor the third array, please type " + ages.length + " ages (as integers).");
        System.out.println("This can be one at a time or all at once (separated by a space).");
        System.out.println("-----------------------------");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = Integer.parseInt(userInput.next());
        }

        // Array.toString(Array arr) prints the contents of the array, whereas arr.toString() would print the assignment data of the array itself.
        System.out.println("Here are your people:");
        System.out.println("-----------------------------");
        System.out.printf("%-14s %s\n", "Name", "Age");
        for (int i = 0; i < firstNames.length; i++) {
            System.out.printf("%-14s %d\n",firstNames[i] + " " + lastNames[i], ages[i]);
        }
    }
}
