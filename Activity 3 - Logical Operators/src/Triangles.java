import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        int a, b, c; // triangle sides adjacent, opposite, hypotenuse
        Scanner userInput = new Scanner(System.in);

        // Prompt
        System.out.println("\nPlease enter the three side lengths of your triangle.");
        a = userInput.nextInt();
        b = userInput.nextInt();
        c = userInput.nextInt();

        if (a == b && b == c) // transitive property says a == c.
            System.out.println("\nYou have an equilateral triangle. (All sides are equal.)");
        else if (a == b || b == c || a == c)
            System.out.println("\nYou have an isosceles triangle. (Two sides are equal.)");
        else
            System.out.println("\nYou have a scalene triangle. (All sides are unequal.)");
    }
}
