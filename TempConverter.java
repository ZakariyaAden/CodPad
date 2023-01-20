import java.util.Scanner;

public class TempConvrt {
    public static void main(String[] args) {
        System.out.println("Java Temp Converter");
        Scanner typeOfConv = new Scanner(System.in);
        System.out.print("What Type of Conversionp?\n[Enter 1 for Fairenheight to Celsius & Enter 2 for Celsius to Farenheight]:");
        int convrBino = typeOfConv.nextInt();
        typeOfConv.nextLine();
        typeOfConv.remove();
        boolean convrTypeF = false;
        boolean convrTypeC = false;

        if (convrBino == 1) {
            convrTypeF = true;
            convrTypeC = false;
        }
        if (convrBino == 2) {
            convrTypeF = false;
            convrTypeC = true;
        }

        if (convrTypeF) {
            System.out.println("\nFairenheight to Celsius");
        }
        if (convrTypeC) {
            System.out.println("\nCelsius to Fairenheight");
        }
    }
}