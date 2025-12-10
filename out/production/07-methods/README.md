# Exercice 5 : Méthodes Statiques

## Objectif

Apprendre à créer et utiliser des méthodes statiques qui appartiennent à la classe plutôt qu'aux instances.

## Instructions

1. Complétez la classe UtilitaireStatique avec des méthodes statiques
2. Appelez les méthodes statiques sans créer d'instance
3. Comparez avec les méthodes d'instance

## À Faire

- Créer une méthode statique `maximum(int a, int b)` qui retourne le maximum
- Créer une méthode statique `calculerAireCercle(double rayon)` qui calcule l'aire
- Créer une méthode d'instance pour comparaison
- Appeler les méthodes statiques directement sur la classe

## Notes

- Méthodes statiques : déclarées avec le mot-clé `static`
- Appel : `NomClasse.nomMethode()` ou `objet.nomMethode()`
- Pas besoin de créer un objet pour appeler une méthode statique
- Les méthodes statiques ne peuvent accéder qu'aux membres static de la classe
- Utiles pour les fonctions utilitaires qui ne dépendent pas d'un état d'objet

## Résultat Attendu

```
Maximum : 10
Aire du cercle : 28.274333882308138
Méthode d'instance appelée
```
