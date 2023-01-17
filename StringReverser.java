import java.util.Scanner;
import java.util.Random;

public class revString {
    public static void main (String[] args) {
        System.out.println("Java String Reverser\n");
        Scanner strInput = new Scanner(System.in);
        System.out.print("Input String To Reverse:");
        String str = strInput.nextLine();

        char arrConvert[] = new char[str.length()];

        for (int i = 0; i <= arrConvert.length; i++) {
            arrConvert[i] = str.charAt(i);
        }
        
        System.out.println(arrConvert);
    }
}
