# Exercice 3 : Créer des Méthodes Génériques

## Objectif

Apprendre à créer des méthodes génériques indépendantes, avec et sans contraintes de type.

## Instructions

1. Créez une méthode générique pour échanger deux éléments
2. Créez une méthode générique pour trouver le maximum avec une contrainte
3. Créez une méthode générique pour afficher un tableau

## À Faire

- Créer une méthode échanger<T>(T[] tab, int i, int j) pour échanger deux éléments
- Créer une méthode max<T extends Comparable<T>>(T a, T b) pour trouver le maximum
- Créer une méthode afficher<T>(T[] tab) pour afficher un tableau
- Tester les méthodes avec différents types

## Notes

- Méthodes génériques : <T> avant le type de retour
- Bounded types : <T extends Comparable<T>> limite T aux types comparables
- Les méthodes génériques peuvent être statiques
- Permet la réutilisation de code pour différents types
- Comparable<T> : interface pour comparer des objets

## Résultat Attendu

```
Tableau après échange : [B, A, C]
Maximum entre 10 et 20 : 20
Maximum entre 'a' et 'z' : z
Tableau d'entiers : [1, 2, 3]
Tableau de chaînes : [X, Y, Z]
```

