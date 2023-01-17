import java.util.Scanner;
import java.util.Random;

public class NumberGame{
    public static void main{
        System.out.println("Welcome to the Number Game!!!\n");

        Scanner numGuessScanner = new Scanner(System.in);
        System.out.println("Enter a number(1~10):");
        int numGuess = numGuessScanner.nextInt();

        Random rand = new Random();
        int realNum = random.nextInt(10);


        if ( realNum != numGuess) {
            System.out.println("HAHA");
            System.out.println("Your Number was " + numGuess + " and the real Number was " + realNum + ".");
        }
        if (realNum == numGuess){
            System.out.println("Your Guess was right: " + numGuess);
        }

    }
}
