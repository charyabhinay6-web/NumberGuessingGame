import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNum = random.nextInt(100) + 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Guess the number between 1 to 100: ");
        int guess = s.nextInt();

        while (guess != secretNum) {

            if (guess > secretNum) {
                System.out.println("TOO High!!");
            } 
            else {
                System.out.println("TOO Low!!");
            }

            System.out.println("Try again: ");
            guess = s.nextInt();
        }

        System.out.println("Correcttt!!!");

        s.close();
    }
}