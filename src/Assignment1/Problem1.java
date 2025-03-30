package Assignment1;

import java.util.Scanner;
/**
 * Recursively finds the minimum element in an array.
 * 
 * The function works as follows:
 * 
 * Base Case:
 * - If n == 1, return the only element in the array.
 * 
 * Recursive Case:
 * - Compare the last element with the minimum of the remaining array.
 * - Use Math.min() to return the smallest value.
 * 
 * Time Complexity: O(n) (since we check each element once).
 * Space Complexity: O(n) (due to recursive function calls in the call stack).
    */
public class Problem1 {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr, n));
    }
}
