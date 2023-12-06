import java.util.Scanner;

public class MethodsActivity {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        System.out.println(); // For organization/flow :)
        displayData(length, width, area);

        // At the end
        userInput.close();
    }

    public static double getLength() {
        System.out.print("\nEnter the rectangle's length: \t");
        return Double.parseDouble(userInput.nextLine());
    }

    public static double getWidth() {
        System.out.print("Enter the rectangle's width: \t");
        return Double.parseDouble(userInput.nextLine());
    }

    public static double getArea(double length, double width) {
        return length*width;
    }

    public static void displayData(double length, double width, double area) {
        System.out.println("rectangle length: \t" + length);
        System.out.println("rectangle width: \t" + width);
        System.out.println("rectangle area: \t" + area);
    }
}
