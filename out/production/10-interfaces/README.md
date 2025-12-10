# Exercice 4 : Constantes dans les Interfaces

## Objectif

Apprendre que les interfaces peuvent contenir des constantes (toujours public static final).

## Instructions

1. Créez une interface avec des constantes
2. Utilisez ces constantes dans une classe qui implémente l'interface
3. Accédez aux constantes

## À Faire

- Créer une interface Constantes avec des constantes (PI, MAX_SIZE)
- Créer une classe Cercle qui implémente Constantes
- Utiliser les constantes dans les calculs

## Notes

- Les variables dans une interface sont automatiquement `public static final`
- Convention : nommer les constantes en MAJUSCULES avec underscores
- Les constantes sont accessibles via `Interface.NOM_CONSTANTE` ou `objet.NOM_CONSTANTE`
- Utile pour partager des valeurs constantes entre plusieurs classes

## Résultat Attendu

```
Aire du cercle : 28.274333882308138
Taille maximale autorisée : 100
```
