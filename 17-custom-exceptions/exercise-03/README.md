# Exercice 3 : Utiliser throws pour Déclarer des Exceptions

## Objectif

Apprendre à utiliser le mot-clé throws pour déclarer les exceptions qu'une méthode peut lancer.

## Instructions

1. Créez une exception checked (qui étend Exception)
2. Créez une méthode qui lance cette exception et la déclare avec throws
3. Gérez l'exception à l'appel de la méthode

## À Faire

- Créer une exception EmailInvalideException qui étend Exception
- Créer une méthode envoyerEmail(String email) qui vérifie le format
- Déclarer l'exception avec throws EmailInvalideException
- Lancer l'exception si l'email ne contient pas "@"
- Dans main(), gérer l'exception avec try-catch ou la propager

## Notes

- throws = déclare qu'une méthode peut lancer une exception
- Obligatoire pour les exceptions checked (Exception)
- Optionnel pour les exceptions unchecked (RuntimeException)
- L'appelant doit gérer les exceptions checked (try-catch ou throws)

## Résultat Attendu

```
Email valide : contact@example.com envoyé
Erreur : EmailInvalideException - Format d'email invalide : email-invalide
Email valide : admin@site.fr envoyé
```

