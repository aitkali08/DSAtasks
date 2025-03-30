package Assignment1;

import java.util.Scanner;

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
