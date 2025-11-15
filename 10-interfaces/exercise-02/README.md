# Exercice 2 : Interfaces Multiples

## Objectif

Apprendre qu'une classe peut implémenter plusieurs interfaces en Java.

## Instructions

1. Créez plusieurs interfaces
2. Créez une classe qui implémente plusieurs interfaces
3. Testez toutes les méthodes

## À Faire

- Créer une interface Nageur avec méthode nager()
- Créer une interface Coureur avec méthode courir()
- Créer une classe Canard qui implémente Volant ET Nageur
- Créer une classe Humain qui implémente Nageur ET Coureur

## Notes

- Syntaxe : `class NomClasse implements Interface1, Interface2 { ... }`
- Une classe peut implémenter plusieurs interfaces séparées par des virgules
- Toutes les méthodes de toutes les interfaces doivent être implémentées
- C'est une forme de multiple héritage en Java (via interfaces)

## Résultat Attendu

```
Le canard vole
Le canard nage
L'humain nage
L'humain court
```
