import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();  // Take user input for km

        // Conversion factor
        double miles = km / 1.6;  // 1 mile = 1.6 kilometers

        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

    }
}
