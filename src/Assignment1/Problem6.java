package Assignment1;

import java.util.Scanner;
/**
 * This method calculates the power of a number using recursion.
 * 
 * The function computes a^n (a raised to the power of n) recursively.
 * 
 * Base Case:
 * - If n == 0, return 1 (as any number raised to the power of 0 is 1).
 * 
 * Recursive Case:
 * - Multiply 'a' by the result of power(a, n - 1).
 * 
 * Time Complexity: O(n), since the function calls itself n times.
 * Space Complexity: O(n), due to recursive function calls stored in the call stack.
*/

public class Problem6 {
    public static long power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a, n));
    }
}
