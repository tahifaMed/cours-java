# 12 - Packages

## Vue d'Ensemble

Les packages organisent les classes Java en espaces de noms, évitent les conflits de noms, et permettent de grouper des classes liées. Ils correspondent généralement à la structure des dossiers dans le système de fichiers.

## Concepts Clés

1. **Déclaration package** : `package nom.du.package;`
2. **Import** : `import nom.du.package.Classe;`
3. **Import static** : Importer des membres statiques
4. **Package par défaut** : Classes sans déclaration package
5. **Structure de dossiers** : Correspondance avec la structure des packages

## Exemples

### Exemple 1 : Création et Utilisation d'un Package

```java
// Fichier : com/entreprise/utils/Calculatrice.java
package com.entreprise.utils;

public class Calculatrice {
    public static int additionner(int a, int b) {
        return a + b;
    }
}

// Fichier : com/entreprise/Test.java
package com.entreprise;

import com.entreprise.utils.Calculatrice;

public class Test {
    public static void main(String[] args) {
        int resultat = Calculatrice.additionner(5, 3);
        System.out.println("Résultat : " + resultat);
    }
}
```

### Exemple 2 : Imports

```java
package com.exemple;

// Import d'une classe spécifique
import java.util.ArrayList;
import java.util.List;

// Import de toutes les classes d'un package
import java.util.*;

// Import static
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ExempleImports {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        
        // Utilisation de PI et pow sans préfixe Math.
        double aire = PI * pow(5, 2);
    }
}
```

### Exemple 3 : Packages et Visibilité

```java
// Package : com.exemple.model
package com.exemple.model;

public class Produit {
    public String nom;           // Accessible partout
    protected double prix;       // Accessible dans le package et sous-classes
    String description;          // Accessible uniquement dans le package
    private int stock;           // Accessible uniquement dans la classe
}
```

## Prérequis

- Sujet 06 : Classes et objets

## Exercices

- **exercise-01** : Créer et organiser des classes en packages
- **exercise-02** : Utiliser les imports pour accéder aux classes
- **exercise-03** : Utiliser les imports static

## Ressources

- [Packages Java - Oracle](https://docs.oracle.com/javase/tutorial/java/package/index.html)
