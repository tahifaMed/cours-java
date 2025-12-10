# Exercice 3 : Comparer ArrayList et LinkedList

## Objectif

Comprendre les différences entre ArrayList et LinkedList et quand utiliser chacune.

## Instructions

1. Créez une ArrayList et une LinkedList avec les mêmes éléments
2. Comparez les performances pour l'accès par index
3. Comparez les performances pour l'insertion
4. Observez que les deux implémentent l'interface List

## À Faire

- Créer une ArrayList<String> et une LinkedList<String>
- Ajouter les mêmes éléments aux deux
- Accéder à un élément par index avec get() (ArrayList plus rapide)
- Insérer un élément au milieu avec add(index, element) (LinkedList plus rapide)
- Parcourir les deux listes avec for-each
- Afficher les résultats

## Notes

- ArrayList : accès rapide par index, insertion lente au milieu
- LinkedList : accès lent par index, insertion rapide n'importe où
- Les deux implémentent List, donc API similaire
- Choisir ArrayList pour accès fréquent par index
- Choisir LinkedList pour insertions/suppressions fréquentes

## Résultat Attendu

```
ArrayList - Élément à l'index 2 : Charlie
LinkedList - Élément à l'index 2 : Charlie
ArrayList après insertion : [Alice, Bob, Xavier, Charlie, Diana]
LinkedList après insertion : [Alice, Bob, Xavier, Charlie, Diana]
Les deux listes contiennent les mêmes éléments
```

