# Exercice 2 : Manipuler TreeMap pour des Clés Triées

## Objectif

Apprendre à utiliser TreeMap pour avoir des clés automatiquement triées.

## Instructions

1. Créez un TreeMap pour stocker des données
2. Ajoutez des paires clé-valeur dans un ordre aléatoire
3. Observez que les clés sont automatiquement triées
4. Utilisez firstKey() et lastKey()
5. Comparez avec HashMap pour voir la différence d'ordre

## À Faire

- Créer un TreeMap<String, String> pour stocker des pays et capitales
- Ajouter des pays dans un ordre non alphabétique
- Observer que les clés sont triées automatiquement
- Utiliser firstKey() et lastKey() pour obtenir la première et dernière clé
- Parcourir avec keySet() pour voir l'ordre trié
- Comparer avec un HashMap pour voir la différence

## Notes

- TreeMap = clés triées automatiquement selon leur ordre naturel
- Nécessite que les clés soient Comparable ou fournir un Comparator
- Plus lent que HashMap mais maintient l'ordre trié
- firstKey() : première clé (la plus petite)
- lastKey() : dernière clé (la plus grande)
- Utile quand l'ordre trié est important

## Résultat Attendu

```
TreeMap (clés triées) :
Allemagne -> Berlin
Espagne -> Madrid
France -> Paris
Italie -> Rome
Première clé : Allemagne
Dernière clé : Italie
HashMap (ordre non garanti) :
France -> Paris
Espagne -> Madrid
Allemagne -> Berlin
Italie -> Rome
```

