# Exercice 2 : Utiliser try-with-resources

## Objectif

Apprendre à utiliser try-with-resources pour gérer automatiquement la fermeture des ressources.

## Instructions

1. Créez une classe qui implémente AutoCloseable
2. Utilisez try-with-resources pour utiliser cette ressource
3. Observez que la ressource est fermée automatiquement

## À Faire

- Créer une classe Ressource qui implémente AutoCloseable
- Implémenter la méthode close() pour afficher un message de fermeture
- Utiliser try-with-resources dans main()
- Utiliser la ressource dans le bloc try
- Observer que close() est appelée automatiquement

## Notes

- try-with-resources = syntaxe simplifiée pour les ressources
- La ressource doit implémenter AutoCloseable
- close() est appelée automatiquement à la fin du bloc try
- close() est appelée même en cas d'exception
- Syntaxe : try (Ressource res = new Ressource()) { ... }

## Résultat Attendu

```
Ressource créée
Utilisation de la ressource
Ressource fermée automatiquement
---
Ressource créée
Exception dans le bloc try
Ressource fermée automatiquement (même avec exception)
```

