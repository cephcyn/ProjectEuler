/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural
numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred
natural numbers and the square of the sum.
 */

public class P0006 {
    public static final int NUM_NUMBERS = 100;

    public static void main(String[] args) {
        System.out.println(sumSquares(NUM_NUMBERS) - squaresSum(NUM_NUMBERS));
    }

    public static long sumSquares(int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static long squaresSum(int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        return sum * sum;
    }
}