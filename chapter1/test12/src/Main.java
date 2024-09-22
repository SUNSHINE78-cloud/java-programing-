public class Main {
    public static void main(String[] args) {
        // Distance in miles
        double distanceMiles = 24.0;

        // Convert miles to kilometers (1 mile = 1.6 kilometers)
        double distanceKilometers = distanceMiles * 1.6;

        // Time in hours, minutes, and seconds
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        // Convert total time to hours
        double totalHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Calculate average speed in kilometers per hour
        double averageSpeed = distanceKilometers / totalHours;

        // Display the average speed
        System.out.printf("Average speed: %.2f km/h\n", averageSpeed);
    }
}


