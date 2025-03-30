package Assignment1;

import java.util.Scanner;
/**
 * This method calculates the Binomial Coefficient C(n, k) using recursion.
 * 
 * The Binomial Coefficient represents the number of ways to choose k elements from a set of n elements.
 * It is defined as:
 * 
 * C(n, k) = n! / (k! * (n - k)!)
 * 
 * Using Pascal's identity:
 * C(n, k) = C(n-1, k-1) + C(n-1, k), with base cases:
 * C(n, 0) = 1 and C(n, n) = 1
 * 
 * Time Complexity: O(2^n), due to the exponential growth of recursive calls.
 * Space Complexity: O(n), due to recursive call stack depth.
    */
public class Problem9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoefficient(n, k));

        if (n < 0 || k < 0 || k > n) {
            System.out.println("Invalid input. Ensure that 0 ≤ k ≤ n.");
        } else {
            System.out.println("C(" + n + ", " + k + ") = " + binomialCoefficient(n, k));
        }
    }
}
