# Exercice 1 : Créer une Relation de Composition

## Objectif

Comprendre la composition (has-a) en créant une classe qui contient d'autres objets.

## Instructions

1. Créez une classe Moteur avec une méthode demarrer()
2. Créez une classe Voiture qui utilise la composition pour contenir un Moteur
3. Démontrez que la Voiture "a-un" Moteur (relation has-a)

## À Faire

- Créer une classe Moteur avec méthode demarrer() qui affiche "Moteur démarré"
- Créer une classe Voiture avec un attribut privé Moteur
- Ajouter un constructeur à Voiture qui initialise le Moteur
- Créer une méthode demarrer() dans Voiture qui utilise le moteur
- Instancier une Voiture et appeler demarrer()

## Notes

- Composition : relation "a-un" (has-a) - Voiture HAS-A Moteur
- Plus flexible que l'héritage : on peut changer le moteur facilement
- Encapsulation : le moteur est privé, l'accès se fait via les méthodes de Voiture

## Résultat Attendu

```
Moteur démarré
Voiture prête à rouler
```

