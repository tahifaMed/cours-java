# Exercice 4 : Streams Parallèles

## Objectif

Comprendre comment utiliser les streams parallèles pour traiter les données en parallèle.

## Instructions

1. Créez un stream parallèle avec parallelStream()
2. Comparez les performances avec un stream séquentiel
3. Comprenez quand utiliser les streams parallèles

## À Faire

- Créer une grande liste de nombres
- Traiter avec un stream séquentiel (stream())
- Traiter avec un stream parallèle (parallelStream())
- Comparer les temps d'exécution
- Utiliser isParallel() pour vérifier si un stream est parallèle
- Comprendre les cas d'usage appropriés

## Notes

- parallelStream() : crée un stream qui peut être traité en parallèle
- isParallel() : vérifie si un stream est parallèle
- Les streams parallèles sont utiles pour de grandes collections
- Attention : certaines opérations ne bénéficient pas du parallélisme
- Les streams parallèles utilisent ForkJoinPool

## Résultat Attendu

```
Stream séquentiel : false
Stream parallèle : true
Traitement séquentiel terminé
Traitement parallèle terminé
```

