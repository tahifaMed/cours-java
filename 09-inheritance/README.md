# 09 - Héritage

## Vue d'Ensemble

L'héritage permet à une classe (classe dérivée ou enfant) d'hériter des attributs et méthodes d'une autre classe (classe de base ou parent). Cela favorise la réutilisation du code et établit une relation "est-un" entre les classes.

## Concepts Clés

1. **Mot-clé extends** : Déclarer l'héritage
2. **Héritage des membres** : Accès aux membres de la classe parente
3. **Méthode super** : Appeler les constructeurs et méthodes du parent
4. **Override (redéfinition)** : Redéfinir des méthodes héritées
5. **Classe Object** : Classe racine de toutes les classes Java

## Exemples

### Exemple 1 : Héritage Simple

```java
// Classe parente
public class Animal {
    String nom;
    int age;
    
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }
    
    public void manger() {
        System.out.println(nom + " mange");
    }
}

// Classe dérivée
public class Chien extends Animal {
    String race;
    
    public Chien(String nom, int age, String race) {
        super(nom, age);  // Appelle le constructeur du parent
        this.race = race;
    }
    
    // Redéfinition (override) de la méthode
    @Override
    public void faireDuBruit() {
        System.out.println(nom + " aboie : Woof !");
    }
    
    // Méthode spécifique au Chien
    public void aboyer() {
        System.out.println("Woof ! Woof !");
    }
}

public class TestHeritage {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal générique", 5);
        Chien chien = new Chien("Rex", 3, "Labrador");
        
        animal.faireDuBruit();  // "L'animal fait du bruit"
        chien.faireDuBruit();    // "Rex aboie : Woof !"
        chien.manger();          // "Rex mange" (héritée)
        chien.aboyer();          // "Woof ! Woof !"
    }
}
```

### Exemple 2 : Chaîne d'Héritage

```java
public class Vehicule {
    String marque;
    int annee;
    
    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
    }
    
    public void demarrer() {
        System.out.println("Le véhicule démarre");
    }
}

public class Voiture extends Vehicule {
    int nombrePortes;
    
    public Voiture(String marque, int annee, int nombrePortes) {
        super(marque, annee);
        this.nombrePortes = nombrePortes;
    }
    
    @Override
    public void demarrer() {
        System.out.println("La voiture démarre avec la clé");
    }
}

public class VoitureElectrique extends Voiture {
    int autonomieBatterie;
    
    public VoitureElectrique(String marque, int annee, int nombrePortes, int autonomie) {
        super(marque, annee, nombrePortes);
        this.autonomieBatterie = autonomie;
    }
    
    @Override
    public void demarrer() {
        System.out.println("La voiture électrique démarre silencieusement");
    }
    
    public void charger() {
        System.out.println("Chargement de la batterie...");
    }
}
```

### Exemple 3 : Utilisation de super

```java
public class Forme {
    protected String couleur;
    
    public Forme(String couleur) {
        this.couleur = couleur;
    }
    
    public void dessiner() {
        System.out.println("Dessin d'une forme " + couleur);
    }
}

public class Cercle extends Forme {
    private double rayon;
    
    public Cercle(String couleur, double rayon) {
        super(couleur);  // Appelle le constructeur du parent
        this.rayon = rayon;
    }
    
    @Override
    public void dessiner() {
        super.dessiner();  // Appelle la méthode du parent
        System.out.println("C'est un cercle de rayon " + rayon);
    }
    
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}
```

## Prérequis

- Sujet 06 : Classes et objets
- Sujet 08 : Encapsulation

## Exercices

- **exercise-01** : Créer une hiérarchie de classes avec extends
- **exercise-02** : Utiliser super dans les constructeurs
- **exercise-03** : Redéfinir des méthodes (override)
- **exercise-04** : Créer une chaîne d'héritage à plusieurs niveaux

## Ressources

- [Héritage Java - Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
