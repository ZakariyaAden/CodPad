public class Referee{
    public static String jugde(String[][] paraBoard,Player p1,Player p2){
        String p1HasWon = "\n" + p1.name + " has won!";
        String p2HasWon = "\n" + p2.name + " has won!";
        String whoWon = " ";
        for (int i = 0; i < paraBoard.length; i++){
            if (paraBoard[i][0] == p1.marker && paraBoard[i][2] == p1.marker && paraBoard[i][4] == p1.marker){
                whoWon = p1HasWon;
            }
            if (paraBoard[i][0] == p2.marker && paraBoard[i][2] == p2.marker && paraBoard[i][4] == p2.marker){
                whoWon = p2HasWon;
            }            
        }
        return whoWon;
    }
}