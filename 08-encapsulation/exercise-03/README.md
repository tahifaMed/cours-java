# Exercice 3 : Encapsulation Complète

## Objectif

Créer une classe complètement encapsulée avec contrôle total sur les opérations.

## Instructions

1. Complétez la classe CompteBancaireAvance
2. Implémentez des méthodes métier au lieu d'exposer directement les attributs
3. Validez toutes les opérations

## À Faire

- Créer des méthodes `deposer()` et `retirer()` au lieu de setter pour solde
- Valider que les montants sont positifs
- Valider que le retrait ne dépasse pas le solde
- Créer une méthode pour obtenir le solde (getter)

## Notes

- L'encapsulation permet d'exposer seulement les opérations nécessaires
- Les méthodes métier sont plus expressives qu'un simple setter
- La validation garantit la cohérence des données

## Résultat Attendu

```
Solde initial : 1000.0
Après dépôt de 500.0 : 1500.0
Retrait de 300.0 réussi
Solde final : 1200.0
Retrait de 2000.0 échoué : Solde insuffisant
```
