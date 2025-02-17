import java.util.*;
public class grade {
    public static void main(String[] args) {
        // create a Scanner object for user input 
        Scanner sc = new Scanner(System.in);

        // input three subject marks 
        int physicsMarks = sc.nextInt();

        int chemistryMarks = sc.nextInt();

        int mathMarks = sc.nextInt();
        

        double percentage = physicsMarks+chemistryMarks+mathMarks/3.0;

        String remarks,  grade;
        if(percentage>=80){
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        }
        else if(percentage >=70 && percentage<=79){
            grade = "B";
            remarks = "(Level 3, at agency- normalized standars)";
        }
        else if(percentage>=60 && percentage<=69){
            grade="C";
            remarks = "(Level 2, below , but approaching agency- normalized standards)";
        }
        else if(percentage>=50 && percentage<=59){
            grade = "D";
            remarks = "(Level 1 , well below agency-normalized standards)";
        }
        else if(percentage>=40 && percentage<=49){
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        }
        else{
            grade = "R";
            remarks = "(Remedial standard)";
        }
        System.out.println("Average Percentage: " + percentage + "%"); 
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

    }
}
