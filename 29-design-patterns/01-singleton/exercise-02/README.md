# Exercice 2 : Singleton Thread-Safe - Cache de Configuration

## Objectif

Implémenter un Singleton thread-safe utilisant le pattern Double-Checked Locking pour un cache de configuration.

## Contexte

Vous devez créer un système de cache de configuration qui :
- Garantit une seule instance même en environnement multi-thread
- Utilise le chargement différé (lazy initialization)
- Permet de stocker et récupérer des valeurs de configuration
- Gère thread-safe l'accès concurrent

## À Faire

1. Implémentez le pattern Singleton avec **Double-Checked Locking**
2. Ajoutez une structure de données pour stocker les clés-valeurs (Map)
3. Implémentez `put(String key, String value)` pour stocker une configuration
4. Implémentez `get(String key)` pour récupérer une valeur
5. Implémentez `contains(String key)` pour vérifier l'existence d'une clé

## Points Importants

- Utilisez `volatile` pour l'instance
- Double vérification dans `getInstance()` avec `synchronized`
- Utilisez `ConcurrentHashMap` pour thread-safety du cache
- Le constructeur doit initialiser le cache

## Notes

- Double-Checked Locking améliore les performances
- La première vérification évite la synchronisation inutile
- La deuxième vérification garantit qu'une seule instance est créée
- `volatile` assure la visibilité entre threads

## Résultat Attendu

```
Thread-0: Instance créée: cours.java.designpatterns.singleton.ConfigCache@hashcode1
Thread-1: Instance utilisée: cours.java.designpatterns.singleton.ConfigCache@hashcode1
Thread-2: Instance utilisée: cours.java.designpatterns.singleton.ConfigCache@hashcode1
Thread-0: Configuration stockée: database.url = jdbc:mysql://localhost:3306/app
Thread-1: Configuration stockée: app.name = Mon Application
Thread-2: Configuration stockée: app.version = 1.0.0
Configuration récupérée - app.name: Mon Application
Configuration vérifiée - contains 'database.url': true
```
