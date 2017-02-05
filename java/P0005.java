/*
2520 is the smallest number that can be divided by each of the numbers from 1
 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20?
 */

public class P0005 {
    public static void main(String[] args) {
        int i = 1;
        while (!divisibleUpTo20(i)) {
            i++;
        }
        System.out.println(i);
    }

    public static boolean divisibleUpTo20(int num) {
        for (int i = 1; i <= 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}