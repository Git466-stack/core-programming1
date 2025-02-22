import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String input) {
        StringBuilder toggledString = new StringBuilder();

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } 
            // Check if the character is lowercase
            else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } 
            // For non-alphabetic characters, keep them unchanged
            else {
                toggledString.append(c);
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Toggle the case of characters
        String result = toggleCase(input);

        // Output the result
        System.out.println("String with toggled case: " + result);

        scanner.close();
    }
}
