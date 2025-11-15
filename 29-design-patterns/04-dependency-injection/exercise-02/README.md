# Exercice 2 : IoC Container Simple

## Objectif

Créer un conteneur IoC simple pour gérer l'injection de dépendances.

## Contexte

Vous devez créer un conteneur qui enregistre et récupère les beans, simulant le comportement de Spring.

## À Faire

1. Compléter `UserService` avec Constructor Injection de Logger
2. Créer `IoCContainer` avec :
   - `register(Class<?>, Object)` pour enregistrer les beans
   - `<T> T getBean(Class<T>)` pour récupérer les beans
3. Utiliser le conteneur pour gérer les dépendances

## Points Importants

- Container stocke les beans dans une Map
- getBean() retourne le bean typé
- Gestion centralisée des dépendances

## Notes

- Simulation de Spring BeanFactory
- Pattern fondamental des frameworks
- Facilite la gestion des dépendances

## Résultat Attendu

```
[FILE] Création d'utilisateur: Alice

[CONSOLE] Création d'utilisateur: Bob
```

