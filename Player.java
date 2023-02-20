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
}