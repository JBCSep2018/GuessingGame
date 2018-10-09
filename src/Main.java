import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Create new instance of the Random class
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

        // Get random number
        int num = rand.nextInt(10)+1;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

        // Print out randomly generated number to make sure loop works correctly
        System.out.println("num to guess: " + num);

        // Prompt the user for input
        System.out.println("Enter a number: ");
        int guess = keyboard.nextInt();

        // Loop keeps going as long as the user's guess is not equal to the generated number
        while(guess != num){
            System.out.println("That is incorrect. Guess again.");
            guess = keyboard.nextInt();
        }

        System.out.println("That's right! You're a good guesser.");
    }
}
