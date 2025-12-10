# Exercice 4 : Modificateurs d'Accès

## Objectif

Comprendre les différents modificateurs d'accès : private, protected, public, et package-private.

## Instructions

1. Créez plusieurs classes dans le même package
2. Testez l'accessibilité avec différents modificateurs
3. Observez les règles d'accès

## À Faire

- Créer une classe avec des membres de différents niveaux d'accès
- Tester l'accès depuis une autre classe du même package
- Comprendre les restrictions d'accès

## Notes

- `private` : accessible uniquement dans la classe
- `protected` : accessible dans le package et les sous-classes
- `public` : accessible partout
- Package-private (aucun mot-clé) : accessible uniquement dans le package
- C'est la base du contrôle d'accès en Java

## Résultat Attendu

```
Variable publique : 10
Variable protégée : 20
Variable package : 30
Variable privée : Erreur de compilation
```
