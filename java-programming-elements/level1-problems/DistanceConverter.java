public class DistanceConverter {
    public static void main(String[] args) {
        
        double kilometers = 10.8;

        // Conversion factor
        double conversionFactor = 1.6;

        // Calculating distance in miles
        double miles = kilometers / conversionFactor;

        // Displaying the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
