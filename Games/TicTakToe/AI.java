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
    public boolean[] think(String[][] arr){
        boolean[] occuiped = {
            true,true,true,
            true,true,true,
            true,true,true
        };
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
                if(i == 0 && j == 0 && arr[i][j] == " " && arr[i][j] == " "){
                    occuiped[0] = false;
                }
                if(i == 0 && j == 2 && arr[i][j] == " "){
                    occuiped[1] = false;
                }
                if(i == 0 && j == 4 && arr[i][j] == " "){
                    occuiped[2] = false;
                }
                if(i == 2 && j == 0 && arr[i][j] == " "){
                    occuiped[3] = false;
                }
                if(i == 2 && j == 2 && arr[i][j] == " "){
                    occuiped[4] = false;
                }
                if(i == 2 && j == 4 && arr[i][j] == " "){
                    occuiped[5] = false;
                }
                if(i == 4 && j == 0 && arr[i][j] == " "){
                    occuiped[6] = false;
                }
                if(i == 4 && j == 2 && arr[i][j] == " "){
                    occuiped[7] = false;     
                }
                if(i == 4 && j == 4 && arr[i][j] == " "){
                    occuiped[8] = false;
                }
            }
        }

        return occuiped;
    }
    public boolean placePiece(String[][] arr, boolean[] occuiped) {

        for(boolean bool : occuiped){
            if(bool){return false;}            
            if(!occuiped[0]){
                arr[0][0] = this.get("MKR");
            }
            if(!occuiped[1]){
                arr[0][2] = this.get("MKR");
            }
            if(!occuiped[2]){
                arr[0][4] = this.get("MKR");
            }
            if(!occuiped[3]){
                arr[1][0] = this.get("MKR");
            }
            if(!occuiped[4]){
                arr[1][2] = this.get("MKR");
            }
            if(!occuiped[5]){
                arr[0][2] = this.get("MKR");
            }
        }
        System.out.println("\n");
        // int thisIndex = 0;
        // for (int i = 0; j < arr.length; i++){
        //     for (int j = 0; j < arr[i].length;j++){
        //         if (arr[i][j].equals(this.marker)){
        //             int aiIndex = i + j;
        //             int[] aiIndexarr = {
        //                 aiIndex
        //             };
                    
        //             this.placementArr = aiIndexarr;
        //         }
        //     }
        // }
        return false;
    }
}