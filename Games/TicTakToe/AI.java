public class AI{

    private String aiName;
    private String marker;
    private int diffLevel;
    private int[] placementArr;

    public void setName(String aiName){
        this.aiName = aiName;
        this.marker = "" + aiName.charAt(0);
    }
    public void setDiffLevel(int diffLevel){
        this.diffLevel = diffLevel;
    }
    public String getName(){
        return this.aiName;
    }
    public String getMarker(){
        return this.marker;
    }
    public int getDiffLevel(){
        return this.diffLevel;
    }
    public boolean[] think(String[][] arr){
        boolean freeSpot1 = false;
        boolean freeSpot2 = false;
        boolean freeSpot3 = false;
        boolean freeSpot4 = false;
        boolean freeSpot5 = false;
        boolean freeSpot6 = false;
        boolean freeSpot7 = false;
        boolean freeSpot8 = false;
        boolean freeSpot9 = false;
        boolean[] freeSpots = {
            freeSpot1,freeSpot2,freeSpot3,
            freeSpot4,freeSpot5,freeSpot6,
            freeSpot7,freeSpot8,freeSpot9
        };
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
                if (arr[i][j] == " "){
                    if(i == 0 && j == 0){
                        freeSpot1 = true;
                    }
                    if(i == 0 && j == 2){
                        freeSpot2 = true;
                    }
                    if(i == 0 && j == 4){
                        freeSpot3 = true;
                    }
                    if(i == 2 && j == 0){
                        freeSpot4 = true;
                    }
                    if(i == 2 && j == 2){
                        freeSpot5 = true;
                    }
                    if(i == 2 && j == 4){
                        freeSpot6 = true;
                    }
                    if(i == 4 && j == 0){
                        freeSpot7 = true;
                    }
                    if(i == 4 && j == 2){
                        freeSpot8 = true;     
                    }
                    if(i == 4 && j == 4){
                        freeSpot9 = true;
                    }
                }
            }
        }

        return freeSpots;
    }
    // I'll intergate this later
    // public boolean placePiece(String[][] arr, boolean[] freeSpots, AI paraAI) {
    //     boolean occuiped = false;
    //     switch(spotNum) {
    //         case 1: 
    //             if (arr[0][0] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[0][0] = this.marker;
    //             break;
    //         case 2:   
    //             if (arr[0][2] != " "){
    //                 occuiped = true;
    //                 break;
    //             }                 
    //             arr[0][2] = this.marker;
    //             break;
    //         case 3:
    //             if (arr[0][4] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[0][4] = this.marker;
    //             break;
    //         case 4:
    //             if (arr[2][0] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[2][0] = this.marker;
    //             break;
    //         case 5:
    //             if (arr[2][2] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[2][2] = this.marker;
    //             break;
    //         case 6:
    //             if (arr[2][4] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[2][4] = this.marker;
    //             break;
    //         case 7:
    //             if (arr[4][0] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[4][0] = this.marker;
    //             break;
    //         case 8:
    //             if (arr[4][2] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[4][2] = this.marker;
    //             break;
    //         case 9:
    //             if (arr[4][4] != " "){
    //                 occuiped = true;
    //                 break;
    //             }
    //             arr[4][4] = this.marker;
    //             break;
    //         default:
    //             break;
    //     }
        
    //     System.out.println("\n");
    //     int thisIndex = 0;
    //     for (int i = 0; i < arr.length; i++){
    //         for (int j = 0; j < arr[i].length;j++){
    //             if (arr[i][j].equals(this.marker)){
    //                 int aiIndex = i + j;
    //                 int[] aiIndexarr = {
    //                     aiIndex
    //                 };
                    
    //                 this.placementArr = aiIndexarr;
    //             }
    //         }
    //     }
    //     return occuiped;
    // } 
}