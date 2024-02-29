// Classe représentant un joueur
public class Player {
    public CharacterClass characterClass;
    private int level;
    public int health;
    private boolean isAlive;
    private int healCount; // Nombre de fois où le joueur s'est soigné
    private int healAmount; // Quantité de soins effectués

    public Player(CharacterClass characterClass) {
        this.characterClass = characterClass;
        this.level = 1;
        this.health = 100;
        this.isAlive = true;
        this.healCount = 0;
        this.healAmount = 10;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void attack(Player target) {
        if (isAlive) {
            int damage = level;
            target.takeDamage(damage);
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isAlive = false;
        }
    }

    public void heal(Player target) {
        if (isAlive && target.isAlive() && target.health < 50 && healCount < 3) {
            target.receiveHealing(healAmount);
            healCount++;
        }
    }

    public void receiveHealing(int healing) {
        health += healing;
        if (health > 100) {
            health = 100;
        }
    }

    public void increaseLevel() {
        level++;
    }
}
