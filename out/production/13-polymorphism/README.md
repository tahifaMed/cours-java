# Exercice 3 : Polymorphisme avec Interfaces

## Objectif

Utiliser le polymorphisme avec des interfaces pour traiter différents objets implémentant la même interface.

## Instructions

1. Créez une interface
2. Créez plusieurs classes qui implémentent l'interface
3. Utilisez des références de type interface pour le polymorphisme

## À Faire

- Créer une interface Volant avec méthode voler()
- Créer Avion et Oiseau qui implémentent Volant
- Créer des références Volant qui pointent vers Avion et Oiseau
- Observer le polymorphisme avec les interfaces

## Notes

- Le polymorphisme fonctionne aussi avec les interfaces
- Une référence d'interface peut pointer vers n'importe quel objet qui implémente l'interface
- C'est très puissant pour découpler le code : on programme contre l'interface, pas l'implémentation

## Résultat Attendu

```
L'avion vole dans le ciel
L'oiseau vole en battant des ailes
```
