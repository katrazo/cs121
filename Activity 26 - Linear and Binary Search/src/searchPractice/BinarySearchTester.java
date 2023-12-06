package searchPractice;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        int[] array = {23, 17, 12, 90, 84, 38, 5, 77, 44};
        System.out.print("unsorted: ");
        for (int num : array)
            System.out.print(num + " ");
        System.out.println();
        // sort array
        int[] sortedArray = selectionSort(array);
        System.out.print("sorted: ");
        for (int num : sortedArray)
            System.out.print(num + " ");
        System.out.println();

        //search for number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(userInput.nextLine());

        int found = demo.binarySearch(key, sortedArray);
        if (found == -1)
            System.out.println("Item not found.");
        else
            System.out.printf("Item found at index %d, position %d", found, found+1);
    }

    public static int[] selectionSort(int[] unsortedArray) {
        int[] sortedArray = unsortedArray;
        for (int i = 0; i < sortedArray.length-1; i++) {
            int min = i;
            for (int j = i + 1;j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[min])
                    min = j;
            }
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[min];
            sortedArray[min] = temp;
        }
        return sortedArray;
    }
}
