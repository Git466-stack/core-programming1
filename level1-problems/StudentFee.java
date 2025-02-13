import java.util.*;
public class StudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int   discountPercentge =  sc.nextInt();
        double discount = (fee*discountPercentge)/100.00;
        double finalfee = fee-discount;
        System.out.println( "The discount is " + discount + "The final fee is " +  finalfee);
    }
}
