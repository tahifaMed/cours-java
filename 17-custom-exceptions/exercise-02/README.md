# Exercice 2 : Lancer et Capturer des Exceptions Personnalisées

## Objectif

Apprendre à lancer (throw) et capturer (catch) des exceptions personnalisées dans un programme.

## Instructions

1. Créez une exception personnalisée
2. Lancez cette exception dans une méthode
3. Capturez-la dans un bloc try-catch

## À Faire

- Créer une classe AgeInvalideException qui étend RuntimeException
- Créer une méthode verifierAge(int age) qui lance AgeInvalideException si age < 0 ou age > 150
- Utiliser try-catch pour capturer et gérer l'exception
- Afficher un message d'erreur approprié

## Notes

- throw new ExceptionType("message") pour lancer une exception
- Les exceptions RuntimeException (unchecked) ne nécessitent pas de déclaration throws
- Les exceptions Exception (checked) doivent être déclarées avec throws
- Toujours fournir un message clair lors du lancement d'exception

## Résultat Attendu

```
Âge valide : 25
Erreur : AgeInvalideException - Âge invalide : -5 (doit être entre 0 et 150)
Erreur : AgeInvalideException - Âge invalide : 200 (doit être entre 0 et 150)
```

