import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args)  {
        // Création des joueurs
        Player mage = new Player(CharacterClass.GANDALF);
        Player barbarian = new Player(CharacterClass.KRATOS);
        Player rogue = new Player(CharacterClass.BASSEM);
        Player warrior = new Player(CharacterClass.EDGAR);

        // Ajout des joueurs à une liste
        List<Player> players = new ArrayList<>();
        players.add(mage);
        players.add(barbarian);
        players.add(rogue);
        players.add(warrior);

        // Simulation de la partie
        while (players.size() > 1) {
            // Choix aléatoire d'un attaquant et d'une cible
            Player attacker = players.get((int) (Math.random() * players.size()));

            // Vérification si l'attaquant est vivant
            if (attacker.isAlive()) {
                // Si la vie de l'attaquant est inférieure à 50, il se soigne
                if (attacker.health < 50) {
                    attacker.heal(attacker);
                    System.out.println(attacker.characterClass + " heals themself");
                } else {
                    Player target = players.get((int) (Math.random() * players.size()));

                    // Vérification si l'attaquant et la cible sont différents et vivants
                    while (attacker == target || !target.isAlive()) {
                        target = players.get((int) (Math.random() * players.size()));
                    }

                    attacker.attack(target);
                    System.out.println(attacker.characterClass + " attacks " + target.characterClass);

                if (!target.isAlive()) {
                    players.remove(target);
                    attacker.increaseLevel();
                    System.out.println(target.characterClass + " is killed by " + attacker.characterClass);
                    System.out.println(attacker.characterClass + " gain a level.");
                    }
                }
            }
        }
    }
}