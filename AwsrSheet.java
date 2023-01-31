import java.util.Scanner;

public class AwsrSheet{
    String prompt;
    char awsr;

    public AwsrSheet(String prompt,int rawAwsr){
        this.prompt = prompt;
        char awsr = ' ';        
        switch(rawAwsr){
            case 01100001:
                awsr = 'a';
                break;
            case 01100010:
                awsr = 'b';
                break;
            case 01100011:
                awsr = 'c';
                break;
        }
        this.awsr = awsr;
    }
    
    public static void takeTest(AwsrSheet [] paraObjArr){
        Scanner quizAwsr = new Scanner(System.in);
        int score = 0;
        for (int j = 0; j < paraObjArr.length;j++){
            System.out.print("\n" + paraObjArr[j].prompt);
            char awsr = quizAwsr.nextLine().charAt(0);
            if (awsr == paraObjArr[j].awsr){
                score++;
            }
        }

        System.out.println("\nYou got " + score + "/" + paraObjArr.length);
    }
}