# 14 - Composition vs Héritage

## Vue d'Ensemble

La composition (has-a) et l'héritage (is-a) sont deux façons de réutiliser du code. La composition est généralement préférée car elle offre plus de flexibilité et évite les problèmes de l'héritage profond. "Favoriser la composition sur l'héritage" est un principe de design important.

## Concepts Clés

1. **Héritage (is-a)** : Relation "est-un", extension de classe
2. **Composition (has-a)** : Relation "a-un", objet contient d'autres objets
3. **Avantages de la composition** : Flexibilité, faible couplage
4. **Quand utiliser chacun** : Critères de choix

## Exemples

### Exemple 1 : Composition

```java
// Composition : une classe contient d'autres objets
public class Moteur {
    public void demarrer() {
        System.out.println("Moteur démarré");
    }
}

public class Voiture {
    private Moteur moteur;  // Composition : Voiture HAS-A Moteur
    
    public Voiture() {
        this.moteur = new Moteur();
    }
    
    public void demarrer() {
        moteur.demarrer();
        System.out.println("Voiture prête à rouler");
    }
}
```

### Exemple 2 : Héritage vs Composition

```java
// Héritage : Chien IS-A Animal
public class Animal {
    public void manger() {
        System.out.println("Mange");
    }
}

public class Chien extends Animal {
    // Héritage
}

// Composition : Voiture HAS-A Moteur (plus flexible)
public class VoitureAvecComposition {
    private Moteur moteur;
    
    public void changerMoteur(Moteur nouveauMoteur) {
        this.moteur = nouveauMoteur;  // Facilement remplaçable
    }
}
```

## Prérequis

- Sujet 09 : Héritage

## Exercices

- **exercise-01** : Créer une relation de composition
- **exercise-02** : Comparer composition et héritage
- **exercise-03** : Choisir entre composition et héritage

## Ressources

- [Effective Java - Item 18: Favor composition over inheritance](https://www.oreilly.com/library/view/effective-java/9780134686097/)
