/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

import java.util.*;
import java.io.*;

public class P0010 {
    public static final int MAX_VALUE = 2000000;

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= MAX_VALUE; i++) {
            primes.add(i);
        }

        // sieve
        int i = 0;
        while (i < primes.size()) {
            int factor = primes.get(i);
            for (int j = primes.size() - 1; j > i; j--) {
                if (primes.get(j) % factor == 0) {
                    primes.remove(j);
                }
            }
            i++;
        }
        savePrimesToFile(primes);

        long sum = 0;
        for (Integer curr : primes) {
            sum += curr;
        }
        System.out.println(sum);
    }

    public static void savePrimesToFile(ArrayList<Integer> list) {
        try {
            PrintStream output = new PrintStream(new File("primes.txt"));
            for (Integer i : list) {
                output.print(i + " ");
            }
        } catch (Exception e) {
        }
    }
}