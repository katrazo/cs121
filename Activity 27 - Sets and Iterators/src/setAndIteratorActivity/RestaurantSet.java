package setAndIteratorActivity;

import setAndIteratorActivity.otherClasses.Table;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RestaurantSet {
    private Set<Table> tables = new HashSet<>();
    private Scanner userInput = new Scanner(System.in);

    public void addTables(){
        int numOfTables;
        System.out.println("[Enter 0 at any time to quit]");
        System.out.print("How many tables would you like to enter? -> ");
        numOfTables = Integer.parseInt(userInput.nextLine());
        if (numOfTables == 0)
            return;

        for (int i = 1; i <= numOfTables; i++) {
            int numOfSeats;
            String input;
            boolean isReserved;

            System.out.println("-=-=- Table " + i + " -=-=-");

            System.out.print("Number of seats -> ");
            numOfSeats = Integer.parseInt(userInput.nextLine());
            if (numOfSeats == 0)
                return;

            System.out.print("Is the table reserved? [true or false] -> ");
            input = userInput.nextLine().toLowerCase();
            if (input.equals("0"))
                return;
            else if (input.equals("true"))
                isReserved = true;
            else
                isReserved = false;

            tables.add(new Table(numOfSeats,isReserved));
        }
    }

    public void displayTables() {
        Iterator<Table> iter = tables.iterator();

        System.out.println("\n-=-=- Tables: -=-=-");
        while (iter.hasNext())
            System.out.println(iter.next().toString());
    }
}
