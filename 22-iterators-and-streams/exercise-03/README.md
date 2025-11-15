# Exercice 3 : Introduction aux Streams (filter, map)

## Objectif

Apprendre les bases de la Stream API : créer un stream, utiliser filter() et map(), collecter les résultats.

## Instructions

1. Créez une liste de nombres
2. Créez un stream avec stream()
3. Utilisez filter() pour filtrer les éléments
4. Utilisez map() pour transformer les éléments
5. Collectez les résultats avec collect()

## À Faire

- Créer une List<Integer> avec des nombres de 1 à 10
- Créer un stream avec nombres.stream()
- Filtrer les nombres pairs avec filter(n -> n % 2 == 0)
- Multiplier chaque nombre par 2 avec map(n -> n * 2)
- Collecter dans une liste avec collect(Collectors.toList())
- Afficher le résultat
- Essayer une autre opération : filtrer les nombres > 5 et les convertir en String

## Notes

- Stream = séquence d'éléments sur laquelle on peut effectuer des opérations
- filter() : opération intermédiaire qui filtre selon un prédicat
- map() : opération intermédiaire qui transforme chaque élément
- collect() : opération terminale qui collecte les résultats
- Les streams sont lazy (évalués seulement quand une opération terminale est appelée)

## Résultat Attendu

```
Nombres pairs multipliés par 2 : [4, 8, 12, 16, 20]
Nombres > 5 convertis en String : [6, 7, 8, 9, 10]
```

