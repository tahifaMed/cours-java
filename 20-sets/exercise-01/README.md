# Exercice 1 : Utiliser HashSet pour Éviter les Doublons

## Objectif

Comprendre comment HashSet garantit l'unicité des éléments et apprendre à l'utiliser.

## Instructions

1. Créez un HashSet pour stocker des chaînes
2. Ajoutez des éléments, y compris des doublons
3. Observez que les doublons sont automatiquement ignorés
4. Utilisez les méthodes contains(), size(), remove()

## À Faire

- Créer un HashSet<String>
- Ajouter des éléments avec add()
- Essayer d'ajouter un doublon (doit être ignoré)
- Vérifier la taille (doit être réduite si doublons ignorés)
- Vérifier si un élément existe avec contains()
- Parcourir le set avec for-each
- Supprimer un élément avec remove()

## Notes

- Set = collection sans doublons
- HashSet = implémentation la plus rapide
- L'ordre des éléments n'est pas garanti
- La méthode add() retourne false si l'élément existe déjà
- Utilisé pour éliminer les doublons d'une liste

## Résultat Attendu

```
Taille après ajouts : 4
Le set contient 'Java' : true
Tentative d'ajout de 'Java' (déjà présent) : false
Taille finale : 4
Éléments du set :
Python
Java
C++
JavaScript
Taille après suppression : 3
```

