# Exercice 2 : Créer une Annotation Personnalisée

## Objectif

Apprendre à créer ses propres annotations avec @interface et définir leurs propriétés.

## Instructions

1. Créez une annotation personnalisée avec @interface
2. Définissez des éléments (attributs) dans l'annotation
3. Utilisez @Retention pour spécifier la durée de vie
4. Utilisez @Target pour spécifier où l'annotation peut être appliquée
5. Appliquez l'annotation à des classes et méthodes

## À Faire

- Créer une annotation @Info avec un élément auteur() et version()
- Utiliser @Retention(RetentionPolicy.RUNTIME) pour garder l'annotation à l'exécution
- Utiliser @Target({ElementType.TYPE, ElementType.METHOD}) pour permettre l'utilisation sur classes et méthodes
- Appliquer l'annotation @Info à une classe et une méthode
- Tester l'utilisation

## Notes

- @interface : mot-clé pour créer une annotation
- @Retention : définit quand l'annotation est disponible (SOURCE, CLASS, RUNTIME)
- @Target : définit où l'annotation peut être utilisée (TYPE, METHOD, FIELD, etc.)
- Les éléments d'annotation sont comme des méthodes sans corps
- default value : valeur par défaut pour un élément

## Résultat Attendu

```
Classe annotée avec @Info
Méthode annotée avec @Info
Annotation créée et utilisée avec succès
```

