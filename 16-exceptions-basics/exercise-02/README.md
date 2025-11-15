# Exercice 2 : Gérer Différents Types d'Exceptions

## Objectif

Apprendre à gérer plusieurs types d'exceptions différentes avec plusieurs blocs catch.

## Instructions

1. Créez du code qui peut lever différentes exceptions
2. Utilisez plusieurs blocs catch pour gérer chaque type
3. Utilisez catch(Exception) comme cas général

## À Faire

- Créer un bloc try avec accès à un tableau hors limites
- Créer un catch pour ArrayIndexOutOfBoundsException
- Créer un catch général pour Exception
- Tester différents types d'exceptions
- Afficher des messages spécifiques pour chaque type

## Notes

- On peut avoir plusieurs blocs catch après un try
- Les exceptions spécifiques doivent être capturées avant les générales
- Exception est la classe parente de toutes les exceptions
- L'ordre des catch est important : du plus spécifique au plus général

## Résultat Attendu

```
Index hors limites du tableau
Exception générale : / par zéro
Programme terminé avec gestion d'exceptions
```

