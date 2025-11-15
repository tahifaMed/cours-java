# Exercice 5 : Incrémentation et Décrémentation

## Objectif

Comprendre la différence entre l'incrémentation/décrémentation préfixée (++x) et postfixée (x++), et leur impact sur l'évaluation des expressions.

## Instructions

1. Complétez le fichier `Exercise05.java`
2. Utilisez les opérateurs ++ et -- en préfixe et postfixe
3. Observez la différence dans les résultats

## À Faire

- Utilisez l'incrémentation postfixe (x++)
- Utilisez l'incrémentation préfixe (++x)
- Utilisez la décrémentation postfixe (x--)
- Utilisez la décrémentation préfixe (--x)
- Observez la différence lors de l'utilisation dans une expression

## Notes

- `x++` : incrémente x APRÈS avoir utilisé sa valeur actuelle (post-incrémentation)
- `++x` : incrémente x AVANT d'utiliser sa valeur (pré-incrémentation)
- `x--` : décrémente x APRÈS avoir utilisé sa valeur actuelle
- `--x` : décrémente x AVANT d'utiliser sa valeur
- Cette différence est importante quand l'opérateur est utilisé dans une expression

## Résultat Attendu

```
x initial : 5
Après x++ : 6 (mais x++ retourne 5)
Après ++x : 7 (et ++x retourne 7)
Après x-- : 6 (mais x-- retourne 7)
Après --x : 5 (et --x retourne 5)
```
