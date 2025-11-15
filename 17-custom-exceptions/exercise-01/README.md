# Exercice 1 : Créer une Exception Personnalisée

## Objectif

Apprendre à créer sa propre classe d'exception en étendant Exception ou RuntimeException.

## Instructions

1. Créez une classe d'exception personnalisée qui étend Exception
2. Ajoutez un constructeur qui prend un message
3. Utilisez cette exception dans une classe

## À Faire

- Créer une classe SoldeInsuffisantException qui étend Exception
- Ajouter un constructeur qui prend un String message et appelle super(message)
- Créer une classe CompteBancaire avec un solde
- Créer une méthode retirer() qui vérifie le solde
- Lancer SoldeInsuffisantException si le montant dépasse le solde

## Notes

- Exception = checked exception (doit être déclarée avec throws ou gérée)
- RuntimeException = unchecked exception (pas besoin de déclaration)
- Les exceptions personnalisées améliorent la clarté du code
- Toujours fournir un message descriptif dans le constructeur

## Résultat Attendu

```
Exception créée : SoldeInsuffisantException
Utilisation de l'exception dans CompteBancaire
```

