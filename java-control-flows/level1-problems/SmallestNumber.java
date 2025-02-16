
import java.util.*;
public class SmallestNumber {
    public static void main(String[] args) {
        // create a Scanner object for user input 

        Scanner sc = new Scanner(System.in);
        // user to input three numbers
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter the Second number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();

        // check if first number is the smallest

        boolean isFirstSmallest = (number1<number2 && number1<number3);
        
        // %s in printf is used to display the string "Yes" or "No" based on the boolean isFirstSmallest.
        System.out.printf("Is the first number the smallest? %s\n " , isFirstSmallest? "yes" : "No"); 

    }
}
