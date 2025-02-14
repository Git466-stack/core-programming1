import java.util.*;

public class AreaOfTraiangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle ");
        double base_cm = sc.nextDouble();
        System.out.println("Enter the height of the triangle ");
        double height_cm = sc.nextDouble();

        double ans_cm = 0.5 * base_cm * height_cm;

        double base_feet = base_cm / 30.48;
        double height_feet = height_cm / 30.48;

        double ans_feet = 0.5 * base_feet * height_feet;

        double base_inch = base_cm / 2.54;
        double height_inch = height_cm / 2.54;

        double ans_inch = 0.5* base_inch * height_inch;

        System.out.println("Your Height in cm is " + ans_cm + " " + " while in feet is " + ans_feet + " "
                + " and inches is " + ans_inch);

    }

}
