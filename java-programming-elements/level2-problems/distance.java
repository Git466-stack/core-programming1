// doubt 
import java.util.*;

public class distance {
    public static void main(String[] args) {
        // create a Scanner object for user input 
        Scanner sc = new Scanner(System.in);

        // user to input the distance in feet
        System.out.println("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        // convert the distance to yards and miles 
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards
        double distanceInCentimeters = distanceInFeet *30.48; // i foot = 30.48cm
        double distanceInInches = distanceInFeet * 12; // 1 foot = 12 inches

        // Display the result;
        // System.out.printf("Your distance in cm is %.2f, while in feet is %d and inches is %.2f.\n",
        // distanceInCentimeters, integerFeet, remainingInches);
       
    }
} 
    

