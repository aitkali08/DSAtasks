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
