# 38 - JavaDoc et Documentation

## Vue d'Ensemble

JavaDoc permet de générer de la documentation automatique à partir de commentaires spéciaux dans le code. C'est le standard pour documenter les API Java.

## Concepts Clés

1. **Commentaires JavaDoc** : /** ... */
2. **Tags** : @param, @return, @throws, @author
3. **Génération** : Outil javadoc pour créer la documentation
4. **HTML** : Documentation générée en HTML

## Exemples

### Exemple 1 : Documentation JavaDoc

```java
/**
 * Cette classe représente une calculatrice simple.
 * 
 * @author Votre Nom
 * @version 1.0
 */
public class Calculatrice {
    /**
     * Additionne deux nombres.
     * 
     * @param a Le premier nombre
     * @param b Le deuxième nombre
     * @return La somme de a et b
     */
    public int additionner(int a, int b) {
        return a + b;
    }
}
```

## Prérequis

- Sujet 01 : Les bases de Java (commentaires)

## Exercices

- **exercise-01** : Documenter une classe avec JavaDoc
- **exercise-02** : Utiliser les tags JavaDoc
- **exercise-03** : Générer la documentation HTML

## Ressources

- [JavaDoc - Oracle](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)
