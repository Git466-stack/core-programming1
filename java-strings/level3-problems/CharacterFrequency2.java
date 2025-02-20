import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;
    }

    // Method to find the length of the string without using length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return count;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int[] frequency = new int[uniqueChars.length];

        // Calculate frequency of each unique character
        for (int i = 0; i < findLength(text); i++) {
            char currentChar = text.charAt(i);
            for (int j = 0; j < uniqueChars.length; j++) {
                if (uniqueChars[j] == currentChar) {
                    frequency[j]++;
                    break;
                }
            }
        }

        // Store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequency[i]);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayFrequencyTable(String[][] frequencyTable) {
        System.out.printf("%-10s%-10s\n", "Character", "Frequency");
        System.out.println("-------------------");
        for (String[] row : frequencyTable) {
            System.out.printf("%-10s%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[][] frequencyTable = findCharacterFrequency(input);

        // Display the frequency table
        displayFrequencyTable(frequencyTable);

        scanner.close();
    }
}
