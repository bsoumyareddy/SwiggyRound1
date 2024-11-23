package src;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name) {
        this.name = name;
        this.health = (int)(Math.random() * 51) + 50;  // Random health between 50 and 100
        this.strength = (int)(Math.random() * 16) + 5;  // Random strength between 5 and 20
        this.attack = (int)(Math.random() * 11) + 5;  // Random attack between 5 and 15
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void applyDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int rollAttackDie() {
        return (int)(Math.random() * 6) + 1;  // Rolling a 6-sided die (1-6)
    }

    public int rollDefendDie() {
        return (int)(Math.random() * 6) + 1;  // Rolling a 6-sided die (1-6)
    }

    public void printAttributes() {
        System.out.println(name + " - Health: " + health + ", Strength: " + strength + ", Attack: " + attack);
    }
}
