# Exercice 4 : Redéfinition de Méthodes (Override)

## Objectif

Apprendre à redéfinir des méthodes héritées avec @Override et comprendre les règles de redéfinition.

## Instructions

1. Créez une hiérarchie de classes
2. Redéfinissez des méthodes avec @Override
3. Testez le polymorphisme

## À Faire

- Créer une classe Animal avec une méthode sePresenter()
- Créer plusieurs classes qui étendent Animal (Chien, Chat)
- Redéfinir sePresenter() dans chaque classe
- Utiliser @Override pour indiquer explicitement la redéfinition

## Notes

- `@Override` : annotation qui indique qu'on redéfinit une méthode
- La signature doit être exactement la même (nom, paramètres, type de retour)
- Le polymorphisme permet d'appeler la bonne méthode selon le type réel de l'objet

## Résultat Attendu

```
Je suis un animal générique
Je suis un chien, je m'appelle Rex
Je suis un chat, je m'appelle Minou
```
