import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println("Java Speed Converter\n");
        Scanner typeOfConv = new Scanner(System.in);
        System.out.print("What Type of Conversion?\n[Enter 1 for Mph to Kph & Enter 2 for Kph to Mph]:");
        String convrBino = typeOfConv.nextLine();
        boolean convrTypeM = false;
        boolean convrTypeK = false;
        if (convrBino.equals("1")) {
            convrTypeM = true;
            convrTypeK = false;
        }
        if (convrBino.equals("2")) {
            convrTypeM = false;
            convrTypeK = true;
        }
        if (convrTypeM) {
            System.out.println("\nMph to Kph");
            Scanner mphToKphraw = new Scanner(System.in);
            System.out.print("Input Speed in Miles Per Hour:");
            Double mphConvr = mphToKphraw.nextDouble();
            Double mphConvrFinal = MphToKph(mphConvr);
            System.out.println(mphConvr + " MPH is " + mphConvrFinal + " KPH");
        }
        if (convrTypeK) {
            System.out.println("\nKph to Mph");
            Scanner kphToMphraw = new Scanner(System.in);
            System.out.print("Input Speed in Kilometers Per Hour:");
            Double kphConvr = kphToMphraw.nextDouble();
            Double kphConvrFinal = KphToMph(kphConvr);
            System.out.println(kphConvr + " KPH is " + kphConvrFinal + " MPH");
        }
        if (convrTypeK == false && convrTypeM == false) {
            System.out.println("Invalid Input");
        }
    }
    public static Double KphToMph(Double parakph) {
        Double speedConvr = parakph * 1.609;
        return speedConvr;
    }
    public static Double MphToKph(Double paramph) {
        Double speedConvr = paramph / 1.609;
        return speedConvr;
    }
}