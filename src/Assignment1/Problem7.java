package Assignment1;

import java.util.Scanner;

/**
 * This method checks if a given string consists only of numeric digits.
 * 
 * The method iterates through each character of the string and verifies if all characters are digits.
 * 
 * Edge Cases Handled:
 * - An empty string returns false.
 * - A string with non-numeric characters returns false.
 * - A purely numeric string returns true.
 * 
 * Time Complexity: O(n), where n is the length of the input string.
 * Space Complexity: O(1), as only a few extra variables are used.
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
