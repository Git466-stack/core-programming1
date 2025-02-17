import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // 2. Create arrays to store height, weight, BMI, and status
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmiValues = new double[n];
        String[] statuses = new String[n];

        // 3. Input data and compute BMI for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Weight (in kg): ");
            weights[i] = scanner.nextDouble();

            // Calculate BMI directly
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            // 4. Determine status using if–else checks
            if (bmiValues[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // 5. Display information in forward order
        System.out.println("\n--- Forward Order ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                              heights[i], weights[i], bmiValues[i], statuses[i]);
        }

        // 6. Display information in reverse order
        System.out.println("\n--- Reverse Order ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                              heights[i], weights[i], bmiValues[i], statuses[i]);
        }

        scanner.close();
    }
}