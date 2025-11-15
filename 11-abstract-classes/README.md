# 11 - Classes Abstraites

## Vue d'Ensemble

Une classe abstraite est une classe qui ne peut pas être instanciée directement. Elle sert de modèle pour d'autres classes et peut contenir des méthodes abstraites (sans implémentation) et des méthodes concrètes (avec implémentation). Les classes dérivées doivent implémenter toutes les méthodes abstraites.

## Concepts Clés

1. **Mot-clé abstract** : Déclarer une classe ou méthode abstraite
2. **Méthodes abstraites** : Déclarées sans corps, doivent être implémentées
3. **Méthodes concrètes** : Méthodes avec implémentation dans la classe abstraite
4. **Héritage** : Les classes concrètes étendent la classe abstraite

## Exemples

### Exemple 1 : Classe Abstraite Simple

```java
// Classe abstraite
public abstract class Forme {
    protected String couleur;
    
    // Constructeur
    public Forme(String couleur) {
        this.couleur = couleur;
    }
    
    // Méthode concrète
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    // Méthode abstraite (sans implémentation)
    public abstract double calculerAire();
    
    // Méthode abstraite
    public abstract double calculerPerimetre();
    
    // Méthode concrète utilisant les méthodes abstraites
    public void afficherInfo() {
        System.out.println("Forme " + couleur);
        System.out.println("Aire : " + calculerAire());
        System.out.println("Périmètre : " + calculerPerimetre());
    }
}

// Classe concrète
public class Cercle extends Forme {
    private double rayon;
    
    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }
    
    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
    
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}

// Classe concrète
public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;
    
    public Rectangle(String couleur, double largeur, double hauteur) {
        super(couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    @Override
    public double calculerAire() {
        return largeur * hauteur;
    }
    
    @Override
    public double calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }
}
```

### Exemple 2 : Classes Abstraites vs Interfaces

```java
// Classe abstraite peut avoir des attributs et constructeurs
public abstract class Animal {
    protected String nom;
    protected int age;
    
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    // Méthode concrète partagée
    public void dormir() {
        System.out.println(nom + " dort");
    }
    
    // Méthode abstraite
    public abstract void faireDuBruit();
}

public class Chien extends Animal {
    public Chien(String nom, int age) {
        super(nom, age);
    }
    
    @Override
    public void faireDuBruit() {
        System.out.println(nom + " aboie");
    }
}
```

## Prérequis

- Sujet 09 : Héritage
- Sujet 10 : Interfaces

## Exercices

- **exercise-01** : Créer une classe abstraite avec méthodes abstraites
- **exercise-02** : Implémenter une classe concrète depuis une classe abstraite
- **exercise-03** : Mélanger méthodes abstraites et concrètes

## Ressources

- [Classes abstraites - Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
