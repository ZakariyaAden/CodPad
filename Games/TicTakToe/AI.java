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
    public String get(String indecator){
        String returnedStr = "";
        switch(indecator){
            case "NAME":
                returnedStr = this.aiName;
                break;
            case "MKR":
                returnedStr = this.marker;
                break;
        }
        return returnedStr;
    }
    public int getDiffLevel(){
        return this.diffLevel;
    }
    public int kill(){
        return 404;
    }
    public boolean[] think(String[][] arr){
        boolean[] freeSpots = {
            true,true,true,
            true,true,true,
            true,true,true
        };
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
                if(i == 0 && j == 0 && arr[i][j] == " " && arr[i][j] == " "){
                    freeSpots[0] = false;
                }
                if(i == 0 && j == 2 && arr[i][j] == " "){
                    freeSpots[1] = false;
                }
                if(i == 0 && j == 4 && arr[i][j] == " "){
                    freeSpots[2] = false;
                }
                if(i == 2 && j == 0 && arr[i][j] == " "){
                    freeSpots[3] = false;
                }
                if(i == 2 && j == 2 && arr[i][j] == " "){
                    freeSpots[4] = false;
                }
                if(i == 2 && j == 4 && arr[i][j] == " "){
                    freeSpots[5] = false;
                }
                if(i == 4 && j == 0 && arr[i][j] == " "){
                    freeSpots[6] = false;
                }
                if(i == 4 && j == 2 && arr[i][j] == " "){
                    freeSpots[7] = false;     
                }
                if(i == 4 && j == 4 && arr[i][j] == " "){
                    freeSpots[8] = false;
                }
            }
        }

        return freeSpots;
    }
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