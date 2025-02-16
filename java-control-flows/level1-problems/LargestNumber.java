//package core-programming.java-control-flows.level1-problems;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        // user input for first number 
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        // user input for second number 
        System.out.println("Enter the Second number: ");
        int number2 = sc.nextInt();
        // user input for third number 
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();


        // Check if the first, second, or third number is the largest
        boolean isFirstLargest = (number1 > number2 && number1 > number3);
        boolean isSecondLargest = (number2 > number1 && number2 > number3);
        boolean isThirdLargest = (number3 > number1 && number3 > number2);

        // Display the results
        System.out.printf("Is the first number the largest? %s\n", isFirstLargest ? "Yes" : "No");
        System.out.printf("Is the second number the largest? %s\n", isSecondLargest ? "Yes" : "No");
        System.out.printf("Is the third number the largest? %s\n", isThirdLargest ? "Yes" : "No");


    }
}
