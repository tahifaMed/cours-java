# Exercice 3 : Mélange Méthodes Abstraites et Concrètes

## Objectif

Créer une classe abstraite qui mélange méthodes abstraites et méthodes concrètes, avec utilisation des méthodes abstraites dans les méthodes concrètes.

## Instructions

1. Créez une classe abstraite Animal
2. Ajoutez une méthode concrète qui utilise les méthodes abstraites
3. Créez une classe concrète qui étend Animal

## À Faire

- Créer une classe abstraite Animal avec :
  - Attributs nom et age
  - Méthode concrète afficherInfo() qui utilise faireDuBruit() (abstraite)
  - Méthode abstraite faireDuBruit()
- Créer une classe Chien qui étend Animal et implémente faireDuBruit()

## Notes

- Les méthodes concrètes dans une classe abstraite peuvent appeler des méthodes abstraites
- C'est le Template Method pattern : la structure est définie, mais certains détails sont laissés aux sous-classes
- Très utile pour définir un algorithme avec des étapes variables

## Résultat Attendu

```
Nom : Rex
Âge : 3
Rex aboie : Woof !
```
