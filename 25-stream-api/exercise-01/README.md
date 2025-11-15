# Exercice 1 : Utiliser filter et map

## Objectif

Apprendre à utiliser les opérations intermédiaires filter() et map() avec l'API Stream.

## Instructions

1. Créez une liste d'objets
2. Utilisez filter() pour sélectionner certains éléments
3. Utilisez map() pour transformer les éléments
4. Enchaînez plusieurs opérations
5. Collectez les résultats

## À Faire

- Créer une liste de nombres de 1 à 10
- Filtrer les nombres pairs avec filter(n -> n % 2 == 0)
- Multiplier par 2 avec map(n -> n * 2)
- Filtrer les nombres > 5 et convertir en String avec map
- Afficher les résultats après collect()
- Utiliser distinct() pour éliminer les doublons

## Notes

- filter() : opération intermédiaire qui filtre selon un Predicate
- map() : opération intermédiaire qui transforme chaque élément selon une Function
- Les opérations intermédiaires sont lazy (évaluées seulement avec une opération terminale)
- distinct() : élimine les doublons
- collect() : opération terminale qui collecte les résultats

## Résultat Attendu

```
Nombres pairs multipliés par 2 : [4, 8, 12, 16, 20]
Nombres > 5 en String : [6, 7, 8, 9, 10]
Nombres distincts : [1, 2, 3, 4, 5]
```

