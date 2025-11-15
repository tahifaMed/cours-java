# Exercice 4 : Variables d'Instance vs Variables de Classe

## Objectif

Comprendre la différence entre les variables d'instance (une par objet) et les variables de classe (statiques, partagées par tous les objets).

## Instructions

1. Complétez la classe Compteur
2. Ajoutez une variable d'instance et une variable de classe (static)
3. Créez plusieurs objets et observez la différence

## À Faire

- Créer une variable d'instance `int valeur` (une par objet)
- Créer une variable de classe `static int nombreInstances` (partagée)
- Incrémenter nombreInstances dans le constructeur
- Créer une méthode statique pour obtenir le nombre d'instances
- Créer plusieurs objets et vérifier le comportement

## Notes

- Variables d'instance : chaque objet a sa propre copie
- Variables de classe (static) : partagées par tous les objets
- Accès aux variables static : `NomClasse.nomVariable` ou `objet.nomVariable`
- Méthodes static : peuvent être appelées sans créer d'objet
- Méthodes static : ne peuvent accéder qu'aux membres static

## Résultat Attendu

```
c1.valeur : 2
c2.valeur : 1
Instances créées : 3
```
