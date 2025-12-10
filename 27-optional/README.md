# 27 - Optional

## Vue d'Ensemble

Optional (Java 8+) est un conteneur qui peut contenir ou non une valeur. Il permet de gérer élégamment les valeurs potentiellement nulles et évite les NullPointerException.

## Concepts Clés

1. **Création** : of(), ofNullable(), empty()
2. **Vérification** : isPresent(), isEmpty()
3. **Extraction** : get(), orElse(), orElseGet(), orElseThrow()
4. **Transformation** : map(), flatMap(), filter()
5. **Actions conditionnelles** : ifPresent(), ifPresentOrElse()
6. **Chaînage** : Enchaîner plusieurs opérations Optional
7. **Bonnes pratiques** : Quand et comment utiliser Optional

## Exemples

### Exemple 1 : Création et Vérification de Base

**Qu'est-ce qu'Optional ?**

`Optional<T>` est un conteneur qui peut contenir une valeur de type `T` ou être vide. Il a été introduit en Java 8 pour gérer élégamment les valeurs potentiellement nulles et éviter les `NullPointerException`.

**Pourquoi utiliser Optional ?**

- **Sécurité** : Évite les `NullPointerException` en rendant explicite l'absence de valeur
- **Clarté** : Le code exprime clairement qu'une valeur peut être absente
- **Fonctionnel** : Permet un style de programmation fonctionnel avec `map()`, `filter()`, etc.
- **Documentation** : Le type de retour `Optional<T>` indique qu'une valeur peut être absente

**Méthodes de création :**

- `Optional.of(value)` : Crée un Optional avec une valeur (lève exception si null)
- `Optional.ofNullable(value)` : Crée un Optional avec une valeur ou empty si null
- `Optional.empty()` : Crée un Optional vide

**Méthodes de vérification :**

- `isPresent()` : Retourne true si une valeur est présente
- `isEmpty()` : Retourne true si l'Optional est vide (Java 11+)

```java
import java.util.Optional;

public class ExempleOptionalBase {
    public static void main(String[] args) {
        // Création avec of() - la valeur ne doit PAS être null
        Optional<String> opt1 = Optional.of("Valeur");
        System.out.println("opt1 est présent : " + opt1.isPresent()); // true
        
        // Création avec ofNullable() - accepte null
        Optional<String> opt2 = Optional.ofNullable("Valeur");
        Optional<String> opt3 = Optional.ofNullable(null); // Crée un Optional.empty()
        System.out.println("opt2 est présent : " + opt2.isPresent()); // true
        System.out.println("opt3 est vide : " + opt3.isEmpty()); // true
        
        // Création d'un Optional vide
        Optional<String> opt4 = Optional.empty();
        System.out.println("opt4 est vide : " + opt4.isEmpty()); // true
        
        // Vérification avant extraction
        if (opt1.isPresent()) {
            System.out.println("Valeur de opt1 : " + opt1.get());
        }
        
        // ❌ Attention : opt3.get() lèverait NoSuchElementException
        // String valeur = opt3.get(); // ❌ Ne pas faire ça sans vérifier
    }
}
```

### Exemple 2 : Extraction de Valeurs

**Méthodes d'extraction :**

- `get()` : Retourne la valeur (lève exception si vide) - **À éviter sauf si sûr**
- `orElse(defaultValue)` : Retourne la valeur ou une valeur par défaut
- `orElseGet(supplier)` : Retourne la valeur ou calcule une valeur par défaut (lazy)
- `orElseThrow()` : Retourne la valeur ou lève une exception
- `orElseThrow(exceptionSupplier)` : Retourne la valeur ou lève une exception personnalisée

**Quand utiliser orElse vs orElseGet ?**

- `orElse()` : Utilisez quand la valeur par défaut est simple (ex: chaîne littérale)
- `orElseGet()` : Utilisez quand le calcul de la valeur par défaut est coûteux (lazy evaluation)

```java
import java.util.Optional;
import java.util.NoSuchElementException;

public class ExempleExtraction {
    public static void main(String[] args) {
        Optional<String> optPresent = Optional.of("Hello");
        Optional<String> optVide = Optional.empty();
        
        // orElse() - valeur par défaut simple
        String valeur1 = optPresent.orElse("Par défaut");
        System.out.println("Valeur présente : " + valeur1); // Hello
        
        String valeur2 = optVide.orElse("Par défaut");
        System.out.println("Valeur par défaut : " + valeur2); // Par défaut
        
        // orElseGet() - calcul lazy de la valeur par défaut
        String valeur3 = optVide.orElseGet(() -> {
            System.out.println("Calcul de la valeur par défaut...");
            return "Valeur calculée";
        });
        System.out.println("Valeur calculée : " + valeur3);
        
        // orElseThrow() - lève NoSuchElementException si vide
        try {
            String valeur4 = optVide.orElseThrow();
        } catch (NoSuchElementException e) {
            System.out.println("Exception levée : " + e.getMessage());
        }
        
        // orElseThrow() avec exception personnalisée
        try {
            String valeur5 = optVide.orElseThrow(() -> 
                new IllegalArgumentException("Valeur manquante"));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception personnalisée : " + e.getMessage());
        }
        
        // ❌ Ne pas utiliser get() sans vérifier (mauvaise pratique)
        // String valeur = optVide.get(); // ❌ Lève NoSuchElementException
    }
}
```

### Exemple 3 : Transformation avec map()

**Qu'est-ce que map() ?**

`map()` transforme la valeur contenue dans l'Optional si elle est présente, sinon retourne un Optional vide. C'est similaire à `map()` dans les streams.

**Syntaxe :**
```java
Optional<R> map(Function<? super T, ? extends R> mapper)
```

**Caractéristiques :**

- Si l'Optional est vide, retourne `Optional.empty()` sans exécuter la fonction
- Si l'Optional contient une valeur, applique la fonction et retourne le résultat dans un Optional
- Permet l'enchaînement de transformations

```java
import java.util.Optional;

public class ExempleMap {
    public static void main(String[] args) {
        // Transformation simple
        Optional<String> optString = Optional.of("Hello");
        Optional<Integer> longueur = optString.map(String::length);
        System.out.println("Longueur : " + longueur.orElse(0)); // 5
        
        // Transformation avec lambda
        Optional<Integer> optInt = Optional.of(10);
        Optional<Integer> doubleOpt = optInt.map(n -> n * 2);
        System.out.println("Nombre doublé : " + doubleOpt.orElse(0)); // 20
        
        // Enchaînement de transformations
        Optional<String> optNom = Optional.of("java");
        Optional<String> majuscules = optNom
            .map(String::toUpperCase)
            .map(s -> s + "!");
        System.out.println("Nom transformé : " + majuscules.orElse("")); // JAVA!
        
        // Avec Optional vide - la transformation n'est pas exécutée
        Optional<String> optVide = Optional.empty();
        Optional<Integer> longueurVide = optVide.map(String::length);
        System.out.println("Longueur (vide) : " + longueurVide.orElse(-1)); // -1
        
        // Transformation complexe
        Optional<String> optEmail = Optional.of("user@example.com");
        Optional<String> domaine = optEmail
            .map(email -> email.split("@"))
            .map(parts -> parts.length > 1 ? parts[1] : "");
        System.out.println("Domaine : " + domaine.orElse("Inconnu")); // example.com
    }
}
```

### Exemple 4 : flatMap() pour Éviter Optional<Optional<T>>

**Qu'est-ce que flatMap() ?**

`flatMap()` est utilisé quand la fonction de transformation retourne elle-même un `Optional`. Il "aplatit" le résultat pour éviter `Optional<Optional<T>>`.

**Différence entre map() et flatMap() :**

- `map()` : `Optional<T>` → `Optional<R>` (la fonction retourne R)
- `flatMap()` : `Optional<T>` → `Optional<R>` (la fonction retourne `Optional<R>`)

**Quand utiliser flatMap() ?**

Quand vous avez une méthode qui retourne `Optional<T>` et vous voulez l'appeler sur une valeur dans un Optional.

```java
import java.util.Optional;

public class ExempleFlatMap {
    
    // Méthode qui retourne Optional
    static Optional<String> trouverNom(int id) {
        if (id == 1) {
            return Optional.of("Alice");
        } else if (id == 2) {
            return Optional.of("Bob");
        }
        return Optional.empty();
    }
    
    // Méthode qui retourne Optional
    static Optional<Integer> trouverAge(String nom) {
        if ("Alice".equals(nom)) {
            return Optional.of(25);
        } else if ("Bob".equals(nom)) {
            return Optional.of(30);
        }
        return Optional.empty();
    }
    
    public static void main(String[] args) {
        Optional<Integer> id = Optional.of(1);
        
        // ❌ Problème avec map() - crée Optional<Optional<String>>
        Optional<Optional<String>> nomDouble = id.map(ExempleFlatMap::trouverNom);
        System.out.println("Avec map() : " + nomDouble); // Optional[Optional[Alice]]
        
        // ✅ Solution avec flatMap() - aplatit le résultat
        Optional<String> nom = id.flatMap(ExempleFlatMap::trouverNom);
        System.out.println("Avec flatMap() : " + nom); // Optional[Alice]
        
        // Enchaînement avec flatMap()
        Optional<Integer> age = id
            .flatMap(ExempleFlatMap::trouverNom)  // Optional<String>
            .flatMap(ExempleFlatMap::trouverAge); // Optional<Integer>
        System.out.println("Âge trouvé : " + age.orElse(-1)); // 25
        
        // Avec Optional vide
        Optional<Integer> idVide = Optional.empty();
        Optional<String> nomVide = idVide.flatMap(ExempleFlatMap::trouverNom);
        System.out.println("Nom (vide) : " + nomVide.orElse("Inconnu")); // Inconnu
        
        // Exemple pratique : chaîne de méthodes qui retournent Optional
        Optional<String> resultat = Optional.of(2)
            .flatMap(ExempleFlatMap::trouverNom)
            .map(String::toUpperCase)
            .filter(n -> n.length() > 2);
        System.out.println("Résultat final : " + resultat.orElse("Non trouvé")); // BOB
    }
}
```

### Exemple 5 : filter() pour Filtrer les Valeurs

**Qu'est-ce que filter() ?**

`filter()` garde la valeur dans l'Optional si elle satisfait un prédicat, sinon retourne un Optional vide.

**Syntaxe :**
```java
Optional<T> filter(Predicate<? super T> predicate)
```

**Utilisation :**

- Valider une valeur avant de l'utiliser
- Appliquer des conditions sur les valeurs
- Enchaîner avec `map()` et `flatMap()`

```java
import java.util.Optional;

public class ExempleFilter {
    public static void main(String[] args) {
        // Filtrer un nombre pair
        Optional<Integer> optPair = Optional.of(10);
        Optional<Integer> filtrePair = optPair.filter(n -> n % 2 == 0);
        System.out.println("Nombre pair : " + filtrePair); // Optional[10]
        
        // Filtrer un nombre impair (sera vide)
        Optional<Integer> optImpair = Optional.of(11);
        Optional<Integer> filtreImpair = optImpair.filter(n -> n % 2 == 0);
        System.out.println("Nombre pair (impair) : " + filtreImpair); // Optional.empty
        
        // Filtrer une chaîne
        Optional<String> optEmail = Optional.of("user@example.com");
        Optional<String> emailValide = optEmail.filter(e -> e.contains("@"));
        System.out.println("Email valide : " + emailValide.orElse("Invalide")); // user@example.com
        
        // Enchaînement : map() puis filter()
        Optional<String> optNom = Optional.of("Alice");
        Optional<String> resultat = optNom
            .map(String::toUpperCase)
            .filter(n -> n.length() > 3);
        System.out.println("Nom filtré : " + resultat.orElse("Trop court")); // ALICE
        
        // Exemple pratique : validation d'âge
        Optional<Integer> age = Optional.of(25);
        Optional<Integer> ageValide = age.filter(a -> a >= 18 && a <= 100);
        System.out.println("Âge valide : " + ageValide.orElse(-1)); // 25
        
        Optional<Integer> ageInvalide = Optional.of(150);
        Optional<Integer> ageInvalideFiltre = ageInvalide.filter(a -> a >= 18 && a <= 100);
        System.out.println("Âge invalide : " + ageInvalideFiltre.orElse(-1)); // -1
    }
}
```

### Exemple 6 : Actions Conditionnelles (ifPresent, ifPresentOrElse)

**Méthodes d'action conditionnelle :**

- `ifPresent(Consumer)` : Exécute une action si une valeur est présente
- `ifPresentOrElse(Consumer, Runnable)` : Exécute une action si présente, sinon une autre (Java 9+)

**Quand les utiliser ?**

- Pour effectuer des effets de bord (affichage, logging, etc.)
- Pour éviter les blocs `if (isPresent())`
- Pour un style plus fonctionnel

```java
import java.util.Optional;

public class ExempleActionsConditionnelles {
    public static void main(String[] args) {
        Optional<String> optPresent = Optional.of("Hello");
        Optional<String> optVide = Optional.empty();
        
        // ifPresent() - exécute une action si présent
        optPresent.ifPresent(value -> System.out.println("Valeur trouvée : " + value));
        // Affiche : Valeur trouvée : Hello
        
        optVide.ifPresent(value -> System.out.println("Ne sera pas affiché"));
        // Ne fait rien
        
        // ifPresent() avec référence de méthode
        optPresent.ifPresent(System.out::println);
        // Affiche : Hello
        
        // ifPresentOrElse() - action si présent, autre action si vide (Java 9+)
        optPresent.ifPresentOrElse(
            value -> System.out.println("Valeur : " + value),
            () -> System.out.println("Aucune valeur")
        );
        // Affiche : Valeur : Hello
        
        optVide.ifPresentOrElse(
            value -> System.out.println("Valeur : " + value),
            () -> System.out.println("Aucune valeur")
        );
        // Affiche : Aucune valeur
        
        // Exemple pratique : traitement conditionnel
        Optional<Integer> optNombre = Optional.of(42);
        optNombre.ifPresentOrElse(
            n -> System.out.println("Nombre trouvé : " + n),
            () -> System.out.println("Aucun nombre disponible")
        );
    }
}
```

### Exemple 7 : Enchaînement de Plusieurs Opérations

**Chaînage d'opérations Optional**

Vous pouvez enchaîner plusieurs opérations Optional pour créer un pipeline de transformations.

```java
import java.util.Optional;

public class ExempleChaining {
    
    static Optional<String> trouverNom(int id) {
        if (id > 0 && id < 10) {
            return Optional.of("User" + id);
        }
        return Optional.empty();
    }
    
    static Optional<Integer> trouverAge(String nom) {
        if (nom != null && nom.startsWith("User")) {
            return Optional.of(20 + nom.length());
        }
        return Optional.empty();
    }
    
    public static void main(String[] args) {
        // Enchaînement complexe
        Optional<Integer> id = Optional.of(5);
        
        Optional<String> resultat = id
            .flatMap(ExempleChaining::trouverNom)      // Optional<String>
            .map(String::toUpperCase)                   // Optional<String>
            .filter(n -> n.length() > 4)                // Optional<String>
            .map(n -> n + " - Trouvé");                 // Optional<String>
        
        System.out.println("Résultat : " + resultat.orElse("Non trouvé"));
        // Affiche : USER5 - Trouvé
        
        // Pipeline avec plusieurs transformations
        Optional<String> email = Optional.of("user@example.com");
        
        Optional<String> domaine = email
            .map(e -> e.split("@"))
            .filter(parts -> parts.length == 2)
            .map(parts -> parts[1])
            .map(String::toUpperCase)
            .filter(d -> d.contains("EXAMPLE"));
        
        System.out.println("Domaine : " + domaine.orElse("Invalide"));
        // Affiche : EXAMPLE.COM
        
        // Exemple avec Optional vide dans la chaîne
        Optional<Integer> idVide = Optional.of(99);
        Optional<String> resultatVide = idVide
            .flatMap(ExempleChaining::trouverNom)  // Retourne empty
            .map(String::toUpperCase)               // Non exécuté
            .filter(n -> n.length() > 4);           // Non exécuté
        
        System.out.println("Résultat (vide) : " + resultatVide.orElse("Non trouvé"));
        // Affiche : Non trouvé
    }
}
```

### Exemple 8 : Cas d'Usage Pratiques

**Remplacer les null checks par Optional**

Optional est particulièrement utile pour remplacer les vérifications de null et rendre le code plus lisible.

```java
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

public class ExempleCasUsage {
    
    // ❌ Ancienne approche avec null
    public static String trouverNomAncien(int id) {
        Map<Integer, String> noms = new HashMap<>();
        noms.put(1, "Alice");
        noms.put(2, "Bob");
        
        String nom = noms.get(id);
        if (nom != null) {
            return nom.toUpperCase();
        }
        return "Inconnu";
    }
    
    // ✅ Nouvelle approche avec Optional
    public static String trouverNomNouveau(int id) {
        Map<Integer, String> noms = new HashMap<>();
        noms.put(1, "Alice");
        noms.put(2, "Bob");
        
        return Optional.ofNullable(noms.get(id))
            .map(String::toUpperCase)
            .orElse("Inconnu");
    }
    
    // Méthode qui retourne Optional
    public static Optional<String> trouverEmail(int userId) {
        Map<Integer, String> emails = new HashMap<>();
        emails.put(1, "alice@example.com");
        emails.put(2, "bob@example.com");
        
        return Optional.ofNullable(emails.get(userId));
    }
    
    // Méthode qui utilise Optional en chaîne
    public static Optional<String> obtenirDomaineEmail(int userId) {
        return trouverEmail(userId)
            .map(email -> email.split("@"))
            .filter(parts -> parts.length == 2)
            .map(parts -> parts[1]);
    }
    
    public static void main(String[] args) {
        // Utilisation de la méthode qui retourne Optional
        Optional<String> email = trouverEmail(1);
        email.ifPresent(e -> System.out.println("Email : " + e));
        
        // Chaînage avec plusieurs méthodes Optional
        Optional<String> domaine = obtenirDomaineEmail(1);
        System.out.println("Domaine : " + domaine.orElse("Non trouvé"));
        
        // Comparaison ancienne vs nouvelle approche
        System.out.println("Ancienne : " + trouverNomAncien(1));
        System.out.println("Nouvelle : " + trouverNomNouveau(1));
        System.out.println("Non trouvé (ancienne) : " + trouverNomAncien(99));
        System.out.println("Non trouvé (nouvelle) : " + trouverNomNouveau(99));
    }
}
```

### Exemple 9 : Optional avec Streams

**Optional et Streams**

Optional fonctionne bien avec l'API Stream pour un style de programmation fonctionnel.

```java
import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleOptionalStreams {
    
    public static Optional<String> trouverNom(int id) {
        if (id > 0 && id <= 5) {
            return Optional.of("User" + id);
        }
        return Optional.empty();
    }
    
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 99, 4, 5, 200);
        
        // Filtrer et mapper avec Optional
        List<String> noms = ids.stream()
            .map(ExempleOptionalStreams::trouverNom)  // Stream<Optional<String>>
            .filter(Optional::isPresent)               // Garder seulement les présents
            .map(Optional::get)                       // Extraire les valeurs
            .collect(Collectors.toList());
        
        System.out.println("Noms trouvés : " + noms);
        // Affiche : [User1, User2, User4, User5]
        
        // Alternative avec flatMap (plus élégant)
        List<String> nomsFlatMap = ids.stream()
            .map(ExempleOptionalStreams::trouverNom)
            .flatMap(Optional::stream)  // Java 9+ : convertit Optional en Stream
            .collect(Collectors.toList());
        
        System.out.println("Noms (flatMap) : " + nomsFlatMap);
        
        // Avec transformation
        List<String> nomsMajuscules = ids.stream()
            .map(ExempleOptionalStreams::trouverNom)
            .flatMap(Optional::stream)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        
        System.out.println("Noms en majuscules : " + nomsMajuscules);
        
        // Trouver le premier Optional présent
        Optional<String> premierNom = ids.stream()
            .map(ExempleOptionalStreams::trouverNom)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst();
        
        System.out.println("Premier nom : " + premierNom.orElse("Aucun"));
    }
}
```

### Exemple 10 : Bonnes Pratiques et Pièges à Éviter

**Bonnes pratiques :**

1. **Utilisez Optional comme type de retour**, pas comme paramètre
2. **Ne retournez jamais null** depuis une méthode qui retourne Optional
3. **Évitez `get()`** sans vérifier `isPresent()` d'abord
4. **Préférez `orElse()` ou `orElseGet()`** à `get()`
5. **Utilisez `map()` et `flatMap()`** pour les transformations
6. **N'utilisez pas Optional dans les champs de classe** (utilisez null)

**Pièges à éviter :**

```java
import java.util.Optional;

public class ExempleBonnesPratiques {
    
    // ✅ BON : Optional comme type de retour
    public static Optional<String> trouverNom(int id) {
        if (id == 1) {
            return Optional.of("Alice");
        }
        return Optional.empty(); // ✅ Ne jamais retourner null
    }
    
    // ❌ MAUVAIS : Optional comme paramètre
    // public static void traiter(Optional<String> nom) { ... }
    // ✅ BON : Utiliser la surcharge
    public static void traiter(String nom) {
        // Traitement
    }
    
    public static void traiterAvecOptional(Optional<String> nom) {
        nom.ifPresent(ExempleBonnesPratiques::traiter);
    }
    
    // ✅ BON : Utilisation correcte
    public static void exempleCorrect() {
        Optional<String> nom = trouverNom(1);
        
        // ✅ Préférer orElse() à get()
        String valeur = nom.orElse("Inconnu");
        
        // ✅ Utiliser ifPresent() pour les actions
        nom.ifPresent(System.out::println);
        
        // ✅ Enchaîner les opérations
        nom.map(String::toUpperCase)
           .filter(n -> n.length() > 3)
           .ifPresent(System.out::println);
    }
    
    // ❌ MAUVAIS : Utilisations à éviter
    public static void exemplesMauvais() {
        Optional<String> nom = trouverNom(1);
        
        // ❌ Ne pas utiliser get() sans vérifier
        // String valeur = nom.get(); // Peut lever NoSuchElementException
        
        // ❌ Ne pas vérifier null sur Optional
        // if (nom == null) { ... } // Optional ne devrait jamais être null
        
        // ❌ Ne pas utiliser Optional dans les champs
        // private Optional<String> nom; // Utilisez String et null à la place
    }
    
    public static void main(String[] args) {
        exempleCorrect();
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
