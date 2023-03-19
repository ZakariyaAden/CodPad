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
            char[] equationArr = new char[equation.length()];
            for(int i = 0; i < equation.length(); i++){
                equationArr[i] = equationArr.charAt(i);
            }
            int num1 = 0;
            int num2 = 0;
            for (int j = 0; j < equation.length(); j++){
                switch(equationArr[j]){
                    case '1':
                        num1 = 1;
                        if (j > 0){
                            break;
                        }
                        break;
                    case '2':
                        num1 = 2;
                        if (j > 0){
                            break;
                        }
                        break;
                    case '3':
                        num1 = 1;
                        if (j > 0){
                            break;
                        }
                        break;
                }
            }
            
        }
    }
}
