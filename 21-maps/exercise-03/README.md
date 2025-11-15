# Exercice 3 : Parcourir et Manipuler des Maps

## Objectif

Apprendre différentes façons de parcourir une map et manipuler ses données.

## Instructions

1. Créez une map et ajoutez des données
2. Parcourez avec entrySet() pour obtenir clés et valeurs
3. Parcourez avec keySet() pour obtenir les clés
4. Parcourez avec values() pour obtenir les valeurs
5. Utilisez replace() et computeIfAbsent()

## À Faire

- Créer un HashMap<String, Integer> pour stocker des scores
- Parcourir avec entrySet() pour afficher clé-valeur
- Parcourir avec keySet() pour obtenir toutes les clés
- Parcourir avec values() pour obtenir toutes les valeurs
- Utiliser replace() pour modifier une valeur existante
- Utiliser computeIfAbsent() pour ajouter une valeur si la clé n'existe pas
- Utiliser getOrDefault() pour obtenir une valeur par défaut

## Notes

- entrySet() : Set<Map.Entry<K, V>> - parcours clé-valeur
- keySet() : Set<K> - toutes les clés
- values() : Collection<V> - toutes les valeurs
- replace(key, value) : remplace si la clé existe
- computeIfAbsent(key, function) : ajoute si la clé n'existe pas
- getOrDefault(key, defaultValue) : retourne la valeur ou une valeur par défaut

## Résultat Attendu

```
Parcours avec entrySet() :
Alice : 85
Bob : 90
Charlie : 75
Clés : [Alice, Bob, Charlie]
Valeurs : [85, 90, 75]
Score de Bob après remplacement : 95
Score de Diana (nouveau) : 80
Score de Eve (par défaut) : 0
```

