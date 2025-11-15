# 06 - Classes et Objets

## Vue d'Ensemble

Les classes sont les briques fondamentales de la programmation orientée objet en Java. Une classe est un modèle (template) qui définit les attributs et comportements des objets. Un objet est une instance concrète d'une classe.

## Concepts Clés

1. **Classe** : Modèle qui définit la structure et le comportement
2. **Objet** : Instance concrète d'une classe
3. **Attributs** : Variables qui caractérisent un objet
4. **Méthodes** : Fonctions qui définissent le comportement
5. **Constructeurs** : Méthodes spéciales pour initialiser les objets
6. **Mot-clé `this`** : Référence à l'objet courant

## Explications Détaillées

### Structure d'une Classe

Une classe contient :
- **Attributs** : Variables d'instance ou de classe
- **Méthodes** : Comportements de la classe
- **Constructeurs** : Initialisation des objets

### Création d'Objets

Utilisation de `new` pour créer une instance :
```java
NomClasse objet = new NomClasse();
```

## Exemples

### Exemple 1 : Classe Simple

```java
// Définition de la classe
public class Personne {
    // Attributs (ou champs)
    String nom;
    int age;
    
    // Constructeur par défaut (créé automatiquement si aucun constructeur)
    public Personne() {
    }
    
    // Méthode
    public void sePresenter() {
        System.out.println("Je m'appelle " + nom + " et j'ai " + age + " ans.");
    }
}

// Utilisation
public class TestPersonne {
    public static void main(String[] args) {
        // Création d'un objet
        Personne personne1 = new Personne();
        
        // Accès aux attributs
        personne1.nom = "Alice";
        personne1.age = 25;
        
        // Appel de méthode
        personne1.sePresenter();  // "Je m'appelle Alice et j'ai 25 ans."
    }
}
```

### Exemple 2 : Constructeurs

```java
public class Voiture {
    String marque;
    String modele;
    int annee;
    
    // Constructeur par défaut
    public Voiture() {
        marque = "Inconnue";
        modele = "Inconnu";
        annee = 2020;
    }
    
    // Constructeur avec paramètres
    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }
    
    public void afficherInfo() {
        System.out.println(marque + " " + modele + " (" + annee + ")");
    }
}

public class TestVoiture {
    public static void main(String[] args) {
        Voiture v1 = new Voiture();  // Utilise le constructeur par défaut
        Voiture v2 = new Voiture("Toyota", "Corolla", 2023);
        
        v1.afficherInfo();  // "Inconnue Inconnu (2020)"
        v2.afficherInfo();  // "Toyota Corolla (2023)"
    }
}
```

### Exemple 3 : Utilisation de `this`

```java
public class Rectangle {
    double largeur;
    double hauteur;
    
    public Rectangle(double largeur, double hauteur) {
        // 'this' distingue les attributs des paramètres
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public double calculerAire() {
        // 'this' optionnel ici mais souvent utilisé pour clarté
        return this.largeur * this.hauteur;
    }
    
    public void redimensionner(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
}
```

### Exemple 4 : Variables de Classe vs Variables d'Instance

```java
public class Compteur {
    // Variable d'instance : une par objet
    int valeur;
    
    // Variable de classe : partagée par tous les objets
    static int nombreInstances = 0;
    
    public Compteur() {
        valeur = 0;
        nombreInstances++;  // Incrémente le compteur global
    }
    
    public void incrementer() {
        valeur++;
    }
    
    // Méthode de classe (static)
    public static int getNombreInstances() {
        return nombreInstances;
    }
}

public class TestCompteur {
    public static void main(String[] args) {
        Compteur c1 = new Compteur();
        Compteur c2 = new Compteur();
        Compteur c3 = new Compteur();
        
        c1.incrementer();
        c1.incrementer();
        
        System.out.println("c1.valeur : " + c1.valeur);  // 2
        System.out.println("c2.valeur : " + c2.valeur);  // 0
        System.out.println("Instances créées : " + Compteur.getNombreInstances());  // 3
    }
}
```

### Exemple 5 : Méthodes avec Paramètres et Valeur de Retour

```java
public class Calculatrice {
    public int additionner(int a, int b) {
        return a + b;
    }
    
    public double multiplier(double x, double y) {
        return x * y;
    }
    
    public boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }
    
    public void afficherMessage(String message) {
        System.out.println("Message : " + message);
    }
}

public class TestCalculatrice {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        
        int somme = calc.additionner(5, 3);
        System.out.println("Somme : " + somme);  // 8
        
        double produit = calc.multiplier(2.5, 4.0);
        System.out.println("Produit : " + produit);  // 10.0
        
        boolean resultat = calc.estPair(7);
        System.out.println("7 est pair ? " + resultat);  // false
        
        calc.afficherMessage("Bonjour !");
    }
}
```

## Bonnes Pratiques

1. **Nommage** : Classes en PascalCase (`MaClasse`)
2. **Un fichier = Une classe publique** : Le nom du fichier doit correspondre
3. **Constructeurs** : Initialisez tous les attributs essentiels
4. **Encapsulation** : Utilisez des modificateurs d'accès appropriés (voir sujet 08)
5. **Documentation** : Commentez vos classes et méthodes importantes

## Prérequis

- Sujet 02 : Variables et types de données
- Sujet 03 : Opérateurs
- Sujet 04 : Structures de contrôle

## Exercices

- **exercise-01** : Créer une classe simple avec attributs et méthodes
- **exercise-02** : Implémenter différents constructeurs
- **exercise-03** : Utiliser le mot-clé `this`
- **exercise-04** : Distinguer variables d'instance et de classe
- **exercise-05** : Créer une classe avec plusieurs méthodes

## Ressources

- [Classes Java - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
