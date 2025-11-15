# Exercice 2 : Ajouter des Méthodes à un Enum

## Objectif

Apprendre à ajouter des attributs, constructeurs et méthodes à un enum pour lui donner du comportement.

## Instructions

1. Créez un enum StatusCommande avec des valeurs et des descriptions
2. Ajoutez un attribut description et un constructeur
3. Ajoutez une méthode getDescription() pour accéder à la description
4. Utilisez l'enum avec ses méthodes

## À Faire

- Créer enum StatusCommande avec valeurs : EN_ATTENTE, EN_COURS, EXPEDIEE, LIVREE
- Ajouter attribut privé String description
- Ajouter constructeur qui prend une description
- Ajouter méthode getDescription()
- Créer des instances et afficher leurs descriptions

## Notes

- Les enums peuvent avoir des attributs, constructeurs et méthodes
- Le constructeur doit être privé (ou package-private)
- Chaque valeur enum peut avoir des paramètres passés au constructeur
- Les enums sont des classes spéciales avec un ensemble fixe d'instances

## Résultat Attendu

```
Status : EN_ATTENTE - En attente de traitement
Status : EN_COURS - En cours de préparation
Status : EXPEDIEE - Expédiée
Status : LIVREE - Livrée
```

