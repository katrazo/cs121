import java.util.Arrays;

public class RestaurantReservationSimulation {
    public static void main(String[] args) {

        // 1. Initialize Book Information
        String[][] tables = {
                // 2. Hardcoded Table Information
                {"3 seats", "Available"},
                {"6 seats", "Available"},
                {"2 seats", "Reserved"}
        };

        /* A toString() method for printing the contents of multidimensional arrays
         * System.out.println(Arrays.deepToString(tables));
         */

        // 3. Print Tables (Initial)
        for (String[] arrayChecker : tables) {
            System.out.println();
            for (String checker : arrayChecker) {
                System.out.print(checker + "     ");
            }
        }

        // 4. Simulate Reservation
        tables[0][1] = "Reserved";
        System.out.println("\n\n-----------------\n     Updated\n-----------------");

        // 5. Print Tables (Updated)
        for (String[] arrayChecker : tables) {
            System.out.println();
            for (String checker : arrayChecker) {
                System.out.print(checker + "     ");
            }
        }

    }
}
