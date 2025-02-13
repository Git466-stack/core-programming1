import java.util.*;
public class Feettoinches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  heightcm = sc.nextDouble();
        double cmToInch = 2.54;
        int inchToFoot = 12;

         double totalInches = heightcm/cmToInch;
         int feet = (int) (totalInches/inchToFoot);
         double inches = totalInches% inchToFoot;
         System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f%n", heightcm, feet, inches);


    }
}
