import java.util.Scanner;

public class JavaCalc{

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

    public static void main(String[] args){

        System.out.println("Java Calculator\n");
        Scanner numScanner = new Scanner(System.in);

        char operationls[] = {
            '+',
            '-',
            '*',
            '/'
        };
        int awsr = 0;
        boolean endbool = false;
        while(!endbool){
            System.out.print("Input equation[Ex:1+2]:");
            String equation = numScanner.nextLine();
            
            for(char i : operationls) {
                if (i == operation) {
                    if (i == '+') {
                        awsr = add(num1,num2);
                        System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);
                    } 
                    if (i == '-') {
                        awsr = sub(num1,num2);
                        System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);                    
                    }
                    if (i == '*') {
                        awsr = mult(num1,num2);
                        System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);

                    }
                    if (i == '/') {
                        awsr = div(num1,num2);
                        System.out.println("\n" + num1 + " " + operation + " " + num2 + " = " + awsr);   
                    }
                }
            }

        }
    }
}
