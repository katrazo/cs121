package activity26;

import java.util.ArrayList;

public class BinarySearchDemo {
    public int binarySearch(int key, ArrayList<Integer> list) {
        int counter = 0;
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;
        System.out.printf("comparison %d:\t", ++counter);
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.printf("\n\tLow Index: %d (%d)\tMid Index: %d (%d)\tHigh Index: %d (%d)\n\n",
                low, list.get(low), mid, list.get(mid), high, list.get(high));

        while (low <= high && list.get(mid) != key) {
            if (list.get(mid) < key)
                low = mid + 1;
            else
                high = mid - 1;
            mid = (low + high) / 2;
            System.out.printf("comparison %d:\t", ++counter);
            for (int i = low; i <= high; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.printf("\n\tLow Index: %d (%d)\tMid Index: %d (%d)\tHigh Index: %d (%d)\n\n",
                    low, list.get(low), mid, list.get(mid), high, list.get(high));
        }

        if (low > high) {
            mid = -1;
        }

        return mid;
    }
}
