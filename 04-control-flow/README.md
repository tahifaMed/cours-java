# 04 - Structures de Contrôle

## Vue d'Ensemble

Les structures de contrôle permettent de modifier le flux d'exécution de votre programme : prendre des décisions avec `if/else`, choisir entre plusieurs options avec `switch`, et répéter des actions avec des boucles (`for`, `while`, `do-while`).

## Concepts Clés

1. **Conditionnelles** : `if`, `if-else`, `if-else-if`, `switch`
2. **Boucles** : `for`, `while`, `do-while`
3. **Contrôle de boucle** : `break`, `continue`
4. **Boucle for-each** : Parcourir des collections

## Explications Détaillées

### Structures Conditionnelles

Permettent d'exécuter du code uniquement si une condition est vraie.

### Boucles

Répètent une séquence d'instructions un certain nombre de fois ou jusqu'à ce qu'une condition soit remplie.

## Exemples

### Exemple 1 : if-else

```java
public class Conditionnelles {
    public static void main(String[] args) {
        int age = 20;
        
        if (age >= 18) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
        
        // if-else-if
        int note = 85;
        if (note >= 90) {
            System.out.println("Excellent !");
        } else if (note >= 75) {
            System.out.println("Bien !");
        } else if (note >= 60) {
            System.out.println("Satisfaisant");
        } else {
            System.out.println("À améliorer");
        }
    }
}
```

### Exemple 2 : switch

```java
public class Switch {
    public static void main(String[] args) {
        int jour = 3;
        
        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            default:
                System.out.println("Jour invalide");
        }
        
        // Switch avec String (Java 7+)
        String saison = "été";
        switch (saison) {
            case "printemps":
                System.out.println("Fleurs et chaleur");
                break;
            case "été":
                System.out.println("Soleil et plage");
                break;
            case "automne":
                System.out.println("Feuilles colorées");
                break;
            case "hiver":
                System.out.println("Neige et froid");
                break;
        }
    }
}
```

### Exemple 3 : Boucle for

```java
public class BoucleFor {
    public static void main(String[] args) {
        // Boucle classique
        for (int i = 0; i < 5; i++) {
            System.out.println("Itération " + i);
        }
        
        // Boucle avec pas différent
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);  // 0, 2, 4, 6, 8
        }
        
        // Boucle décroissante
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
```

### Exemple 4 : Boucle while

```java
public class BoucleWhile {
    public static void main(String[] args) {
        int compteur = 0;
        
        while (compteur < 5) {
            System.out.println("Compteur : " + compteur);
            compteur++;
        }
        
        // Attention : boucle infinie si condition toujours vraie
        // while (true) { ... } // Boucle infinie
    }
}
```

### Exemple 5 : Boucle do-while

```java
public class BoucleDoWhile {
    public static void main(String[] args) {
        int nombre = 0;
        
        // do-while s'exécute au moins une fois
        do {
            System.out.println("Nombre : " + nombre);
            nombre++;
        } while (nombre < 5);
        
        // Même si la condition est fausse au départ
        int x = 10;
        do {
            System.out.println("Ceci s'affiche une fois");
        } while (x < 5);  // Condition fausse, mais exécuté une fois
    }
}
```

### Exemple 6 : break et continue

```java
public class BreakContinue {
    public static void main(String[] args) {
        // break : sort de la boucle
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // Sort de la boucle quand i = 5
            }
            System.out.println(i);  // Affiche 0 à 4
        }
        
        // continue : passe à l'itération suivante
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // Passe les nombres pairs
            }
            System.out.println(i);  // Affiche 1, 3, 5, 7, 9
        }
    }
}
```

### Exemple 7 : Boucles imbriquées

```java
public class BouclesImbriquees {
    public static void main(String[] args) {
        // Table de multiplication
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        // Affiche :
        // 1    2    3
        // 2    4    6
        // 3    6    9
    }
}
```

## Prérequis

- Sujet 02 : Variables et types de données
- Sujet 03 : Opérateurs

## Exercices

- **exercise-01** : Utiliser if-else pour prendre des décisions
- **exercise-02** : Implémenter une logique avec switch
- **exercise-03** : Utiliser la boucle for pour répéter des actions
- **exercise-04** : Utiliser while et do-while
- **exercise-05** : Contrôler le flux avec break et continue
- **exercise-06** : Créer des boucles imbriquées

## Ressources

- [Contrôle de flux - Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
