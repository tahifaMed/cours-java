# Exercice 1 : Utiliser Iterator pour Parcourir des Collections

## Objectif

Apprendre à utiliser l'interface Iterator pour parcourir des collections de manière standardisée.

## Instructions

1. Créez une collection (ArrayList)
2. Obtenez un Iterator avec iterator()
3. Utilisez hasNext() et next() pour parcourir
4. Utilisez remove() pour supprimer des éléments pendant le parcours

## À Faire

- Créer une ArrayList<String> avec plusieurs éléments
- Obtenir un Iterator avec iterator()
- Parcourir avec while (it.hasNext())
- Utiliser it.next() pour obtenir l'élément suivant
- Utiliser it.remove() pour supprimer un élément de manière sécurisée
- Afficher les éléments restants

## Notes

- Iterator = interface standard pour parcourir les collections
- hasNext() : vérifie s'il y a un élément suivant
- next() : retourne l'élément suivant et avance
- remove() : supprime l'élément retourné par next() (appel unique après next())
- Plus flexible que la boucle for-each car permet la suppression sécurisée

## Résultat Attendu

```
Élément : A
Élément : B (supprimé)
Élément : C
Élément : D
Éléments restants : [A, C, D]
```

