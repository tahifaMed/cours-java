# Exercice 3 : Remplacer les Null Checks par Optional

## Objectif

Apprendre à remplacer les vérifications de null classiques par Optional pour un code plus sûr et expressif.

## Instructions

1. Créez une méthode qui peut retourner null
2. Retournez Optional au lieu de null
3. Utilisez Optional dans le code appelant pour éviter NullPointerException
4. Comparez l'approche avec Optional vs null checks

## À Faire

- Créer une méthode trouverNom(int id) qui retourne Optional<String>
- Si id existe, retourner Optional.of(nom), sinon Optional.empty()
- Dans main(), utiliser la méthode avec map(), orElse(), ifPresent()
- Éviter les NullPointerException
- Montrer l'avantage d'Optional sur les null checks

## Notes

- Optional encourage à gérer explicitement l'absence de valeur
- Évite les NullPointerException en forçant la vérification
- Code plus lisible et expressif
- Meilleure pratique : retourner Optional au lieu de null
- ifPresent(Consumer) : exécute une action si une valeur est présente

## Résultat Attendu

```
Nom trouvé : Alice
Nom par défaut : Inconnu
Le nom existe et sa longueur est : 5
Aucun nom trouvé
```

