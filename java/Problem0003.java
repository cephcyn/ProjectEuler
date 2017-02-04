/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

import java.util.*;

public class Problem0003 {
    public static void main(String[] args) {
        long num = 600851475143L;
        long testing = 2;

        while (testing < num) {
            if (num % testing == 0) {
                num /= testing;
                testing = 2;
            } else {
                testing++;
            }
        }
        System.out.println(num);
    }
}