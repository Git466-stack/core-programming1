import java.util.*;

public class CensorBadWord {
    public static void main(String[] args) {
        // Input sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Replace each bad word with "****"
        for (String badWord : badWords) {
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        // Print the censored sentence
        System.out.println("Censored Sentence:");
        System.out.println(sentence);

        scanner.close();
    }
}
