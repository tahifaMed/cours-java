# Exercice 3 : Choisir entre Composition et Héritage

## Objectif

Apprendre à choisir entre composition et héritage selon le contexte.

## Instructions

1. Analyser un problème : créer un système de bibliothèque
2. Utiliser la composition pour les relations "a-un"
3. Utiliser l'héritage uniquement pour les relations "est-un"

## À Faire

- Créer classe Auteur avec nom
- Créer classe Livre qui contient un Auteur (composition : Livre HAS-A Auteur)
- Créer classe LivreNumerique qui étend Livre (héritage : LivreNumerique IS-A Livre)
- Créer classe Bibliotheque qui contient des Livres (composition : Bibliotheque HAS-A Livres)
- Démontrer l'utilisation des deux concepts

## Notes

- Utiliser l'héritage quand la relation "est-un" est toujours vraie
- Utiliser la composition pour les relations "a-un" ou "utilise"
- Composition = plus flexible, moins de couplage
- Héritage = relation permanente, couplage plus fort

## Résultat Attendu

```
Livre "Java pour débutants" écrit par Auteur: Martin Dupont
Livre numérique "Java avancé" écrit par Auteur: Sophie Martin
Bibliothèque contient 2 livre(s)
```

