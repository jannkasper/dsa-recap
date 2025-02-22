package sorting;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
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
        BubbleSort sorter = new BubbleSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        sorter.bubbleSort(array);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
