public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Given values
        double radiusKm = 6378;  // Radius of Earth in kilometers
        double pi = 3.14;  // Value of pi

        // Calculate the volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert cubic kilometers to cubic miles
        double volumeMiles3 = volumeKm3 * 0.239913;  // 1 cubic kilometer = 0.239913 cubic miles

        // Display the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
