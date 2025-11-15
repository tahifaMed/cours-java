# Exercice 2 : Utiliser map et flatMap avec Optional

## Objectif

Apprendre à transformer des Optional avec map() et flatMap().

## Instructions

1. Utilisez map() pour transformer la valeur d'un Optional
2. Utilisez flatMap() pour aplatir des Optional imbriqués
3. Utilisez filter() pour filtrer des Optional

## À Faire

- Créer Optional<String> et utiliser map() pour obtenir la longueur
- Créer Optional<Integer> et utiliser map() pour multiplier par 2
- Utiliser flatMap() pour éviter Optional<Optional<T>>
- Utiliser filter() pour garder seulement les valeurs qui satisfont une condition
- Enchaîner map(), filter(), flatMap()

## Notes

- map(Function<T, R>) : transforme Optional<T> en Optional<R>, retourne Optional.empty() si vide
- flatMap(Function<T, Optional<R>>) : évite Optional<Optional<R>>, retourne Optional<R>
- filter(Predicate<T>) : garde la valeur si le prédicat est vrai, sinon Optional.empty()
- Toutes les opérations retournent Optional, permettant l'enchaînement

## Résultat Attendu

```
Longueur : 5
Nombre doublé : 20
Nom en majuscules : JAVA
Nombre filtré (pair) : Optional[10]
Nombre filtré (impair) : Optional.empty
```

