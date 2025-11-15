# Exercice 1 : Polymorphisme de Base

## Objectif

Comprendre le polymorphisme : une référence de type parent peut pointer vers un objet de type enfant.

## Instructions

1. Créez une hiérarchie de classes
2. Utilisez des références de type parent pour pointer vers des objets enfants
3. Observez que les méthodes redéfinies sont appelées selon le type réel

## À Faire

- Créer une classe Animal avec méthode faireDuBruit()
- Créer des classes Chien et Chat qui étendent Animal
- Redéfinir faireDuBruit() dans chaque classe
- Créer des références Animal qui pointent vers Chien et Chat

## Notes

- Polymorphisme : même référence, comportement différent selon le type réel
- La méthode appelée dépend du type réel de l'objet, pas du type de la référence
- C'est la liaison dynamique (runtime binding) vs liaison statique (compile-time)

## Résultat Attendu

```
Le chien aboie
Le chat miaule
```
