# 27 - Optional

## Vue d'Ensemble

Optional (Java 8+) est un conteneur qui peut contenir ou non une valeur. Il permet de gérer élégamment les valeurs potentiellement nulles et évite les NullPointerException.

## Concepts Clés

1. **Création** : of(), ofNullable(), empty()
2. **Vérification** : isPresent(), isEmpty()
3. **Extraction** : get(), orElse(), orElseGet()
4. **Transformation** : map(), flatMap(), filter()

## Exemples

### Exemple 1 : Utilisation de Base

```java
import java.util.Optional;

public class ExempleOptional {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Valeur");
        Optional<String> opt2 = Optional.empty();
        
        if (opt1.isPresent()) {
            System.out.println(opt1.get());
        }
        
        String valeur = opt2.orElse("Valeur par défaut");
        System.out.println(valeur);
    }
}
```

## Prérequis

- Sujet 19 : Listes
- Sujet 24 : Lambda Expressions

## Exercices

- **exercise-01** : Créer et utiliser Optional
- **exercise-02** : Utiliser map et flatMap avec Optional
- **exercise-03** : Remplacer les null checks par Optional

## Ressources

- [Optional - Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
