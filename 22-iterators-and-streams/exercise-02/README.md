# Exercice 2 : Utiliser Enhanced For Loop

## Objectif

Apprendre à utiliser la syntaxe simplifiée "for-each" pour parcourir les collections.

## Instructions

1. Créez différentes collections (List, Set)
2. Utilisez la syntaxe enhanced for loop (for-each)
3. Comparez avec l'Iterator explicite
4. Parcourez des tableaux avec for-each

## À Faire

- Créer une List<Integer> avec des nombres
- Parcourir avec for-each : for (Integer n : liste)
- Créer un Set<String> et le parcourir avec for-each
- Créer un tableau et le parcourir avec for-each
- Afficher tous les éléments

## Notes

- Enhanced for loop = syntaxe simplifiée : for (Type element : collection)
- Plus lisible que Iterator explicite
- Utilise Iterator en interne
- Fonctionne avec toutes les collections et les tableaux
- Ne permet pas la suppression pendant le parcours (utiliser Iterator si nécessaire)

## Résultat Attendu

```
Parcours d'une liste :
1
2
3
4
5
Parcours d'un set :
Java
Python
C++
Parcours d'un tableau :
10
20
30
```

