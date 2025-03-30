package Assignment1;

import java.util.Scanner;

/**
 * This method prints an array in reverse order using recursion.
 * 
 * The function starts from the last index of the array and recursively prints each element 
 * until it reaches the beginning of the array.
 * 
 * Base Case:
 * - If the index becomes negative, the recursion stops.
 * 
 * Time Complexity: O(n), since each element is visited once.
 * Space Complexity: O(n), due to recursive function calls stored in the call stack.
    */
public class Problem7 {
    public static void printReverse(int index, int n, int[] elements) {
        if (index < 0) {
            return;
        }
        System.out.print(elements[index] + " ");
        printReverse(index - 1, n, elements);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }

        printReverse(n - 1, n, elements);
        scanner.close();
    }
}
