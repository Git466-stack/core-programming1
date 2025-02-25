import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Take input from the user
        String input = getInput("Enter a string to check if it is a palindrome: ");

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display the result
        displayResult(input, isPalindrome);
    }

    // Function to take input from the user
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }

    // Function to display the result
    public static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
