package genericsActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();

        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charArrayList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));

        System.out.println("Integer ArrayList:");
        generic.printArrayList(intArrayList);
        System.out.println("Double ArrayList:");
        generic.printArrayList(doubleArrayList);
        System.out.println("Char ArrayList:");
        generic.printArrayList(charArrayList);
        System.out.println("String ArrayList:");
        generic.printArrayList(stringArrayList);
    }
}
