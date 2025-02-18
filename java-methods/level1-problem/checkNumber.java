import java.util.*;
public class checkNumber {
    public static int check(int number ){
        if(number>0){
            return 1;
        }
        else if(number<0){
            return -1;
        }
        else{
            return 0;
        }
    }

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    //Taking user input 
    System.out.println("Enter an Integer: ");
    int number = sc.nextInt();

    int result = check(number);

    if(result ==1){
        System.out.println("The number is positive");
    }
    else if(result == -1){
        System.out.println("The number is negative");
    }
    else{
        System.out.println("The number is zero ");
    }
    }
}

