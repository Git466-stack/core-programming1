import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sides of the triangular park
        System.out.println("Enter the length of the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculating the perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Distance to be covered in meters (5 km = 5000 meters)
        double distanceToCover = 5000;

        // Calculating the number of rounds
        int rounds = calculateRounds(distanceToCover, perimeter);

        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run.");

        scanner.close();
    }

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds
    public static int calculateRounds(double distance, double perimeter) {
        return (int) Math.ceil(distance / perimeter);
    }
}
