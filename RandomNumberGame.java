import java.util.Scanner;
import java.util.Random;

public class RandomNumberGame{
    public static void main(String[] args){
        System.out.println("Welcome to the Number Game!!!\n");

        Scanner dif = new Scanner(System.in);
        System.out.print("Choose your difficulty[E for Easy // D for difficult]:");
        String diffMod = dif.nextLine();

        while (diffMod.equals("E") || diffMod.equals("e")) {
            Scanner numGuessScanner = new Scanner(System.in);
            System.out.println("\nEasy Mod // Enter a number(1~10):");
            int numGuess = numGuessScanner.nextInt();

            Random rand = new Random();

            int realNumBefore = rand.nextInt(10);
            int intLimiter = easyMod(numGuess,realNumBefore);
            int realNum = rand.nextInt(intLimiter);

            if (numGuess < 1 || numGuess > 10) {
                System.out.println("Invalid Number");
            }

            if (numGuess >= 1 && numGuess <= 10) {
                if ( realNum != numGuess) {
                    System.out.println("\nHAHA");
                    System.out.println("Your Number was " + numGuess + " and the real Number was " + realNum + ".");
                }
                if (realNum == numGuess){
                    System.out.println("\nYour Guess was right: " + numGuess);
                    break;
                }
            }
        }

        while (diffMod.equals("D") || diffMod.equals("d")) {
            Scanner numGuessScanner = new Scanner(System.in);
            System.out.println("\nDifficult Mod // Enter a number(1~10):");
            int numGuess = numGuessScanner.nextInt();

            Random rand = new Random();
            int realNum = rand.nextInt(10);

            if (numGuess < 1 || numGuess > 10) {
                System.out.println("Invalid Number");
            }
            if (numGuess >= 1 && numGuess <= 10) {
                if ( realNum != numGuess) {
                    System.out.println("\nHAHA");
                    System.out.println("Your Number was " + numGuess + " and the real Number was " + realNum + ".");
                }
                if (realNum == numGuess){
                    System.out.println("\nYour Guess was right: " + numGuess);
                    break;
                }
            }
        }
    }
    public static int easyMod(int user, int computer) {
        int userMod = user + 2;
        return userMod;                    
    }
}
