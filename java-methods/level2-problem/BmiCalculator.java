import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        // Create a 2D array with 10 rows and 3 columns:
        // Column 0: weight (kg), Column 1: height (cm), Column 2: BMI.
        double[][] data = new double[10][3];
        // Array to store BMI status for each person.
        String[] bmiStatus = new String[10];

        Scanner scanner = new Scanner(System.in);

        // Input weight and height for each person.
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and determine BMI status for each person.
        for (int i = 0; i < 10; i++) {
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            bmiStatus[i] = determineBMIStatus(data[i][2]);
        }

        // Display the results.
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1), data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        scanner.close();
    }

    // Method to calculate BMI using the formula: BMI = weight / (height in m)^2.
    public static double calculateBMI(double weight, double heightCm) {
        // Convert height from centimeters to meters.
        double heightM = heightCm / 100.0;
        // Guard against division by zero.
        if (heightM == 0) {
            return 0;
        }
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status based on the BMI value.
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}