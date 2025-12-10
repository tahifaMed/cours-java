# 34 - Réflexion

## Vue d'Ensemble

La réflexion permet d'examiner et de manipuler des classes, méthodes et champs à l'exécution. C'est une fonctionnalité puissante utilisée par les frameworks mais qui doit être utilisée avec précaution.

## Concepts Clés

1. **Class** : Objet représentant une classe
2. **Méthodes** : Examiner et invoquer des méthodes
3. **Champs** : Accéder aux attributs
4. **Constructeurs** : Créer des instances dynamiquement

## Exemples

### Exemple 1 : Obtenir la Class

```java
public class ReflectionExemple {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        System.out.println("Nom de la classe : " + clazz.getName());
    }
}
```

## Prérequis

- Sujet 06 : Classes et objets

## Exercices

- **exercise-01** : Obtenir des informations sur une classe
- **exercise-02** : Invoquer des méthodes avec la réflexion
- **exercise-03** : Accéder aux champs privés

## Ressources

- [Réflexion - Oracle](https://docs.oracle.com/javase/tutorial/reflect/index.html)
