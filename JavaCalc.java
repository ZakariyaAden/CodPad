import java.util.Scanner;

public class calc{

    public static int add (int num1, int num2){
        return num1 + num2;
    }
    public static int sub (int num1, int num2){
        return num1 - num2;
    }
    public static int mult (int num1, int num2){
        return num1 * num2;
    }
    public static int div (int num1, int num2){
        if (num1 == 0.0 || num2 == 0.0) {
            System.out.println("Error: Can't Divide by Zero");
        }
        else {
            return num1 / num2;
        }
        return num1 / num2;
    }

    //public static int arrSeacher (char arr[],char charKey){
    //    for (int i; i < arr; i++) {
    //        if (arr[i] == charKey) {
    //            int targetLength = arr.length - i;
    //            return targetLength;
    //        }
    //    }
    //}

    public static void main(String [] args){

        System.out.println("Java Calculator\n");
        Scanner numScanner = new Scanner(System.in);
        
        System.out.print("Input Operation[+,-,*,/]:");
        char operation = numScanner.next().charAt(0);

        System.out.print("Input First #: ");
        int num1 = numScanner.nextInt();
        
        System.out.print("Input Second #: ");
        int num2 = numScanner.nextInt();


        char operationls[] = {
            '+',
            '-',
            '*',
            '/'
        };

        

        for(char i : operationls) {

            if (i == operation) {
                if (i == '+') {
                    int awsr = add(num1,num2);
                    System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);
                } 
                if (i == '-') {
                    int awsr = sub(num1,num2);
                    System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);                    
                }
                if (i == '*') {
                    int awsr = mult(num1,num2);
                    System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);

                }
                if (i == '/') {
                    int awsr = div(num1,num2);
                    System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);   
                }
            }
        }
    }
}
