# Exercice 2 : Utiliser des Interfaces Fonctionnelles

## Objectif

Apprendre à utiliser les interfaces fonctionnelles prédéfinies de Java : Predicate, Function, Consumer, Supplier.

## Instructions

1. Utilisez Predicate<T> pour tester des conditions
2. Utilisez Function<T,R> pour transformer des valeurs
3. Utilisez Consumer<T> pour consommer des valeurs
4. Utilisez Supplier<T> pour fournir des valeurs

## À Faire

- Créer un Predicate<String> pour vérifier si une chaîne est vide
- Créer un Function<Integer, Integer> pour doubler un nombre
- Créer un Consumer<String> pour afficher une chaîne en majuscules
- Créer un Supplier<String> pour fournir un message
- Tester toutes ces interfaces

## Notes

- Predicate<T> : teste une condition, méthode test(T t) -> boolean
- Function<T,R> : transforme T en R, méthode apply(T t) -> R
- Consumer<T> : consomme une valeur, méthode accept(T t) -> void
- Supplier<T> : fournit une valeur, méthode get() -> T
- Ces interfaces sont dans java.util.function

## Résultat Attendu

```
La chaîne est vide : false
La chaîne est vide : true
Double de 5 : 10
Double de 20 : 40
CHAÎNE EN MAJUSCULES
Message du supplier : Hello World
```

