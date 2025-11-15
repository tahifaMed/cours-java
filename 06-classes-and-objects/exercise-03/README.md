# Exercice 3 : Utilisation du Mot-clé this

## Objectif

Comprendre et utiliser le mot-clé `this` pour distinguer les paramètres des attributs de la classe.

## Instructions

1. Complétez la classe Rectangle
2. Utilisez `this` dans le constructeur pour distinguer les paramètres des attributs
3. Utilisez `this` dans les méthodes (optionnel mais bon pour la clarté)

## À Faire

- Créer un constructeur qui utilise `this` pour assigner les valeurs
- Créer des méthodes qui utilisent `this` pour accéder aux attributs
- Créer des objets Rectangle et tester les méthodes

## Notes

- `this` fait référence à l'objet courant (l'instance actuelle)
- `this.attribut` permet d'accéder explicitement à un attribut de l'objet
- Utile quand un paramètre a le même nom qu'un attribut
- Peut être utilisé dans n'importe quelle méthode (pas seulement les constructeurs)

## Résultat Attendu

```
Rectangle créé : largeur=5.0, hauteur=3.0
Aire du rectangle : 15.0
Nouvelle taille : largeur=8.0, hauteur=6.0
```
