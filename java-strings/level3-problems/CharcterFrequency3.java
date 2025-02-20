import java.util.Scanner;

public class CharcterFrequency3 {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int length = text.length();
        char[] characters = text.toCharArray();
        int[] frequency = new int[length];

        // Marking visited characters
        boolean[] visited = new boolean[length];

        for (int i = 0; i < length; i++) {
            if (visited[i]) {
                continue;
            }
            frequency[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    visited[j] = true;
                }
            }
        }

        // Counting unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                uniqueCount++;
            }
        }

        // Preparing result array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                result[index][0] = Character.toString(characters[i]);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
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
