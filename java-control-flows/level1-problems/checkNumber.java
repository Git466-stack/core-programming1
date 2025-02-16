//package core-programming.java-control-flows.level1-problems;
import java.util.*;
public class checkNumber {
    public static void main(String[] args) {

        // create an  Scanner objecxt for user input 
        Scanner sc = new Scanner(System.in);

        // Enter the number using user input 
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        // check if number is positive , negative , or zero

        if(number>0){
            System.out.println("Number is Positive");
        }
        else if(number<0){
            System.out.println("Number is negative ");
        }
        else{
            System.out.println("number is zero ");
        }

    }
}
