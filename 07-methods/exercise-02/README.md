# Exercice 2 : Surcharge de Méthodes (Overloading)

## Objectif

Apprendre à créer plusieurs méthodes avec le même nom mais des signatures différentes (surcharge de méthodes).

## Instructions

1. Complétez la classe Calculatrice avec des méthodes surchargées
2. Créez plusieurs méthodes `additionner` avec différents paramètres
3. Testez toutes les variantes dans Exercise02

## À Faire

- Créer une méthode `additionner(int a, int b)` qui retourne int
- Créer une méthode `additionner(double a, double b)` qui retourne double
- Créer une méthode `additionner(int a, int b, int c)` qui retourne int
- Appeler chaque méthode et afficher les résultats

## Notes

- La surcharge permet d'avoir plusieurs méthodes avec le même nom
- Les signatures doivent différer : nombre ou types de paramètres
- Le compilateur choisit la méthode selon les types d'arguments
- Le type de retour seul ne suffit pas pour différencier (même signature)

## Résultat Attendu

```
8
8.7
6
```
