# 35 - Annotations

## Vue d'Ensemble

Les annotations fournissent des métadonnées sur le code. Elles sont utilisées par le compilateur, les outils et les frameworks. Java fournit des annotations intégrées (@Override, @Deprecated) et permet de créer des annotations personnalisées.

## Concepts Clés

1. **Annotations intégrées** : @Override, @Deprecated, @SuppressWarnings
2. **Annotations personnalisées** : Créer ses propres annotations
3. **Retention** : Durée de vie de l'annotation
4. **Target** : Où l'annotation peut être utilisée

## Exemples

### Exemple 1 : Annotations Intégrées

```java
public class ExempleAnnotations {
    @Override
    public String toString() {
        return "Exemple";
    }
    
    @Deprecated
    public void ancienneMethode() {
        // Méthode dépréciée
    }
}
```

### Exemple 2 : Annotation Personnalisée

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MonAnnotation {
    String valeur();
}

@MonAnnotation(valeur = "Test")
public class MaClasse {
}
```

## Prérequis

- Sujet 06 : Classes et objets

## Exercices

- **exercise-01** : Utiliser les annotations intégrées
- **exercise-02** : Créer une annotation personnalisée
- **exercise-03** : Traiter les annotations avec la réflexion

## Ressources

- [Annotations - Oracle](https://docs.oracle.com/javase/tutorial/java/annotations/index.html)
