package dateFormatPractice;

import java.util.Scanner;

public class RentalFeeTest {
    public static void main(String[] args) {
        RentalFee rentalFee = new RentalFee();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the rate per day:");
        double rate = Double.parseDouble(userInput.nextLine());
        System.out.println("Enter the pickup date as mm/dd/yyyy:");
        String pickupDate = userInput.nextLine();
        System.out.println("Enter the return date as mm/dd/yyyy:");
        String returnDate = userInput.nextLine();

        double fee = rentalFee.calcRentalFee(rate, pickupDate, returnDate);
        System.out.printf("Rental fee = $%.2f", fee);
    }
}
