// Completed by Kat Razo and Maxwell Maglinte

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("\nEnter your budget for the month. $");
        int budget = Integer.parseInt(userInput.nextLine());
        System.out.println();

        int expenseTotal = 0;
        int numOfExpenses = 0;
        while (expenseTotal < budget) {
            System.out.print("Enter an expense: $");
            expenseTotal += Integer.parseInt(userInput.nextLine());
            numOfExpenses++;
        }

        System.out.println("Budget: $" + budget + "\n---------------");
        System.out.println("Total Expenses: $" + expenseTotal + " [" + numOfExpenses + " expense(s)]");
        if (expenseTotal > budget)
            System.out.println("You are $" + (expenseTotal - budget) + " over your budget.");
        else
            System.out.println("You are $" + (budget - expenseTotal) + " under your budget.");
    }
}
