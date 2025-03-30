package Assignment1;

import java.util.Scanner;

public class Problem8 {
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isAllDigits(s) ? "Yes" : "No");
    }
}
