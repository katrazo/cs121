package genericsPractice;

public class Main {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};

        System.out.println("Integer Array:");
        generic.printArray(intArray);
        System.out.println("Double Array:");
        generic.printArray(doubleArray);
        System.out.println("Char Array:");
        generic.printArray(charArray);
        System.out.println("String Array:");
        generic.printArray(stringArray);
    }
}
