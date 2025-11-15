# Exercice 2 : Factory Method - Types de Base de Données

## Objectif

Implémenter le pattern Factory Method pour créer différentes connexions de base de données.

## Contexte

Vous devez créer un système de gestion de connexions à différentes bases de données. Chaque type de base de données a sa propre méthode de connexion. Le système doit être extensible pour ajouter facilement de nouveaux types de bases de données.

## À Faire

1. Créer une classe abstraite `DatabaseFactory` avec :
   - Méthode abstraite `DatabaseConnection creerConnexion()`
   - Méthode concrète `void testerConnexion()`
2. Créer l'interface `DatabaseConnection` avec :
   - `void connecter()`
   - `String getType()`
3. Implémenter deux factories concrètes :
   - `MySqlFactory` crée `MySqlConnection`
   - `PostgreSqlFactory` crée `PostgreSqlConnection`
4. Implémenter les connexions correspondantes

## Points Importants

- Factory Method : chaque Creator crée son propre Product
- La méthode `creerConnexion()` est le Factory Method
- Utiliser des classes abstraites et interfaces
- Chaque factory est responsable de créer son type de connexion

## Notes

- Le Factory Method délègue la création aux sous-classes
- Plus flexible que Simple Factory pour l'extensibilité
- Permet de varier les produits indépendamment des créateurs

## Résultat Attendu

```
Factory MySQL créée
Connexion MySQL créée
Connexion établie à MySQL

Factory PostgreSQL créée
Connexion PostgreSQL créée
Connexion établie à PostgreSQL

Test de connexion MySQL:
Connexion établie à MySQL

Test de connexion PostgreSQL:
Connexion établie à PostgreSQL
```

## Références

- Pattern Factory Method du GoF
- Chaque sous-classe décide quel objet créer