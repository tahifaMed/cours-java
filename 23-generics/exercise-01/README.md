# Exercice 1 : Créer une Classe Générique

## Objectif

Apprendre à créer une classe générique avec des paramètres de type.

## Instructions

1. Créez une classe générique Boite<T>
2. Ajoutez un attribut privé de type T
3. Créez des méthodes getter et setter
4. Instanciez la classe avec différents types

## À Faire

- Créer une classe Boite<T> avec un attribut privé T contenu
- Ajouter setContenu(T contenu) et getContenu() : T
- Créer une instance Boite<String> et y mettre une chaîne
- Créer une instance Boite<Integer> et y mettre un entier
- Afficher le contenu des boîtes

## Notes

- <T> = paramètre de type (type placeholder)
- T peut être remplacé par n'importe quel type
- Sécurité de type : pas besoin de cast
- Une Boite<String> ne peut contenir que des String
- Convention : T pour Type, E pour Element, K pour Key, V pour Value

## Résultat Attendu

```
Contenu de boiteString : Bonjour
Contenu de boiteInt : 42
Contenu de boiteDouble : 3.14
```

