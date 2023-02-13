public class Player {
    String name;
    String marker;
    int[] placementArr;

    public Player(String name){
        this.name = name;
        this.marker = "" + name.charAt(0);
    }
}