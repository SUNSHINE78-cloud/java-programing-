public class task6 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Original number: " + number);
        changeNumber(number);
        System.out.println("Number after method call: " + number);
    }

    public static void changeNumber(int number) {
        number = 20;
    }
}