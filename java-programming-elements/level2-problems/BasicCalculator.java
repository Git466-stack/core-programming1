import java.util.*;
public class BasicCalculator{
        public static void main(String[] args) {
            // create a scanner object for taking user input 
            Scanner sc = new Scanner(System.in);
            // Ask the user to input two floating -point number 

            System.out.println("Enter the first number : ");
            double number1 = sc.nextDouble();
            System.out.println("Enter the second number : ");
            double  number2 = sc.nextDouble();
            
            // perform arithmetic operations

            double addition = number1+number2;
            double subtraction = number1-number2;
            double multiplication = number1*number2;
            double division = number1/number2;

            System.out.println("The addition of two numbers " + addition);
            System.out.println("The  subtraction of two number " + subtraction);
            System.out.println("The multiplication of two number " + multiplication);
            System.out.println("The division of two number " + division);
            
        }
}