package weekTwo;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String name = returnInput(userInput, "Please enter your name:");
        System.out.println("Hello, " + name + "!");
        // double aaa = Double.parseDouble(userInput.nextLine());
        // int aaaaaaaa = Integer.parseInt(userInput.nextLine());

        userInput.close();
    }

    public static String returnInput (Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
