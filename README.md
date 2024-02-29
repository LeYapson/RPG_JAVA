# Auteurs

- Théau YAPI
- Lukas TABOGA


# Modélisation d'un RPG simple en Java

Ce projet consiste à développer un jeu de rôle (RPG) simple en Java.

## Description du jeu

Le jeu comporte une liste de joueurs, chacun étant défini par un type de classe : Mage, Barbare, Voleur ou Guerrier.

### Contraintes

- Tous les personnages ont initialement 100 points de vie et sont de niveau 1.
- Un personnage peut être vivant ou mort.
- Chaque ennemi tué augmente le niveau de 1.
- Les personnages vivants peuvent attaquer les autres :
  - Les dommages infligés sont soustraits de leurs points de vie.
  - Si les dommages dépassent les points de vie, le personnage meurt (ses points de vie descendent à 0).
- Les personnages vivants peuvent se soigner :
  - Les morts ne peuvent pas être soignés.
  - La vie ne peut pas dépasser 100 points.
- La force des dommages et des soins est égale au niveau du personnage.
- Le nom des méthodes et des classes doit être en anglais.
- Vous devez créer une classe `Main` contenant une méthode `main` qui simule une partie du jeu. Assurez-vous d'ajouter des commentaires explicatifs.

---

N'hésitez pas à explorer le code pour comprendre la modélisation du jeu et son fonctionnement. Amusez-vous bien à coder !
