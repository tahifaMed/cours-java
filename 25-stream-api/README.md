# 25 - API Stream

## Vue d'Ensemble

L'API Stream (Java 8+) permet de traiter les collections de manière fonctionnelle et déclarative. Elle offre des opérations intermédiaires (filter, map) et terminales (collect, reduce) pour manipuler efficacement les données.

## Concepts Clés

1. **Opérations intermédiaires** : filter, map, flatMap, sorted, distinct
2. **Opérations terminales** : collect, reduce, forEach, count, anyMatch
3. **Streams parallèles** : Traitement parallèle avec parallelStream()
4. **Collectors** : Collecter les résultats (toList, groupingBy, etc.)

## Exemples

### Exemple 1 : Opérations de Base

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasiques {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> pairs = nombres.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .collect(Collectors.toList());
        
        System.out.println(pairs);
    }
}
```

### Exemple 2 : Reduce

```java
public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        
        int somme = nombres.stream()
            .reduce(0, (a, b) -> a + b);
        
        System.out.println(somme);  // 15
    }
}
```

## Prérequis

- Sujet 22 : Itérateurs et Streams (basiques)
- Sujet 24 : Lambda Expressions

## Exercices

- **exercise-01** : Utiliser filter et map
- **exercise-02** : Utiliser reduce pour agréger
- **exercise-03** : Utiliser collectors avancés
- **exercise-04** : Streams parallèles

## Ressources

- [Stream API - Oracle](https://docs.oracle.com/javase/tutorial/collections/streams/index.html)
