import java.util.*;

public class Distanceyardsmiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion formulas
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // Output: Display the distance in yards and miles
        System.out.printf("Your distance in feet is %.2f while in yards is %.2f and miles is %.4f.%n",
                distanceInFeet, distanceInYards, distanceInMiles);

    }
}
