# 01 - Les Bases de Java

## Vue d'Ensemble

Ce sujet introduit les concepts fondamentaux de Java : comment écrire votre premier programme, la structure de base d'une classe Java, les commentaires, et comment compiler et exécuter un programme.

Java est un langage de programmation orienté objet qui nécessite que tout code soit écrit dans une classe. Même le plus simple des programmes doit avoir une structure de classe.

## Concepts Clés

1. **Structure d'un programme Java** : Une classe publique avec une méthode `main`
2. **Compilation** : Transformation du code source (.java) en bytecode (.class)
3. **Exécution** : L'interpréteur Java (JVM) exécute le bytecode
4. **Commentaires** : Comment documenter votre code

## Explications Détaillées

### Structure d'un Programme Java

Tout programme Java commence par une classe. Le point d'entrée est la méthode `main` qui doit être déclarée ainsi :

```java
public static void main(String[] args)
```

- `public` : Accessible depuis l'extérieur
- `static` : Peut être appelée sans créer d'instance de la classe
- `void` : Ne retourne aucune valeur
- `String[] args` : Paramètres en ligne de commande

### La Méthode main

La méthode `main` est le point d'entrée de toute application Java. Quand vous exécutez un programme, la JVM cherche cette méthode pour commencer l'exécution.

### Commentaires en Java

Java supporte trois types de commentaires :

1. **Commentaire sur une ligne** : `// Ceci est un commentaire`
2. **Commentaire multi-lignes** : `/* Ceci est un commentaire sur plusieurs lignes */`
3. **JavaDoc** : `/** Commentaire de documentation */` (voir sujet 38)

## Exemples

### Exemple 1 : Hello World (Programme Minimal)

```java
public class BonjourMonde {
    public static void main(String[] args) {
        System.out.println("Bonjour, Monde !");
    }
}
```

**Explication** :
- `public class BonjourMonde` : Définit une classe publique nommée `BonjourMonde`
- `System.out.println()` : Affiche du texte dans la console et ajoute un retour à la ligne
- Le nom du fichier doit être `BonjourMonde.java` (même nom que la classe)

### Exemple 2 : Affichage Multiple

```java
public class Affichage {
    public static void main(String[] args) {
        System.out.print("Première ligne ");
        System.out.print("sur la même ligne");
        System.out.println(); // Retour à la ligne
        System.out.println("Deuxième ligne");
    }
}
```

**Explication** :
- `System.out.print()` : Affiche sans retour à la ligne
- `System.out.println()` sans paramètre : Affiche juste un retour à la ligne

**Sortie** :
```
Première ligne sur la même ligne
Deuxième ligne
```

### Exemple 3 : Utilisation des Arguments

```java
public class Arguments {
    public static void main(String[] args) {
        System.out.println("Nombre d'arguments : " + args.length);
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " : " + args[i]);
        }
    }
}
```

**Explication** :
- `args.length` : Nombre d'arguments passés au programme
- `args[i]` : Accède à l'argument à l'index `i`
- Exécution : `java Arguments un deux trois`

**Sortie** :
```
Nombre d'arguments : 3
Argument 0 : un
Argument 1 : deux
Argument 2 : trois
```

### Exemple 4 : Commentaires

```java
public class ExempleCommentaires {
    // Ceci est un commentaire sur une ligne
    
    /* Ceci est un commentaire
       sur plusieurs lignes */
    
    /**
     * Ceci est un commentaire JavaDoc
     * Utilisé pour la documentation
     */
    public static void main(String[] args) {
        System.out.println("Hello"); // Commentaire en fin de ligne
    }
}
```

## Compilation et Exécution

### Compilation
```bash
javac NomDuFichier.java
```

Cela crée un fichier `NomDuFichier.class` (bytecode).

### Exécution
```bash
java NomDuFichier
```

**Important** : Utilisez `java` sans l'extension `.class` pour exécuter.

### Erreurs Courantes

1. **Nom de fichier ne correspond pas à la classe** :
   - Erreur : `public class MaClasse` dans un fichier `AutreNom.java`
   - Solution : Le fichier doit avoir le même nom que la classe publique

2. **Méthode main manquante ou mal écrite** :
   - Erreur : `Error: Main method not found in class`
   - Solution : Vérifiez la signature exacte de `main`

## Prérequis

Aucun prérequis. C'est le premier sujet du cours !

## Exercices

- **exercise-01** : Écrire votre premier programme Hello World
- **exercise-02** : Créer un programme qui affiche plusieurs messages
- **exercise-03** : Manipuler les arguments de la ligne de commande

## Ressources

- [Documentation Oracle Java](https://docs.oracle.com/javase/tutorial/getStarted/index.html)
- [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se11/html/index.html)
