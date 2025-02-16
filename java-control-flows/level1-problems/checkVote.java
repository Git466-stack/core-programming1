//package core-programming.java-control-flows.level1-problems;
import java.util.*;
public class checkVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // the user to input their age 
        System.out.println("Enter the person's age: ");
        int age = sc.nextInt();

        // check voting  eligibility

        if(age>=18){
            // if age is 18 or more
            System.out.printf("The person's age is %d and can vote.\n",age);
        }
        else{
            // if age is less than 18
            System.out.printf("The person's age is %d and cannot vote.\n" , age);
        }

    }
}
