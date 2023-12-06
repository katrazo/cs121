package searchPractice;

public class BinarySearchDemo {
    public int binarySearch(int key, int[] array) {
        int counter = 0;
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;
        System.out.printf("comparison %d:\t", ++counter);
        for (int n : array) {
            System.out.println(n + " ");
        }
        System.out.printf("\n\tLow Index: %d (%d)\tMid Index: %d (%d)\tHigh Index: %d (%d)\n\n",
                low, array[low], mid, array[mid], high, array[high]);

        while (low <= high && array[mid] != key) {
            if (array[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
            mid = (low + high) / 2;
            System.out.printf("comparison %d:\t", ++counter);
            for (int i = low; i <= high; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.printf("\n\tLow Index: %d (%d)\tMid Index: %d (%d)\tHigh Index: %d (%d)\n\n",
                    low, array[low], mid, array[mid], high, array[high]);
        }

        if (low > high) {
            mid = -1;
        }

        return mid;
    }
}
