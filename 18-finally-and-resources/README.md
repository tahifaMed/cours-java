# 18 - Finally et Try-with-Resources

## Vue d'Ensemble

Le bloc `finally` garantit l'exécution de code de nettoyage même en cas d'exception. Try-with-resources (Java 7+) simplifie la gestion des ressources qui doivent être fermées (fichiers, connexions, etc.).

## Concepts Clés

1. **Bloc finally** : Exécuté toujours, même en cas d'exception
2. **Try-with-resources** : Fermeture automatique des ressources
3. **AutoCloseable** : Interface pour les ressources

## Exemples

### Exemple 1 : Bloc Finally

```java
public class BlocFinally {
    public static void main(String[] args) {
        try {
            int resultat = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception capturée");
        } finally {
            System.out.println("Ce code s'exécute toujours");
        }
    }
}
```

### Exemple 2 : Try-with-Resources

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        // Ressource fermée automatiquement
        try (BufferedReader br = new BufferedReader(new FileReader("fichier.txt"))) {
            String ligne = br.readLine();
            System.out.println(ligne);
        } catch (IOException e) {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
        // br est automatiquement fermé ici
    }
}
```

## Prérequis

- Sujet 16 : Les bases des exceptions

## Exercices

- **exercise-01** : Utiliser le bloc finally
- **exercise-02** : Utiliser try-with-resources
- **exercise-03** : Créer une classe AutoCloseable

## Ressources

- [Try-with-resources - Oracle](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html)
