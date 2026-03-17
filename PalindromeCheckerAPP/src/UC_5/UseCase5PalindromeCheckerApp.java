package UC_5;

/**
 * ================================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using a Stack data structure.
 *
 * Author: Your Name
 * Version: 1.0
 */

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Build reversed string using stack
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
