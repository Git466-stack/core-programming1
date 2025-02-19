import java.util.*;
public class SmallestandLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        // To initialize a value smallest and largest
        int smallest , largest;
        // check the condition using if else  
        // finding the largest number 
        if(number1>number2 && number1>number3){
            largest = number1;
        }
         else if(number2 > number1 && number2> number3){
            largest = number2;
        }
        else{
            largest = number3;
        }
        
        if(number1<number2 && number1<number3){
            smallest = number1;
        }
        else if(number2<number1 && number2<number3){
            smallest = number2;
        }
        else {
            smallest = number3;
        }
        return new int[]{smallest,largest};
    }
    public static void main(String[] args) {
        // Scanner class for object 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter the Second number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();

        // Calling the  method to find smallest and Largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        //Displaying the result 
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest Number: " + result[1]);


    }
}
