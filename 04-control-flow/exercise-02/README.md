# Exercice 2 : Structure switch

## Objectif

Apprendre à utiliser la structure switch pour choisir parmi plusieurs options de manière plus lisible qu'une série de if-else-if.

## Instructions

1. Complétez le fichier `Exercise02.java`
2. Utilisez switch pour gérer plusieurs cas
3. N'oubliez pas les `break` pour éviter le fall-through
4. Utilisez le cas `default` pour gérer les valeurs non prévues

## À Faire

- Créer un switch pour afficher le nom du jour selon un numéro (1-7)
- Créer un switch avec String pour afficher un message selon une saison
- Utiliser default pour gérer les cas non prévus

## Notes

- La syntaxe : `switch (variable) { case valeur1: ... break; default: ... }`
- Le `break` est important pour sortir du switch après un cas
- Sans `break`, l'exécution continue dans le cas suivant (fall-through)
- Le cas `default` est optionnel mais recommandé
- Depuis Java 7, on peut utiliser des String dans switch

## Résultat Attendu

```
Jour 3 : Mercredi
Saison été : Soleil et plage
Jour 10 : Jour invalide
```
