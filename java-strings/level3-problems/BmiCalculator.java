import java.util.Scanner;

public class BmiCalculator {

// Method to calculate BMI and status
public static String[][] calculateBMI(double[][] data) {
    String[][] result = new String[10][4];
    
    for (int i = 0; i < 10; i++) {
        double weight = data[i][0];
        double height = data[i][1] / 100; // Convert cm to meters
        double bmi = weight / (height * height);
        String status;
        
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        result[i][0] = String.format("%.2f", data[i][1]); // Height
        result[i][1] = String.format("%.2f", data[i][0]); // Weight
        result[i][2] = String.format("%.2f", bmi); // BMI
        result[i][3] = status; // Status
    }
    
    return result;
}

// Method to display results
public static void displayResults(String[][] results) {
    System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
    System.out.println("------------------------------------------------------");
    for (String[] row : results) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[][] data = new double[10][2];

    // Taking user input
    for (int i = 0; i < 10; i++) {
        System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
        data[i][0] = scanner.nextDouble();
        System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
        data[i][1] = scanner.nextDouble();
    }
    scanner.close();
    
    // Calculate BMI and status
    String[][] results = calculateBMI(data);
    
    // Display results
    displayResults(results);
}

}