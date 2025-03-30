package Assignment1;

import java.util.Scanner;
/**
 * This method calculates the factorial of a given number using recursion.
 * 
 * The function multiplies the number by the factorial of (n-1) until it reaches the base case.
 * Factorial is defined as: n! = n × (n-1) × (n-2) × ... × 1
 * 
 * Time Complexity: O(n), as the function makes n recursive calls.
 * Space Complexity: O(n), due to the recursive call stack.
**/
public class Problem4 {
    public static int factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(n == 0) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
