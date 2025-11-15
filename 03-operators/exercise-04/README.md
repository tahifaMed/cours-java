# Exercice 4 : Opérateurs Logiques

## Objectif

Apprendre à utiliser les opérateurs logiques && (ET), || (OU), et ! (NON) pour combiner des conditions booléennes.

## Instructions

1. Complétez le fichier `Exercise04.java`
2. Utilisez les opérateurs logiques pour combiner des conditions
3. Affichez les résultats des expressions logiques

## À Faire

- Utilisez && (ET logique) : true && true, true && false
- Utilisez || (OU logique) : true || false, false || false
- Utilisez ! (NON logique) : !true, !false
- Combinez plusieurs opérateurs logiques

## Notes

- `&&` retourne true seulement si les deux conditions sont true
- `||` retourne true si au moins une condition est true
- `!` inverse la valeur booléenne
- L'évaluation est paresseuse : si le premier opérande de && est false, le second n'est pas évalué

## Résultat Attendu

```
true && true : true
true && false : false
true || false : true
false || false : false
!true : false
!false : true
(true && false) || true : true
```
