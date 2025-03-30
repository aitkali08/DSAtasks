package Assignment1;

import java.util.Scanner;

public class Problem3 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }
}
