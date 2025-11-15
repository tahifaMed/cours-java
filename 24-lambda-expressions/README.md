# 24 - Expressions Lambda

## Vue d'Ensemble

Les expressions lambda introduisent la programmation fonctionnelle en Java. Elles permettent de passer du code comme une valeur et simplifient grandement l'utilisation des interfaces fonctionnelles.

## Concepts Clés

1. **Syntaxe lambda** : (paramètres) -> expression
2. **Interfaces fonctionnelles** : Interfaces avec une seule méthode abstraite
3. **Méthodes de référence** : :: pour référencer des méthodes
4. **Fonctions prédéfinies** : Predicate, Function, Consumer, Supplier

## Exemples

### Exemple 1 : Lambda Simple

```java
import java.util.function.Predicate;

public class LambdaSimple {
    public static void main(String[] args) {
        // Lambda pour vérifier si un nombre est pair
        Predicate<Integer> estPair = (n) -> n % 2 == 0;
        
        System.out.println(estPair.test(4));  // true
        System.out.println(estPair.test(5));  // false
    }
}
```

### Exemple 2 : Avec Collections

```java
import java.util.Arrays;
import java.util.List;

public class LambdaCollections {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript");
        
        // Lambda pour filtrer
        mots.stream()
            .filter(mot -> mot.length() > 4)
            .forEach(mot -> System.out.println(mot));
    }
}
```

## Prérequis

- Sujet 10 : Interfaces
- Sujet 19 : Listes

## Exercices

- **exercise-01** : Créer des expressions lambda simples
- **exercise-02** : Utiliser des interfaces fonctionnelles
- **exercise-03** : Utiliser les méthodes de référence

## Ressources

- [Lambda Expressions - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
