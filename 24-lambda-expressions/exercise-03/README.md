# Exercice 3 : Utiliser les Méthodes de Référence

## Objectif

Apprendre à utiliser la syntaxe :: pour référencer des méthodes (méthodes statiques, méthodes d'instance, constructeurs).

## Instructions

1. Utilisez des références de méthodes statiques
2. Utilisez des références de méthodes d'instance
3. Utilisez des références de constructeurs
4. Comparez avec les expressions lambda équivalentes

## À Faire

- Utiliser Integer::parseInt comme référence de méthode statique
- Utiliser String::length comme référence de méthode d'instance
- Utiliser String::toUpperCase comme référence de méthode d'instance
- Utiliser ArrayList::new comme référence de constructeur
- Utiliser System.out::println comme référence de méthode

## Notes

- Méthode statique : Classe::méthodeStatique
- Méthode d'instance : objet::méthode ou Classe::méthode
- Constructeur : Classe::new
- Plus concis que les lambdas équivalentes
- Utile pour améliorer la lisibilité du code

## Résultat Attendu

```
Nombre parsé : 42
Longueur de 'Java' : 4
Longueur de 'Python' : 6
En majuscules : JAVA
Nouvelle liste créée
Message affiché
```

