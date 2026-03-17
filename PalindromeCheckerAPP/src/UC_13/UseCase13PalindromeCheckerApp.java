package UC_13;

/**
 * ================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This program compares performance of different
 * palindrome checking approaches.
 *
 * Author: Your Name
 * Version: 1.0
 */

import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Deque approach
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "AmanaplanacanalPanama".toLowerCase();

        // Measure Two-pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Measure Stack
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Measure Deque
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Two-Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}
