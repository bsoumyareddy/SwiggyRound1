
// ---

// ### **4. Adding Unit Tests**

// Add a `test` package or inline testing. Example test cases:

// ```java
package src;

public class Test {
    public static void main(String[] args) {
        // Test Player attributes
        Player testPlayer = new Player("Test Player");
        System.out.println("Health: " + testPlayer.getHealth());
        System.out.println("Strength: " + testPlayer.getStrength());
        System.out.println("Attack: " + testPlayer.getAttack());

        // Test Game Flow
        Player p1 = new Player("Player A");
        Player p2 = new Player("Player B");
        GameArena arena = new GameArena(p1, p2);
        arena.startGame();
    }
}
