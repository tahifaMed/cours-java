# Exercice 1 : Utiliser le Bloc finally

## Objectif

Comprendre le rôle du bloc finally qui s'exécute toujours, même en cas d'exception.

## Instructions

1. Créez un bloc try-catch-finally
2. Observez que le bloc finally s'exécute toujours
3. Testez avec et sans exception

## À Faire

- Créer un bloc try qui peut lever une exception
- Ajouter un bloc catch pour gérer l'exception
- Ajouter un bloc finally qui s'exécute toujours
- Afficher des messages pour montrer l'ordre d'exécution
- Tester avec exception levée et sans exception

## Notes

- finally s'exécute toujours, même si une exception est levée
- finally s'exécute même si un return est dans le try ou catch
- Utile pour le nettoyage de ressources (fermeture de fichiers, connexions)
- L'ordre d'exécution : try → catch (si exception) → finally

## Résultat Attendu

```
Début du bloc try
Exception capturée : Division par zéro
Bloc finally exécuté
---
Début du bloc try
Calcul réussi : 5
Bloc finally exécuté
```

