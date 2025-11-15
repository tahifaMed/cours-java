# Exercice 3 : Singleton avec Enum - Pool de Connexions

## Objectif

Implémenter un Singleton en utilisant un enum pour gérer un pool de connexions. L'implémentation avec enum est recommandée par Joshua Bloch dans Effective Java.

## Contexte

Vous devez créer un gestionnaire de pool de connexions qui :
- Garantit une seule instance via enum
- Gère un nombre limité de connexions
- Permet d'acquérir et libérer des connexions
- Affiche des messages informatifs

## À Faire

1. Créer un enum `ConnectionPool` avec une instance unique `INSTANCE`
2. Ajouter des champs pour gérer le pool : maxSize, disponibles, en cours d'utilisation
3. Implémenter `acquireConnection()` pour obtenir une connexion
4. Implémenter `releaseConnection()` pour libérer une connexion
5. Implémenter `getStatus()` pour afficher l'état du pool

## Points Importants

- Utilisez la syntaxe d'enum Java
- L'enum garantit automatiquement l'unicité d'instance
- Générez des numéros de connexion simples (CONN-1, CONN-2, etc.)
- Gérez les limites du pool

## Notes

- Les enums sont thread-safe par défaut en Java
- Cette implémentation résiste à la sérialisation/désérialisation
- C'est l'approche recommandée par Joshua Bloch
- Pas besoin de synchronisation explicite

## Résultat Attendu

```
Pool initialisé avec 3 connexions max
Acquisition: CONN-1
Acquisition: CONN-2
Acquisition: CONN-3
Tentative d'acquisition lorsque le pool est plein...
Échec: Pool plein!
Libération: CONN-1
Acquisition: CONN-4
État du pool: Disponibles: 0, En utilisation: 3
Libération: CONN-2
Libération: CONN-3
Libération: CONN-4
État du pool: Disponibles: 3, En utilisation: 0
```
