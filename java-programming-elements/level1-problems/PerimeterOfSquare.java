import java.util.*;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // user input the perimeter of the square 
        System.out.println("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // calculate side of perimeter
        double side = perimeter/4;
        
        // display the side and perimeter

        System.out.printf("The length of the side and perimeter ", side, perimeter);

    }
}
