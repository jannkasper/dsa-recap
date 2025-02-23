package array;

import java.util.Arrays;

/**
 * Given a sorted array, modifies it so that all distinct elements appear at the beginning in sorted order.
 * Returns the length of this distinct subarray.
 *
 * The elements after the distinct ones can be ignored.
 */
public class RemoveDuplicatesSorted {

    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1; // Position to insert the next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // Found a new unique element
                arr[index++] = arr[i];
            }
        }

        return index; // The length of the distinct sorted subarray
    }

    // Main method to test the function
    public static void main(String[] args) {
        RemoveDuplicatesSorted dsa = new RemoveDuplicatesSorted();
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        int newSize = dsa.removeDuplicates(array);

        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 0, newSize)));

        System.out.println("Length of distinct sorted subarray: " + newSize);
    }
}
