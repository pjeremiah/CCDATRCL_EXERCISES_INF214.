public class Enemy {
    // Enemy attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("Fear me player for my name is " + name + ", I deal " + damage + " damage!, I have " + health + " health! and I have " + armor + " armor!");
    }
    
}
