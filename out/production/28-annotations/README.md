# Exercice 3 : Traiter les Annotations avec la Réflexion

## Objectif

Apprendre à lire et traiter les annotations au runtime en utilisant la réflexion (reflection).

## Instructions

1. Créez une annotation avec @Retention(RetentionPolicy.RUNTIME)
2. Appliquez l'annotation à une classe
3. Utilisez la réflexion pour lire l'annotation
4. Accédez aux valeurs des éléments de l'annotation

## À Faire

- Créer une annotation @Description avec un élément texte()
- Utiliser @Retention(RetentionPolicy.RUNTIME) pour pouvoir la lire au runtime
- Appliquer @Description à une classe
- Utiliser getAnnotation() pour récupérer l'annotation
- Afficher les valeurs des éléments de l'annotation
- Vérifier si une annotation est présente avec isAnnotationPresent()

## Notes

- La réflexion permet d'inspecter les classes, méthodes, annotations au runtime
- getAnnotation(Class) : récupère une annotation spécifique
- isAnnotationPresent(Class) : vérifie si une annotation est présente
- getAnnotations() : récupère toutes les annotations
- Nécessite @Retention(RetentionPolicy.RUNTIME) pour être accessible à l'exécution

## Résultat Attendu

```
Annotation présente : true
Description : Cette classe fait quelque chose d'utile
Classe traitée avec succès via réflexion
```

