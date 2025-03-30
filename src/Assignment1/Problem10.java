package Assignment1;

import java.util.Scanner;
/**
 * This method calculates the Greatest Common Divisor (GCD) of two numbers using recursion.
 * 
 * The function implements the **Euclidean Algorithm**, which states:
 * GCD(a, b) = GCD(b, a % b) until b becomes 0, at which point a is the GCD.
 * 
 * Time Complexity: O(log(min(a, b))), since the Euclidean algorithm runs in logarithmic time.
 * Space Complexity: O(log(min(a, b))), due to the recursive call stack.
 */
public class Problem10 {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a, b));

    }
}
