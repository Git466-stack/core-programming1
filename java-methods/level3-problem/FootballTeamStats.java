import java.util.Scanner;
import java.util.Arrays;

public class FootballTeamStats {

    // Method to generate an array of random heights for players
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // Random heights between 150 and 250 cm
        }
        return heights;
    }

    // Method to calculate the sum of array elements
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate the mean of array elements
    public static double calculateMean(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    // Method to find the shortest height in the array
    public static int findShortestHeight(int[] array) {
        int shortest = Integer.MAX_VALUE;
        for (int height : array) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    // Method to find the tallest height in the array
    public static int findTallestHeight(int[] array) {
        int tallest = Integer.MIN_VALUE;
        for (int height : array) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teamSize = 11; // Number of players in the football team

        // Generate random heights for the team
        int[] heights = generateRandomHeights(teamSize);
        System.out.println("Player heights (in cm): " + Arrays.toString(heights));

        // Calculate stats
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double meanHeight = calculateMean(heights);

        // Display results
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm\n", meanHeight);

        scanner.close();
    }
}