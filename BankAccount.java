import java.util.Scanner;
import java.util.Random;
public class BankAccount{
    String accountFirstName;
    String accountLastName;
    String maleOrfemale;
    int age;
    String password;
    String passwordHashed;
    Boolean isCompanyAccount;
    String companyName;
    String amount;

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
        this.password = encryptionStepOne(tempPassword);
    }
    public static void openAccountStoryMood(String accountFirstName,String accountLastName,String maleOrfemale,int age,String amount)
    
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
    public static String encryptionStepTwo(){        
        int hashLoopCount = 0;
        int[] hashArr = new int[5];
        while(hashLoopCount < hashArr.length){
            int localhash = hashGenorator.nextInt(9);
            hashArr[hashLoopCount] = localhash;
        }
        String[] passwordArr = new String[this.password.length()]; 
        for (int i = 0; i < this.password.length();i++){
            passwordArr[i] = "" + this.password.charAt(i);
            if (passwordArr[i] == " "){
                int randNum = hashGenorator.nextInt(9);
                passwordArr[i] = "" + randNum;
            }
        }
        /*
        finish later
        for()
        */
    }
}