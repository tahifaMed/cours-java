# 07 - Méthodes

## Vue d'Ensemble

Les méthodes définissent le comportement des objets. Elles permettent de structurer le code en blocs réutilisables, d'accepter des paramètres, et de retourner des valeurs. Java supporte la surcharge de méthodes (plusieurs méthodes avec le même nom mais des signatures différentes).

## Concepts Clés

1. **Définition de méthode** : Syntaxe et structure
2. **Paramètres** : Passage d'arguments
3. **Valeur de retour** : Types de retour, void
4. **Surcharge (overloading)** : Plusieurs méthodes avec le même nom
5. **Paramètres variables (varargs)** : Nombre variable d'arguments
6. **Méthodes statiques** : Méthodes de classe

## Exemples

### Exemple 1 : Méthode Simple

```java
public class MethodesSimples {
    // Méthode sans paramètres ni retour
    public void saluer() {
        System.out.println("Bonjour !");
    }
    
    // Méthode avec paramètres
    public void saluerPersonne(String nom) {
        System.out.println("Bonjour " + nom + " !");
    }
    
    // Méthode avec valeur de retour
    public int calculerCarre(int nombre) {
        return nombre * nombre;
    }
    
    public static void main(String[] args) {
        MethodesSimples obj = new MethodesSimples();
        obj.saluer();
        obj.saluerPersonne("Alice");
        int resultat = obj.calculerCarre(5);
        System.out.println("5 au carré = " + resultat);
    }
}
```

### Exemple 2 : Surcharge de Méthodes

```java
public class Surcharge {
    // Plusieurs méthodes avec le même nom mais signatures différentes
    
    public int additionner(int a, int b) {
        return a + b;
    }
    
    public double additionner(double a, double b) {
        return a + b;
    }
    
    public int additionner(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Surcharge calc = new Surcharge();
        System.out.println(calc.additionner(5, 3));        // 8 (int)
        System.out.println(calc.additionner(5.5, 3.2));    // 8.7 (double)
        System.out.println(calc.additionner(1, 2, 3));     // 6 (3 paramètres)
    }
}
```

### Exemple 3 : Paramètres Variables (Varargs)

```java
public class Varargs {
    // Le paramètre '...' accepte un nombre variable d'arguments
    public int somme(int... nombres) {
        int total = 0;
        for (int n : nombres) {
            total += n;
        }
        return total;
    }
    
    public void afficherMessages(String... messages) {
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
    
    public static void main(String[] args) {
        Varargs v = new Varargs();
        System.out.println(v.somme(1, 2, 3));           // 6
        System.out.println(v.somme(10, 20, 30, 40));    // 100
        v.afficherMessages("Un", "Deux", "Trois");
    }
}
```

### Exemple 4 : Passage par Valeur vs Référence

```java
public class PassageParametres {
    // Types primitifs : passage par valeur (copie)
    public void modifierPrimitif(int x) {
        x = 100;  // Ne modifie que la copie locale
    }
    
    // Objets : passage par référence (copie de la référence)
    public void modifierObjet(int[] tableau) {
        tableau[0] = 100;  // Modifie l'objet original
    }
    
    public static void main(String[] args) {
        PassageParametres p = new PassageParametres();
        
        int nombre = 5;
        p.modifierPrimitif(nombre);
        System.out.println(nombre);  // Toujours 5
        
        int[] arr = {1, 2, 3};
        p.modifierObjet(arr);
        System.out.println(arr[0]);  // 100 (modifié)
    }
}
```

### Exemple 5 : Méthodes Statiques

```java
public class MethodesStatiques {
    // Méthode statique : appelée sur la classe, pas sur un objet
    public static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static double calculerAireCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }
    
    // Méthode d'instance
    public void methodeInstance() {
        System.out.println("Méthode d'instance");
    }
    
    public static void main(String[] args) {
        // Appel direct sans objet
        int max = MethodesStatiques.maximum(10, 5);
        double aire = MethodesStatiques.calculerAireCercle(3.0);
        
        System.out.println("Maximum : " + max);
        System.out.println("Aire : " + aire);
        
        // Méthode d'instance nécessite un objet
        MethodesStatiques obj = new MethodesStatiques();
        obj.methodeInstance();
    }
}
```

## Prérequis

- Sujet 06 : Classes et objets

## Exercices

- **exercise-01** : Créer des méthodes avec paramètres et valeurs de retour
- **exercise-02** : Implémenter la surcharge de méthodes
- **exercise-03** : Utiliser les paramètres variables (varargs)
- **exercise-04** : Distinguer méthodes statiques et d'instance
- **exercise-05** : Comprendre le passage de paramètres

## Ressources

- [Méthodes Java - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
