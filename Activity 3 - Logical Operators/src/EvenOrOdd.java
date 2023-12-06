import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Prompt
        System.out.println("\nPlease enter a number:");
        // User Input
        int num = Integer.parseInt(userInput.nextLine());

        if (num % 2 == 1)
            System.out.println(num + " is odd.");
        else
            System.out.println(num + " is even.");
    }
}
