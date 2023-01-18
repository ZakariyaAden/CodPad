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
        String strConverted = "";
        for (char i : arrConvert) {
            for (int j = arrConvert.length - 1; j >= 0; j--) {
                int grunt = j;
                str.charAt(i) = arrConvert[grunt];
            }
        }
        System.out.println(str);
        //System.out.println(arrConvert);
    }
}
