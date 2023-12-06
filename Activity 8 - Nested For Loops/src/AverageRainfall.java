import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int years;
        int months; // not needed for for-loop, just for final calculation
        int totalRainfall = 0;
        double averageRainfall;

        System.out.println("Enter number of years");
        years = userInput.nextInt();
        months = years * 12;

        for (int i = 1; i <= years; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("Enter inches of rainfall for year %d month %d\n", i, j);
                totalRainfall += userInput.nextInt();
            }
        }

        averageRainfall = (double)totalRainfall / months;
        System.out.println("\nNumber of months: " + months);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.printf("Average rainfall per month for %d years: %.2f", years, averageRainfall);
    }
}
