import java.util.Scanner;

public class VowelConsonantClassifier {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    // Method to display a 2D array in tabular format
    public static void displayClassification(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("-------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Classify characters using user-defined methods
        String[][] classification = classifyCharacters(text);

        // Display the classification
        System.out.println("\nCharacter Classification:");
        displayClassification(classification);

        scanner.close();
    }
}
