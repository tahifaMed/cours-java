# 15 - Types Énumérés (Enums)

## Vue d'Ensemble

Les enums permettent de définir un ensemble fixe de constantes nommées. Ils sont plus sûrs et plus expressifs que les constantes entières, et peuvent contenir des méthodes et des attributs.

## Concepts Clés

1. **Déclaration enum** : Syntaxe de base
2. **Méthodes dans les enums** : Ajouter du comportement
3. **Constructeurs** : Initialiser les valeurs enum
4. **EnumSet et EnumMap** : Collections spécialisées

## Exemples

### Exemple 1 : Enum Simple

```java
public enum JourSemaine {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
}

public class UtilisationEnum {
    public static void main(String[] args) {
        JourSemaine aujourdhui = JourSemaine.LUNDI;
        System.out.println(aujourdhui);  // LUNDI
        
        // Parcours
        for (JourSemaine jour : JourSemaine.values()) {
            System.out.println(jour);
        }
    }
}
```

### Exemple 2 : Enum avec Méthodes

```java
public enum StatusCommande {
    EN_ATTENTE("En attente de traitement"),
    EN_COURS("En cours de préparation"),
    EXPEDIEE("Expédiée"),
    LIVREE("Livrée");
    
    private String description;
    
    StatusCommande(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
```

## Prérequis

- Sujet 02 : Variables et types de données
- Sujet 06 : Classes et objets

## Exercices

- **exercise-01** : Créer un enum simple
- **exercise-02** : Ajouter des méthodes à un enum
- **exercise-03** : Utiliser EnumSet et EnumMap

## Ressources

- [Enums Java - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)
