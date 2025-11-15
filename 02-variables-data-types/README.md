# 02 - Variables et Types de Données

## Vue d'Ensemble

Ce sujet couvre les variables en Java, les types de données primitifs et références, ainsi que les conversions de types (casting). Les variables sont des conteneurs qui stockent des valeurs que votre programme peut utiliser et modifier.

## Concepts Clés

1. **Variables** : Déclaration, initialisation, et utilisation
2. **Types primitifs** : Les 8 types primitifs de Java
3. **Types références** : Objets, tableaux, chaînes de caractères
4. **Cast (conversion de type)** : Conversion explicite entre types
5. **Portée (scope)** : Où une variable est accessible

## Explications Détaillées

### Déclaration et Initialisation

Une variable doit être déclarée avant utilisation. La syntaxe est :
```java
type nomDeLaVariable = valeur;
```

### Types Primitifs

Java a 8 types primitifs :

| Type | Taille | Valeur par défaut | Exemple |
|------|--------|-------------------|---------|
| `byte` | 8 bits | 0 | `byte age = 25;` |
| `short` | 16 bits | 0 | `short nombre = 1000;` |
| `int` | 32 bits | 0 | `int nombre = 1000000;` |
| `long` | 64 bits | 0L | `long grandNombre = 1000000000L;` |
| `float` | 32 bits | 0.0f | `float prix = 19.99f;` |
| `double` | 64 bits | 0.0d | `double pi = 3.14159;` |
| `char` | 16 bits | '\u0000' | `char lettre = 'A';` |
| `boolean` | 1 bit | false | `boolean actif = true;` |

### Types Références

Les types références pointent vers des objets en mémoire :
- `String` : Chaîne de caractères
- Tableaux
- Objets de classes personnalisées

### Conversion de Types (Casting)

**Cast explicite** : Conversion forcée entre types compatibles
```java
double d = 3.14;
int i = (int) d; // i = 3 (troncature)
```

**Cast implicite** : Conversion automatique (petit vers grand)
```java
int i = 100;
long l = i; // Conversion automatique
```

## Exemples

### Exemple 1 : Variables et Types Primitifs

```java
public class TypesPrimitifs {
    public static void main(String[] args) {
        // Entiers
        byte petitNombre = 127;
        short nombreCourt = 32767;
        int nombre = 2147483647;
        long grandNombre = 9223372036854775807L; // L pour long
        
        // Nombres décimaux
        float decimal = 3.14f; // f pour float
        double precision = 3.141592653589793;
        
        // Caractère
        char lettre = 'A';
        char unicode = '\u0041'; // 'A' en Unicode
        
        // Booléen
        boolean vrai = true;
        boolean faux = false;
        
        System.out.println("Int : " + nombre);
        System.out.println("Double : " + precision);
        System.out.println("Char : " + lettre);
        System.out.println("Booléen : " + vrai);
    }
}
```

### Exemple 2 : String (Type Référence)

```java
public class ChainesDeCaracteres {
    public static void main(String[] args) {
        String prenom = "Jean";
        String nom = "Dupont";
        
        // Concatenation
        String nomComplet = prenom + " " + nom;
        System.out.println(nomComplet); // "Jean Dupont"
        
        // Méthodes utiles
        int longueur = nomComplet.length(); // 10
        String majuscules = nomComplet.toUpperCase(); // "JEAN DUPONT"
        boolean commencePar = nomComplet.startsWith("Jean"); // true
    }
}
```

### Exemple 3 : Conversion de Types (Casting)

```java
public class Conversions {
    public static void main(String[] args) {
        // Cast implicite (petit vers grand)
        int entier = 100;
        long entierLong = entier; // OK automatique
        
        // Cast explicite (grand vers petit)
        double decimal = 3.14159;
        int entier2 = (int) decimal; // Troncature à 3
        
        // Entre types différents
        char caractere = 'A';
        int codeAscii = caractere; // 65 (implicite)
        char nouveau = (char) codeAscii; // 'A' (explicite)
        
        // Attention aux pertes de précision
        long grand = 3000000000L;
        int petit = (int) grand; // Perte de données !
        System.out.println(petit); // Résultat incorrect
    }
}
```

### Exemple 4 : Portée des Variables

```java
public class Portee {
    static int variableGlobale = 10; // Variable de classe
    
    public static void main(String[] args) {
        int variableLocale = 20; // Variable locale à main
        
        {
            int variableBloc = 30; // Variable de bloc
            System.out.println(variableBloc); // OK
            System.out.println(variableLocale); // OK
            System.out.println(variableGlobale); // OK
        }
        
        // System.out.println(variableBloc); // ERREUR : hors portée
        System.out.println(variableLocale); // OK
        System.out.println(variableGlobale); // OK
    }
}
```

### Exemple 5 : Variables Finales (Constantes)

```java
public class Constantes {
    public static void main(String[] args) {
        // Constante locale
        final int TAILLE_MAX = 100;
        
        // Constante de classe (convention : MAJUSCULES)
        final double PI = 3.14159;
        
        // TAILLE_MAX = 200; // ERREUR : ne peut pas être modifiée
        
        System.out.println("Taille maximale : " + TAILLE_MAX);
        System.out.println("Valeur de PI : " + PI);
    }
}
```

## Bonnes Pratiques

1. **Nommage** : Utilisez des noms descriptifs (`age` plutôt que `a`)
2. **Convention** : camelCase pour les variables (`nombreUtilisateurs`)
3. **Constantes** : MAJUSCULES avec underscores (`TAILLE_MAX`)
4. **Initialisation** : Initialisez toujours vos variables
5. **Types appropriés** : Utilisez le type le plus petit adapté à vos besoins

## Prérequis

- Sujet 01 : Les bases de Java (connaissance de la structure d'un programme)

## Exercices

- **exercise-01** : Déclarer et initialiser différents types de variables
- **exercise-02** : Effectuer des conversions de types (casting)
- **exercise-03** : Manipuler des chaînes de caractères
- **exercise-04** : Utiliser des constantes dans un programme

## Ressources

- [Types primitifs Java - Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
