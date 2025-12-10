# 25 - API Stream

## Vue d'Ensemble

L'API Stream (Java 8+) permet de traiter les collections de manière fonctionnelle et déclarative. Elle offre des opérations intermédiaires (filter, map) et terminales (collect, reduce) pour manipuler efficacement les données.

## Concepts Clés

1. **Opérations intermédiaires** : filter, map, flatMap, sorted, distinct, limit, skip, peek
2. **Opérations terminales** : collect, reduce, forEach, count, anyMatch, allMatch, noneMatch, findFirst, findAny
3. **Streams parallèles** : Traitement parallèle avec parallelStream()
4. **Collectors** : Collecter les résultats (toList, groupingBy, partitioningBy, joining, etc.)

**Caractéristiques importantes :**
- **Lazy evaluation** : Les opérations intermédiaires ne sont exécutées qu'avec une opération terminale
- **Pipeline** : Les opérations peuvent être enchaînées
- **Non-mutante** : Les streams ne modifient pas la collection source
- **Peut être consommé une seule fois** : Un stream ne peut être utilisé qu'une fois

## Opérations Intermédiaires

Les opérations intermédiaires retournent un nouveau Stream et sont **lazy** (évaluées seulement avec une opération terminale).

### filter()

**Description** : Filtre les éléments selon un prédicat (Predicate). Garde seulement les éléments qui satisfont la condition.

**Signature** : `Stream<T> filter(Predicate<? super T> predicate)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleFilter {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filtrer les nombres pairs
        List<Integer> pairs = nombres.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Nombres pairs : " + pairs); // [2, 4, 6, 8, 10]
        
        // Filtrer les nombres supérieurs à 5
        List<Integer> grands = nombres.stream()
            .filter(n -> n > 5)
            .collect(Collectors.toList());
        System.out.println("Nombres > 5 : " + grands); // [6, 7, 8, 9, 10]
        
        // Filtrer des chaînes
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript", "Go");
        List<String> longs = mots.stream()
            .filter(m -> m.length() > 4)
            .collect(Collectors.toList());
        System.out.println("Mots longs : " + longs); // [Python, JavaScript]
    }
}
```

### map()

**Description** : Transforme chaque élément selon une fonction (Function). Convertit un Stream<T> en Stream<R>.

**Signature** : `<R> Stream<R> map(Function<? super T, ? extends R> mapper)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleMap {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        
        // Multiplier chaque nombre par 2
        List<Integer> doubles = nombres.stream()
            .map(n -> n * 2)
            .collect(Collectors.toList());
        System.out.println("Nombres doublés : " + doubles); // [2, 4, 6, 8, 10]
        
        // Convertir en String
        List<String> strings = nombres.stream()
            .map(n -> String.valueOf(n))
            .collect(Collectors.toList());
        System.out.println("En String : " + strings); // ["1", "2", "3", "4", "5"]
        
        // Mettre en majuscules
        List<String> mots = Arrays.asList("java", "python", "c++");
        List<String> majuscules = mots.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("En majuscules : " + majuscules); // [JAVA, PYTHON, C++]
        
        // Obtenir la longueur
        List<Integer> longueurs = mots.stream()
            .map(String::length)
            .collect(Collectors.toList());
        System.out.println("Longueurs : " + longueurs); // [4, 6, 3]
    }
}
```

### flatMap()

**Description** : Aplatit un Stream de Streams en un seul Stream. Utile quand chaque élément produit plusieurs éléments.

**Signature** : `<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleFlatMap {
    public static void main(String[] args) {
        // Liste de listes
        List<List<Integer>> listes = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9)
        );
        
        // Aplatir en une seule liste
        List<Integer> aplati = listes.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
        System.out.println("Liste aplatie : " + aplati); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        
        // Diviser des chaînes en mots
        List<String> phrases = Arrays.asList("Hello World", "Java Stream", "API");
        List<String> mots = phrases.stream()
            .flatMap(phrase -> Arrays.stream(phrase.split(" ")))
            .collect(Collectors.toList());
        System.out.println("Mots : " + mots); // [Hello, World, Java, Stream, API]
        
        // Extraire les caractères
        List<String> chaines = Arrays.asList("abc", "def", "ghi");
        List<Character> caracteres = chaines.stream()
            .flatMap(s -> s.chars().mapToObj(c -> (char) c))
            .collect(Collectors.toList());
        System.out.println("Caractères : " + caracteres); // [a, b, c, d, e, f, g, h, i]
    }
}
```

### distinct()

**Description** : Élimine les doublons selon equals(). Retourne un Stream avec des éléments uniques.

**Signature** : `Stream<T> distinct()`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleDistinct {
    public static void main(String[] args) {
        // Éliminer les doublons de nombres
        List<Integer> avecDoublons = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5);
        List<Integer> distincts = avecDoublons.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Distincts : " + distincts); // [1, 2, 3, 4, 5]
        
        // Éliminer les doublons de chaînes
        List<String> mots = Arrays.asList("Java", "Python", "Java", "C++", "Python");
        List<String> uniques = mots.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Mots uniques : " + uniques); // [Java, Python, C++]
    }
}
```

### sorted()

**Description** : Trie les éléments. Peut utiliser l'ordre naturel (Comparable) ou un Comparator personnalisé.

**Signature** : 
- `Stream<T> sorted()` - ordre naturel
- `Stream<T> sorted(Comparator<? super T> comparator)` - ordre personnalisé

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleSorted {
    public static void main(String[] args) {
        // Tri naturel (croissant)
        List<Integer> nombres = Arrays.asList(5, 2, 8, 1, 9, 3);
        List<Integer> tries = nombres.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Triés : " + tries); // [1, 2, 3, 5, 8, 9]
        
        // Tri décroissant
        List<Integer> decroissant = nombres.stream()
            .sorted((a, b) -> b.compareTo(a))
            .collect(Collectors.toList());
        System.out.println("Décroissant : " + decroissant); // [9, 8, 5, 3, 2, 1]
        
        // Tri de chaînes
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript");
        List<String> triesAlpha = mots.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Triés alphabétiquement : " + triesAlpha); // [C++, Java, JavaScript, Python]
        
        // Tri par longueur
        List<String> triesLongueur = mots.stream()
            .sorted((a, b) -> Integer.compare(a.length(), b.length()))
            .collect(Collectors.toList());
        System.out.println("Triés par longueur : " + triesLongueur); // [C++, Java, Python, JavaScript]
    }
}
```

### limit()

**Description** : Limite le nombre d'éléments dans le Stream. Retourne les n premiers éléments.

**Signature** : `Stream<T> limit(long maxSize)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleLimit {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Prendre les 5 premiers
        List<Integer> premiers = nombres.stream()
            .limit(5)
            .collect(Collectors.toList());
        System.out.println("5 premiers : " + premiers); // [1, 2, 3, 4, 5]
        
        // Filtrer puis limiter
        List<Integer> pairsLimites = nombres.stream()
            .filter(n -> n % 2 == 0)
            .limit(3)
            .collect(Collectors.toList());
        System.out.println("3 premiers pairs : " + pairsLimites); // [2, 4, 6]
    }
}
```

### skip()

**Description** : Ignore les n premiers éléments et retourne le reste.

**Signature** : `Stream<T> skip(long n)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleSkip {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Ignorer les 3 premiers
        List<Integer> sautes = nombres.stream()
            .skip(3)
            .collect(Collectors.toList());
        System.out.println("Après skip(3) : " + sautes); // [4, 5, 6, 7, 8, 9, 10]
        
        // Filtrer puis ignorer
        List<Integer> pairsSautes = nombres.stream()
            .filter(n -> n % 2 == 0)
            .skip(2)
            .collect(Collectors.toList());
        System.out.println("Pairs après skip(2) : " + pairsSautes); // [6, 8, 10]
    }
}
```

### peek()

**Description** : Permet d'effectuer une action sur chaque élément sans modifier le Stream. Utile pour le débogage.

**Signature** : `Stream<T> peek(Consumer<? super T> action)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplePeek {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        
        // Utiliser peek pour afficher les éléments pendant le traitement
        List<Integer> resultat = nombres.stream()
            .peek(n -> System.out.println("Avant filter : " + n))
            .filter(n -> n % 2 == 0)
            .peek(n -> System.out.println("Après filter : " + n))
            .map(n -> n * 2)
            .peek(n -> System.out.println("Après map : " + n))
            .collect(Collectors.toList());
        System.out.println("Résultat final : " + resultat);
    }
}
```

## Opérations Terminales

Les opérations terminales consomment le Stream et produisent un résultat ou un effet de bord.

### collect()

**Description** : Collecte les éléments dans une collection. Utilise un Collector pour spécifier comment collecter.

**Signature** : `<R, A> R collect(Collector<? super T, A, R> collector)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExempleCollect {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        
        // Collecter dans une List
        List<Integer> liste = nombres.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Liste : " + liste); // [2, 4]
        
        // Collecter dans un Set (élimine automatiquement les doublons)
        Set<Integer> set = nombres.stream()
            .collect(Collectors.toSet());
        System.out.println("Set : " + set);
        
        // Joindre des chaînes
        List<String> mots = Arrays.asList("Java", "Python", "C++");
        String joint = mots.stream()
            .collect(Collectors.joining(", "));
        System.out.println("Joint : " + joint); // Java, Python, C++
    }
}
```

### reduce()

**Description** : Réduit les éléments en une seule valeur en utilisant une fonction d'accumulation.

**Signature** : 
- `Optional<T> reduce(BinaryOperator<T> accumulator)`
- `T reduce(T identity, BinaryOperator<T> accumulator)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExempleReduce {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        
        // Somme avec valeur initiale
        int somme = nombres.stream()
            .reduce(0, (a, b) -> a + b);
        System.out.println("Somme : " + somme); // 15
        
        // Produit
        int produit = nombres.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println("Produit : " + produit); // 120
        
        // Maximum
        Optional<Integer> max = nombres.stream()
            .reduce((a, b) -> a > b ? a : b);
        System.out.println("Maximum : " + max.orElse(0)); // 5
        
        // Minimum
        Optional<Integer> min = nombres.stream()
            .reduce((a, b) -> a < b ? a : b);
        System.out.println("Minimum : " + min.orElse(0)); // 1
        
        // Concaténation de chaînes
        List<String> mots = Arrays.asList("Java", "Python", "C++");
        String concat = mots.stream()
            .reduce("", (a, b) -> a + " " + b)
            .trim();
        System.out.println("Concaténation : " + concat); // Java Python C++
    }
}
```

### forEach()

**Description** : Exécute une action sur chaque élément. Opération terminale avec effet de bord.

**Signature** : `void forEach(Consumer<? super T> action)`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;

public class ExempleForEach {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript");
        
        // Afficher chaque élément
        mots.stream()
            .forEach(System.out::println);
        
        // Afficher avec transformation
        mots.stream()
            .map(String::toUpperCase)
            .forEach(m -> System.out.println("Langage : " + m));
        
        // Filtrer puis afficher
        mots.stream()
            .filter(m -> m.length() > 4)
            .forEach(m -> System.out.println("Mot long : " + m));
    }
}
```

### count()

**Description** : Compte le nombre d'éléments dans le Stream.

**Signature** : `long count()`

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;

public class ExempleCount {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Compter tous les éléments
        long total = nombres.stream().count();
        System.out.println("Total : " + total); // 10
        
        // Compter après filtrage
        long pairs = nombres.stream()
            .filter(n -> n % 2 == 0)
            .count();
        System.out.println("Nombres pairs : " + pairs); // 5
        
        // Compter les éléments uniques
        List<Integer> avecDoublons = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        long distincts = avecDoublons.stream()
            .distinct()
            .count();
        System.out.println("Distincts : " + distincts); // 4
    }
}
```

### anyMatch(), allMatch(), noneMatch()

**Description** : Vérifient si des éléments satisfont un prédicat.

**Signatures** :
- `boolean anyMatch(Predicate<? super T> predicate)` - au moins un élément
- `boolean allMatch(Predicate<? super T> predicate)` - tous les éléments
- `boolean noneMatch(Predicate<? super T> predicate)` - aucun élément

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;

public class ExempleMatch {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        
        // anyMatch : au moins un élément pair ?
        boolean aUnPair = nombres.stream()
            .anyMatch(n -> n % 2 == 0);
        System.out.println("A un pair : " + aUnPair); // true
        
        // allMatch : tous les éléments sont pairs ?
        boolean tousPairs = nombres.stream()
            .allMatch(n -> n % 2 == 0);
        System.out.println("Tous pairs : " + tousPairs); // false
        
        // noneMatch : aucun élément n'est négatif ?
        boolean aucunNegatif = nombres.stream()
            .noneMatch(n -> n < 0);
        System.out.println("Aucun négatif : " + aucunNegatif); // true
        
        // Vérifier si tous les mots commencent par 'J'
        List<String> mots = Arrays.asList("Java", "JavaScript", "Python");
        boolean tousCommenceParJ = mots.stream()
            .allMatch(m -> m.startsWith("J"));
        System.out.println("Tous commencent par J : " + tousCommenceParJ); // false
    }
}
```

### findFirst() et findAny()

**Description** : Trouvent un élément dans le Stream.

**Signatures** :
- `Optional<T> findFirst()` - trouve le premier élément
- `Optional<T> findAny()` - trouve n'importe quel élément (utile pour streams parallèles)

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExempleFind {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Trouver le premier nombre pair
        Optional<Integer> premierPair = nombres.stream()
            .filter(n -> n % 2 == 0)
            .findFirst();
        System.out.println("Premier pair : " + premierPair.orElse(-1)); // 2
        
        // Trouver le premier nombre > 5
        Optional<Integer> premierGrand = nombres.stream()
            .filter(n -> n > 5)
            .findFirst();
        System.out.println("Premier > 5 : " + premierGrand.orElse(-1)); // 6
        
        // Trouver n'importe quel élément (utile pour streams parallèles)
        Optional<Integer> nImporteQuel = nombres.stream()
            .filter(n -> n % 3 == 0)
            .findAny();
        System.out.println("N'importe quel multiple de 3 : " + nImporteQuel.orElse(-1)); // 3
        
        // Avec Optional
        List<String> mots = Arrays.asList("Java", "Python", "C++");
        Optional<String> premierLong = mots.stream()
            .filter(m -> m.length() > 4)
            .findFirst();
        premierLong.ifPresent(m -> System.out.println("Premier mot long : " + m)); // Python
    }
}
```

## Collectors Avancés

### groupingBy()

**Description** : Groupe les éléments selon une fonction de classification.

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExempleGroupingBy {
    public static void main(String[] args) {
        // Grouper par longueur
        List<String> mots = Arrays.asList("Java", "Python", "C++", "Go", "JavaScript");
        Map<Integer, List<String>> parLongueur = mots.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println("Groupés par longueur : " + parLongueur);
        // {2=[Go], 4=[Java, C++], 6=[Python], 10=[JavaScript]}
        
        // Grouper par première lettre
        Map<Character, List<String>> parLettre = mots.stream()
            .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Groupés par première lettre : " + parLettre);
    }
}
```

### partitioningBy()

**Description** : Partitionne en deux groupes selon un prédicat (true/false).

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemplePartitioningBy {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Partitionner en pairs et impairs
        Map<Boolean, List<Integer>> partition = nombres.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pairs : " + partition.get(true));   // [2, 4, 6, 8, 10]
        System.out.println("Impairs : " + partition.get(false)); // [1, 3, 5, 7, 9]
        
        // Partitionner par longueur
        List<String> mots = Arrays.asList("Java", "Python", "C++", "Go");
        Map<Boolean, List<String>> parLongueur = mots.stream()
            .collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println("Longs (>3) : " + parLongueur.get(true));  // [Java, Python]
        System.out.println("Courts (<=3) : " + parLongueur.get(false)); // [C++, Go]
    }
}
```

### joining()

**Description** : Joint les chaînes avec un délimiteur optionnel.

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleJoining {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript");
        
        // Joindre sans délimiteur
        String joint = mots.stream()
            .collect(Collectors.joining());
        System.out.println("Joint : " + joint); // JavaPythonC++JavaScript
        
        // Joindre avec délimiteur
        String jointDelimiteur = mots.stream()
            .collect(Collectors.joining(", "));
        System.out.println("Joint avec délimiteur : " + jointDelimiteur); // Java, Python, C++, JavaScript
        
        // Joindre avec préfixe et suffixe
        String jointComplet = mots.stream()
            .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Joint complet : " + jointComplet); // [Java, Python, C++, JavaScript]
    }
}
```

### toMap()

**Description** : Collecte dans une Map avec des fonctions pour les clés et valeurs.

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExempleToMap {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript");
        
        // Créer une map : mot -> longueur
        Map<String, Integer> longueurs = mots.stream()
            .collect(Collectors.toMap(
                mot -> mot,           // clé
                String::length        // valeur
            ));
        System.out.println("Map longueurs : " + longueurs);
        // {Java=4, Python=6, C++=3, JavaScript=10}
        
        // Créer une map : première lettre -> mot
        Map<Character, String> parLettre = mots.stream()
            .collect(Collectors.toMap(
                s -> s.charAt(0),    // clé
                s -> s,               // valeur
                (existing, replacement) -> existing // résolution de conflit
            ));
        System.out.println("Par première lettre : " + parLettre);
    }
}
```

## Exemples Complets

### Exemple 1 : Pipeline Complexe

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PipelineComplexe {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Pipeline : filtrer pairs -> multiplier par 2 -> prendre 3 premiers -> collecter
        List<Integer> resultat = nombres.stream()
            .filter(n -> n % 2 == 0)      // [2, 4, 6, 8, 10]
            .map(n -> n * 2)              // [4, 8, 12, 16, 20]
            .limit(3)                     // [4, 8, 12]
            .collect(Collectors.toList());
        
        System.out.println("Résultat : " + resultat); // [4, 8, 12]
    }
}
```

### Exemple 2 : Streams Parallèles

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsParalleles {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Stream parallèle pour traitement multi-thread
        List<Integer> pairs = nombres.parallelStream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .collect(Collectors.toList());
        
        System.out.println("Résultat parallèle : " + pairs);
        
        // Attention : l'ordre peut être différent avec parallelStream()
        // Utilisez forEachOrdered() si l'ordre est important
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
