# Exercice 2 : Constructeurs

## Objectif

Apprendre à créer et utiliser des constructeurs pour initialiser les objets lors de leur création.

## Instructions

1. Modifiez la classe Voiture pour ajouter des constructeurs
2. Créez un constructeur par défaut (sans paramètres)
3. Créez un constructeur avec paramètres
4. Utilisez les constructeurs dans Exercise02

## À Faire

- Ajouter un constructeur par défaut qui initialise marque à "Inconnue", modèle à "Inconnu", année à 2020
- Ajouter un constructeur avec 3 paramètres (marque, modèle, année)
- Créer des objets en utilisant les deux types de constructeurs
- Utiliser la méthode afficherInfo() pour afficher les informations

## Notes

- Un constructeur a le même nom que la classe
- Un constructeur n'a pas de type de retour (même pas void)
- Un constructeur par défaut est créé automatiquement si aucun constructeur n'est défini
- Vous pouvez avoir plusieurs constructeurs (surcharge)
- Le mot-clé `this` fait référence à l'objet courant

## Résultat Attendu

```
Voiture 1 : Inconnue Inconnu (2020)
Voiture 2 : Toyota Corolla (2023)
```
