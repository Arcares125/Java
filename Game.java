public class Game {
    String gameName;
    String quality;
    Integer price;

    Game(String name, String qual, Integer pri){
        this.gameName = name;
        this.quality = qual;
        this.price = pri;
    }
    
    public static void main(String[] args){
        FPS Game1 = new FPS();
        System.out.println(Game1.gameName);
    }

}
