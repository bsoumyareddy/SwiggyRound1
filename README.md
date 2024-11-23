SwiggyTask - Magical Arena Game
This project simulates a turn-based magical battle arena where two players with randomly generated attributes (health, strength, and attack) fight until one player's health reaches 0.
Folder Structure:
SwiggyTask/
├── src/
│   ├── Main.java
│   ├── Player.java
│   ├── GameArena.java
│   ├── Test.java
├── class/
│   ├── (Compiled .class files will be stored here after compilation)
├── README.md
└── .git/  (Git folder automatically created during initialization)


How to Run
Prerequisites:
Java Development Kit (JDK) installed on your system (version 8+ recommended).
Command-line interface (e.g., Command Prompt, Terminal, or PowerShell).
Steps to Run:
1. Navigate to the SwiggyTask folder:
    cd SwiggyTask
2. Compile the Java files: Use the javac command to compile all .java files from the src/ folder and store the compiled .class files in the class/ directory:
    javac -d class src/*.java
3. Run the program: Run the Main class from the compiled files:
    java -cp class Main


Game Rules
1. Each player has the following attributes:
    Health: A randomly assigned value between 50 and 100.
    Strength: A randomly assigned value between 5 and 20.
    Attack: A randomly assigned value between 5 and 15.

2.Players take turns attacking and defending.
    The player with lower health starts the game.
    Each turn, the attacker rolls an attack die (value: 1–6), and the defender rolls a defense die (value: 1–6).
    Attack Damage = Attacker’s attack * Attack Die Roll.
    Defense Strength = Defender’s strength * Defense Die Roll.
    Net Damage = Maximum of 0 or (Attack Damage - Defense Strength).
3.The defender’s health is reduced by the net damage. The game continues until one player’s health reaches 0.


Sample Test Output
Game Start
Starting the game between Player A and Player B
Player A - Health: 57, Strength: 20, Attack: 11
Player B - Health: 74, Strength: 17, Attack: 15
The player with lower health starts: Player A

Turns
Player A attacks Player B
Player A rolls 3, Player B rolls 6
Net damage: 0. Player B's health: 74
Player A - Health: 57, Strength: 20, Attack: 11
Player B - Health: 74, Strength: 17, Attack: 15
......

Game End
Game over! Winner: Player A

