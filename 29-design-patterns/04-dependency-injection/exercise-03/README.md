# Exercice 3 : Field Injection avec Réflexion

## Objectif

Simuler l'injection Spring avec @Autowired en utilisant la réflexion Java.

## Contexte

Vous devez créer un conteneur qui injecte automatiquement les dépendances marquées par @Autowired, comme le fait Spring.

## À Faire

1. Compléter `OrderService` avec des champs @Autowired
2. Créer `SpringLikeContainer` avec injection par réflexion
3. `injectDependencies()` parcourt les champs et injecte les beans

## Points Importants

- Utilisez la réflexion Java
- Cherchez les champs avec @Autowired
- Injectez les bonnes dépendances depuis le container

## Notes

- Simulation de @Autowired de Spring
- Nécessite des notions de réflexion
- Pattern avancé de DI

## Résultat Attendu

```
[LOG] Traitement de la commande ORD-123
Email envoyé à customer@example.com: Votre commande ORD-123 a été traitée
[LOG] Commande ORD-123 traitée avec succès
```

