# 10 - Interfaces

## Vue d'Ensemble

Une interface définit un contrat : elle déclare quelles méthodes une classe doit implémenter, sans fournir l'implémentation. Une classe peut implémenter plusieurs interfaces, permettant une forme de polymorphisme et de découplage.

## Concepts Clés

1. **Déclaration interface** : Mot-clé `interface`
2. **Implémentation** : Mot-clé `implements`
3. **Méthodes abstraites** : Déclarées sans corps
4. **Méthodes par défaut** : Implémentation dans l'interface (Java 8+)
5. **Interfaces multiples** : Une classe peut implémenter plusieurs interfaces
6. **Variables dans les interfaces** : Toujours `public static final`

## Exemples

### Exemple 1 : Interface Simple

```java
// Définition de l'interface
public interface Volant {
    void voler();  // Méthode abstraite (sans corps)
    void atterrir();
}

// Implémentation
public class Avion implements Volant {
    @Override
    public void voler() {
        System.out.println("L'avion vole dans le ciel");
    }
    
    @Override
    public void atterrir() {
        System.out.println("L'avion atterrit sur la piste");
    }
}

public class Oiseau implements Volant {
    @Override
    public void voler() {
        System.out.println("L'oiseau vole en battant des ailes");
    }
    
    @Override
    public void atterrir() {
        System.out.println("L'oiseau atterrit sur une branche");
    }
}
```

### Exemple 2 : Interfaces Multiples

```java
public interface Nageur {
    void nager();
}

public interface Coureur {
    void courir();
}

// Une classe peut implémenter plusieurs interfaces
public class Canard implements Volant, Nageur {
    @Override
    public void voler() {
        System.out.println("Le canard vole");
    }
    
    @Override
    public void nager() {
        System.out.println("Le canard nage");
    }
}

public class Humain implements Nageur, Coureur {
    @Override
    public void nager() {
        System.out.println("L'humain nage");
    }
    
    @Override
    public void courir() {
        System.out.println("L'humain court");
    }
}
```

### Exemple 3 : Méthodes par Défaut (Java 8+)

```java
public interface Calculatrice {
    // Méthode abstraite
    int calculer(int a, int b);
    
    // Méthode par défaut
    default void afficherResultat(int resultat) {
        System.out.println("Résultat : " + resultat);
    }
    
    // Méthode statique (Java 8+)
    static void information() {
        System.out.println("Ceci est une calculatrice");
    }
}

public class Addition implements Calculatrice {
    @Override
    public int calculer(int a, int b) {
        int resultat = a + b;
        afficherResultat(resultat);  // Utilise la méthode par défaut
        return resultat;
    }
}
```

### Exemple 4 : Variables dans les Interfaces

```java
public interface Constantes {
    // Toutes les variables sont public static final
    double PI = 3.14159;
    int MAX_SIZE = 100;
    String NOM_APPLICATION = "Mon Application";
}

public class Cercle implements Constantes {
    double rayon;
    
    public double calculerAire() {
        return PI * rayon * rayon;  // Utilise la constante de l'interface
    }
}
```

## Prérequis

- Sujet 09 : Héritage

## Exercices

- **exercise-01** : Créer et implémenter une interface simple
- **exercise-02** : Implémenter plusieurs interfaces
- **exercise-03** : Utiliser des méthodes par défaut
- **exercise-04** : Créer des interfaces avec des constantes

## Ressources

- [Interfaces Java - Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
