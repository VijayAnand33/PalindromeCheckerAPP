package UC_2;

/**
 * ================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This program checks whether a hardcoded string is a palindrome.
 *
 * Author: Your Name
 * Version: 1.0
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}