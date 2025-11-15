# Exercice 1 : Utiliser HashMap pour Stocker des Données

## Objectif

Apprendre à utiliser HashMap pour stocker et récupérer des paires clé-valeur.

## Instructions

1. Créez un HashMap pour stocker des données (par exemple, noms -> âges)
2. Ajoutez des paires clé-valeur avec put()
3. Récupérez des valeurs avec get()
4. Utilisez containsKey() et containsValue()
5. Parcourez la map avec entrySet()

## À Faire

- Créer un HashMap<String, Integer> pour stocker des noms et âges
- Ajouter des paires clé-valeur avec put()
- Récupérer une valeur avec get()
- Vérifier si une clé existe avec containsKey()
- Vérifier si une valeur existe avec containsValue()
- Obtenir la taille avec size()
- Parcourir la map avec entrySet()
- Supprimer une entrée avec remove()

## Notes

- Map = structure clé-valeur, chaque clé est unique
- HashMap = accès rapide, ordre non garanti
- put(key, value) : ajoute ou remplace une valeur
- get(key) : récupère la valeur associée à une clé, retourne null si absente
- entrySet() : retourne un Set de Map.Entry pour le parcours

## Résultat Attendu

```
Taille de la map : 4
Âge d'Alice : 25
La map contient la clé 'Bob' : true
La map contient la valeur 28 : true
Parcours de la map :
Charlie : 28
Alice : 25
Diana : 22
Bob : 30
Taille après suppression : 3
```

