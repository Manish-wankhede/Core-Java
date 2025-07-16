import java.util.Random;
import java.util.Scanner;

public class GuessGame
{

    public static void main(String[] args) 
    {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numGuesses = 0;
        Scanner s = new Scanner(System.in);

        while (true) 
        {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = s.nextInt();
            numGuesses++;

            if (guess < numberToGuess) 
            {
                System.out.println("Too low! Guess again.");
            } 
            else if (guess > numberToGuess) 
            {
                System.out.println("Too high! Guess again.");
            } 
            else 
            {
                System.out.println("Congratulations, you guessed the number!");
                System.out.println("Number of guesses: " + numGuesses);
                break;
            }
        }
        s.close();
    }
}
