import java.util.Scanner;
import java.util.Random;

public class StringReverser {
    public static void main (String[] args) {
        System.out.println("Java String Reverser\n");
        Scanner strInput = new Scanner(System.in);
        boolean end = false;
        while(!end == true) {
            System.out.print("Input String To Reverse(Press Control + C to exit):\n");
            String str = strInput.nextLine();
            System.out.println("\nReversed String:" + reverser(str) + "\n");
        }
    }

    public static String reverser(String paraStr) {
        char[] arrForReverser = new char[paraStr.length()];
        int strIndex = 0;
        for (int i = paraStr.length() - 1; i >= 0; i--) {
            arrForReverser[strIndex] = paraStr.charAt(i);
            strIndex++;
        }
        String letter = "";
        for (int j = 0; j < paraStr.length(); j++) {
            letter = letter + arrForReverser[j];
        }
        return letter;
    }
}