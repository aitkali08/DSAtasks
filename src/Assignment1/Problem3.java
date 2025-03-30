package Assignment1;

import java.util.Scanner;
/**
 * This method checks whether a given number is prime.
 * 
 * A prime number is a natural number greater than 1 that has no 
 * positive divisors other than 1 and itself.
 * 
 * Algorithm:
 * - If n < 2, return false (as 0 and 1 are not prime).
 * - Iterate from 2 to sqrt(n) (i.e., i * i ≤ n):
 *   - If n is divisible by any number in this range, return false.
 * - If no divisors are found, return true.
 * 
 * Time Complexity: O(√n) (more efficient than O(n) brute force).
 * Space Complexity: O(1) (only a few variables are used).
*/
public class Problem3 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }
}
