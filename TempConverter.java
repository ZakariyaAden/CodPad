import java.util.Scanner;

public class TempConvrt {
    public static void main(String[] args) {
        System.out.println("Java Temp Converter");
        Scanner typeOfConv = new Scanner(System.in);
        System.out.print("What Type of Conversionp?\n[Enter 1 for Fairenheight to Celsius & Enter 2 for Celsius to Farenheight]:");
        try {
            String convrBino = typeOfConv.nextLine();
            typeOfConv.remove();
        }
        catch (Throwable e) {
            System.out.println(e);
        }
        boolean convrTypeF = false;
        boolean convrTypeC = false;
        try { 
            if (convrBino.equals("1")) {
                convrTypeF = true;
                convrTypeC = false;
            }
            if (convrBino.equals("2")) {
                convrTypeF = false;
                convrTypeC = true;
            }
        }
        catch (Throwable err) {
            System.out.println("1st try/catch failed");
            System.out.println(err);
        }
        if (convrTypeF) {
            System.out.println("\nFairenheight to Celsius");
            Scanner farToCel = new Scanner(System.in);
            System.out.print("Input Temp in Fairenheight:");
            int farToConvr = farToCel.nextInt();
            System.out.print(farToConvr + " Fairenheight");
        }
        if (convrTypeC) {
            System.out.println("\nCelsius to Fairenheight");
        }
        if (convrTypeF == false && convrTypeC == false) {
            System.out.println("Incorrect Input");
            
        }
    }
}