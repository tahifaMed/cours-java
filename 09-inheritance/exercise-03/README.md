# Exercice 3 : Chaîne d'Héritage

## Objectif

Comprendre comment créer une chaîne d'héritage à plusieurs niveaux (grand-parent, parent, enfant).

## Instructions

1. Créez une hiérarchie à 3 niveaux : Vehicule -> Voiture -> VoitureElectrique
2. Observez comment les membres sont hérités à travers les niveaux
3. Ajoutez des spécificités à chaque niveau

## À Faire

- Créer Vehicule avec marque, annee et méthode demarrer()
- Créer Voiture qui étend Vehicule avec nombrePortes
- Créer VoitureElectrique qui étend Voiture avec autonomieBatterie
- Redéfinir demarrer() à chaque niveau

## Notes

- L'héritage peut être profond (plusieurs niveaux)
- Une classe hérite de tous ses ancêtres
- Chaque niveau peut ajouter ou redéfinir des fonctionnalités

## Résultat Attendu

```
La voiture électrique démarre silencieusement
Marque : Tesla
Nombre de portes : 4
Autonomie : 500 km
Chargement de la batterie...
```
