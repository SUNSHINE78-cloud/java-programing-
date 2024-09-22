public class Main {
    public static void main(String[] args) {;
        double radius = 5.5;
        double pi = Math.PI;

        // Calculate perimeter and area
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        // Display the results
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Area: %.2f\n", area);
    }
}

