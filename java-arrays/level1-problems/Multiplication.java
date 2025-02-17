import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get user input for the number 
        System.out.println("Enter the number for the multiplication table: ");
        int n = sc.nextInt();
        // Define an array to store the results of multiplication
        int table[] = new int[10];
        // calculate and store the result in the array
        for(int i = 0;i<table.length;i++){
            table[i]= n * (i+1);
        }
        System.out.println("Multiplication Table for " + n + ":");
        for(int i = 0;i<table.length;i++){
            System.out.println(n + "x" + (i+1) + " = " +table[i]);
        }
    }
}
