import java.util.Scanner;
import java.util.Random;

public class Codex {
    public static void main(String[] args) {
        System.out.println("Java Codex\n");
        Scanner msgScanner = new Scanner(System.in); 
        System.out.println("Input Message to be Encrypted:");
        String rawMsg = msgScanner.nextLine();
        EncryptionKey info = new EncryptionKey(rawMsg,coinFlip());
    }
public static int coinFlip(){
    Random coinFlipRand = new Random();
    boolean endbool = false;
    while(!endbool) {
        int coinFlipRaw = coinFlipRand.nextInt(9999);
        if (coinFlipRaw > 1000) {
            int coinFliplogic = coinFlip % 2;
            if (coinFliplogic == 1){
                endbool = true;
            }
            if(coinFliplogic == 0){
                coinFlipRaw = coinFlipRaw + 1;
                endbool = true;
            }
        }
    }
    return coinFlipRaw;
}
public static String encrypt(EncryptionKey paraObj) {
    StringBuilder encryptedText = new StringBuilder();
    int length = paraObj.msg.length();
    for (int i = 0; i < length; i++) {
        char c = paraObj.charAt(i);
        if (Character.isUpperCase(c)) {
            encryptedText.append((char) ((c + shift - 65) % 26 + 65));
        } else if (Character.isLowerCase(c)) {
            encryptedText.append((char) ((c + shift - 97) % 26 + 97));
        } else {
            encryptedText.append(c);
        }
    }
    return encryptedText.toString();
}
}