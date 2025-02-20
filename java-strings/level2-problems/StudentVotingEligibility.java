import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random ages for students
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int) (Math.random() * 50); // Random age between 0 and 50
        }
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] determineVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-20s%n", "Age", "Voting Eligibility");
        System.out.println("-----------------------------");
        for (String[] result : results) {
            System.out.printf("%-10s %-20s%n", result[0], result[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);

        // Determine voting eligibility
        String[][] eligibilityResults = determineVotingEligibility(ages);

        // Display the results
        displayResults(eligibilityResults);

        scanner.close();
    }
}
