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

        // for(boolean bool : occuiped){
        //     if(bool){return false;}            
        //     if(!occuiped[0]){
        //         arr[0][0] = this.get("MKR");
        //     }
        //     else{
        //         if(!occuiped[1]){
        //             arr[0][2] = this.get("MKR");
        //         }
        //         else{
        //             if(!occuiped[2]){
        //                 arr[0][4] = this.get("MKR");
        //             }
        //             else{
        //                 if(!occuiped[3]){
        //                     arr[1][0] = this.get("MKR");
        //                 }
        //                 else{
        //                     if(!occuiped[4]){
        //                         arr[1][2] = this.get("MKR");
        //                     }
        //                     else{
        //                         if(!occuiped[5]){
        //                             arr[0][2] = this.get("MKR");
        //                         }
        //                     }
        //                 }
        //             }
        //         }

        //     }
        // }

        //refactor 
        for(int opStatus = 0; opStatus <= 8;opStatus++){
            if(!occuiped[opStatus]){
                int indexConverted = opStatus + 1;

                switch(indexConverted){
                    case 1:
                        int[] posArr1 = returnCoordinates(1);
                        int posX1 = posArr1[0];
                        int posY1 = posArr1[1];
                        if(arr[posX1][posY1] == " "){
                            arr[posX1][posY1] = this.get("MKR");
                            opStatus = 10000;
                        }
                        break;
                    case 2:
                        int[] posArr2 = returnCoordinates(2);
                        int posX2 = posArr2[0];
                        int posY2 = posArr2[1];
                        if(arr[posX2][posY2] == " "){
                            arr[posX2][posY2] = this.get("MKR");
                            opStatus = 10000;
                        }                    
                        break;
                    case 3:
                        int[] posArr3 = returnCoordinates(3);
                        int posX3 = posArr3[0];
                        int posY3 = posArr3[1];
                        if(arr[posX3][posY3] == " "){
                            arr[posX3][posY3] = this.get("MKR");
                            opStatus = 10000;
                        }                    
                        break;
                    case 4:
                        int[] posArr4 = returnCoordinates(4);
                        int posX4 = posArr4[0];
                        int posY4 = posArr4[1];
                        if(arr[posX4][posY4] == " "){
                            arr[posX4][posY4] = this.get("MKR");
                            opStatus = 10000;
                        }                    
                        break;
                    case 5:
                        int[] posArr5 = returnCoordinates(5);
                        int posX5 = posArr5[0];
                        int posY5 = posArr5[1];
                        if(arr[posX5][posY5] == " "){
                            arr[posX5][posY5] = this.get("MKR");
                            opStatus = 10000;
                        }    
                        break;
                    case 6:
                        int[] posArr6 = returnCoordinates(6);
                        int posX6 = posArr6[0];
                        int posY6 = posArr6[1];
                        if(arr[posX6][posY6] == " "){
                            arr[posX6][posY6] = this.get("MKR");
                            opStatus = 10000;
                        }    
                        break;
                    case 7:
                        int[] posArr7 = returnCoordinates(7);
                        int posX7 = posArr7[0];
                        int posY7 = posArr7[1];
                        if(arr[posX7][posY7] == " "){
                            arr[posX7][posY7] = this.get("MKR");
                            opStatus = 10000;
                        }    
                        break;
                    case 8:
                        int[] posArr8 = returnCoordinates(8);
                        int posX8 = posArr8[0];
                        int posY8 = posArr8[1];
                        if(arr[posX8][posY8] == " "){
                            arr[posX8][posY8] = this.get("MKR");
                            opStatus = 10000;
                        }    
                        break;
                    case 9:
                        int[] posArr9 = returnCoordinates(9);
                        int posX9 = posArr9[0];
                        int posY9 = posArr9[1];
                        if(arr[posX9][posY9] == " "){
                            arr[posX9][posY9] = this.get("MKR");
                            opStatus = 10000;
                        }    
                        break;
                }
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
    public int[] returnCoordinates(int x){                
        x = x - 1;
        int[][] posArr = {
            {0,0},{0,2},{0,4},
            {2,0},{2,2},{2,4},
            {4,0},{4,2},{4,4},
        };
        return posArr[x];
    }
}