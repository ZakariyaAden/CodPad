import java.util.Scanner;

public class TikTacToe{
    public static void main(String[] args) {
        Referee ref = new Referee();
        System.out.println("TickTackToe\n");
        Scanner startMsg = new Scanner(System.in);
        System.out.println("Press E to Start:");
        char start = startMsg.next().charAt(0);
        boolean startBool = false;
        String[][] boardV1 = {
            {" ","|"," ","|"," "},
            {"-","+","-","+","-"},
            {" ","|"," ","|"," ",},
            {"-","+","-","+","-",},
            {" ","|"," ","|"," ",}
        };
        String[][] boardV2 = {
            {" ","    /"," ","    /"," "},
            {"_","   /","_","   /","_"},
            {" ","  /"," ","  /"," "},
            {"_"," /","_"," /","_"},
            {" ","/"," ","/"," "},
        };
        if (start == 'E' || start == 'e' ) {
            startBool = true;
        }
        if (start != 'E'  && start != 'e') {
            System.out.println("Ok");
        }
        if (startBool) {
            Scanner oneOrTwoPlayers = new Scanner(System.in);
            System.out.println("\nOne Player or Two Players(1/2):");
            int numOfPLayers = oneOrTwoPlayers.nextInt();
            if (numOfPLayers == 1){
                Scanner playerinfo = new Scanner(System.in);
                System.out.println("\nWhat's Your Name:");
                String player1Name = playerinfo.nextLine();
                Player p1 = new Player(player1Name);
                System.out.println("\nYour Name:");
                System.out.println(p1.name);
                System.out.println("\nYour Board Marker:");
                System.out.println(p1.marker + "\n");
                System.out.println("Now Choose Your AI(Enter Their #):");
                System.out.println("AIDEED is easy(1)");
                System.out.println("BOB is harder(2)");
                System.out.println("ZAK is impossible(3)");
                AI ai = new AI();
                switch(playerinfo.nextInt()){
                    case 1: 
                        ai.setName("AIDEED");
                        ai.setDiffLevel(1);
                        break;
                    case 2:
                        ai.setName("BOB");
                        ai.setDiffLevel(2);
                        break;
                    case 3:
                        ai.setName("ZAK");
                        ai.setDiffLevel(3);
                        break;
                }
                System.out.println("\nYour opponent:");
                System.out.println("Name: " + ai.getName());
                System.out.println("Difficulty Level: " + ai.getDiffLevel());
            }
            if (numOfPLayers == 2){
                Scanner playerinfo = new Scanner(System.in);
                System.out.println("\nWhat's P1's First Name:");
                String player1Name = playerinfo.nextLine();
                Player p1 = new Player(player1Name);
                System.out.println("\nPlayer 1's Name:");
                System.out.println(p1.name);
                System.out.println("\nPlayer 1's Board Marker:");
                System.out.println(p1.marker);
                System.out.println("\n\nWhat's P2's First Name:");
                String player2Name = playerinfo.nextLine();
                Player p2 = new Player(player2Name);
                System.out.println("\nPlayer 2's Name:");
                System.out.println(p2.name);
                System.out.println("\nPlayer 2's Board Marker:");
                System.out.println(p2.marker);
                System.out.print(p1.champion());
                System.out.print(p2.champion());            
                if (p1.name == p2.name && p1.marker == p2.marker){
                    System.out.println("We are in the matrix now");
                }            
                System.out.println("\nOk " + p1.name + ", You're up First\n\n");
                boolean endbool = true;
                int turnCounter = 1;            
                for (int endcount = 0; endcount <= 9;endcount++){
                    Scanner moveInput = new Scanner(System.in);
                    if (turnCounter == 1 || turnCounter == 3 || turnCounter == 5 || turnCounter == 7 || turnCounter == 9){
                        System.out.println("\n\nOk " + p1.name + ", Your Turn:" + turnCounter  + "\n\n");
                        printBoard(boardV1);
                        System.out.println("\n\nWhich Spot do you want to put your " + p1.marker + " on[1~9]:");
                        int p1spotNumForGameLoop = 0;
                        try{
                            p1spotNumForGameLoop = moveInput.nextInt();
                        }
                        catch(Throwable err){
                            System.out.println("Invalid Input");
                        }
                        boolean loseATurn = p1.placePiece(boardV1,p1spotNumForGameLoop);
                        printBoard(boardV1);
                        String whoWon = ref.jugde(boardV1,p1,p2,endcount);
                        if(whoWon.charAt(0) !=' '){
                            System.out.println("\n" + whoWon);
                            break;
                        }
                    System.out.println(ref.jugde(boardV1,p1,p2,endcount));     
                    }
                    if (turnCounter == 2 || turnCounter == 4 || turnCounter == 6 || turnCounter == 8){
                        System.out.println("\n\nOk " + p2.name + ", Your Turn:" + turnCounter + "\n\n");
                        printBoard(boardV1);
                        System.out.println("\n\nWhich Spot do you want to put your " + p2.marker + " on[1~9]:");
                        int p2spotNumForGameLoop = 0;
                        try{
                            p2spotNumForGameLoop = moveInput.nextInt();
                        }
                        catch(Throwable err){
                            System.out.println("Invalid Input");
                        }
                        boolean loseATurn = p2.placePiece(boardV1,p2spotNumForGameLoop);
                        printBoard(boardV1);
                        String whoWon = ref.jugde(boardV1,p1,p2,endcount);
                        if(whoWon.charAt(0) != ' '){
                            System.out.println("\n" + whoWon);
                            break;
                        }
                    System.out.println(ref.jugde(boardV1,p1,p2,endcount));     
                    }
                    if (turnCounter == 9){
                        System.out.println("\nCAT");
                        break;
                    }
                    turnCounter++;
                }
            }
            if (numOfPLayers <= 0 || numOfPLayers >= 3){
                System.out.println("ok");
            }
        }
    }
    public static void printBoard(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}