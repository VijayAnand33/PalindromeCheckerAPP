/*
* =========================================
* MAIN CLASS UseCase1Palindrome App
* =========================================
* Use Case 1: Application Entry & Welcome Message
* Description:
* This class represents the entry point of the
* Palindrome Checker Management System.
* At this stage, the application:
* Starts execution from the main() method
* Displays a welcome message
* Shows application version
* No palindrome logic is implemented yet.
* The goal is to establish a clear startup flow.
  @author Vijay Anand D S
  @version 1.0

public class UseCase1PalindromeCheckerApp
/**
Application entry point.
This is the first method executed by the JVM
when the program starts.
* @param args Command-Line arguments
public static void main(String[] args) {...}
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "level";
        String reversed = "";

        // Reverse the string using loop
        for(int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if(original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }
    }
}