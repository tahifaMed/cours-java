# 08 - Encapsulation

## Vue d'Ensemble

L'encapsulation est un principe fondamental de la POO qui consiste à cacher les détails d'implémentation et à contrôler l'accès aux données via des modificateurs d'accès (public, private, protected). Elle améliore la sécurité, la maintenabilité et permet de valider les données.

## Concepts Clés

1. **Modificateurs d'accès** : public, private, protected, package-private
2. **Getters et Setters** : Méthodes pour accéder et modifier les attributs privés
3. **Données cachées** : Protection des attributs
4. **Validation** : Contrôle des valeurs dans les setters

## Exemples

### Exemple 1 : Modificateurs d'Accès

```java
public class ExempleAcces {
    public int publicVar = 1;           // Accessible partout
    private int privateVar = 2;         // Accessible uniquement dans la classe
    protected int protectedVar = 3;     // Accessible dans le package et sous-classes
    int packageVar = 4;                 // Accessible uniquement dans le package
}
```

### Exemple 2 : Encapsulation avec Getters/Setters

```java
public class CompteBancaire {
    // Attributs privés : accès contrôlé
    private double solde;
    private String titulaire;
    
    // Constructeur
    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        if (soldeInitial >= 0) {
            this.solde = soldeInitial;
        } else {
            this.solde = 0;
        }
    }
    
    // Getter : lecture du solde
    public double getSolde() {
        return solde;
    }
    
    // Getter : lecture du titulaire
    public String getTitulaire() {
        return titulaire;
    }
    
    // Setter avec validation
    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.trim().isEmpty()) {
            this.titulaire = titulaire;
        }
    }
    
    // Méthode pour déposer (avec validation)
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }
    
    // Méthode pour retirer (avec validation)
    public boolean retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }
}
```

### Exemple 3 : Encapsulation Complète

```java
public class Etudiant {
    private String nom;
    private int age;
    private double moyenne;
    
    // Constructeur
    public Etudiant(String nom, int age) {
        this.nom = nom;
        setAge(age);  // Utilise le setter pour validation
        this.moyenne = 0.0;
    }
    
    // Getters
    public String getNom() {
        return nom;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getMoyenne() {
        return moyenne;
    }
    
    // Setter avec validation pour l'âge
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Âge invalide");
        }
    }
    
    // Méthode pour calculer la moyenne (logique métier)
    public void ajouterNote(double note) {
        if (note >= 0 && note <= 20) {
            moyenne = (moyenne + note) / 2;
        }
    }
}
```

## Prérequis

- Sujet 06 : Classes et objets
- Sujet 07 : Méthodes

## Exercices

- **exercise-01** : Créer une classe avec attributs privés
- **exercise-02** : Implémenter des getters et setters
- **exercise-03** : Ajouter de la validation dans les setters
- **exercise-04** : Utiliser différents modificateurs d'accès

## Ressources

- [Modificateurs d'accès - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
