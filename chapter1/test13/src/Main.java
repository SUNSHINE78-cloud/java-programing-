public class Main{
    public static void main(String[] args) {
        // Coefficients
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

        // Calculate the determinant (ad - bc)
        double determinant = a * d - b * c;

        // Check if the determinant is not zero
        if (determinant != 0) {
            // Calculate x and y using Cramer's Rule
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            // Display the results
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        } else {
            System.out.println("The system has no unique solution.");
        }
    }
}
