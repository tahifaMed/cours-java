# Exercice 3 : Factory Complexe - Système de Paiement

## Objectif

Créer une factory complexe qui combine Factory Method et Simple Factory pour un système de paiement multi-méthodes.

## Contexte

Vous devez créer un système de traitement de paiements qui supporte plusieurs méthodes de paiement (carte de crédit, PayPal, crypto-monnaie). Chaque méthode de paiement a différentes configurations (mode production/test). Le système doit permettre de créer facilement de nouvelles méthodes de paiement.

## À Faire

1. Créer l'interface `PaymentMethod` avec :
   - `boolean payer(double montant)`
   - `String getType()`
2. Créer une classe abstraite `PaymentFactory` avec :
   - Factory Method abstraite `PaymentMethod creerPaymentMethod()`
   - Méthode concrète `void testerPayment()`
3. Créer une factory `CreditCardFactory` qui crée `CreditCardPayment`
4. Créer une factory `PayPalFactory` qui crée `PayPalPayment`
5. Créer une `PaymentProvider` (Simple Factory) qui retourne la bonne factory selon le type

## Points Importants

- Combiner Factory Method et Simple Factory
- PaymentProvider agit comme une factory de factories
- Chaque méthode de paiement a son comportement spécifique
- Extensibilité pour ajouter de nouvelles méthodes

## Notes

- Architecture à deux niveaux : Factory de Factories
- Common pattern dans les systèmes complexes
- Utilisé dans Spring via BeanFactory hierarchies

## Résultat Attendu

```
Factory pour Carte de Crédit créée
Paiement par Carte de Crédit créé
Carte de Crédit: Paiement de 100.0€ effectué

Factory pour PayPal créée
Paiement par PayPal créé
PayPal: Paiement de 150.0€ effectué

Test de paiement Carte de Crédit:
Carte de Crédit: Paiement de 99.99€ effectué

Test de paiement PayPal:
PayPal: Paiement de 99.99€ effectué
```
