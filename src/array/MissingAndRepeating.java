package array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class MissingAndRepeating {

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
        MissingAndRepeating dsa = new MissingAndRepeating();
        Integer[] array = {4, 3, 6, 2, 1, 1};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        dsa.removeElement(array);

        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(array));
    }
}
