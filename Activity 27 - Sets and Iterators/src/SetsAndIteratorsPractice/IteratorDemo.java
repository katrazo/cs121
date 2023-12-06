package SetsAndIteratorsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Steve");
        names.add("Jack");

        // Display elements of names list

        // initialize iterator by calling collection's
        // iterator() method
        Iterator<String> iter = names.iterator();

        // hasNext() returns a boolean, true or false
        // while it's true that iter has a next element...
        /* while (iter.hasNext()) {
            // ...the next element value will be assigned to name
            // and name's value printed
            String name = (String)iter.next();
            System.out.println(name);
        } */
        // Remove elements

        while (iter.hasNext()) {
            String name = (String)iter.next();
            if (name.equals("Alice"))
                iter.remove();
        }
    }
}
