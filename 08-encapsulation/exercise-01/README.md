# Exercice 1 : Attributs Privés

## Objectif

Apprendre à rendre les attributs privés pour protéger les données et contrôler l'accès via des méthodes.

## Instructions

1. Complétez la classe CompteBancaire
2. Rendez les attributs privés
3. Créez des méthodes publiques pour accéder et modifier les données
4. Testez dans Exercise01

## À Faire

- Rendre les attributs `solde` et `titulaire` privés
- Créer un constructeur qui initialise ces attributs
- Créer des méthodes publiques pour interagir avec les données privées
- Tester l'accès aux attributs (qui doit échouer directement)

## Notes

- `private` : accessible uniquement dans la classe
- Les attributs privés ne peuvent pas être accédés directement depuis l'extérieur
- C'est le principe de base de l'encapsulation : cacher les détails d'implémentation

## Résultat Attendu

```
Titulaire : Alice
Solde : 1000.0
```
