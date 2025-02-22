import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static char findMostFrequentChar(String input) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Populate the HashMap with character frequencies
        for (char c : input.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the highest frequency
        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        // Input string
        String input = "success";

        // Find and print the most frequent character
        char result = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
