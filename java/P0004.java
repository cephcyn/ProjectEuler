/*
A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

import java.util.*;

public class P0004 {
    public static void main(String[] args) {
        boolean done = false;
        int max = 0;
        for (int i = 100; i < 1000 && !done; i++) {
            for (int j = i; j < 1000 && !done; j++) {
                if (isPalindrome(i * j) && i * j > max) {
                    max = i * j;
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(int i) {
        if (i > 10) {
            int curr = i;
            int reverse = 0;
            while (curr > 0) {
                reverse = reverse * 10 + curr % 10;
                curr /= 10;
            }
            return i == reverse;
        }
        return true;
    }
}