/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

import java.util.*;

public class P0009 {
    public static final int SUM = 1000;

    public static void main(String[] args) {
        for (int a = 1; a < SUM; a++) {
            for (int b = a; b < SUM; b++) {
                for (int c = b; c < SUM; c++) {
                    if (isPythTripl(a, b, c) && (a + b + c == SUM)) {
                        System.out.println(a * b * c);
                    }
                }
            }
        }
    }

    public static boolean isPythTripl(int a, int b, int c) {
        return (a * a + b * b) == (c * c);
    }
}