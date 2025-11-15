# Exercice 4 : Tableaux Multidimensionnels

## Objectif

Apprendre à créer et manipuler des tableaux multidimensionnels (tableaux de tableaux) en Java.

## Instructions

1. Complétez le fichier `Exercise04.java`
2. Créez un tableau bidimensionnel (matrice)
3. Initialisez et parcourez le tableau 2D
4. Accédez aux éléments avec deux indices

## À Faire

- Créer un tableau 2D de 3 lignes et 4 colonnes
- Initialiser un tableau 2D avec des valeurs
- Parcourir un tableau 2D avec des boucles imbriquées
- Accéder à un élément spécifique

## Notes

- Syntaxe : `int[][] matrice = new int[3][4];`
- Syntaxe initialisation : `int[][] matrice = {{1,2}, {3,4}};`
- Accès : `matrice[ligne][colonne]`
- Parcours : boucle externe pour les lignes, boucle interne pour les colonnes
- `matrice.length` donne le nombre de lignes
- `matrice[i].length` donne le nombre de colonnes de la ligne i

## Résultat Attendu

```
Matrice 3x4 :
1 2 3 4
5 6 7 8
9 10 11 12
Élément à [1][2] : 7
Matrice initialisée :
1 2 3
4 5 6
```
