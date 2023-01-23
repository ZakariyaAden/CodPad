import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("Java Temp Converter");
        Scanner typeOfConv = new Scanner(System.in);
        System.out.print("What Type of Conversionp?\n[Enter 1 for Fairenheight to Celsius & Enter 2 for Celsius to Farenheight]:");
        String convrBino = typeOfConv.nextLine();
        boolean convrTypeF = false;
        boolean convrTypeC = false;
        if (convrBino.equals("1")) {
            convrTypeF = true;
            convrTypeC = false;
        }
        if (convrBino.equals("2")) {
            convrTypeF = false;
            convrTypeC = true;
        }
        if (convrTypeF) {
            System.out.println("\nFairenheight to Celsius");
            Scanner farToCelraw = new Scanner(System.in);
            System.out.print("Input Temp in Fairenheight:");
            int farToConvr = farToCelraw.nextInt();
            int farConvrFinal = farenheightConvr(farToConvr);
            System.out.println(farToConvr + " Fairenheight is " + farConvrFinal + " Celsius");
        }
        if (convrTypeC) {
            System.out.println("\nCelsius to Fairenheight");
            Scanner farToCelraw = new Scanner(System.in);
            System.out.print("Input Temp in Celsius:");
            int celToConvr = farToCelraw.nextInt();
            int celConvrFinal = celsiusConvr(celToConvr);
            System.out.println(celToConvr + " Celsius is " + celConvrFinal + " Fairenheight");
        }
        if (convrTypeF == false && convrTypeC == false) {
            System.out.println("Incorrect Input");
            
        }
    }
    public static int farenheightConvr(int far) {
        int tempConvr = (far - 32) * 5/9;
        return tempConvr;
    }
    public static int celsiusConvr(int cel) {
        int tempConvr = (cel * 9/5) + 32;
        return tempConvr;
    }
}
