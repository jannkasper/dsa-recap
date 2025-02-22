package sorting;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++ ) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap only if a smaller element is found
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }

    }

    // Swap two elements in an array
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test Bubble Sort
    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        sorter.selectionSort(array);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
