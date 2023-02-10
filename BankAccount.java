import java.util.Scanner;
import java.util.Random;
public class BankAccount{
    String accountFirstName;
    String accountLastName;
    String maleOrfemale;
    int age;
    String password;
    int hash;
    Double amount;

    public static void openAccount(){
        Scanner collectUserAccountInfo = new Scanner(System.in);
        Random hashGenorator = new Random();
        System.out.print("Enter First Name:");
        this.accountFirstName = collectUserAccountInfo.nextLine();
        System.out.print("Enter Last Name:");
        this.accountLastName = collectUserAccountInfo.nextLine();
        System.out.print("Are you Male or Female(m/f):");
        String gender = collectUserAccountInfo.nextLine();
        char genderChar = gender.charAt(0);
        if (genderChar.equals('m')){
            this.maleOrfemale = "Male";
        }
        if (genderChar.equals('f')){
            this.maleOrfemale = "Female";
        }
        System.out.print("Enter Your Age:");
        this.age = collectUserAccountInfo.nextInt();
        System.out.print("Make a password:");
        String tempPassword = collectUserAccountInfo.nextLine();
        int hash = hashGenorator.nextInt(9999);
        this.password = encryptionStepOne(encryptionStepTwo(tempPassword,hash));
        this.hash = hash;
        System.out.println("How Much Would You Like To Deposit:");
        Double amount = collectUserAccountInfo.nextDouble();
        this.amount = amount;
    }
    public static void openAccountStoryMood(String accountFirstName,String accountLastName,Boolean maleOrfemale,int age, String password, Double amount){
        this.accountFirstName = accountFirstName;
        this.accountLastName = accountLastName;
        if (maleOrfemale){
            this.maleOrfemale = "Male";
        }
        if (!maleOrfemale){
            this.maleOrfemale = "Female";
        }
        this.age = age;
        Random hashGenoratorForStoryMood = new Random();
        int hashForStoryMood = hashGenoratorForStoryMood.nextInt(9999) 
        this.password = encryptionStepOne(encryptionStepTwo(password,hashForStoryMood));
        this.hash = hashForStoryMood;
        this.amount = amount;
    }
    public static void closeAccount(){
        String accountFirstName = null;
        String accountLastName = null;
        String maleOrfemale = null;
        int age = null;
        String password = null;
        int hash = null;
        Double amount = null;
    }
    public static String encryptionStepOne(String paraStr) {
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
    public static String encryptionStepTwo(String plainText,int shift){        
        StringBuilder encryptedText = new StringBuilder();
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char c = plainText.charAt(i);
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