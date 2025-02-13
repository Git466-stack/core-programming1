import java.util.*;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitprice = sc.nextInt();
        int quantity = sc.nextInt();
        int total = unitprice*quantity;
        System.out.println(total);
    }
}
