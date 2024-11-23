package src;
public class GameArena {
    private Player player1;
    private Player player2;

    public GameArena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Starting the game between " + player1.getName() + " and " + player2.getName());

        // Print initial stats
        player1.printAttributes();
        player2.printAttributes();
        
        // Determine who starts the game based on health
        Player attacker = (player1.getHealth() <= player2.getHealth()) ? player1 : player2;
        Player defender = (attacker == player1) ? player2 : player1;
        
        System.out.println("The player with lower health starts: " + attacker.getName());

        // Game loop continues as long as neither player has died
        while (!isGameOver()) {
            simulateTurn(attacker, defender);

            // Switch turns after each attack
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Once the game ends, print the winner
        System.out.println("Game over! Winner: " + getWinner().getName());
    }

    private void simulateTurn(Player attacker, Player defender) {
        System.out.println("\n" + attacker.getName() + " attacks " + defender.getName());
        
        // Players roll their dice
        int attackRoll = attacker.rollAttackDie();
        int defendRoll = defender.rollDefendDie();

        // Calculate damage
        int attackDamage = attacker.getAttack() * attackRoll;
        int defense = defender.getStrength() * defendRoll;

        // Calculate net damage and apply to defender
        int netDamage = Math.max(0, attackDamage - defense);
        defender.applyDamage(netDamage);

        // Print the details of the turn
        System.out.println(attacker.getName() + " rolls " + attackRoll + ", " + defender.getName() + " rolls " + defendRoll);
        System.out.println("Net damage: " + netDamage + ". " + defender.getName() + "'s health: " + defender.getHealth());

        // Print player stats after the turn
        attacker.printAttributes();
        defender.printAttributes();
    }

    private boolean isGameOver() {
        return !player1.isAlive() || !player2.isAlive();
    }

    private Player getWinner() {
        return player1.isAlive() ? player1 : player2;
    }
}
