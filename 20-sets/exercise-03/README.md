# Exercice 3 : Opérations sur les Sets (Union, Intersection)

## Objectif

Apprendre à effectuer des opérations ensemblistes : union, intersection, différence.

## Instructions

1. Créez deux sets avec des éléments partiellement communs
2. Utilisez addAll() pour l'union
3. Utilisez retainAll() pour l'intersection
4. Utilisez removeAll() pour la différence

## À Faire

- Créer deux HashSet avec des éléments différents
- Union : créer un nouveau set avec tous les éléments (addAll)
- Intersection : créer un nouveau set avec les éléments communs (retainAll)
- Différence : créer un nouveau set avec les éléments du premier qui ne sont pas dans le second (removeAll)
- Afficher les résultats

## Notes

- Union (A ∪ B) : tous les éléments de A et B
- Intersection (A ∩ B) : éléments présents dans A ET B
- Différence (A - B) : éléments de A qui ne sont pas dans B
- addAll() modifie le set appelant
- Créer des copies pour éviter de modifier les sets originaux

## Résultat Attendu

```
Set A : [1, 2, 3, 4]
Set B : [3, 4, 5, 6]
Union (A ∪ B) : [1, 2, 3, 4, 5, 6]
Intersection (A ∩ B) : [3, 4]
Différence (A - B) : [1, 2]
```

