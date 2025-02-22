package sorting;

import java.util.Arrays;

public class CountingSort {

    public void countingSort(int[] arr) {
        int maxVal = Arrays.stream(arr).max().orElse(0);
        int[] count = new int[maxVal + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }

    }
    // Main method to test Bubble Sort
    public static void main(String[] args) {
        CountingSort sorter = new CountingSort();
        int[] array = {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        sorter.countingSort(array);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
