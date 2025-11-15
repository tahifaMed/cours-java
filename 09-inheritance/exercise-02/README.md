# Exercice 2 : Utilisation de super

## Objectif

Apprendre à utiliser le mot-clé `super` pour accéder aux membres de la classe parente.

## Instructions

1. Créez une hiérarchie de classes avec super
2. Utilisez super dans les constructeurs
3. Utilisez super pour appeler les méthodes du parent

## À Faire

- Créer une classe Forme avec un constructeur et une méthode dessiner()
- Créer une classe Cercle qui étend Forme
- Utiliser super() dans le constructeur de Cercle
- Utiliser super.dessiner() dans la méthode redéfinie

## Notes

- `super()` : appelle le constructeur du parent (doit être la première instruction)
- `super.methode()` : appelle la méthode du parent (dans une méthode redéfinie)
- Utile pour réutiliser le code du parent avant d'ajouter des fonctionnalités

## Résultat Attendu

```
Dessin d'une forme Rouge
C'est un cercle de rayon 5.0
Aire du cercle : 78.53981633974483
```
