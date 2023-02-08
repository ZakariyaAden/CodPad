import java.util.Scanner;

public class WordCounter{
    public static void main(String[] args){
        System.out.println("Java Word Counter\n");
        Scanner paraGraph = new Scanner(System.in);
        System.out.println("Paste Paragraph Here:\n");
        String paraGraphForCounting = paraGraph.nextLine();
        System.out.println("\n\nParagraph length: " + counter(paraGraphForCounting));
    }
    public static int counter(String paraMsg){
        int length = 1;
        for(int i = 0; i < paraMsg.length();i++){
            if(paraMsg.charAt(i) == ' '){
                length++;
            }
        }
        length = length - 1; 
        return length;
    }
}
