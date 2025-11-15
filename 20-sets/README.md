# 20 - Ensembles (Sets)

## Vue d'Ensemble

Les sets sont des collections qui ne contiennent pas de doublons. Les principales implémentations sont HashSet (ordre non garanti), LinkedHashSet (ordre d'insertion), et TreeSet (ordre trié).

## Concepts Clés

1. **Interface Set** : Collections sans doublons
2. **HashSet** : Accès rapide, ordre non garanti
3. **LinkedHashSet** : Conserve l'ordre d'insertion
4. **TreeSet** : Éléments triés automatiquement

## Exemples

### Exemple 1 : HashSet

```java
import java.util.HashSet;
import java.util.Set;

public class ExempleHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");  // Ignoré (déjà présent)
        
        System.out.println(set.size());  // 2
        System.out.println(set.contains("Java"));  // true
    }
}
```

### Exemple 2 : TreeSet

```java
import java.util.TreeSet;
import java.util.Set;

public class ExempleTreeSet {
    public static void main(String[] args) {
        Set<Integer> nombres = new TreeSet<>();
        nombres.add(30);
        nombres.add(10);
        nombres.add(20);
        
        // Automatiquement trié
        for (Integer n : nombres) {
            System.out.println(n);  // 10, 20, 30
        }
    }
}
```

## Prérequis

- Sujet 19 : Listes

## Exercices

- **exercise-01** : Utiliser HashSet pour éviter les doublons
- **exercise-02** : Comparer HashSet, LinkedHashSet et TreeSet
- **exercise-03** : Opérations sur les sets (union, intersection)

## Ressources

- [Interface Set - Oracle](https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html)
