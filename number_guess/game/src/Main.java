
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("e are going to start the game, guess the number: ");
        int numberToGuess = (int)(Math.random() * 100);
        int numTries = 5;
        while(numTries > 0)
        {
            System.out.println("Guess the number");
            int userInput = scaner.nextInt();
            if (numberToGuess == userInput){
                System.out.println("Correct you guess the number");
            }else if (userInput > numberToGuess){
                System.out.println("guess lower");
            }else {
                System.out.println("guess higher");
            }

            numTries--;
        }
        System.out.println("the correct number was: " + numberToGuess);

    }
}
