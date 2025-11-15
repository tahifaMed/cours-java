# Exercice 1 : Utiliser try-catch pour Gérer les Exceptions

## Objectif

Apprendre à utiliser les blocs try-catch pour capturer et gérer les exceptions.

## Instructions

1. Créez du code qui peut lever une exception (division par zéro)
2. Utilisez try-catch pour capturer l'exception
3. Affichez un message d'erreur approprié

## À Faire

- Créer un bloc try qui fait une division par zéro
- Créer un bloc catch pour ArithmeticException
- Afficher un message d'erreur dans le catch
- Ajouter un autre exemple avec NullPointerException
- Gérer cette exception également

## Notes

- try : bloc de code qui peut lever une exception
- catch : bloc qui capture et traite une exception spécifique
- Si une exception est levée dans try, le code passe immédiatement au catch
- Le code après try-catch continue à s'exécuter si l'exception est gérée

## Résultat Attendu

```
Erreur : Division par zéro impossible
Erreur : La chaîne est nulle
Programme terminé
```

