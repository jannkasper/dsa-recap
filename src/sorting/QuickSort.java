package sorting;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = this.pivot(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public int pivot(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }


        // Swap two elements in an array
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test Bubble Sort
    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        sorter.quickSort(array, 0 , array.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
