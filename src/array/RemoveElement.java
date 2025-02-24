package array;

import java.util.Arrays;

/**
 * Given an integer array arr[] and an integer ele the task is to the remove all occurrences of ele from arr[] in-place
 * and return the number of elements which are not equal to ele.
 * If there are k number of elements which are not equal to ele then the input array arr[] should be modified
 * such that the first k elements should contain the elements which are not equal to ele and then the remaining elements.
 */
public class RemoveElement {

    public void removeElement(Integer[] arr, int d) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != d) {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = null;
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        RemoveElement dsa = new RemoveElement();
        Integer[] array = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele = 2;

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        dsa.removeElement(array, ele);

        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(array));
    }
}
