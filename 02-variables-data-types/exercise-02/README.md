# Exercice 2 : Conversion de Types (Casting)

## Objectif

Comprendre et pratiquer les conversions de types explicites et implicites en Java.

## Instructions

1. Complétez le fichier `Exercise02.java`
2. Effectuez les conversions de types demandées
3. Utilisez le casting explicite `(type)` quand nécessaire
4. Affichez les résultats des conversions

## À Faire

- Convertissez un `double` (3.14) en `int` (cast explicite)
- Convertissez un `int` (100) en `long` (cast implicite, mais affichez-le)
- Convertissez un `char` ('A') en `int` pour obtenir son code ASCII
- Convertissez un `int` (65) en `char` pour obtenir le caractère correspondant

## Notes

- Un cast explicite peut entraîner une perte de précision (troncature)
- Un cast implicite se fait automatiquement quand on convertit d'un type plus petit vers un type plus grand
- Les caractères ont des codes numériques (ASCII/Unicode)

## Résultat Attendu

```
Double : 3.14
Double vers Int : 3
Int : 100
Int vers Long : 100
Char : A
Code ASCII de A : 65
Int 65 vers Char : A
```
