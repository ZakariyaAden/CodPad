import java.util.Scanner;
import java.util.Random;

public class revString {
    public static void main (String[] args) {
        System.out.println("Java String Reverser\n");
        Scanner strInput = new Scanner(System.in);
        System.out.print("Input String To Reverse:");
        String str = strInput.nextLine();
        int strLength = str.length();
        char[] arrConvert = new char[strLength];
        for (int i = 0; i < arrConvert.length; i++) {
            arrConvert[i] = str.charAt(i);
        }
        try {
            functForReverse(arrConvert);
        }
        catch (Exception err) {
            System.out.println(err);
        }
    }
    public static void functForReverse(char[] parArr) {
        for (int i  = 0; i < parArr.length + 1; i++) {
            for (int j = parArr.length; j > -1; j--) {
                char revChar = parArr[j]; 
                parArr[i] = revChar;
            }
        }
    }
}
