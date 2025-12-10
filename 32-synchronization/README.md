# 32 - Synchronisation

## Vue d'Ensemble

La synchronisation est nécessaire lorsque plusieurs threads accèdent aux mêmes ressources partagées. Elle prévient les conditions de course (race conditions) et garantit la cohérence des données.

## Concepts Clés

1. **Mot-clé synchronized** : Synchroniser des blocs ou méthodes
2. **Locks** : Verrous explicites
3. **Thread safety** : Code sûr pour les threads multiples
4. **Race conditions** : Problèmes de concurrence

## Exemples

### Exemple 1 : Synchronized

```java
public class Compteur {
    private int valeur = 0;
    
    public synchronized void incrementer() {
        valeur++;
    }
    
    public synchronized int getValeur() {
        return valeur;
    }
}
```

## Prérequis

- Sujet 31 : Les bases des threads

## Exercices

- **exercise-01** : Utiliser synchronized pour protéger des ressources
- **exercise-02** : Créer du code thread-safe
- **exercise-03** : Comprendre les race conditions

## Ressources

- [Synchronisation - Oracle](https://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html)
