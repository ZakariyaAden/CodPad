//Codex v1 // Full Release // Quadratic Hash Generation Coming Soon

import java.util.Scanner;
import java.util.Random;

public class Codex {
    public static void main(String[] args) {
        System.out.println("Java Codex\n");
        Scanner msgScanner = new Scanner(System.in); 
        System.out.println("Input Message to be Encrypted:");
        String rawMsg = msgScanner.nextLine();
        EncryptionKey info = new EncryptionKey(rawMsg,coinFlip());
        System.out.println("\nEncrypted Message: "+ encryptStepTwo(encrypt(info)));
        System.out.println("Encryption Hash: " + info.hash);
        System.out.println("\nbreak my encryption, I dare you");
    }
    public static int coinFlip(){
        Random coinFlipRand = new Random();
        boolean endbool = false;
        int coinFlipRaw = coinFlipRand.nextInt(9999);
        while(!endbool) {
            if (coinFlipRaw > 1000) {
                int coinFliplogic = coinFlipRaw % 2;
                if (coinFliplogic == 1){
                    endbool = true;
                }
                if(coinFliplogic == 0){
                    coinFlipRaw += 1;
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
            char c = paraObj.msg.charAt(i);
            if (Character.isUpperCase(c)) {
                encryptedText.append((char) ((c + paraObj.hash - 65) % 26 + 65));
            } else if (Character.isLowerCase(c)) {
                encryptedText.append((char) ((c + paraObj.hash - 97) % 26 + 97));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
    public static String encryptStepTwo(String paraStr) {
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