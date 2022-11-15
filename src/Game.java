import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner numberScanner = new Scanner(System.in);

        int level = 10;
        int attempts = 3;
        System.out.println("Select difficulty level:");
        System.out.println("1: from 1 to 10");
        System.out.println("2: from 1 to 50");
        System.out.println("3: from 1 to 100");

        boolean incorrectLevel = true;
        while (incorrectLevel) {
            int userLevel = numberScanner.nextInt();
            if (userLevel == 1) {
                level = 10;
                incorrectLevel = false;
            } else if (userLevel == 2) {
                level = 50;
                attempts = 7;
                incorrectLevel = false;
            } else if (userLevel == 3) {
                level = 100;
                attempts = 12;
                incorrectLevel = false;
            }
            if (incorrectLevel) {
                System.out.println("Incorrect value");
            }
        }


        Random random = new Random();
        int userNumber;
        int guessNumber = random.nextInt(level);

        while (attempts > 0) {
            System.out.println("Enter your number");
            userNumber = numberScanner.nextInt();

            if (userNumber == guessNumber) {
                System.out.println("You won!");
                break;
            } else if (userNumber > guessNumber) {
                System.out.println("Your number is bigger");
            } else if (userNumber < guessNumber) {
                System.out.println("Your number is smaller");
            }
            attempts--;
        }
        if (attempts == 0) {
            System.out.println("Game over. Try again");
        }
    }
}
