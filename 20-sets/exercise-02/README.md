# Exercice 2 : Comparer HashSet, LinkedHashSet et TreeSet

## Objectif

Comprendre les différences entre les trois principales implémentations de Set.

## Instructions

1. Créez un HashSet, un LinkedHashSet et un TreeSet
2. Ajoutez les mêmes éléments dans le même ordre
3. Observez l'ordre des éléments lors du parcours
4. Comprenez quand utiliser chaque implémentation

## À Faire

- Créer un HashSet, LinkedHashSet et TreeSet avec les mêmes éléments
- Ajouter des nombres dans un ordre spécifique
- Parcourir chaque set et observer l'ordre
- Noter que HashSet n'a pas d'ordre garanti
- Noter que LinkedHashSet conserve l'ordre d'insertion
- Noter que TreeSet trie automatiquement

## Notes

- HashSet : aucun ordre garanti, accès le plus rapide
- LinkedHashSet : conserve l'ordre d'insertion, légèrement plus lent
- TreeSet : éléments triés automatiquement, le plus lent
- TreeSet nécessite que les éléments soient Comparable ou un Comparator
- Choisir selon le besoin : vitesse (HashSet), ordre insertion (LinkedHashSet), tri (TreeSet)

## Résultat Attendu

```
HashSet (ordre non garanti) : [33, 66, 99, 11, 22]
LinkedHashSet (ordre d'insertion) : [11, 22, 33, 66, 99]
TreeSet (trié automatiquement) : [11, 22, 33, 66, 99]
```

