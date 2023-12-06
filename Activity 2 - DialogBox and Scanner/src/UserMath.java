import java.util.Scanner;

public class UserMath {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter two numbers.\n[Anything else will crash the program.]");
        int numOne = userInput.nextInt();
        int numTwo = userInput.nextInt();

        System.out.println("\nAddition:");
        System.out.println(numOne + " + " + numTwo + " = " + (numOne+numTwo));

        System.out.println("\nSubtraction:");
        System.out.println(numOne + " - " + numTwo + " = " + (numOne-numTwo));

        System.out.println("\nMultiplication:");
        System.out.println(numOne + " * " + numTwo + " = " + (numOne*numTwo));

        System.out.println("\nDivision:");
        System.out.println(numOne + " / " + numTwo + " = " + ((double)numOne/numTwo));

        System.out.println("\nSquare Root:");
        System.out.println("Square Root of " + numOne + " = " + Math.sqrt((double)numOne));
        System.out.println("Square Root of " + numTwo + " = " + Math.sqrt((double)numTwo));

        System.out.println("\nPower:");
        System.out.println(numOne + " to the power of " + numTwo + " = " + Math.pow(numOne, numTwo));

        System.out.println("\nLogarithm:");
        System.out.println("Natural log of " + numOne + " = " + Math.log(numOne));
        System.out.println("Natural log of " + numTwo + " = " + Math.log(numTwo));
    }
}
