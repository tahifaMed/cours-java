# 30 - NIO et NIO.2

## Vue d'Ensemble

NIO.2 (Java 7+) offre une nouvelle API plus moderne pour la manipulation de fichiers avec les classes Path et Files, remplaçant la classe File. Elle offre de meilleures performances et plus de fonctionnalités.

## Concepts Clés

1. **Path** : Représente un chemin de fichier/dossier
2. **Files** : Méthodes statiques pour les opérations sur fichiers
3. **Paths** : Factory pour créer des Path
4. **NIO.2** : Améliorations par rapport à java.io

## Exemples

### Exemple 1 : Path et Files

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIO2Exemple {
    public static void main(String[] args) throws Exception {
        Path chemin = Paths.get("fichier.txt");
        
        // Lire toutes les lignes
        List<String> lignes = Files.readAllLines(chemin);
        
        // Écrire
        Files.write(chemin, "Contenu".getBytes());
    }
}
```

## Prérequis

- Sujet 28 : Manipulation de fichiers

## Exercices

- **exercise-01** : Utiliser Path pour représenter des chemins
- **exercise-02** : Utiliser Files pour lire/écrire
- **exercise-03** : Parcourir des dossiers avec NIO.2

## Ressources

- [NIO.2 - Oracle](https://docs.oracle.com/javase/tutorial/essential/io/fileio.html)
