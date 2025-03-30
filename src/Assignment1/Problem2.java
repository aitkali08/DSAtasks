package Assignment1;

import java.util.Scanner;
/**
 * Recursively calculates the average of an array.
 * 
 * The average of an array {a1, a2, ..., an} is computed as:
 * 
 * Average(n) = (arr[n-1] + (n-1) * Average(n-1)) / n
 * 
 * Base Case:
 * - If n == 1, return the only element in the array.
 * 
 * Recursive Case:
 * - Compute the average by including the last element and 
 *   averaging it with the result of a smaller sub-array.
 * 
 * Time Complexity: O(n) (since we make n recursive calls).
 * Space Complexity: O(n) (due to recursive function calls in the call stack).
    */
public class Problem2 {
    public static double findAverage(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return (arr[n - 1] + (n - 1) * findAverage(arr, n - 1)) / (double) n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findAverage(arr, n));
    }
}
