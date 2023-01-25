import java.util.Scanner;
import java.util.Random;

public class Codex {
    public static void main(String[] args) {
        print("Java Codex",1);
        Scanner msgScanner = new Scanner(System.in); 
        print("Input Message to be Encrypted:");
        String rawMsg = msgScanner.nextLine();
        int newHash = coinFlip();
        EncryptionKey info = new EncryptionKey(rawMsg,newHash);
    }

}
public class EncryptionKey {
    int hash;
    String msg;

    EncryptionKey(int hash,String msg){
        this.hash = hash;
        this.msg = msg;
    }
}
public static String EncryptionManager(EncryptionKey paraClass) {
    String loopForShiftVarible = "" + paraClass.hash;
    char[] arrForShiftVarible = new char[paraClass.msg.length()];
    for(int j = 0; j < paraClass.msg.length(); j++)
        arrForShiftVarible[j] = paraClass.msg.charAt(j);
    for(int i = 0; i < loopForShiftVarible.length(); i++)
        if(loopForShiftVarible.charAt(i) == "0") {
            
        }
        if(loopForShiftVarible.charAt(i) == "1") {

        }
        if(loopForShiftVarible.charAt(i) == "2") {

        }
        if(loopForShiftVarible.charAt(i) == "3") {

        }
        if(loopForShiftVarible.charAt(i) == "4") {

        }
        if(loopForShiftVarible.charAt(i) == "5") {

        }
        if(loopForShiftVarible.charAt(i) == "6") {

        }
        if(loopForShiftVarible.charAt(i) == "7") {

        }
        if(loopForShiftVarible.charAt(i) == "8") {

        }
        if(loopForShiftVarible.charAt(i) == "9") {

        }
}
// put shift method here
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
public static void print(String msg,int indentNum) {
    String indent = "\n";
    switch(indentNum){
        case 0:
            break;
        case 1:
            System.out.println(msg + indent);
            break;
        case 2:
            String multiIndent = indent + indent;
            System.out.println(msg + multiIndent);
            break;
        case 3:
            String multiIndent = indent + indent + indent;
            System.out.println(msg + multiIndent);
            break;
        case 4:
            String multiIndent = indent + indent + indent + indent;
            System.out.println(msg + multiIndent);
            break;
        case 5:
            String multiIndent = indent + indent + indent + indent + indent;
            System.out.println(msg + multiIndent);
            break;
    }
}