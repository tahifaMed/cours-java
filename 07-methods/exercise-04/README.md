# Exercice 4 : Passage par Valeur vs Référence

## Objectif

Comprendre comment Java passe les paramètres : par valeur pour les types primitifs, par référence (copie de référence) pour les objets.

## Instructions

1. Complétez la classe PassageParametres
2. Créez des méthodes qui modifient des paramètres primitifs et des objets
3. Observez la différence de comportement

## À Faire

- Créer une méthode `modifierPrimitif(int x)` qui tente de modifier x
- Créer une méthode `modifierObjet(int[] tableau)` qui modifie le tableau
- Appeler ces méthodes et observer les résultats

## Notes

- Types primitifs : passage par valeur (copie de la valeur)
- Objets : passage par référence (copie de la référence, mais l'objet est le même)
- Modifier un paramètre primitif ne modifie pas la variable originale
- Modifier un objet (via sa référence) modifie l'objet original
- C'est important pour comprendre les effets de bord des méthodes

## Résultat Attendu

```
Avant modification : nombre = 5
Après modifierPrimitif : nombre = 5
Avant modification : arr[0] = 1
Après modifierObjet : arr[0] = 100
```
