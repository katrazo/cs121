package sortingActivity;

import java.util.Scanner;

public class Sorting {
    Scanner userInput = new Scanner(System.in);

    public int[] getArray() {
        int[] toReturn = new int[5];
        System.out.println("Please enter 5 integers, separated by a space or a new line.");
        for (int i = 0; i < 5; i++) {
            toReturn[i] = Integer.parseInt(userInput.next());
        }
        return toReturn;
    }

    /**
     * Sorts an integer array in ascending order using bubble sort or merge sort, then returns it.
     * @param array an integer array to be sorted
     * @param type an indicator of the sorting algorithm; 1 is bubble sort, 2 (or else) is merge sort
     * @return a sorted integer array based on the sorting method used on the original array
     */
    public int[] sortArray(int[] array, int type) {
        // -=-=- Bubble Sort -=-=-
        if (type == 1) {
            while (!isSorted(array)) {
                // "i < array.length - 1" because if length is 4 and i+1 = 5, it'll cause an outOfBoundsException
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        }

        // -=-=- Merge Sort -=-=-
        // See mergeSort method further down; because of the way
        // the method recurs and breaks, it needs to be isolated.
        else {
            mergeSort(array);
        }

        return array;
    }


    private void mergeSort(int[] array) {
        // base case: array has one value
        if (array.length <= 1)
            return;

        int[] leftHalf = new int[array.length/2];
        int[] rightHalf = new int[array.length - leftHalf.length];

        // IntelliJ is telling me these can be replaced by the System.arraycopy() method.
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[leftHalf.length+i];
        }

        // recursive case: array is not 1 element
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // merge divided arrays
        merge(leftHalf,rightHalf,array);
    }

    /**
     * A private method used to Merge the splits in an array. Since the mergeSort() is recursive, it'll need this.
     * @param leftHalf The left half of the split array that needs sorted back together
     * @param rightHalf The right half of the split array that needs sorted back together
     * @param array The array that is sorted.
     */
    private void merge(int[] leftHalf, int[] rightHalf, int[] array) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        // advance left or right half of the array accordingly, sorting it
        while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {
            // If the left half is smaller, add that first
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
            }

            // If the right half is smaller, add that first
            else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }

        // -=- Copy the rest of the left and right halves in. Only one of these will be true. -=-
        // Copy in the rest of the left half
        while (leftIndex < leftHalf.length) {
            array[arrayIndex] = leftHalf[leftIndex];
            leftIndex++;
            arrayIndex++;
        }

        // Copy in the rest of the right half
        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }


    /**
     * Checks if an array is sorted in ascending order.
     * Bubble sort has to potentially iterate multiple times, so this method checks if it must iterate again.
     * @param array the array to check for proper sorting
     * @return false if the array is not sorted, true if it is
     */
    private boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}
