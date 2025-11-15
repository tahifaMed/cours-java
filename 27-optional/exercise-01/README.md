# Exercice 1 : Créer et Utiliser Optional

## Objectif

Apprendre à créer des Optional et vérifier la présence de valeurs.

## Instructions

1. Créez des Optional avec of(), ofNullable() et empty()
2. Vérifiez si une valeur est présente avec isPresent() et isEmpty()
3. Extrayez la valeur avec get(), orElse(), orElseGet()

## À Faire

- Créer Optional.of("Valeur") - valeur non-null garantie
- Créer Optional.ofNullable(null) - peut être null
- Créer Optional.empty() - vide
- Vérifier avec isPresent() et isEmpty()
- Extraire avec get() (si présent)
- Extraire avec orElse("Par défaut")
- Extraire avec orElseGet(() -> "Valeur par défaut")

## Notes

- Optional<T> = conteneur qui peut contenir ou non une valeur de type T
- of(value) : crée un Optional avec une valeur non-null (lève exception si null)
- ofNullable(value) : crée un Optional, peut être null
- empty() : crée un Optional vide
- isPresent() : vérifie si une valeur est présente
- get() : extrait la valeur (lève exception si vide)
- orElse(defaultValue) : retourne la valeur ou defaultValue

## Résultat Attendu

```
Optional avec valeur : true
Optional vide : false
Valeur : Valeur
Valeur par défaut (orElse) : Par défaut
Valeur par défaut (orElseGet) : Valeur par défaut
```

