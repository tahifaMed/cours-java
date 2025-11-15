# Exercice 3 : Utiliser EnumSet et EnumMap

## Objectif

Apprendre à utiliser EnumSet et EnumMap, des collections optimisées pour travailler avec des enums.

## Instructions

1. Créez un enum Priorite avec plusieurs valeurs
2. Utilisez EnumSet pour stocker un ensemble de priorités
3. Utilisez EnumMap pour associer des priorités à des valeurs
4. Manipulez ces collections

## À Faire

- Créer enum Priorite : BASSE, MOYENNE, HAUTE, URGENTE
- Créer un EnumSet contenant plusieurs priorités
- Afficher les priorités sélectionnées
- Créer un EnumMap associant Priorite -> String (tâche)
- Ajouter des associations et les afficher

## Notes

- EnumSet : Set optimisé pour les enums, très efficace
- EnumMap : Map optimisée pour les enums comme clés
- Plus performants que HashSet/HashMap pour les enums
- EnumSet utilise des opérations bitwise en interne

## Résultat Attendu

```
Priorités sélectionnées : [MOYENNE, HAUTE]
Tâches par priorité :
BASSE : Faire les courses
MOYENNE : Répondre aux emails
HAUTE : Corriger les bugs
URGENTE : Réunion d'urgence
```

