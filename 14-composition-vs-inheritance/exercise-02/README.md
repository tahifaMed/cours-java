# Exercice 2 : Comparer Composition et Héritage

## Objectif

Comparer les deux approches de réutilisation de code : héritage (is-a) et composition (has-a).

## Instructions

1. Créez une hiérarchie avec héritage (Animal -> Chien)
2. Créez une relation avec composition (Ordinateur -> Processeur)
3. Montrez les différences entre les deux approches

## À Faire

- Créer classe Animal avec méthode manger()
- Créer classe Chien qui étend Animal (héritage : Chien IS-A Animal)
- Créer classe Processeur avec méthode executer()
- Créer classe Ordinateur qui contient un Processeur (composition : Ordinateur HAS-A Processeur)
- Utiliser les deux approches et observer les différences

## Notes

- Héritage (is-a) : relation forte, couplage élevé
- Composition (has-a) : relation flexible, faible couplage
- "Favoriser la composition sur l'héritage" est une bonne pratique
- L'héritage est approprié quand la relation "est-un" est vraiment vraie

## Résultat Attendu

```
Le chien mange
Processeur exécute une tâche
Ordinateur utilise le processeur
```

