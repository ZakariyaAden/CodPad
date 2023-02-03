import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        System.out.println("Java Weight Converter");
        Scanner typeOfConv = new Scanner(System.in);
        System.out.print("What Type of Conversion?\n[Enter 1 for Pounds to Kilograms & Enter 2 for Kilograms to Pounds]:");
        String convrBino = typeOfConv.nextLine();
        boolean convrTypeP = false;
        boolean convrTypeK = false;
        if (convrBino.equals("1")) {
            convrTypeP = true;
            convrTypeK = false;
        }
        if (convrBino.equals("2")) {
            convrTypeP = false;
            convrTypeK = true;
        }
        if (convrTypeP) {
            System.out.println("\nPounds to Kilograms");
            Scanner farToCelraw = new Scanner(System.in);
            System.out.print("Input Weight in Pounds:");
            int farToConvr = farToCelraw.nextInt();
            int farConvrFinal = farenheightConvr(faToConvr);
            System.out.println(farToConvr + " Fairenheight is " + farConvrFinal + " Celsius");
        }
        if (convrTypeP) {
            System.out.println("\nPounds to Kilograms");
            Scanner raw = new Scanner(System.in);
            System.out.print("Input Weght in Pounds:");
            int poundConvr = raw.nextInt();
            int poundConvrFinal = poundConvr(poundConvr);
            System.out.println(poundConvr + " Pounds is " + poundConvrFinal + " Kilograms");
        }
        if (convrTypeK) {
            System.out.println("\nCelsius to Fairenheight");
            Scanner farToCelraw = new Scanner(System.in);
            System.out.print("Input Temp in Celsius:");
            int celToConvr = farToCelraw.nextInt();
            int celConvrFinal = celsiusConvr(celToConvr);
            System.out.println(celToConvr + " Celsius is " + celConvrFinal + " Fairenheight");
        }
        if (convrTypeK) {
            System.out.println("\nKilograms to Pounds");
            Scanner raw = new Scanner(System.in);
            System.out.print("Input Temp in Kilograms:");
            int kiloConvr = raw.nextInt();
            int kiloConvrFinal = kiloConvr(kiloConvr);
            System.out.println(kiloConvr + " Kilograms is " + kiloConvrFinal + " Pounds");
        }
        if (convrTypeP == false && convrTypeK == false) {
            System.out.println("Incorrect Input");

        }
    }

    public static int poundConvr(int pounds) {
        int weightConvr = pounds / 2;
        return weightConvr;
    }
    public static int kiloConvr(int kilos) {
        int weightConvr = kilos * 2;
        return weightConvr;
    }
}
