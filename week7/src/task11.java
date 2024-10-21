import  java.util.Random;

    public class task11 {
        public static void main(String[] args) {
            Random rand = new Random();
            for (int i = 0; i < 175; i++) {
        System.out.print((char) (rand.nextInt(26) + 'a'));
        }
    }
}
