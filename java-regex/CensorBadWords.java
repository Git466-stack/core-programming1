import java.util.*;

public class CensorBadWords {
    public static void main(String[] args) {
        // Example input sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // List of bad words
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Censor bad words
        for (String badWord : badWords) {
            // Replace each bad word with ****
            String replacement = "*".repeat(badWord.length());
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", replacement);
        }

        // Print the censored sentence
        System.out.println("Censored Sentence:");
        System.out.println(sentence);

        scanner.close();
    }
}
