# Exercice 1 : Singleton Basique - Gestionnaire de Logs

## Objectif

Apprendre à implémenter un Singleton pour un gestionnaire de logs qui centralise les messages de logging.

## Contexte

Vous devez créer un système de logging simple qui garantit qu'il n'y a qu'une seule instance du gestionnaire de logs dans toute l'application. Ce gestionnaire doit pouvoir enregistrer des messages à différents niveaux (INFO, WARNING, ERROR).

## À Faire

1. Complétez la classe `LoggerSingleton` pour implémenter le pattern Singleton avec **Eager Initialization**
2. Implémentez la méthode `log(String level, String message)` qui affiche les messages
3. Implémentez des méthodes de commodité :
   - `logInfo(String message)` 
   - `logWarning(String message)`
   - `logError(String message)`

## Points Importants

- Utilisez Eager Initialization (initialisation immédiate)
- Le constructeur doit être privé
- La méthode `getInstance()` doit être statique
- Affichez les messages avec le format : `[LEVEL] - message`

## Notes

- Cette implémentation est simple et thread-safe
- L'instance est créée dès le chargement de la classe
- Pas besoin de gestion de synchronisation

## Résultat Attendu

```
Instance créée: cours.java.designpatterns.singleton.LoggerSingleton@2f92e0f4
Instance utilisée: cours.java.designpatterns.singleton.LoggerSingleton@2f92e0f4
Instance créée: cours.java.designpatterns.singleton.LoggerSingleton@2f92e0f4
Instance utilisée: cours.java.designpatterns.singleton.LoggerSingleton@2f92e0f4
[INFO] - Application démarrée
[WARNING] - Mémoire faible détectée
[ERROR] - Échec de connexion à la base de données
[INFO] - Application arrêtée
```
