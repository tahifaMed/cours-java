# Exercice 2 : Getters et Setters avec Validation

## Objectif

Apprendre à créer des getters et setters qui valident les données avant de les modifier.

## Instructions

1. Complétez la classe Etudiant
2. Créez des getters et setters avec validation
3. Protégez les données avec des règles métier

## À Faire

- Créer des getters pour tous les attributs
- Créer un setter pour `age` qui valide que l'âge est entre 0 et 120
- Créer un setter pour `nom` qui valide que le nom n'est pas vide
- Créer une méthode pour ajouter une note avec validation (entre 0 et 20)

## Notes

- Les setters permettent de contrôler comment les données sont modifiées
- La validation garantit l'intégrité des données
- C'est un avantage majeur de l'encapsulation : contrôle total sur les modifications

## Résultat Attendu

```
Nom : Jean
Âge : 20
Tentative d'âge invalide : 150
Âge reste : 20
Moyenne : 15.0
```
