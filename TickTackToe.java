import java.util.Scanner;

public class TickTackToe{
    public static void main(String[] args) {
        Referee ref = new Referee();
        System.out.println("TickTackToe\n");
        Scanner startMsg = new Scanner(System.in);
        System.out.println("Press E to Start:");
        String start = startMsg.nextLine();
        boolean startBool = false;
        String[][] boardV1 = {
            {" ","|"," ","|"," "},
            {"-","+","-","+","-"},
            {" ","|"," ","|"," ",},
            {"-","+","-","+","-",},
            {" ","|"," ","|"," ",}
        };
        if (start.equals("E") || start.equals("e")) {
            startBool = true;
        }
        if (!start.equals("E") && !start.equals("e")) {
            System.out.println("Ok");
        }
        if (startBool) {
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
            if (p1.name == p2.name && p1.marker == p2.marker){
                System.out.println("We are in the matrix now");
            }            
            System.out.println("\n\nOk " + p1.name + ", You're up First\n\n");
            boolean endbool = false;
            int turnCounter = 1;    
            int turnCounterVisual = turnCounter;
            int turnCounterBino = turnCounter % 2;                    
            while(!endbool){
                Scanner moveInput = new Scanner(System.in);
                if (turnCounterBino == 1 || turnCounterBino == 1){
                    System.out.println("\n\nOk " + p1.name + ", Your Turn:" + turnCounter  + "\n\n");
                    printBoard(boardV1);
                    System.out.println("\n\nWhich Spot do you want to put your " + p1.marker + " on[1~9]:");
                    int p1spotNumForGameLoop = moveInput.nextInt();
                    boolean loseATurn = placePiece(boardV1,p1spotNumForGameLoop,p1);
                    printBoard(boardV1);
                    String whoWon = ref.jugde(boardV1,p1,p2);
                    if(whoWon.charAt(0) == p1.marker.charAt(0)){
                        endbool = true;
                    }
                    System.out.println(ref.jugde(boardV1,p1,p2));
                    if (loseATurn == true){
                        turnCounter = turnCounter - 1;
                        turnCounterVisual = turnCounterVisual - 1;
                    }                   
                }
                if (turnCounterBino == 0){
                    System.out.println("\n\nOk " + p2.name + ", Your Turn:" + turnCounter + "\n\n");
                    printBoard(boardV1);
                    System.out.println("\n\nWhich Spot do you want to put your " + p2.marker + " on[1~9]:");
                    int p2spotNumForGameLoop = moveInput.nextInt();
                    boolean loseATurn = placePiece(boardV1,p2spotNumForGameLoop,p2);
                    printBoard(boardV1);
                    String whoWon = ref.jugde(boardV1,p1,p2);
                    if(whoWon.charAt(0) == p2.marker.charAt(0)){
                        System.out.println(ref.jugde(boardV1,p1,p2));
                        endbool = true;
                    }
                    if (loseATurn == true){
                        turnCounter = turnCounter - 1;
                        turnCounterVisual = turnCounterVisual - 1;
                    } 
                }
                if (turnCounter == 8){
                    endbool = true;
                }
                turnCounter++;
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

    //public static String[][] boardVersionManagerForPrinter(int serialNum){
    //    String[][] boardV1 = {
    //        {" ","|"," ","|"," "},
    //        {"-","+","-","+","-"},
    //        {" ","|"," ","|"," ",},
    //        {"-","+","-","+","-",},
    //        {" ","|"," ","|"," ",}
    //    };

    //    String[][] boardV2 = {
    //        {"_","/","_","/","_"},
    //        {"_","/","_","/","_"},
    //        {" ","/"," ","/"," "},
    //    };

    //    String[][] currentVersion = new String[10][6];

    //    if (serialNum == 0) {
    //        currentVersion = boardV1;
    //    }
    
    //    if (serialNum == 1) {
    //        currentVersion = boardV1;
    //    }
    //    return currentVersion;
    //}

    public static boolean placePiece(String[][] arr, int spotNun, Player player) {
        boolean occuiped = false;
        switch(spotNun) {
            case 1: 
                if (arr[0][0] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[0][0] = player.marker;
                break;
            case 2:   
                if (arr[0][2] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }                 
                arr[0][2] = player.marker;
                break;
            case 3:
                if (arr[0][4] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[0][4] = player.marker;
                break;
            case 4:
                if (arr[2][0] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[2][0] = player.marker;
                break;
            case 5:
                if (arr[2][2] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[2][2] = player.marker;
                break;
            case 6:
                if (arr[2][4] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[2][4] = player.marker;
                break;
            case 7:
                if (arr[4][0] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[4][0] = player.marker;
                break;
            case 8:
                if (arr[4][2] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[4][2] = player.marker;
                break;
            case 9:
                if (arr[4][4] != " "){
                    System.out.println("Can't Place There");
                    occuiped = true;
                    break;
                }
                arr[4][4] = player.marker;
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        
        System.out.println("\n");
        int playerIndex = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                if (arr[i][j].equals(player.marker)){
                    playerIndex = i + j;
                    int[] playerIndexarr = {
                        playerIndex
                    };
                    
                    player.placementArr = playerIndexarr;
                }
            }
        }
        return occuiped;
    } 

}