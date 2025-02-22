package sorting;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Store the value to be inserted
            int j = i - 1;

            // Shift elements to the right instead of swapping
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at the correct position
            arr[j + 1] = key;
        }
    }

    // Main method to test Insertion Sort
    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        sorter.insertionSort(array);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
