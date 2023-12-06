package sortingActivity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting test = new Sorting();
        int[] array = test.getArray();
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        System.out.println("\n-=-=- Bubble Sorted Array: -=-=-");
        int[] bubbleArray = test.sortArray(array, 1);
        System.out.println("Sorted array: " + Arrays.toString(bubbleArray));

        System.out.println("\n-=-=- Merge Sorted Array: -=-=-");
        int[] mergeArray = test.sortArray(array, 2);
        System.out.println("Sorted array: " + Arrays.toString(mergeArray));
    }
}
