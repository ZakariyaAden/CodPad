import java.util.Scanner;
import java.util.Random;
public class EncryptionKey {
    int hash;
    String msg;
    char[] msgArr;
    int[] hashArr;

    EncryptionKey(int hash, String msg, char[] msgArr, int[] hashArr){
        this.hash = hash;
        this.msg = msg;
        this.msgArr = msgArr;
        this.hashArr = hashArr;
    }
}
public class Codex {
    public static void main(String[] args) {
        print("Java Codex",1);
        Scanner msgScanner = new Scanner(System.in); 
        print("Input Message to be Encrypted:");
        String rawMsg = msgScanner.nextLine();
        EncryptionKey info = new EncryptionKey(rawMsg,coinFlip(),arrayCharConverter(info),hashArrConvr(info));
    }
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
public static char arrayCharConverter(EncryptionKey paraClass) {
    char[] arr = new char[paraClass.msg.length()];
    for(int j = 0; j < paraClass.msg.length(); j++) {
        arr[j] = paraClass.msg.charAt(j); 
    }
    return arr;
}
public static int hashArrConvr(EncryptionKey paraClass) {
    int[] hashArr = new int[4];
    String hashString = "" + paraClass.hash;
    int arrIndex = 0; 
    for(int i = 0; i < 4; i++){
        hashArr[arrIndex] = hashString.charAt(i); 
        arrIndex++;
    }
    return hashArr;
}
public static int shift(EncryptionKey paraClass) {
    for(int j = 0; j < paraClass.msgArr.length; j++){
        switch(paraClass.msgArr[j]){
            case 'A':
                alphaIndex = 1;
                shiftedItem = shiftEquation(alphaIndex,paraClass.hashArr[0]);
                break;
            case 'a':
                break;
            case 'B':
                break;
            case 'b':
                break;
            case 'C':
                break;
            case 'c':
                break;
            case 'D':
                break;
            case 'd':
                break;
            case 'E':
                break;
            case 'e':
                break;
            case 'F':
                break;
            case 'f':
                break;
            case 'G':
                break;
            case 'g':
                break;
            case 'H':
                break;
            case 'h':
                break;
            case 'I':
                break;
            case 'i':
                break;
            case 'J':
                break;
            case 'j':
                break;
            case 'K':
                break;
            case 'k':
                break;
            case 'L':
                break;
            //finish later
            case '':
                break;            
        }
    }

    for()
}
public static int shiftEquation(int x, int n) {
    int shiftedIndex = (x - n) % 26;
    return shiftedIndex;
}
public static void print(String msg,int indentNum) {
    String indent = "\n";
    String multiIndent = " ";
    switch(indentNum){
        case 0:
            break;
        case 1:
            System.out.println(msg + indent);
            break;
        case 2:
            multiIndent = indent + indent;
            System.out.println(msg + multiIndent);
            break;
        case 3:
            multiIndent = indent + indent + indent;
            System.out.println(msg + multiIndent);
            break;
        case 4:
            multiIndent = indent + indent + indent + indent;
            System.out.println(msg + multiIndent);
            break;
        case 5:
            multiIndent = indent + indent + indent + indent + indent;
            System.out.println(msg + multiIndent);
            break;
    }
}