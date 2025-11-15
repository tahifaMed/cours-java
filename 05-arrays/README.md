# 05 - Tableaux

## Vue d'Ensemble

Les tableaux (arrays) permettent de stocker plusieurs valeurs du même type dans une structure de données indexée. Chaque élément est accessible via un index numérique commençant à 0.

## Concepts Clés

1. **Déclaration et initialisation** : Créer des tableaux
2. **Accès aux éléments** : Lire et modifier via l'index
3. **Longueur d'un tableau** : Propriété `length`
4. **Tableaux multidimensionnels** : Tableaux de tableaux
5. **Parcours de tableaux** : Boucles for et for-each

## Explications Détaillées

### Caractéristiques des Tableaux

- **Taille fixe** : Une fois créé, la taille ne peut pas changer
- **Type homogène** : Tous les éléments sont du même type
- **Indexation** : Les indices commencent à 0
- **Longueur** : Accessible via `nomTableau.length`

## Exemples

### Exemple 1 : Déclaration et Initialisation

```java
public class DeclarationTableaux {
    public static void main(String[] args) {
        // Méthode 1 : Déclaration puis initialisation
        int[] nombres;
        nombres = new int[5];  // Tableau de 5 entiers (valeurs par défaut : 0)
        
        // Méthode 2 : Déclaration et initialisation en une ligne
        int[] nombres2 = new int[5];
        
        // Méthode 3 : Initialisation avec valeurs
        int[] nombres3 = {10, 20, 30, 40, 50};
        
        // Tableaux de différents types
        String[] mots = {"Java", "Python", "C++"};
        double[] decimaux = new double[10];
        boolean[] booleens = {true, false, true};
    }
}
```

### Exemple 2 : Accès et Modification

```java
public class AccesTableaux {
    public static void main(String[] args) {
        int[] nombres = {10, 20, 30, 40, 50};
        
        // Accès en lecture
        System.out.println("Premier élément : " + nombres[0]);  // 10
        System.out.println("Dernier élément : " + nombres[4]);  // 50
        
        // Modification
        nombres[2] = 35;  // Change 30 en 35
        System.out.println("Élément modifié : " + nombres[2]);  // 35
        
        // Longueur du tableau
        System.out.println("Longueur : " + nombres.length);  // 5
        
        // Attention : index hors limites
        // System.out.println(nombres[10]);  // ArrayIndexOutOfBoundsException
    }
}
```

### Exemple 3 : Parcours avec Boucle for

```java
public class ParcoursFor {
    public static void main(String[] args) {
        int[] nombres = {10, 20, 30, 40, 50};
        
        // Parcours classique
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Index " + i + " : " + nombres[i]);
        }
        
        // Calcul de la somme
        int somme = 0;
        for (int i = 0; i < nombres.length; i++) {
            somme += nombres[i];
        }
        System.out.println("Somme : " + somme);  // 150
        
        // Recherche du maximum
        int max = nombres[0];
        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i] > max) {
                max = nombres[i];
            }
        }
        System.out.println("Maximum : " + max);  // 50
    }
}
```

### Exemple 4 : Boucle for-each

```java
public class ParcoursForEach {
    public static void main(String[] args) {
        int[] nombres = {10, 20, 30, 40, 50};
        
        // Syntaxe : for (type element : tableau)
        for (int nombre : nombres) {
            System.out.println(nombre);
        }
        
        // Avantage : Plus simple, pas besoin d'index
        // Inconvénient : Pas d'accès à l'index
        
        String[] mots = {"Java", "Python", "C++"};
        for (String mot : mots) {
            System.out.println("Langage : " + mot);
        }
    }
}
```

### Exemple 5 : Tableaux Multidimensionnels

```java
public class Tableaux2D {
    public static void main(String[] args) {
        // Tableau 2D : tableau de tableaux
        int[][] matrice = new int[3][4];  // 3 lignes, 4 colonnes
        
        // Initialisation avec valeurs
        int[][] matrice2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Accès aux éléments
        System.out.println(matrice2[0][0]);  // 1 (première ligne, première colonne)
        System.out.println(matrice2[2][2]);  // 9 (dernière ligne, dernière colonne)
        
        // Parcours d'un tableau 2D
        for (int i = 0; i < matrice2.length; i++) {
            for (int j = 0; j < matrice2[i].length; j++) {
                System.out.print(matrice2[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Parcours avec for-each
        for (int[] ligne : matrice2) {
            for (int valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }
}
```

### Exemple 6 : Opérations Utiles

```java
import java.util.Arrays;

public class OperationsTableaux {
    public static void main(String[] args) {
        int[] nombres = {50, 20, 40, 10, 30};
        
        // Tri
        Arrays.sort(nombres);
        System.out.println("Trié : " + Arrays.toString(nombres));
        // [10, 20, 30, 40, 50]
        
        // Recherche (tableau doit être trié)
        int index = Arrays.binarySearch(nombres, 30);
        System.out.println("Index de 30 : " + index);  // 2
        
        // Remplissage
        int[] tableau = new int[5];
        Arrays.fill(tableau, 100);
        System.out.println(Arrays.toString(tableau));
        // [100, 100, 100, 100, 100]
        
        // Copie
        int[] copie = Arrays.copyOf(nombres, nombres.length);
        
        // Comparaison
        int[] autre = {10, 20, 30, 40, 50};
        System.out.println("Égaux ? " + Arrays.equals(nombres, autre));  // true
    }
}
```

### Exemple 7 : Tableaux Irréguliers

```java
public class TableauxIrreguliers {
    public static void main(String[] args) {
        // Tableau 2D avec lignes de longueurs différentes
        int[][] triangle = new int[4][];
        
        triangle[0] = new int[1];  // 1 élément
        triangle[1] = new int[2];  // 2 éléments
        triangle[2] = new int[3];  // 3 éléments
        triangle[3] = new int[4];  // 4 éléments
        
        // Remplissage
        int valeur = 1;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = valeur++;
            }
        }
        
        // Affichage
        for (int[] ligne : triangle) {
            for (int val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```

## Prérequis

- Sujet 02 : Variables et types de données
- Sujet 04 : Structures de contrôle (boucles)

## Exercices

- **exercise-01** : Créer et initialiser des tableaux
- **exercise-02** : Parcourir et afficher des tableaux
- **exercise-03** : Manipuler les éléments d'un tableau (recherche, somme, moyenne)
- **exercise-04** : Travailler avec des tableaux multidimensionnels
- **exercise-05** : Utiliser les méthodes de la classe Arrays

## Ressources

- [Tableaux Java - Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
