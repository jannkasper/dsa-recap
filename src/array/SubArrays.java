package array;

import java.util.Arrays;

/**
 * Given an array arr[], generates and prints all possible subarrays.
 */
public class SubArrays {

    public void generateSubArrays(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Print subarray from index i to j
                for (int k = i; k <= j; k++) { // Fix: include the last element
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // Move to the next line after printing a subarray
            }
        }
    }

    // Main method to test subarray generation
    public static void main(String[] args) {
        SubArrays dsa = new SubArrays();
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        System.out.println("All possible subarrays:");
        dsa.generateSubArrays(array);
    }
}
