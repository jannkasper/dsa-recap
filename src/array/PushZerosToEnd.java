package array;

import java.util.Arrays;

/**
 * Moves all zeros in an array to the end while maintaining the relative order of non-zero elements.
 */
public class PushZerosToEnd {

    public void pushZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroIndex++] = num;
            }
        }

        // Fill the rest with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        PushZerosToEnd dsa = new PushZerosToEnd();
        int[] array = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        dsa.pushZerosToEnd(array);

        System.out.println("Array after moving zeros to the end:");
        System.out.println(Arrays.toString(array));
    }
}
