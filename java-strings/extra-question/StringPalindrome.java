import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome (String str) {
        str = str.toLowerCase();
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev +=str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter a String 
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        boolean res = isPalindrome(str);

        if(res){
            System.out.println("Palindrome String ");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
