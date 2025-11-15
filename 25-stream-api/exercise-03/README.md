# Exercice 3 : Utiliser Collectors Avancés

## Objectif

Apprendre à utiliser les collectors avancés : groupingBy, partitioningBy, joining, toMap.

## Instructions

1. Utilisez groupingBy() pour grouper des éléments
2. Utilisez partitioningBy() pour partitionner
3. Utilisez joining() pour joindre des chaînes
4. Utilisez toMap() pour créer une map

## À Faire

- Créer une liste de personnes avec noms et âges
- Utiliser groupingBy() pour grouper par âge
- Utiliser partitioningBy() pour séparer les majeurs/mineurs
- Utiliser joining() pour joindre des noms avec un séparateur
- Utiliser toMap() pour créer une map nom -> âge
- Afficher tous les résultats

## Notes

- groupingBy(classifier) : groupe les éléments selon une fonction de classification
- partitioningBy(predicate) : partitionne en deux groupes (true/false)
- joining(delimiter) : joint les chaînes avec un délimiteur
- toMap(keyMapper, valueMapper) : collecte dans une Map
- Collectors est une classe utilitaire avec des méthodes statiques

## Résultat Attendu

```
Groupement par âge : {25=[Alice], 30=[Bob, Diana], 28=[Charlie]}
Partition majeurs : {false=[Alice, Charlie], true=[Bob, Diana]}
Noms joints : Alice-Bob-Charlie-Diana
Map nom-âge : {Alice=25, Bob=30, Charlie=28, Diana=30}
```

