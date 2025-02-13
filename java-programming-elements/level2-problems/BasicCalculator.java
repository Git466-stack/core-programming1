import java.util.*;
public class BasicCalculator{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float number1 = sc.nextFloat();
            float number2 = sc.nextFloat();

            float addition = number1+number2;
            float subtraction = number1-number2;
            float multiplication = number1*number2;
            float division = number1/number2;

            System.out.println("The addition of two numbers " + addition);
            System.out.println("The  subtraction of two number " + subtraction);
            System.out.println("The multiplication of two number " + multiplication);
            System.out.println("The division of two number " + division);
            
        }
}