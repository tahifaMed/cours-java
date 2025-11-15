# Exercice 1 : Simple Factory - Création de Véhicules

## Objectif

Implémenter une Simple Factory pour créer différents types de véhicules selon un paramètre.

## Contexte

Vous devez créer un système de location de véhicules où différents types de véhicules sont créés dynamiquement selon les besoins du client. Chaque véhicule doit implémenter des méthodes communes (démarrer, arrêter).

## À Faire

1. Créer l'interface `Vehicule` avec les méthodes : `demarrer()` et `arreter()`
2. Implémenter trois types de véhicules :
   - `Voiture` : affiche "La voiture démarre"
   - `Moto` : affiche "La moto démarre"
   - `Camion` : affiche "Le camion démarre"
3. Créer la classe `VehiculeFactory` avec une méthode statique `creer(String type)`
4. La factory doit retourner le bon véhicule selon le type ("voiture", "moto", "camion")

## Points Importants

- Utilisez une Simple Factory avec une méthode statique
- Le type de véhicule est passé en paramètre (String)
- Toutes les implémentations doivent utiliser l'interface `Vehicule`
- Gérer les types inconnus avec une exception

## Notes

- Simple Factory : une seule classe factory avec une méthode statique
- Pattern le plus basique du Factory
- Idéal pour des cas simples avec peu de logique de création

## Résultat Attendu

```
Voiture créée: cours.java.designpatterns.factory.Voiture@hashcode
La voiture démarre
La voiture s'arrête

Moto créée: cours.java.designpatterns.factory.Moto@hashcode
La moto démarre
La moto s'arrête

Camion créé: cours.java.designpatterns.factory.Camion@hashcode
Le camion démarre
Le camion s'arrête

Exception: Type de véhicule inconnu: avion
```
