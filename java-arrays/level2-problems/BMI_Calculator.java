import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create a multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3]; // [i][0] = weight, [i][1] = height, [i][2] = BMI
        String[] weightStatus = new String[number];

        // Take input for weight and height, and calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double weight = -1;
            double height = -1;

            // Input weight and height, ensure they are positive
            while (weight <= 0) {
                System.out.print("Enter weight for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive number. Please enter again.");
                }
            }

            while (height <= 0) {
                System.out.print("Enter height for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive number. Please enter again.");
                }
            }

            // Store the weight and height in the 2D array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI: BMI = weight / (height * height)
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine the weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\nPerson Data:");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println("------------------------------------------------------");
        }

        scanner.close();
    }
}
