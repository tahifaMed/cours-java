# Exercice 3 : Import Static

## Objectif

Apprendre à utiliser les imports statiques pour simplifier l'accès aux membres statiques.

## Instructions

1. Créez une classe avec des méthodes statiques
2. Utilisez `import static` pour importer directement les méthodes
3. Testez l'utilisation sans préfixe de classe

## À Faire

- Créer une classe MathUtils dans un package avec des méthodes statiques
- Utiliser `import static` pour importer les méthodes
- Appeler les méthodes sans préfixe de classe

## Notes

- Import static : `import static package.Classe.nomMethode;`
- Import static wildcard : `import static package.Classe.*;`
- Permet d'appeler les méthodes sans préfixe : `methode()` au lieu de `Classe.methode()`
- Utile pour améliorer la lisibilité, mais peut réduire la clarté de la provenance

## Résultat Attendu

```
Maximum : 10
PI : 3.141592653589793
```
