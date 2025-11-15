# Exercice 5 : Méthodes Utiles de la Classe Arrays

## Objectif

Apprendre à utiliser les méthodes statiques de la classe Arrays pour manipuler les tableaux : tri, recherche, remplissage, copie, etc.

## Instructions

1. Complétez le fichier `Exercise05.java`
2. Importez `java.util.Arrays`
3. Utilisez les méthodes de la classe Arrays
4. Testez différentes opérations sur les tableaux

## À Faire

- Utiliser `Arrays.sort()` pour trier un tableau
- Utiliser `Arrays.toString()` pour afficher un tableau
- Utiliser `Arrays.binarySearch()` pour rechercher (tableau doit être trié)
- Utiliser `Arrays.fill()` pour remplir un tableau
- Utiliser `Arrays.copyOf()` pour copier un tableau
- Utiliser `Arrays.equals()` pour comparer deux tableaux

## Notes

- `Arrays.sort()` : trie le tableau (modifie l'original)
- `Arrays.toString()` : convertit le tableau en String lisible
- `Arrays.binarySearch()` : recherche binaire (nécessite un tableau trié)
- `Arrays.fill()` : remplit le tableau avec une valeur
- `Arrays.copyOf()` : crée une copie du tableau
- `Arrays.equals()` : compare le contenu de deux tableaux

## Résultat Attendu

```
Tableau original : [50, 20, 40, 10, 30]
Tableau trié : [10, 20, 30, 40, 50]
Index de 30 dans le tableau trié : 2
Tableau rempli : [100, 100, 100, 100, 100]
Copie du tableau : [10, 20, 30, 40, 50]
Les tableaux sont égaux : true
```
