import java.util.*;
public class squareside {
    public static void main(String[] args) {
        // create a Scanner object for user input 
        Scanner sc = new Scanner(System.in);
        
        // user input the perimeter of square 
        System.out.println("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // calculate the side length of square 
        double side = perimeter/4;

        // display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter );

    }
}
