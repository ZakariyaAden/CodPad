public class Referee{
    public static String jugde(String[][] paraBoard,Player p1,Player p2,int endbool){
        String p1HasWon = "\n" + p1.name + " has won!";
        String p2HasWon = "\n" + p2.name + " has won!";
        String whoWon = " ";
        for (int i = 0; i < paraBoard.length; i++){
            if (paraBoard[i][0] == p1.marker && paraBoard[i][2] == p1.marker && paraBoard[i][4] == p1.marker){
                whoWon = p1HasWon;
                endbool = 10;
            }    
            if (paraBoard[0][0] == p1.marker && paraBoard[2][2] == p1.marker && paraBoard[4][4] == p1.marker){
                whoWon = p1HasWon;
                endbool = 10;
            }
            if (paraBoard[0][4] == p1.marker && paraBoard[2][2] == p1.marker && paraBoard[4][0] == p1.marker){
                whoWon = p1HasWon;
                endbool = 10;
            }
            if (paraBoard[0][i] == p1.marker && paraBoard[2][i] == p1.marker && paraBoard[4][i] == p1.marker){
                whoWon = p1HasWon;
                endbool = 10;
            }
            if (paraBoard[i][0] == p2.marker && paraBoard[i][2] == p2.marker && paraBoard[i][4] == p2.marker){
                whoWon = p2HasWon;
                endbool = 10;
            }       
            if (paraBoard[0][0] == p2.marker && paraBoard[2][2] == p2.marker && paraBoard[4][4] == p2.marker){
                whoWon = p2HasWon;
                endbool = 10;
            }
            if (paraBoard[0][4] == p2.marker && paraBoard[2][2] == p2.marker && paraBoard[4][0] == p2.marker){
                whoWon = p2HasWon;
                endbool = 10;
            }    
            if (paraBoard[0][i] == p2.marker && paraBoard[2][i] == p2.marker && paraBoard[4][i] == p2.marker){
                whoWon = p2HasWon;
                endbool = 10;               
            }
        }
        return whoWon;
    }
}