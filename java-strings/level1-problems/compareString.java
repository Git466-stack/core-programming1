import java.util.*;
public class compareString {
    public static boolean compareStringUSingCharAt(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Take user input for two strings
        System.out.println("Enter the first string: ");
        String str1 = sc.next();

        System.out.println("Enter the Second String: ");
        String str2 = sc.next();

        // compare string using charAt()
        boolean charAtComparison = compareStringUSingCharAt(str1, str2);

        // compare String using the built-in equals() method
        boolean equalsComparison = str1.equals(str2);
        
        // Display results 

        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsComparison);

        // check if both result match

        if(charAtComparison == equalsComparison){
            System.out.println("Both methods give the same result.");  
        }
        else{
            System.out.println("Methods give differernt results.");
        }

        
    }
}
