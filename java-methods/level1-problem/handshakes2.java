import java.util.*;
public class handshakes2 {
    public static void main(String[] args) {
        // Scanner object to take user input 
        Scanner sc = new Scanner(System.in);

        // Enter number of student
        System.out.println("Enter number of student ");
        int student = sc.nextInt();

        // print the result for possiable handshakes 

        int handshakes = (student*(student-1))/2;

        System.out.println("The maximum number of handshakes among " + student + " student is: " + handshakes);

    }
}


class Car {
    String name;
    int year;
    String color;
    
    Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }
    
    // display method
    void display() {
        System.out.println("Car details: Name = " + name + ", Year = " + year + ", Color = " + color);
    }
}

class Main {
    public static void main(String[] args) {
        // Create objects for the Car class
        Car car1 = new Car("maruti", 2003, "black");
        Car car2 = new Car("thar", 1995, "black");
        
        // Call the display method
        car1.display();
        car2.display();
    }
}
