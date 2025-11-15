# Exercice 1 : Créer des Expressions Lambda Simples

## Objectif

Apprendre la syntaxe de base des expressions lambda et comprendre comment elles remplacent les classes anonymes.

## Instructions

1. Créez des expressions lambda simples
2. Utilisez-les avec des interfaces fonctionnelles basiques
3. Comparez avec l'ancienne approche (classes anonymes)

## À Faire

- Créer une lambda pour vérifier si un nombre est pair : (n) -> n % 2 == 0
- Créer une lambda pour calculer le carré d'un nombre : (n) -> n * n
- Créer une lambda pour afficher un message : (s) -> System.out.println(s)
- Utiliser ces lambdas avec des interfaces fonctionnelles
- Tester les lambdas avec différents paramètres

## Notes

- Syntaxe lambda : (paramètres) -> expression
- Parenthèses optionnelles pour un seul paramètre
- Accolades et return optionnels pour une expression simple
- Les lambdas sont des objets fonctionnels qui implémentent une interface fonctionnelle
- Plus concis que les classes anonymes

## Résultat Attendu

```
4 est pair : true
5 est pair : false
Carré de 5 : 25
Carré de 10 : 100
Message affiché : Bonjour Lambda
```

