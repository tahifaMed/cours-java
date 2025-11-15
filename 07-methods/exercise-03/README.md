# Exercice 3 : Paramètres Variables (Varargs)

## Objectif

Apprendre à utiliser les paramètres variables (varargs) pour créer des méthodes qui acceptent un nombre variable d'arguments.

## Instructions

1. Complétez la classe UtilisateurVarargs avec des méthodes utilisant varargs
2. Utilisez la syntaxe `...` pour les paramètres variables
3. Parcourez les arguments dans la méthode

## À Faire

- Créer une méthode `somme(int... nombres)` qui additionne tous les arguments
- Créer une méthode `afficherMessages(String... messages)` qui affiche tous les messages
- Tester avec différents nombres d'arguments

## Notes

- Syntaxe varargs : `type... nomVariable`
- Les varargs sont traités comme un tableau dans la méthode
- Vous pouvez parcourir avec une boucle for-each
- Un seul paramètre varargs par méthode et il doit être le dernier
- Vous pouvez appeler avec 0, 1, ou plusieurs arguments

## Résultat Attendu

```
Somme : 6
Somme : 100
Message 1 : Un
Message 2 : Deux
Message 3 : Trois
```
