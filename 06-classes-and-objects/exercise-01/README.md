# Exercice 1 : Créer une Classe Simple

## Objectif

Apprendre à créer une classe simple avec des attributs et des méthodes, puis créer des instances (objets) de cette classe.

## Instructions

1. Créez un nouveau fichier `Personne.java` avec une classe Personne
2. Ajoutez des attributs (nom, age)
3. Ajoutez une méthode pour se présenter
4. Dans `Exercise01.java`, créez des objets Personne et utilisez-les

## À Faire

- Créer une classe Personne avec :
  - Attributs : `String nom` et `int age`
  - Méthode `sePresenter()` qui affiche le nom et l'âge
- Dans Exercise01, créer deux objets Personne
- Initialiser leurs attributs
- Appeler la méthode sePresenter() pour chaque objet

## Notes

- Une classe définit la structure et le comportement d'objets
- Un objet est une instance concrète d'une classe
- Utilisez `new NomClasse()` pour créer un objet
- Les attributs sont accessibles avec `objet.attribut`
- Les méthodes sont appelées avec `objet.methode()`

## Structure des Fichiers

- `Personne.java` : Définition de la classe Personne
- `Exercise01.java` : Classe principale avec méthode main

## Compilation et Exécution

```bash
javac Personne.java Exercise01.java
java Exercise01
```

## Résultat Attendu

```
Je m'appelle Alice et j'ai 25 ans.
Je m'appelle Bob et j'ai 30 ans.
```
