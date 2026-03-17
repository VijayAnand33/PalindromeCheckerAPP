package UC_10;

/**
 * ================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by ignoring spaces and case differences.
 *
 * Author: Your Name
 * Version: 1.0
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize (remove spaces + convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Two-pointer check
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}