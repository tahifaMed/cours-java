# Exercice 3 : Créer une Classe AutoCloseable

## Objectif

Apprendre à créer une classe personnalisée qui implémente AutoCloseable pour l'utiliser avec try-with-resources.

## Instructions

1. Créez une classe Connexion qui implémente AutoCloseable
2. Simulez l'ouverture et la fermeture d'une connexion
3. Utilisez-la avec try-with-resources

## À Faire

- Créer une classe Connexion qui implémente AutoCloseable
- Ajouter un attribut pour suivre si la connexion est ouverte
- Créer un constructeur qui ouvre la connexion
- Implémenter close() pour fermer la connexion
- Créer une méthode executerRequete() qui vérifie si la connexion est ouverte
- Utiliser Connexion avec try-with-resources

## Notes

- AutoCloseable a une méthode close() à implémenter
- La méthode close() est appelée automatiquement avec try-with-resources
- Utile pour les ressources : fichiers, connexions BDD, sockets, etc.
- On peut gérer plusieurs ressources : try (Ressource1 r1 = ...; Ressource2 r2 = ...) { ... }

## Résultat Attendu

```
Connexion ouverte
Exécution de la requête SQL
Connexion fermée automatiquement
---
Connexion ouverte
Tentative d'utilisation après fermeture...
Erreur : La connexion est fermée
Connexion fermée automatiquement
```

