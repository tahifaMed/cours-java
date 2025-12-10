# 24 - Expressions Lambda

## Vue d'Ensemble

Les expressions lambda introduisent la programmation fonctionnelle en Java. Elles permettent de passer du code comme une valeur et simplifient grandement l'utilisation des interfaces fonctionnelles.

## Concepts Clés

1. **Syntaxe lambda** : (paramètres) -> expression
2. **Interfaces fonctionnelles** : Interfaces avec une seule méthode abstraite
3. **Méthodes de référence** : :: pour référencer des méthodes
4. **Fonctions prédéfinies** : Predicate, Function, Consumer, Supplier

## Exemples

### Exemple 1 : Predicate<T>

**Qu'est-ce que Predicate ?**

`Predicate<T>` est une interface fonctionnelle qui représente une fonction qui prend un argument de type `T` et retourne un `boolean`. Elle est utilisée pour tester des conditions sur des valeurs.

**Quand l'utiliser ?**

- Pour filtrer des collections (avec `filter()` dans les streams)
- Pour valider des données (vérifier si une chaîne est vide, si un nombre est positif, etc.)
- Pour tester des conditions dans des structures conditionnelles
- Pour combiner plusieurs conditions avec `and()`, `or()`, `negate()`

**Caractéristiques principales :**

- Méthode fonctionnelle : `boolean test(T t)`
- Retourne toujours un `boolean`
- Peut être combinée avec d'autres predicates
- Très utile avec les streams Java pour le filtrage

**Cas d'usage typiques :**

- Validation de formulaires
- Filtrage de listes
- Tests conditionnels dans des algorithmes
- Vérification de règles métier

```java
import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args) {
        // Predicate : teste une condition, retourne boolean
        Predicate<Integer> estPair = (n) -> n % 2 == 0;
        Predicate<String> estVide = (s) -> s == null || s.isEmpty();
        Predicate<Integer> estPositif = (n) -> n > 0;
        
        System.out.println(estPair.test(4));      // true
        System.out.println(estPair.test(5));      // false
        System.out.println(estVide.test(""));    // true
        System.out.println(estVide.test("test")); // false
        System.out.println(estPositif.test(10));  // true
        
        // Combinaison de predicates
        Predicate<Integer> estPairEtPositif = estPair.and(estPositif);
        System.out.println(estPairEtPositif.test(6));  // true
        System.out.println(estPairEtPositif.test(-4)); // false
    }
}
```

### Exemple 2 : Function<T,R>

**Qu'est-ce que Function ?**

`Function<T,R>` est une interface fonctionnelle qui représente une fonction qui prend un argument de type `T` et retourne un résultat de type `R`. Elle transforme une valeur d'un type vers un autre type.

**Quand l'utiliser ?**

- Pour transformer des données (mapper une valeur vers une autre)
- Pour convertir des types (String vers Integer, Integer vers String, etc.)
- Pour appliquer des transformations dans les streams (avec `map()`)
- Pour chaîner plusieurs transformations avec `andThen()` ou `compose()`

**Caractéristiques principales :**

- Méthode fonctionnelle : `R apply(T t)`
- Prend un argument et retourne un résultat
- Peut être composée avec d'autres functions
- Essentielle pour la programmation fonctionnelle

**Cas d'usage typiques :**

- Conversion de types de données
- Transformation de collections (map)
- Calculs et transformations mathématiques
- Formatage et parsing de données

```java
import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {
        // Function : transforme T en R
        Function<Integer, Integer> doubler = (n) -> n * 2;
        Function<String, Integer> longueur = (s) -> s.length();
        Function<String, String> majuscules = (s) -> s.toUpperCase();
        Function<Integer, String> toString = (n) -> String.valueOf(n);
        
        System.out.println(doubler.apply(5));              // 10
        System.out.println(longueur.apply("Java"));        // 4
        System.out.println(majuscules.apply("hello"));     // HELLO
        System.out.println(toString.apply(42));            // "42"
        
        // Composition de functions
        Function<Integer, Integer> multiplierPar4 = doubler.andThen(doubler);
        System.out.println(multiplierPar4.apply(3));       // 12
        
        Function<String, String> longueurPuisString = longueur.andThen(toString);
        System.out.println(longueurPuisString.apply("test")); // "4"
    }
}
```

### Exemple 3 : Consumer<T>

**Qu'est-ce que Consumer ?**

`Consumer<T>` est une interface fonctionnelle qui représente une opération qui prend un argument de type `T` et ne retourne rien (void). Elle "consomme" une valeur en effectuant une action dessus.

**Quand l'utiliser ?**

- Pour effectuer des actions sur des valeurs (affichage, enregistrement, etc.)
- Pour itérer sur des collections (avec `forEach()`)
- Pour traiter des éléments sans retourner de valeur
- Pour chaîner plusieurs actions avec `andThen()`

**Caractéristiques principales :**

- Méthode fonctionnelle : `void accept(T t)`
- Ne retourne rien (void)
- Utilisée pour les effets de bord (side effects)
- Parfaite pour l'affichage et les opérations I/O

**Cas d'usage typiques :**

- Affichage de données (System.out.println)
- Enregistrement dans des fichiers ou bases de données
- Envoi de notifications
- Mise à jour d'états externes
- Logging et débogage

```java
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class LambdaConsumer {
    public static void main(String[] args) {
        // Consumer : consomme une valeur, retourne void
        Consumer<String> afficher = (s) -> System.out.println(s);
        Consumer<String> afficherMajuscules = (s) -> System.out.println(s.toUpperCase());
        Consumer<Integer> afficherCarre = (n) -> System.out.println(n * n);
        
        afficher.accept("Hello World");           // Hello World
        afficherMajuscules.accept("java");        // JAVA
        afficherCarre.accept(5);                  // 25
        
        // Utilisation avec des collections
        List<String> mots = Arrays.asList("Java", "Python", "C++");
        mots.forEach(afficher);                   // Affiche chaque mot
        
        // Chaînage de consumers
        Consumer<String> afficherEtMajuscules = afficher.andThen(afficherMajuscules);
        afficherEtMajuscules.accept("test");      // test puis TEST
    }
}
```

### Exemple 4 : Supplier<T>

**Qu'est-ce que Supplier ?**

`Supplier<T>` est une interface fonctionnelle qui représente un fournisseur de valeurs. Elle ne prend aucun argument et retourne une valeur de type `T`. Elle est utilisée pour générer ou fournir des valeurs à la demande.

**Quand l'utiliser ?**

- Pour générer des valeurs aléatoires
- Pour créer des objets (factory pattern)
- Pour fournir des valeurs par défaut
- Pour l'évaluation paresseuse (lazy evaluation)
- Pour obtenir des timestamps ou des valeurs dynamiques

**Caractéristiques principales :**

- Méthode fonctionnelle : `T get()`
- Ne prend aucun paramètre
- Retourne une valeur
- Utile pour la génération et la création d'objets

**Cas d'usage typiques :**

- Génération de données de test
- Création d'objets avec des paramètres dynamiques
- Fourniture de valeurs par défaut
- Obtention de timestamps ou valeurs système
- Implémentation du pattern Factory

```java
import java.util.function.Supplier;
import java.util.Random;

public class LambdaSupplier {
    public static void main(String[] args) {
        // Supplier : fournit une valeur, ne prend pas de paramètre
        Supplier<String> message = () -> "Hello World";
        Supplier<Integer> nombreAleatoire = () -> new Random().nextInt(100);
        Supplier<Double> pi = () -> 3.14159;
        Supplier<String> timestamp = () -> String.valueOf(System.currentTimeMillis());
        
        System.out.println(message.get());              // Hello World
        System.out.println(nombreAleatoire.get());      // Nombre aléatoire
        System.out.println(pi.get());                   // 3.14159
        System.out.println(timestamp.get());            // Timestamp actuel
        
        // Supplier pour créer des objets
        Supplier<StringBuilder> createurStringBuilder = () -> new StringBuilder();
        StringBuilder sb = createurStringBuilder.get();
        sb.append("Test");
        System.out.println(sb.toString());              // Test
    }
}
```

### Exemple 5 : Autres Interfaces Fonctionnelles

**UnaryOperator<T>**

`UnaryOperator<T>` est une spécialisation de `Function<T,T>` où l'argument et le résultat sont du même type. Elle représente une opération unaire (un seul opérande).

**Quand l'utiliser ?**
- Pour des transformations qui conservent le type (carré d'un nombre, mise en majuscules, etc.)
- Pour des opérations mathématiques unaires

**BinaryOperator<T>**

`BinaryOperator<T>` représente une opération qui prend deux arguments du même type et retourne un résultat du même type. C'est une spécialisation de `BiFunction<T,T,T>`.

**Quand l'utiliser ?**
- Pour des opérations binaires (addition, multiplication, maximum, minimum, etc.)
- Pour combiner deux valeurs du même type

**BiFunction<T,U,R>**

`BiFunction<T,U,R>` est similaire à `Function<T,R>` mais prend deux arguments de types `T` et `U` et retourne un résultat de type `R`.

**Quand l'utiliser ?**
- Pour des opérations qui nécessitent deux arguments de types différents
- Pour combiner deux valeurs de types différents

**BiPredicate<T,U>**

`BiPredicate<T,U>` est similaire à `Predicate<T>` mais prend deux arguments de types `T` et `U` pour tester une condition.

**Quand l'utiliser ?**
- Pour comparer deux valeurs
- Pour tester des relations entre deux objets

**BiConsumer<T,U>**

`BiConsumer<T,U>` est similaire à `Consumer<T>` mais prend deux arguments de types `T` et `U` pour effectuer une action.

**Quand l'utiliser ?**
- Pour traiter des paires de valeurs (clé-valeur dans une Map)
- Pour effectuer des actions qui nécessitent deux paramètres

```java
import java.util.function.*;

public class LambdaAutres {
    public static void main(String[] args) {
        // UnaryOperator<T> : Function<T,T> spécialisée
        UnaryOperator<Integer> carre = (n) -> n * n;
        UnaryOperator<String> trim = (s) -> s.trim();
        System.out.println(carre.apply(5));        // 25
        
        // BinaryOperator<T> : combine deux valeurs du même type
        BinaryOperator<Integer> addition = (a, b) -> a + b;
        BinaryOperator<Integer> maximum = (a, b) -> a > b ? a : b;
        System.out.println(addition.apply(5, 3));   // 8
        System.out.println(maximum.apply(5, 3));    // 5
        
        // BiFunction<T,U,R> : Function avec deux paramètres
        BiFunction<Integer, Integer, Integer> multiplier = (a, b) -> a * b;
        BiFunction<String, String, String> concatener = (a, b) -> a + b;
        System.out.println(multiplier.apply(4, 5));      // 20
        System.out.println(concatener.apply("Hello ", "World")); // Hello World
        
        // BiPredicate<T,U> : Predicate avec deux paramètres
        BiPredicate<Integer, Integer> estSuperieur = (a, b) -> a > b;
        BiPredicate<String, String> sontEgaux = (a, b) -> a.equals(b);
        System.out.println(estSuperieur.test(5, 3));     // true
        System.out.println(sontEgaux.test("test", "test")); // true
        
        // BiConsumer<T,U> : Consumer avec deux paramètres
        BiConsumer<String, Integer> afficherPair = (s, n) -> 
            System.out.println(s + " : " + n);
        afficherPair.accept("Age", 25);            // Age : 25
    }
}
```

### Exemple 6 : Avec Collections

**Utilisation des lambdas avec les collections**

Les expressions lambda sont particulièrement utiles avec les collections Java, notamment avec l'API Stream introduite en Java 8. Elles permettent d'écrire du code plus concis et lisible pour manipuler des collections.

**Avantages :**

- Code plus concis et lisible
- Style fonctionnel de programmation
- Opérations chaînables (fluent API)
- Meilleure performance avec les streams parallèles

**Méthodes courantes utilisant des lambdas :**

- `filter(Predicate)` : filtre les éléments selon une condition
- `map(Function)` : transforme chaque élément
- `forEach(Consumer)` : effectue une action sur chaque élément
- `reduce(BinaryOperator)` : combine tous les éléments
- `collect(Collector)` : collecte les résultats dans une collection

```java
import java.util.Arrays;
import java.util.List;

public class LambdaCollections {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript");
        
        // Lambda pour filtrer
        mots.stream()
            .filter(mot -> mot.length() > 4)
            .forEach(mot -> System.out.println(mot));
    }
}
```

## Prérequis

- Sujet 10 : Interfaces
- Sujet 19 : Listes

## Exercices

- **exercise-01** : Créer des expressions lambda simples
- **exercise-02** : Utiliser des interfaces fonctionnelles
- **exercise-03** : Utiliser les méthodes de référence

## Ressources

- [Lambda Expressions - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
