package weekTwo;

public class integerDiv {
    public static void main(String[] args) {
        int numOne = 4;
        int numTwo = 5;
        System.out.println("\n" + numOne + " / " + numTwo + " = " + numOne/numTwo);
        System.out.println("Uh oh! That didn't work right.\nIntegers can't use decimals, so they always round down!");

        System.out.println("\n" + (double)numOne + " / " + numTwo + " = " + (double)numOne/numTwo);
        System.out.println("Much better! type-casting one of them as a double allows for usage of decimal places!");
    }
}
