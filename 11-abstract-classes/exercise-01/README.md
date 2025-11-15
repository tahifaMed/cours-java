# Exercice 1 : Classe Abstraite avec Méthodes Abstraites

## Objectif

Apprendre à créer une classe abstraite avec des méthodes abstraites et des méthodes concrètes.

## Instructions

1. Créez une classe abstraite Forme
2. Ajoutez des méthodes abstraites et concrètes
3. Créez une classe concrète qui étend la classe abstraite

## À Faire

- Créer une classe abstraite Forme avec :
  - Un attribut couleur (protected)
  - Un constructeur
  - Une méthode concrète setCouleur()
  - Deux méthodes abstraites : calculerAire() et calculerPerimetre()
- Créer une classe concrète Cercle qui étend Forme
- Implémenter toutes les méthodes abstraites dans Cercle

## Notes

- Une classe abstraite est déclarée avec `abstract class`
- Une classe abstraite ne peut pas être instanciée
- Les méthodes abstraites n'ont pas de corps : `abstract typeRetour nomMethode();`
- Les classes concrètes doivent implémenter toutes les méthodes abstraites

## Résultat Attendu

```
Couleur : Rouge
Aire : 78.53981633974483
Périmètre : 31.41592653589793
```
