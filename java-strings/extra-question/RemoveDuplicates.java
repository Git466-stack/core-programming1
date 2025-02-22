import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        // Create a LinkedHashSet to maintain the order of characters and ensure uniqueness
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        
        // Iterate through the input string and add characters to the LinkedHashSet
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }
        
        // Build the modified string from the LinkedHashSet
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + removeDuplicates(input));
    }
}
