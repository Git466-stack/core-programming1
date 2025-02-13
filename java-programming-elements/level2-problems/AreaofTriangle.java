import java.util.*;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double heightInInches = sc.nextDouble();

        double areaInSquareInches = 0.5 * base * heightInInches;
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        double heightInCentimeters = heightInInches * 2.54;
        double heightInFeet = heightInInches / 12;

        System.out.println("\nThe area of the triangle:");
        System.out.printf("- %.2f square inches\n", areaInSquareInches);
        System.out.printf("- %.2f square centimeters\n", areaInSquareCentimeters);

        System.out.println("\nThe height of the triangle:");
        System.out.printf("- %.2f cm\n", heightInCentimeters);
        System.out.printf("- %.2f feet\n", heightInFeet);
        System.out.printf("- %.2f inches\n", heightInInches);

        
    }
}
