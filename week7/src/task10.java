import java.util.Random;

public class task10 {
    public static char getRandomLowerCaseLetter() {
        Random rand = new Random();
        int ASCII = rand.nextInt(26) + 97;
        return (char) ASCII;
    }

    public static void main(String[] args) {
        System.out.println(getRandomLowerCaseLetter());
    }
}