import java.util.*;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("The distance is %.2f yards or %.4f miles\n", distanceInYards, distanceInMiles);

        
    }
} 
    

