public class Volumeofearth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f%n", volumeKm3, volumeMiles3);
        
    }
}
