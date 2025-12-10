# 29 - Flux d'Entrée/Sortie

## Vue d'Ensemble

Les streams I/O permettent de lire et écrire des données de manière séquentielle. Ils sont organisés en hiérarchie : InputStream/OutputStream pour les bytes, Reader/Writer pour les caractères.

## Concepts Clés

1. **InputStream/OutputStream** : Flux de bytes
2. **Reader/Writer** : Flux de caractères
3. **Buffered streams** : Amélioration des performances
4. **Try-with-resources** : Fermeture automatique

## Exemples

### Exemple 1 : Lecture avec BufferedReader

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("fichier.txt"))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Prérequis

- Sujet 18 : Finally et Try-with-resources

## Exercices

- **exercise-01** : Lire un fichier avec FileReader
- **exercise-02** : Écrire dans un fichier avec FileWriter
- **exercise-03** : Utiliser BufferedReader/BufferedWriter

## Ressources

- [I/O Streams - Oracle](https://docs.oracle.com/javase/tutorial/essential/io/streams.html)
