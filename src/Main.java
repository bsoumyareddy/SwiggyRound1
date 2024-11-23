package src;
public class Main {
    public static void main(String[] args) {
        // Create two players with random attributes
        Player player1 = new Player("Player A");
        Player player2 = new Player("Player B");
        
        // Create the game arena
        GameArena gameArena = new GameArena(player1, player2);

        // Start the game
        gameArena.startGame();
    }
}
