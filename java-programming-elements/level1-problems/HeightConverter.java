import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = sc.nextDouble();

        // Conversion factors
        double cmToInches = 2.54;  // 1 inch = 2.54 cm
        double cmToFeet = 12;      // 1 foot = 12 inches

        // Convert cm to inches
        double totalInches = heightInCm / cmToInches;

        // Convert total inches to feet and remaining inches
        int feet = (int) ((int) totalInches / cmToFeet);
        double inches = totalInches % cmToFeet;

        // Display the result
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
        
    }
}
