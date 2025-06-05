public class GamePlayer {
    public String name;   // #1

    public static void main(String[] args) {
        GamePlayer[] players = new GamePlayer[3];   // #2
        players[0] = new GamePlayer("Alice");
        players[1] = new GamePlayer("Bob");
        players[2] = new GamePlayer("Chris");

        for (GamePlayer player : players) {   // #3
            System.out.println(player.name);
        }
    }

    public GamePlayer(String name) {
        this.name = name;   // #4 修正
    }
}
