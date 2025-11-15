# Exercice 1 : Constructor Injection - Service de Notifications

## Objectif

Implémenter la Constructor Injection pour découpler les services de notification.

## Contexte

Vous devez créer un système de notifications flexible où le type de message (Email, SMS, Push) peut être changé facilement sans modifier le code client.

## À Faire

1. Créer l'interface `MessageService` avec `sendMessage(String)`
2. Implémenter `EmailService`, `SMSService`, et `PushService`
3. Créer `NotificationService` qui reçoit `MessageService` via le constructeur
4. Utiliser les services en injectant différentes implémentations

## Points Importants

- Constructor Injection : dépendance passée au constructeur
- Découplage : NotificationService ne connaît pas les implémentations
- Flexibilité : changements simples d'implémentation

## Notes

- Pattern fondamental de Spring
- Permet de tester facilement
- Principe d'Inversion of Control

## Résultat Attendu

```
📧 Email: Bienvenue dans notre application

📱 SMS: Code de vérification: 123456

🔔 Push: Nouveau message reçu
```

