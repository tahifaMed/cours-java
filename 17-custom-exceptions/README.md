# 17 - Exceptions Personnalisées

## Vue d'Ensemble

Vous pouvez créer vos propres classes d'exception pour représenter des erreurs spécifiques à votre application. Cela améliore la lisibilité et permet une gestion d'erreurs plus précise.

## Concepts Clés

1. **Création d'exception** : Étendre Exception ou RuntimeException
2. **Constructeurs** : Passer des messages d'erreur
3. **Checked vs Unchecked** : Exception vs RuntimeException
4. **Throws** : Déclarer les exceptions lancées

## Exemples

### Exemple 1 : Exception Personnalisée

```java
// Exception checked
public class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message);
    }
}

// Exception unchecked
public class AgeInvalideException extends RuntimeException {
    public AgeInvalideException(String message) {
        super(message);
    }
}

public class CompteBancaire {
    private double solde = 100;
    
    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant : " + solde);
        }
        solde -= montant;
    }
}
```

## Prérequis

- Sujet 16 : Les bases des exceptions

## Exercices

- **exercise-01** : Créer une exception personnalisée
- **exercise-02** : Lancer et capturer des exceptions personnalisées
- **exercise-03** : Utiliser throws pour déclarer des exceptions

## Ressources

- [Créer des exceptions - Oracle](https://docs.oracle.com/javase/tutorial/essential/exceptions/creating.html)
