# Exercice 2 : Protection Proxy - Vérification des Permissions

## Objectif

Créer un Protection Proxy pour contrôler l'accès aux opérations bancaires selon les permissions utilisateur.

## Contexte

Vous devez créer un système où certaines opérations bancaires sont protégées selon le rôle de l'utilisateur. Le proxy doit vérifier les permissions avant de déléguer l'opération au compte bancaire réel.

## À Faire

1. Créer l'interface `CompteBancaire` avec :
   - `void retirer(double montant)`
   - `void deposer(double montant)`
   - `double getSolde()`
2. Créer `CompteReel` qui implémente les opérations bancaires
3. Créer `CompteProxy` qui :
   - Vérifie les permissions avant chaque opération
   - Seules les opérations déposées sont permises pour tous
   - Seuls les ADMIN peuvent retirer
   - Affiche "Accès refusé" si pas autorisé

## Points Importants

- Protection Proxy contrôle l'accès
- Vérification avant délégation
- Messages d'erreur clairs

## Notes

- Pattern commun pour la sécurité
- Utilisé dans Spring Security
- Séparation des préoccupations

## Résultat Attendu

```
Dépôt: 500.0€ - Solde: 500.0€

Solde actuel: 500.0€

Retrait de 100.0€ refusé (permissions insuffisantes)
Dépôt: 200.0€ - Solde: 700.0€

Retrait: 100.0€ - Solde: 600.0€
Dépôt: 50.0€ - Solde: 650.0€
```
