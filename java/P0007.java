/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
that the 6th prime is 13.

What is the 10 001st prime number?
 */
import java.util.*;
public class P0007 {
    public static final int ST_PRIME = 10001;
    public static void main(String[] args) {
        // It's another prime problem... woohoo
        LinkedList<Integer> primes = new LinkedList<Integer>();
        int curr = 2;
        while (primes.size() < ST_PRIME) {
            boolean prime = true;
            for(int i : primes) {
                if (curr % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                primes.add(curr);
            }
            curr++;
        }
        System.out.println(primes.get(primes.size() - 1));
    }
}