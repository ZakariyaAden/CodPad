import java.util.Scanner;
import java.util.Random;
public class BankAccount{
    String accountFirstName;
    String accountLastName;
    String maleOrfemale;
    int age;
    String password;
    int passwordHash;
    String passwordSalt;
    String passwordHashed;
    int passwordHash;
    Boolean isCompanyAccount;
    String companyName;
    String amount;

    public static void createAccount(){
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
        this.password = collectUserAccountInfo.nextLine();
        int hash = hashGenorator.nextInt(100);
        this.passwordHash = hash;
        int shift = hash % 26;
        String[] passwordArr = new String[this.password.length()]; 
        for (int i = 0; i < this.password.length();i++){
            passwordArr[i] = this.password.charAt(i);
        }
        while(!endbool){
            int randomIndex = hashGenorator.nextInt(this.password.length() - 1);
        }

    }
    public static void createAccountStoryMood(String accountFirstName,String accountLastName,String maleOrfemale,int age,String amount)
}