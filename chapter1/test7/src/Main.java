public class Main {
    public static void main(String[] args) {
        double k = (1.0 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11);
        k = 4 * k;
        double e = (1.0 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);
        e = 4 * e;
        System.out.println("The first result is " + e + "   The second result is " + k);
    }
}
