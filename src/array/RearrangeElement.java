package array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * Given an array arr[] of size n, the task is to rearrange it in alternate positive and negative manner
 * without changing the relative order of positive and negative numbers. In case of extra positive/negative numbers, they appear at the end of the array.
 *
 * Note: The rearranged array should start with a positive number and 0 (zero) should be considered as a positive number.
 */
public class RearrangeElement {

    public void removeElement(Integer[] arr) {
        Queue<Integer> pos = new ArrayDeque<>();
        Queue<Integer> neg = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos.offer(arr[i]);
            } else {
                neg.offer(arr[i]);
            }
        }

        int idx = 0;
        while(!pos.isEmpty() || !neg.isEmpty()) {
            if (pos.peek() != null) {
                arr[idx++] = pos.remove();
            }
            if (neg.peek() != null) {
                arr[idx++] = neg.remove();
            }
        }


    }

    // Main method to test the rotation
    public static void main(String[] args) {
        RearrangeElement dsa = new RearrangeElement();
        Integer[] array = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        dsa.removeElement(array);

        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(array));
    }
}
