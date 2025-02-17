import java.util.*;
public class checknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[]= new int[5];

        for(int i = 0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<5;i++){
            if(arr[i]>0){
                System.out.println("positive number");
                if(arr[i]%2==0){
                    System.out.println("even");
                }
                else{
                    System.out.println("odd");
                }
            }

           else  if(arr[i]<0){
                System.out.println("Negative number");
            }
            else{
                System.out.println("zero");
            }

        

        }
        
        if(arr[0]==arr[4]){
            System.out.println("equal");
        }
        else if(arr[0]>arr[4]){
            System.out.println(arr[0] + "is greater " + arr[4]+ " is less");
        }
        else{
            System.out.println(arr[0] + "is lesser" + arr[4] + " is greater");
        }
        
    }
}
