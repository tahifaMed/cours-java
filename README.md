# Cours Java - Guide Complet

Bienvenue dans ce cours complet de programmation Java ! Ce cours est conçu pour vous accompagner de débutant à un niveau avancé, avec des exercices pratiques pour chaque concept.

## Structure du Cours

Ce cours est organisé en **38 sujets** regroupés par niveau et domaine, couvrant tout le spectre de Java :

### Niveau Fondamentaux
- **01-basics** - Les bases de Java (Hello World, compilation, syntaxe de base)
- **02-variables-data-types** - Variables et types de données
- **03-operators** - Opérateurs (arithmétiques, logiques, comparaison)
- **04-control-flow** - Structures de contrôle (if/else, switch, boucles)
- **05-arrays** - Tableaux (déclaration, manipulation, multidimensionnels)

### Programmation Orientée Objet
- **06-classes-and-objects** - Classes et objets
- **07-methods** - Méthodes (définition, paramètres, surcharge)
- **08-encapsulation** - Encapsulation (modificateurs d'accès, getters/setters)
- **09-inheritance** - Héritage
- **10-interfaces** - Interfaces
- **11-abstract-classes** - Classes abstraites
- **12-packages** - Packages et imports

### POO Avancée et Design
- **13-polymorphism** - Polymorphisme
- **14-composition-vs-inheritance** - Composition vs Héritage
- **15-enums** - Types énumérés

### Gestion des Exceptions
- **16-exceptions-basics** - Les bases des exceptions
- **17-custom-exceptions** - Exceptions personnalisées
- **18-finally-and-resources** - Bloc finally et try-with-resources

### Framework Collections
- **19-lists** - Listes (ArrayList, LinkedList)
- **20-sets** - Ensembles (HashSet, TreeSet, LinkedHashSet)
- **21-maps** - Maps (HashMap, TreeMap, LinkedHashMap)
- **22-iterators-and-streams** - Itérateurs et Streams (basiques)

### Fonctionnalités Avancées du Langage
- **23-generics** - Génériques
- **24-lambda-expressions** - Expressions Lambda
- **25-stream-api** - API Stream (map, filter, reduce, collect)
- **26-date-time-api** - API Date et Temps (Java 8+)
- **27-optional** - Optional

### Opérations Fichiers et E/S
- **28-file-handling** - Manipulation de fichiers
- **29-io-streams** - Flux d'entrée/sortie
- **30-nio** - NIO et NIO.2

### Multithreading
- **31-threads-basics** - Les bases des threads
- **32-synchronization** - Synchronisation
- **33-concurrency-utilities** - Utilitaires de concurrence

### Sujets Avancés
- **34-reflection** - Réflexion
- **35-annotations** - Annotations
- **36-junit-testing** - Tests avec JUnit
- **37-regular-expressions** - Expressions régulières
- **38-javadoc** - JavaDoc et documentation

### Projet Pratique
- **39-kata-library-management** - Kata complet : Système de gestion de bibliothèque (intègre tous les concepts du cours)

## Comment Utiliser Ce Cours

1. **Parcours séquentiel recommandé** : Suivez les sujets dans l'ordre, chaque sujet s'appuie sur les précédents.
2. **Lisez le README de chaque sujet** : Chaque dossier contient un README avec :
   - Une explication détaillée du concept
   - Les concepts clés à maîtriser
   - Des exemples de code commentés
   - Les prérequis
   - La liste des exercices
3. **Faites les exercices** : Chaque sujet contient plusieurs exercices pratiques :
   - Ouvrez le dossier `exercise-XX`
   - Lisez le README de l'exercice pour comprendre l'objectif
   - Complétez le code dans `ExerciseXX.java` (cherchez les TODO)
   - Testez votre solution avec les tests JUnit fournis
   - Comparez votre sortie avec `ExpectedOutput.txt` si disponible
4. **Consultez les solutions** : Un dossier `solutions/` est disponible dans chaque sujet pour vérifier vos réponses.

## Structure d'un Sujet

```
XX-nom-du-sujet/
├── README.md              # Explication du sujet avec exemples
├── exercise-01/
│   ├── README.md          # Instructions de l'exercice
│   ├── Exercise01.java    # Template à compléter (avec TODO)
│   ├── Exercise01Test.java # Tests JUnit
│   └── ExpectedOutput.txt # Sortie attendue (si applicable)
├── exercise-02/
│   └── ...
└── solutions/
    ├── exercise-01/
    │   └── Exercise01.java
    └── ...
```

## Prérequis

- Java JDK 8 ou supérieur installé
- Un IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou un éditeur de texte
- JUnit 5 pour les tests (généralement inclus dans les projets Maven/Gradle modernes)

## Comment Compiler et Exécuter

### Avec javac (ligne de commande)
```bash
javac ExerciseXX.java
java ExerciseXX
```

### Avec Maven
```bash
mvn compile
mvn test
```

### Avec Gradle
```bash
./gradlew build
./gradlew test
```

## Bon Apprentissage !

Ce cours vous accompagne pas à pas dans votre apprentissage de Java. N'hésitez pas à expérimenter, modifier le code, et surtout : **pratiquez régulièrement** !

---

**Note** : Tous les contenus, commentaires, et documentations de ce cours sont en français pour faciliter votre compréhension.
