package dateFormatActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TotalCalories totalCalories = new TotalCalories();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the calories per day by the diet:");
        int caloriesPerDay = Integer.parseInt(userInput.nextLine());
        System.out.println("Enter the diet start date as mm/dd/yyyy:");
        String pickupDate = userInput.nextLine();
        System.out.println("Enter the diet end date as mm/dd/yyyy:");
        String returnDate = userInput.nextLine();

        int caloriesConsumed = totalCalories.calcTotalCalories(caloriesPerDay, pickupDate, returnDate);
        System.out.printf("Calories consumed during diet = %d", caloriesConsumed);
    }
}
