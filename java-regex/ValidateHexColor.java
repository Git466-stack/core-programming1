import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateHexColor {
    public static void main(String[] args) {
        // Regex for a valid hex color code
        String regex = "^#([a-fA-F0-9]{6})$";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a hex color code to validate:");
        String hexColor = scanner.nextLine(); // Read user input

        // Validate the hex color code
        if (Pattern.matches(regex, hexColor)) {
            System.out.println("✅ " + hexColor + " → Valid");
        } else {
            System.out.println("❌ " + hexColor + " → Invalid");
        }

    }
}
 
