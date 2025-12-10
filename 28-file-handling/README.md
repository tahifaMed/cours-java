# 28 - Manipulation de Fichiers

## Vue d'Ensemble

La manipulation de fichiers permet de lire et écrire des données depuis/vers le système de fichiers. La classe File et les classes de l'API NIO.2 offrent des outils puissants pour cette tâche.

## Concepts Clés

1. **Classe File** : Représenter des fichiers et dossiers
2. **Lecture** : Lire le contenu d'un fichier
3. **Écriture** : Écrire dans un fichier
4. **Opérations** : Créer, supprimer, vérifier l'existence

## Exemples

### Exemple 1 : Classe File

```java
import java.io.File;

public class ManipulationFichier {
    public static void main(String[] args) {
        File fichier = new File("monfichier.txt");
        
        System.out.println("Existe : " + fichier.exists());
        System.out.println("Est un fichier : " + fichier.isFile());
        System.out.println("Taille : " + fichier.length());
    }
}
```

## Prérequis

- Sujet 16 : Les bases des exceptions

## Exercices

- **exercise-01** : Lire un fichier texte
- **exercise-02** : Écrire dans un fichier
- **exercise-03** : Manipuler des dossiers

## Ressources

- [I/O Fichiers - Oracle](https://docs.oracle.com/javase/tutorial/essential/io/fileio.html)
