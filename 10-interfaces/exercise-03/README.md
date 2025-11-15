# Exercice 3 : Méthodes par Défaut (Java 8+)

## Objectif

Apprendre à utiliser les méthodes par défaut dans les interfaces (introduites en Java 8).

## Instructions

1. Créez une interface avec une méthode abstraite et une méthode par défaut
2. Implémentez l'interface
3. Utilisez la méthode par défaut

## À Faire

- Créer une interface Calculatrice avec une méthode abstraite calculer()
- Ajouter une méthode par défaut afficherResultat()
- Implémenter l'interface dans une classe Addition

## Notes

- Méthode par défaut : `default typeRetour nomMethode() { ... }`
- Permet d'ajouter des méthodes avec implémentation dans une interface
- Les classes qui implémentent l'interface héritent automatiquement de la méthode par défaut
- Utile pour l'évolution des interfaces sans casser le code existant

## Résultat Attendu

```
Résultat : 8
```
