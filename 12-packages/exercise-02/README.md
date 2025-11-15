# Exercice 2 : Imports et Wildcards

## Objectif

Apprendre à utiliser différents types d'imports : import spécifique et import avec wildcard (*).

## Instructions

1. Créez plusieurs classes dans un package
2. Utilisez différents types d'imports pour accéder aux classes
3. Testez les imports avec wildcard

## À Faire

- Créer deux classes dans le package `com.exemple.utils` : Calculatrice et StringUtils
- Utiliser un import spécifique pour une classe
- Utiliser un import avec wildcard (`import com.exemple.utils.*;`) pour l'autre

## Notes

- Import spécifique : `import package.Classe;`
- Import wildcard : `import package.*;` (importe toutes les classes du package)
- `import static` : pour importer des membres statiques (Java 5+)
- Les imports wildcard peuvent ralentir la compilation mais facilitent la lecture

## Résultat Attendu

```
Somme : 15
Chaîne en majuscules : BONJOUR
```
