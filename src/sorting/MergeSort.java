package sorting;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                int value = arr[j];
                int index = j;

                while (index > i) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[i] = value;

                i++;
                mid++;
                j++;
            }
        }
    }

    // Main method to test Bubble Sort
    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        sorter.mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
