import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed strings
    public static boolean isPalindromeUsingReverse(String text) {
        String reversed = reverseString(text);
        return text.equals(reversed);
    }

    // Method to reverse a string
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check palindrome using iterative logic
        boolean isPalindromeIterative = isPalindromeIterative(input);
        System.out.println("Iterative Check: " + (isPalindromeIterative ? "Palindrome" : "Not a Palindrome"));

        // Check palindrome using recursion
        boolean isPalindromeRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Recursive Check: " + (isPalindromeRecursive ? "Palindrome" : "Not a Palindrome"));

        // Check palindrome using reverse logic
        boolean isPalindromeUsingReverse = isPalindromeUsingReverse(input);
        System.out.println("Reverse String Check: " + (isPalindromeUsingReverse ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
