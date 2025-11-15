# Exercice 2 : Utiliser reduce pour Agréger

## Objectif

Apprendre à utiliser reduce() pour agréger les éléments d'un stream en une valeur unique.

## Instructions

1. Utilisez reduce() pour calculer la somme
2. Utilisez reduce() pour calculer le produit
3. Utilisez reduce() pour trouver le maximum
4. Utilisez reduce() pour concaténer des chaînes

## À Faire

- Créer une liste de nombres
- Utiliser reduce(0, (a, b) -> a + b) pour la somme
- Utiliser reduce(1, (a, b) -> a * b) pour le produit
- Utiliser reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b) pour le max
- Créer une liste de chaînes et utiliser reduce() pour concaténer
- Afficher tous les résultats

## Notes

- reduce(identity, accumulator) : réduit le stream en une valeur
- identity : valeur initiale (élément neutre pour l'opération)
- accumulator : BinaryOperator qui combine deux valeurs
- Pour la somme : identity = 0 (0 + x = x)
- Pour le produit : identity = 1 (1 * x = x)

## Résultat Attendu

```
Somme : 55
Produit : 3628800
Maximum : 10
Concaténation : JavaPythonC++JavaScript
```

