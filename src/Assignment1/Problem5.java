package Assignment1;

import java.util.Scanner;
/**
 * This method calculates the nth Fibonacci number using recursion.
 * 
 * The Fibonacci sequence is defined as:
 * - F(0) = 0
 * - F(1) = 1
 * - F(n) = F(n-1) + F(n-2) for n ≥ 2
 * 
 * Base Cases:
 * - If n == 0, return 0.
 * - If n == 1, return 1.
 * 
 * Recursive Case:
 * - Compute F(n) as the sum of F(n-1) and F(n-2).
 * 
 * Time Complexity: O(2^n), due to repeated calculations in the recursive tree.
 * Space Complexity: O(n), due to recursive function calls stored in the call stack
    */
public class Problem5 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
