import java.util.*;
public class countvowelc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int countvowels = 0;
        int countconsonants=0;

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='a' || c=='e' || c=='i' ||  c=='o' || c=='u' ||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                countvowels++;

            }
            else if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
                countconsonants++;
            }
            
        }
        System.out.println( "Count Vowels is " + countvowels);
        System.out.println( "Count Consonants is " + countconsonants);
    }
}
