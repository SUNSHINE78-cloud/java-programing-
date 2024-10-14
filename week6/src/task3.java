import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

    int guess = -1;
    while(guess != number){
        System.out.println("\nEnter you guess:");
        guess = input.nextInt();

        if(guess == number){
            System.out.println("Yes, the number is "+number);
        } else if (guess > number) {
            System.out.println("You guess is too high");
        }
        else System.out.println("You guess is too low");
    }
    }
}
