public class Player {
    String name;
    String marker;
    int[] placementArr;

    public Player(String name){
        this.name = name;
        this.marker = "" + name.charAt(0);
    }
    public String champion(){
        String msg = "";
        if(this.name == "aideed" || this.name == "Aideed"){
            msg = "Welcome back, Champion";
        }
        return msg;
    }
    // this saved me a ton of time
    public boolean placePiece(String[][] arr, int spotNun) {
    boolean occuiped = false;
    switch(spotNun) {
        case 1: 
            if (arr[0][0] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[0][0] = this.marker;
            break;
        case 2:   
            if (arr[0][2] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }                 
            arr[0][2] = this.marker;
            break;
        case 3:
            if (arr[0][4] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[0][4] = this.marker;
            break;
        case 4:
            if (arr[2][0] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[2][0] = this.marker;
            break;
        case 5:
            if (arr[2][2] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[2][2] = this.marker;
            break;
        case 6:
            if (arr[2][4] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[2][4] = this.marker;
            break;
        case 7:
            if (arr[4][0] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[4][0] = this.marker;
            break;
        case 8:
            if (arr[4][2] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[4][2] = this.marker;
            break;
        case 9:
            if (arr[4][4] != " "){
                System.out.println("Can't Place There");
                occuiped = true;
                break;
            }
            arr[4][4] = this.marker;
            break;
        default:
            System.out.println("Invalid Input");
            break;
    }

    System.out.println("\n");
    int playerIndex = 0;
    for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr[i].length;j++){
            if (arr[i][j].equals(this.marker)){
                playerIndex = i + j;
                int[] playerIndexarr = {
                    playerIndex
                };
                
                this.placementArr = playerIndexarr;
            }
        }
    }
    return occuiped;
}
}