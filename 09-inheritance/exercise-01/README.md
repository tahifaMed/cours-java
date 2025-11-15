# Exercice 1 : Héritage Simple

## Objectif

Apprendre à créer une hiérarchie de classes en utilisant l'héritage avec le mot-clé `extends`.

## Instructions

1. Créez une classe parente Animal
2. Créez une classe dérivée Chien qui étend Animal
3. Utilisez les membres hérités et ajoutez des spécificités

## À Faire

- Créer une classe Animal avec des attributs (nom, age) et une méthode faireDuBruit()
- Créer une classe Chien qui étend Animal
- Redéfinir la méthode faireDuBruit() dans Chien
- Ajouter une méthode spécifique à Chien (aboyer())

## Notes

- Syntaxe : `class Chien extends Animal { ... }`
- La classe dérivée hérite de tous les membres publics et protégés
- La classe dérivée peut redéfinir (override) les méthodes héritées
- La classe dérivée peut ajouter de nouveaux membres

## Résultat Attendu

```
Rex aboie : Woof !
Rex mange
Woof ! Woof !
```
