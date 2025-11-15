# Exercice 1 : Interface Simple

## Objectif

Apprendre à créer et implémenter une interface en Java.

## Instructions

1. Créez une interface Volant
2. Créez des classes qui implémentent cette interface
3. Testez l'implémentation

## À Faire

- Créer une interface Volant avec des méthodes abstraites
- Créer une classe Avion qui implémente Volant
- Créer une classe Oiseau qui implémente Volant
- Implémenter toutes les méthodes de l'interface

## Notes

- Syntaxe interface : `interface NomInterface { ... }`
- Syntaxe implémentation : `class NomClasse implements NomInterface { ... }`
- Les méthodes d'interface sont publiques et abstraites par défaut
- Une classe doit implémenter TOUTES les méthodes de l'interface

## Résultat Attendu

```
L'avion vole dans le ciel
L'avion atterrit sur la piste
L'oiseau vole en battant des ailes
L'oiseau atterrit sur une branche
```
