# 16 - Les Bases des Exceptions

## Vue d'Ensemble

Les exceptions permettent de gérer les erreurs et situations exceptionnelles de manière élégante. Java utilise un mécanisme de try-catch pour capturer et traiter les exceptions.

## Concepts Clés

1. **try-catch** : Blocs pour capturer les exceptions
2. **Hiérarchie des exceptions** : Throwable, Exception, RuntimeException
3. **Types d'exceptions** : Checked vs Unchecked
4. **Propagation** : Comment les exceptions remontent dans la pile

## Exemples

### Exemple 1 : Try-Catch de Base

```java
public class GestionExceptions {
    public static void main(String[] args) {
        try {
            int resultat = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro");
        }
        
        try {
            String str = null;
            int longueur = str.length();  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erreur : Chaîne nulle");
        }
    }
}
```

### Exemple 2 : Multiples Catch

```java
public class MultiplesCatch {
    public static void main(String[] args) {
        try {
            int[] tableau = new int[5];
            tableau[10] = 50;  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index hors limites");
        } catch (Exception e) {
            System.out.println("Autre exception : " + e.getMessage());
        }
    }
}
```

## Prérequis

- Sujet 04 : Structures de contrôle

## Exercices

- **exercise-01** : Utiliser try-catch pour gérer les exceptions
- **exercise-02** : Gérer différents types d'exceptions
- **exercise-03** : Comprendre la hiérarchie des exceptions

## Ressources

- [Gestion des exceptions - Oracle](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)
