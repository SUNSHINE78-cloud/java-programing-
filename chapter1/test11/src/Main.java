public class Main {
    public static void main(String[] args) {
        long currentPopulation = 312032486;
        int secondsInYear = 365 * 24 * 60 * 60; // Number of seconds in a year

        // Rates
        double birthsPerYear = secondsInYear / 7.0; // Births per year
        double deathsPerYear = secondsInYear / 13.0; // Deaths per year
        double immigrantsPerYear = secondsInYear / 45.0; // Immigrants per year

        System.out.printf("Current population: %d\n", currentPopulation);

        // Calculate population for the next 5 years
        for (int year = 1; year <= 5; year++) {
            currentPopulation += (long)(birthsPerYear + immigrantsPerYear - deathsPerYear);
            System.out.printf("Population in year %d: %d\n", year, currentPopulation);
        }
    }
}
