package array;

import java.util.Arrays;

/**
 * Finding sum of digits of a number until sum becomes single digit
 * Input: n = 5674
 * Output: 4
 * Explanation:
 * Step 1: 5 + 6 + 7 + 4 = 22
 * Step 2: 2 + 2 = 4
 */
public class SumOfDigits {

    public int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0 || sum > 9) {

            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        SumOfDigits dsa = new SumOfDigits();
        int number = 5674;

        System.out.println("Original number: " + number);

        int result = dsa.sumOfDigits(number);

        System.out.println("Sum of Digits is: : " + result);
    }
}
