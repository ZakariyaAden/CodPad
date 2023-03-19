import java.util.Scanner;

public class Quiz{
    public static void main(String[] args){
        System.out.println("Java Quiz");
        String q1 = "Which of these Print Statment should you use with Scanners?\n" + "(a) println \n(b) print \n(c) printf\nYour Awsr:";
        String q2 = "Which Varible Keyword is used most by programmers to store a Decimal?\n" + "(a) Decimal \n(b) Float \n(c) Double\nYour Awsr:";
        String q3 = "When do you have add semi-colons at the end of a line of code?\n" + "(a) Always \n(b) Sonetimes \n(c) Never\nYour Awsr:";
        AwsrSheet [] cheatSheetArr = {
            new AwsrSheet(q1,01100010),
            new AwsrSheet(q2,01100011),
            new AwsrSheet(q3,01100001)
        };
        AwsrSheet.takeTest(cheatSheetArr);
    }
}