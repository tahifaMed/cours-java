# 22 - Itérateurs et Streams (Basiques)

## Vue d'Ensemble

Les itérateurs permettent de parcourir les collections de manière standardisée. Les streams (Java 8+) offrent une approche fonctionnelle pour traiter les collections de manière déclarative et parallélisable.

## Concepts Clés

1. **Iterator** : Interface pour parcourir les collections
2. **Enhanced for loop** : Syntaxe simplifiée utilisant Iterator
3. **Stream API** : Introduction aux streams (map, filter)
4. **Opérations terminales** : collect, forEach

## Exemples

### Exemple 1 : Iterator

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExempleIterator {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("A");
        liste.add("B");
        liste.add("C");
        
        Iterator<String> it = liste.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
            if (element.equals("B")) {
                it.remove();  // Suppression sécurisée
            }
        }
    }
}
```

### Exemple 2 : Enhanced For Loop

```java
public class EnhancedFor {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        
        // Syntaxe simplifiée
        for (Integer n : nombres) {
            System.out.println(n);
        }
    }
}
```

### Exemple 3 : Streams Basiques

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasiques {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filtrer les nombres pairs et les multiplier par 2
        List<Integer> resultat = nombres.stream()
            .filter(n -> n % 2 == 0)      // Filtre les pairs
            .map(n -> n * 2)               // Multiplie par 2
            .collect(Collectors.toList()); // Collecte les résultats
        
        System.out.println(resultat);  // [4, 8, 12, 16, 20]
    }
}
```

## Prérequis

- Sujet 19 : Listes
- Sujet 24 : Lambda Expressions (pour les streams avancés)

## Exercices

- **exercise-01** : Utiliser Iterator pour parcourir des collections
- **exercise-02** : Utiliser enhanced for loop
- **exercise-03** : Introduction aux streams (filter, map)

## Ressources

- [Itérateurs - Oracle](https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html)
- [Streams - Oracle](https://docs.oracle.com/javase/tutorial/collections/streams/index.html)
