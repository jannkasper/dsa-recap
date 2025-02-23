package array;

import java.util.Arrays;

/**
 * Rotates an array to the left by d positions using the Juggling Algorithm.
 */
public class RotateNth {

    public void rotateNth(int[] arr, int d) {
        int n = arr.length;

        d %= n; // Handle cases where d > n

        int cycles = gcd(n, d);

        for (int i = 0; i < cycles; i++) {
            int temp = arr[i]; // Store initial element
            int currIdx = i;

            while (true) {
                int nextIdx = (currIdx + d) % n;

                if (nextIdx == i) break; // Cycle completed

                arr[currIdx] = arr[nextIdx]; // Move next value to current
                currIdx = nextIdx;
            }

            arr[currIdx] = temp; // Place stored element in final position
        }
    }

    // Compute the Greatest Common Divisor (GCD)
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        RotateNth dsa = new RotateNth();
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        dsa.rotateNth(array, 3);

        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(array));
    }
}
