# 28 - Annotations

## Vue d'Ensemble

Les annotations fournissent des métadonnées sur le code. Elles sont utilisées par le compilateur, les outils et les frameworks. Java fournit des annotations intégrées (@Override, @Deprecated) et permet de créer des annotations personnalisées.

**Qu'est-ce qu'une annotation ?**

Une annotation est une forme de métadonnée qui fournit des informations sur le code sans modifier directement son comportement. Elle commence par le symbole `@` et peut être appliquée à des classes, méthodes, champs, paramètres, etc.

**Utilisations principales :**

- **Compilateur** : Instructions pour le compilateur (@Override, @Deprecated)
- **Outils** : Documentation, génération de code, validation
- **Frameworks** : Configuration (Spring, JPA, JUnit, etc.)
- **Runtime** : Traitement via la réflexion

## Concepts Clés

1. **Annotations intégrées** : @Override, @Deprecated, @SuppressWarnings, @SafeVarargs, @FunctionalInterface
2. **Annotations personnalisées** : Créer ses propres annotations avec @interface
3. **Méta-annotations** : @Retention, @Target, @Documented, @Inherited
4. **Retention** : Durée de vie de l'annotation (SOURCE, CLASS, RUNTIME)
5. **Target** : Où l'annotation peut être utilisée (TYPE, METHOD, FIELD, etc.)
6. **Réflexion** : Accéder aux annotations à l'exécution

## Annotations Intégrées de Java

### @Override

**Description** : Indique qu'une méthode redéfinit (override) une méthode de la classe parente ou implémente une méthode d'interface.

**Utilisation** :
- Assure que la méthode existe bien dans la classe parente
- Le compilateur génère une erreur si la méthode n'existe pas
- Améliore la lisibilité du code
- Protège contre les erreurs de typage dans le nom de la méthode

**Exemple** :

```java
class Animal {
    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }
    
    public void seDeplacer() {
        System.out.println("L'animal se déplace");
    }
}

class Chien extends Animal {
    // ✅ Correct : la méthode existe dans Animal
    @Override
    public void faireDuBruit() {
        System.out.println("Le chien aboie");
    }
    
    // ❌ Erreur de compilation : la méthode n'existe pas dans Animal
    // @Override
    // public void aboyer() {  // Erreur !
    //     System.out.println("Woof!");
    // }
}

// Avec les interfaces
interface Vehicule {
    void demarrer();
}

class Voiture implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
}
```

### @Deprecated

**Description** : Marque un élément (classe, méthode, champ) comme obsolète (deprecated). Le compilateur génère un avertissement si l'élément est utilisé.

**Utilisation** :
- Indique qu'un élément ne devrait plus être utilisé
- Génère un avertissement à la compilation
- Peut inclure un message avec `@Deprecated("message")`
- Utile pour la migration progressive du code

**Exemple** :

```java
public class Calculatrice {
    // Ancienne méthode, remplacée par calculer()
    @Deprecated
    public int addition(int a, int b) {
        return a + b;
    }
    
    // Nouvelle méthode recommandée
    public int calculer(int a, int b) {
        return a + b;
    }
    
    // Avec message explicatif
    @Deprecated(since = "2.0", forRemoval = true)
    public void ancienneMethode() {
        System.out.println("Cette méthode sera supprimée");
    }
}

// Utilisation (génère un avertissement)
public class Test {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        // ⚠️ Avertissement : addition(int, int) est dépréciée
        int resultat = calc.addition(5, 3);
        
        // ✅ Utilisation recommandée
        int resultat2 = calc.calculer(5, 3);
    }
}
```

### @SuppressWarnings

**Description** : Supprime des avertissements spécifiques du compilateur pour un élément donné.

**Utilisation** :
- Supprime des avertissements connus et acceptables
- À utiliser avec précaution
- Valeurs communes : "unused", "unchecked", "deprecation", "rawtypes"

**Exemple** :

```java
import java.util.ArrayList;
import java.util.List;

public class ExempleSuppressWarnings {
    // Supprimer l'avertissement "variable non utilisée"
    @SuppressWarnings("unused")
    private int variableNonUtilisee = 42;
    
    // Supprimer l'avertissement "unchecked" pour les génériques
    @SuppressWarnings("unchecked")
    public void exempleUnchecked() {
        List liste = new ArrayList(); // Avertissement supprimé
        liste.add("Test");
    }
    
    // Supprimer plusieurs avertissements
    @SuppressWarnings({"unused", "unchecked"})
    public void exempleMultiple() {
        List liste = new ArrayList();
        int x = 10; // Non utilisé mais avertissement supprimé
    }
    
    // Supprimer l'avertissement de dépréciation
    @SuppressWarnings("deprecation")
    public void utiliserDeprecated() {
        Calculatrice calc = new Calculatrice();
        calc.addition(1, 2); // Avertissement supprimé
    }
}
```

### @SafeVarargs

**Description** : Indique qu'une méthode avec des arguments variables (varargs) est sûre à utiliser avec des génériques.

**Utilisation** :
- Supprime l'avertissement "unchecked" pour les varargs avec génériques
- Doit être utilisée uniquement si la méthode ne modifie pas le contenu du varargs

**Exemple** :

```java
import java.util.Arrays;
import java.util.List;

public class ExempleSafeVarargs {
    // Sans @SafeVarargs : avertissement "unchecked"
    @SafeVarargs
    public static <T> void afficherListes(List<T>... listes) {
        for (List<T> liste : listes) {
            System.out.println(liste);
        }
    }
    
    public static void main(String[] args) {
        List<String> liste1 = Arrays.asList("A", "B");
        List<String> liste2 = Arrays.asList("C", "D");
        afficherListes(liste1, liste2); // Pas d'avertissement
    }
}
```

### @FunctionalInterface

**Description** : Indique qu'une interface est une interface fonctionnelle (une seule méthode abstraite). Utilisée pour les lambdas.

**Utilisation** :
- Assure que l'interface a exactement une méthode abstraite
- Le compilateur génère une erreur si ce n'est pas le cas
- Améliore la documentation

**Exemple** :

```java
// ✅ Interface fonctionnelle valide
@FunctionalInterface
interface Calcul {
    int operation(int a, int b);
}

// ❌ Erreur : deux méthodes abstraites
// @FunctionalInterface
// interface CalculInvalide {
//     int addition(int a, int b);
//     int soustraction(int a, int b);
// }

// ✅ Interface fonctionnelle avec méthodes par défaut
@FunctionalInterface
interface Operation {
    int calculer(int a, int b);
    
    // Les méthodes par défaut ne comptent pas
    default void afficher() {
        System.out.println("Opération");
    }
    
    // Les méthodes statiques ne comptent pas
    static void info() {
        System.out.println("Interface fonctionnelle");
    }
}
```

## Annotations Personnalisées

### Création d'une Annotation

**Syntaxe** : Utilisez `@interface` pour créer une annotation personnalisée.

**Exemple de base** :

```java
// Annotation simple sans paramètres
public @interface MonAnnotation {
}

// Utilisation
@MonAnnotation
public class MaClasse {
}
```

### Annotation avec Paramètres

**Exemple** :

```java
public @interface Info {
    String auteur();
    String version() default "1.0";  // Valeur par défaut
    int priorite() default 0;
}

// Utilisation
@Info(auteur = "John Doe", version = "2.0", priorite = 1)
public class MaClasse {
    @Info(auteur = "Jane Smith")  // version utilise la valeur par défaut
    public void maMethode() {
    }
}
```

### Méta-annotations

Les méta-annotations sont des annotations qui s'appliquent à d'autres annotations.

#### @Retention

**Description** : Définit la durée de vie de l'annotation.

**Valeurs** :
- `RetentionPolicy.SOURCE` : Supprimée à la compilation (ex: @Override)
- `RetentionPolicy.CLASS` : Conservée dans le bytecode mais pas disponible à l'exécution
- `RetentionPolicy.RUNTIME` : Disponible à l'exécution via la réflexion

**Exemple** :

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Disponible à l'exécution (pour la réflexion)
@Retention(RetentionPolicy.RUNTIME)
public @interface MonAnnotation {
    String valeur();
}

// Supprimée à la compilation
@Retention(RetentionPolicy.SOURCE)
public @interface AnnotationSource {
    String info();
}
```

#### @Target

**Description** : Définit où l'annotation peut être utilisée.

**Valeurs** :
- `ElementType.TYPE` : Classes, interfaces, enums
- `ElementType.METHOD` : Méthodes
- `ElementType.FIELD` : Champs
- `ElementType.PARAMETER` : Paramètres
- `ElementType.CONSTRUCTOR` : Constructeurs
- `ElementType.LOCAL_VARIABLE` : Variables locales
- `ElementType.ANNOTATION_TYPE` : Autres annotations
- `ElementType.PACKAGE` : Packages

**Exemple** :

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Peut être utilisée sur les classes et méthodes
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Info {
    String auteur();
}

// Utilisation
@Info(auteur = "John")  // ✅ Sur une classe
public class MaClasse {
    @Info(auteur = "Jane")  // ✅ Sur une méthode
    public void maMethode() {
    }
    
    // @Info(auteur = "Test")  // ❌ Erreur : ne peut pas être sur un champ
    // private int x;
}
```

#### @Documented

**Description** : L'annotation apparaîtra dans la documentation JavaDoc.

**Exemple** :

```java
import java.lang.annotation.Documented;

@Documented
public @interface Documentee {
    String description();
}

@Documentee(description = "Classe importante")
public class MaClasse {
    // L'annotation apparaîtra dans la JavaDoc
}
```

#### @Inherited

**Description** : L'annotation est héritée par les sous-classes.

**Exemple** :

```java
import java.lang.annotation.Inherited;

@Inherited
public @interface Heritee {
    String valeur();
}

@Heritee(valeur = "Parent")
class ClasseParent {
}

// La sous-classe hérite automatiquement de @Heritee
class ClasseEnfant extends ClasseParent {
    // A automatiquement @Heritee(valeur = "Parent")
}
```

## Exemples Complets

### Exemple 1 : Annotation de Validation

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation pour valider un âge
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AgeValide {
    int min() default 0;
    int max() default 150;
    String message() default "Âge invalide";
}

// Classe utilisant l'annotation
class Personne {
    @AgeValide(min = 18, max = 100, message = "L'âge doit être entre 18 et 100")
    private int age;
    
    public Personne(int age) {
        this.age = age;
    }
}
```

### Exemple 2 : Annotation pour les Tests

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation pour marquer les méthodes de test
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    String description() default "";
    int priorite() default 0;
    boolean ignore() default false;
}

// Classe de test
class TestsCalculatrice {
    @Test(description = "Test de l'addition", priorite = 1)
    public void testAddition() {
        // Code de test
    }
    
    @Test(description = "Test de la soustraction", priorite = 2, ignore = true)
    public void testSoustraction() {
        // Test ignoré
    }
}
```

### Exemple 3 : Utilisation avec la Réflexion

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Annotation avec RUNTIME pour la réflexion
@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String auteur();
    String version() default "1.0";
}

// Classe annotée
@Info(auteur = "John Doe", version = "2.0")
class MaClasse {
    @Info(auteur = "Jane Smith")
    public void maMethode() {
        System.out.println("Méthode annotée");
    }
}

// Traitement avec la réflexion
public class TraitementAnnotations {
    public static void main(String[] args) {
        Class<MaClasse> clazz = MaClasse.class;
        
        // Lire l'annotation de la classe
        if (clazz.isAnnotationPresent(Info.class)) {
            Info info = clazz.getAnnotation(Info.class);
            System.out.println("Auteur : " + info.auteur());
            System.out.println("Version : " + info.version());
        }
        
        // Lire les annotations des méthodes
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Info.class)) {
                Info info = method.getAnnotation(Info.class);
                System.out.println("Méthode : " + method.getName());
                System.out.println("  Auteur : " + info.auteur());
                System.out.println("  Version : " + info.version());
            }
        }
    }
}
```

### Exemple 4 : Annotation pour la Configuration

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation pour configurer une base de données
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigurationBD {
    String url();
    String utilisateur();
    String motDePasse();
    int port() default 3306;
    boolean ssl() default false;
}

// Utilisation
@ConfigurationBD(
    url = "jdbc:mysql://localhost",
    utilisateur = "admin",
    motDePasse = "secret",
    port = 3306,
    ssl = true
)
class Configuration {
    // Configuration de la base de données
}
```

### Exemple 5 : Annotation avec Tableau de Valeurs

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Roles {
    String[] valeurs();  // Tableau de valeurs
}

// Utilisation
class Service {
    @Roles(valeurs = {"ADMIN", "USER"})
    public void methodeRestreinte() {
        // Méthode accessible aux admins et users
    }
    
    @Roles(valeurs = {"ADMIN"})
    public void methodeAdmin() {
        // Méthode accessible uniquement aux admins
    }
}
```

## Bonnes Pratiques

1. **Utilisez @Override systématiquement** : Améliore la sécurité et la lisibilité
2. **Documentez les annotations personnalisées** : Ajoutez des JavaDoc
3. **Choisissez la bonne Retention** : RUNTIME seulement si nécessaire à l'exécution
4. **Utilisez des valeurs par défaut** : Rendez les annotations plus faciles à utiliser
5. **Validez les paramètres** : Vérifiez les valeurs dans le code qui traite les annotations
6. **Évitez @SuppressWarnings** : Utilisez-le seulement quand nécessaire et documentez pourquoi

## Cas d'Usage Réels

- **JUnit** : @Test, @Before, @After pour les tests
- **Spring** : @Component, @Service, @Autowired pour l'injection de dépendances
- **JPA/Hibernate** : @Entity, @Table, @Column pour le mapping ORM
- **Validation** : @NotNull, @Size, @Email pour la validation de données
- **Lombok** : @Getter, @Setter, @Data pour générer du code automatiquement

## Prérequis

- Sujet 06 : Classes et objets

## Exercices

- **exercise-01** : Utiliser les annotations intégrées
- **exercise-02** : Créer une annotation personnalisée
- **exercise-03** : Traiter les annotations avec la réflexion

## Ressources

- [Annotations - Oracle](https://docs.oracle.com/javase/tutorial/java/annotations/index.html)
