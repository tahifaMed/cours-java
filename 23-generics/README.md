# 23 - Génériques

## Vue d'Ensemble

Les génériques permettent de créer des classes, interfaces et méthodes qui travaillent avec des types spécifiés comme paramètres. Cela offre la sécurité de type à la compilation et évite les casts.

## Concepts Clés

1. **Paramètres de type** : Syntaxe <T>, <E>, <K,V> pour définir des types génériques
2. **Classes génériques** : Classes avec paramètres de type pour la réutilisation
3. **Méthodes génériques** : Méthodes avec paramètres de type indépendants
4. **Wildcards** : ?, ? extends, ? super pour la flexibilité des types
5. **Bounded types** : Limiter les types acceptés avec extends et super
6. **Interfaces génériques** : Interfaces avec paramètres de type
7. **Héritage avec génériques** : Comment les génériques fonctionnent avec l'héritage

## Exemples

### Exemple 1 : Classe Générique Simple

**Qu'est-ce qu'une classe générique ?**

Une classe générique est une classe qui accepte un ou plusieurs paramètres de type, permettant de créer des classes réutilisables pour différents types sans perdre la sécurité de type.

**Avantages :**

- **Sécurité de type** : Les erreurs de type sont détectées à la compilation
- **Pas de casts** : Plus besoin de convertir explicitement les types
- **Réutilisation** : Une seule classe pour plusieurs types
- **Code plus propre** : Moins de code répétitif

**Conventions de nommage :**

- `T` : Type (général)
- `E` : Element (collections)
- `K` : Key (clés dans les maps)
- `V` : Value (valeurs dans les maps)
- `N` : Number
- `S`, `U`, `V` : Types supplémentaires

```java
public class Boite<T> {
    private T contenu;
    
    public void setContenu(T contenu) {
        this.contenu = contenu;
    }
    
    public T getContenu() {
        return contenu;
    }
}

public class TestGenerique {
    public static void main(String[] args) {
        // Boîte pour String
        Boite<String> boiteString = new Boite<>();
        boiteString.setContenu("Bonjour");
        String texte = boiteString.getContenu(); // Pas de cast nécessaire
        
        // Boîte pour Integer
        Boite<Integer> boiteInt = new Boite<>();
        boiteInt.setContenu(42);
        Integer nombre = boiteInt.getContenu(); // Pas de cast nécessaire
        
        // Erreur de compilation si on essaie de mettre un String dans une Boite<Integer>
        // boiteInt.setContenu("Erreur"); // ❌ Erreur de compilation
    }
}
```

### Exemple 2 : Classe Générique avec Plusieurs Paramètres

**Classes génériques avec plusieurs paramètres de type**

Vous pouvez définir plusieurs paramètres de type, comme dans les Maps (K pour Key, V pour Value).

```java
public class Paire<K, V> {
    private K cle;
    private V valeur;
    
    public Paire(K cle, V valeur) {
        this.cle = cle;
        this.valeur = valeur;
    }
    
    public K getCle() {
        return cle;
    }
    
    public V getValeur() {
        return valeur;
    }
    
    public void setCle(K cle) {
        this.cle = cle;
    }
    
    public void setValeur(V valeur) {
        this.valeur = valeur;
    }
    
    @Override
    public String toString() {
        return "Paire{cle=" + cle + ", valeur=" + valeur + "}";
    }
}

public class TestPaire {
    public static void main(String[] args) {
        // Paire String-Integer
        Paire<String, Integer> age = new Paire<>("Jean", 25);
        System.out.println(age); // Paire{cle=Jean, valeur=25}
        
        // Paire Integer-String
        Paire<Integer, String> code = new Paire<>(100, "OK");
        System.out.println(code); // Paire{cle=100, valeur=OK}
        
        // Paire String-String
        Paire<String, String> nomComplet = new Paire<>("Prénom", "Nom");
        System.out.println(nomComplet);
    }
}
```

### Exemple 3 : Méthodes Génériques

**Qu'est-ce qu'une méthode générique ?**

Une méthode générique est une méthode qui déclare ses propres paramètres de type, indépendamment de la classe. Elle peut être statique ou d'instance.

**Quand utiliser une méthode générique ?**

- Quand vous avez besoin d'une méthode qui fonctionne avec plusieurs types
- Pour éviter la duplication de code
- Pour créer des utilitaires réutilisables

**Syntaxe :**

```java
public <T> T nomMethode(T param) { ... }
```

```java
public class Utilitaires {
    
    // Méthode générique statique pour échanger deux éléments
    public static <T> void echanger(T[] tableau, int index1, int index2) {
        T temp = tableau[index1];
        tableau[index1] = tableau[index2];
        tableau[index2] = temp;
    }
    
    // Méthode générique pour trouver le maximum
    public static <T extends Comparable<T>> T maximum(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
    
    // Méthode générique pour afficher un tableau
    public static <T> void afficher(T[] tableau) {
        for (T element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Méthode générique pour créer une liste à partir d'éléments
    public static <T> java.util.List<T> creerListe(T... elements) {
        java.util.List<T> liste = new java.util.ArrayList<>();
        for (T element : elements) {
            liste.add(element);
        }
        return liste;
    }
}

public class TestMethodesGeneriques {
    public static void main(String[] args) {
        // Échanger des éléments dans un tableau
        Integer[] nombres = {1, 2, 3, 4, 5};
        System.out.println("Avant échange :");
        Utilitaires.afficher(nombres);
        Utilitaires.echanger(nombres, 0, 4);
        System.out.println("Après échange :");
        Utilitaires.afficher(nombres);
        
        // Trouver le maximum
        System.out.println("Maximum entre 10 et 20 : " + Utilitaires.maximum(10, 20));
        System.out.println("Maximum entre 'a' et 'z' : " + Utilitaires.maximum('a', 'z'));
        
        // Afficher différents types
        String[] mots = {"Java", "Python", "C++"};
        Utilitaires.afficher(mots);
        
        // Créer une liste
        java.util.List<String> liste = Utilitaires.creerListe("A", "B", "C");
        System.out.println("Liste créée : " + liste);
    }
}
```

### Exemple 4 : Bounded Types (Types Bornés)

**Qu'est-ce qu'un type borné ?**

Un type borné limite les types qui peuvent être utilisés comme arguments de type. On utilise `extends` pour une borne supérieure (upper bound) et `super` pour une borne inférieure (lower bound).

**Types bornés avec extends :**

- `T extends Number` : T doit être Number ou une sous-classe de Number
- `T extends Comparable<T>` : T doit implémenter Comparable
- Permet d'utiliser les méthodes de la classe/interface spécifiée

```java
public class Calculatrice {
    
    // Méthode qui accepte seulement les types Number et ses sous-classes
    public static <T extends Number> double additionner(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    
    // Méthode qui accepte seulement les types comparables
    public static <T extends Comparable<T>> T trouverMaximum(T[] tableau) {
        if (tableau == null || tableau.length == 0) {
            return null;
        }
        T max = tableau[0];
        for (T element : tableau) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
    
    // Classe générique avec contrainte
    public static class Conteneur<T extends Number> {
        private T valeur;
        
        public Conteneur(T valeur) {
            this.valeur = valeur;
        }
        
        public double obtenirDouble() {
            return valeur.doubleValue();
        }
    }
}

public class TestBoundedTypes {
    public static void main(String[] args) {
        // Fonctionne avec Integer, Double, Float (tous extends Number)
        System.out.println(Calculatrice.additionner(10, 20));        // 30.0
        System.out.println(Calculatrice.additionner(10.5, 20.3));    // 30.8
        
        // Trouver le maximum dans un tableau
        Integer[] nombres = {5, 2, 8, 1, 9};
        System.out.println("Maximum : " + Calculatrice.trouverMaximum(nombres)); // 9
        
        String[] mots = {"z", "a", "m"};
        System.out.println("Maximum : " + Calculatrice.trouverMaximum(mots)); // z
        
        // Conteneur avec contrainte
        Calculatrice.Conteneur<Integer> conteneur = new Calculatrice.Conteneur<>(42);
        System.out.println("Valeur double : " + conteneur.obtenirDouble());
        
        // Erreur de compilation : String n'extends pas Number
        // Calculatrice.Conteneur<String> erreur = new Calculatrice.Conteneur<>("test"); // ❌
    }
}
```

### Exemple 5 : Wildcards (? extends et ? super)

**Qu'est-ce qu'un wildcard ?**

Un wildcard (`?`) représente un type inconnu. Il permet d'écrire du code plus flexible qui fonctionne avec différents types génériques.

**Types de wildcards :**

1. **`?` (unbounded wildcard)** : Accepte n'importe quel type
2. **`? extends T` (upper bounded)** : Accepte T et ses sous-types (lecture)
3. **`? super T` (lower bounded)** : Accepte T et ses super-types (écriture)

**PECS (Producer Extends, Consumer Super) :**

- **Producer Extends** : Si vous lisez des éléments, utilisez `? extends`
- **Consumer Super** : Si vous écrivez des éléments, utilisez `? super`

```java
import java.util.List;
import java.util.ArrayList;

// Hiérarchie de classes
class Animal {
    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }
}

class Chien extends Animal {
    @Override
    public void faireDuBruit() {
        System.out.println("Chien aboie");
    }
}

class Chat extends Animal {
    @Override
    public void faireDuBruit() {
        System.out.println("Chat miaule");
    }
}

public class ExempleWildcards {
    
    // ? extends Animal : peut lire (Producer Extends)
    // Accepte List<Animal>, List<Chien>, List<Chat>
    public static void afficherAnimaux(List<? extends Animal> animaux) {
        System.out.println("Animaux dans la liste :");
        for (Animal animal : animaux) {
            animal.faireDuBruit();
        }
        // ❌ Ne peut pas ajouter : animaux.add(new Chien()); // Erreur de compilation
    }
    
    // ? super Chien : peut écrire (Consumer Super)
    // Accepte List<Animal>, List<Chien>, List<Object>
    public static void ajouterChien(List<? super Chien> animaux) {
        animaux.add(new Chien());
        System.out.println("Chien ajouté à la liste");
        // ❌ Ne peut pas lire comme Animal : Animal a = animaux.get(0); // Erreur
    }
    
    // ? (unbounded) : accepte n'importe quel type
    public static void afficherTaille(List<?> liste) {
        System.out.println("Taille de la liste : " + liste.size());
        // Ne peut ni lire ni écrire de manière typée
    }
    
    public static void main(String[] args) {
        // Liste d'animaux
        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Chien());
        animaux.add(new Chat());
        
        // Utiliser ? extends (lecture)
        afficherAnimaux(animaux);
        
        List<Chien> chiens = new ArrayList<>();
        chiens.add(new Chien());
        afficherAnimaux(chiens); // Fonctionne aussi avec List<Chien>
        
        // Utiliser ? super (écriture)
        List<Animal> animauxPourAjout = new ArrayList<>();
        ajouterChien(animauxPourAjout);
        
        List<Chien> chiensPourAjout = new ArrayList<>();
        ajouterChien(chiensPourAjout); // Fonctionne aussi
        
        // Wildcard non borné
        afficherTaille(animaux);
        afficherTaille(chiens);
        List<String> mots = new ArrayList<>();
        afficherTaille(mots); // Fonctionne avec n'importe quel type
    }
}
```

### Exemple 6 : Interfaces Génériques

**Interfaces génériques**

Les interfaces peuvent aussi être génériques, permettant de définir des contrats qui fonctionnent avec différents types.

```java
// Interface générique pour un conteneur
public interface Conteneur<T> {
    void ajouter(T element);
    T obtenir(int index);
    int taille();
    boolean estVide();
}

// Implémentation de l'interface générique
public class ListeConteneur<T> implements Conteneur<T> {
    private java.util.List<T> elements = new java.util.ArrayList<>();
    
    @Override
    public void ajouter(T element) {
        elements.add(element);
    }
    
    @Override
    public T obtenir(int index) {
        return elements.get(index);
    }
    
    @Override
    public int taille() {
        return elements.size();
    }
    
    @Override
    public boolean estVide() {
        return elements.isEmpty();
    }
}

// Interface générique pour comparer
public interface Comparable<T> {
    int comparer(T autre);
}

// Classe qui implémente l'interface générique
public class Personne implements Comparable<Personne> {
    private String nom;
    private int age;
    
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    @Override
    public int comparer(Personne autre) {
        return Integer.compare(this.age, autre.age);
    }
    
    @Override
    public String toString() {
        return nom + " (" + age + " ans)";
    }
}

public class TestInterfacesGeneriques {
    public static void main(String[] args) {
        // Utiliser Conteneur avec String
        Conteneur<String> conteneurString = new ListeConteneur<>();
        conteneurString.ajouter("Java");
        conteneurString.ajouter("Python");
        System.out.println("Taille : " + conteneurString.taille());
        System.out.println("Élément 0 : " + conteneurString.obtenir(0));
        
        // Utiliser Conteneur avec Integer
        Conteneur<Integer> conteneurInt = new ListeConteneur<>();
        conteneurInt.ajouter(10);
        conteneurInt.ajouter(20);
        System.out.println("Taille : " + conteneurInt.taille());
        
        // Utiliser Comparable
        Personne p1 = new Personne("Alice", 25);
        Personne p2 = new Personne("Bob", 30);
        int resultat = p1.comparer(p2);
        System.out.println("Comparaison : " + resultat);
    }
}
```

### Exemple 7 : Héritage avec Génériques

**Héritage et génériques**

Les génériques et l'héritage fonctionnent ensemble, mais il y a des règles importantes à comprendre.

```java
// Classe générique de base
public class Conteneur<T> {
    protected T element;
    
    public Conteneur(T element) {
        this.element = element;
    }
    
    public T obtenir() {
        return element;
    }
}

// Classe dérivée avec le même paramètre de type
public class ConteneurAvecCompteur<T> extends Conteneur<T> {
    private int compteur;
    
    public ConteneurAvecCompteur(T element) {
        super(element);
        this.compteur = 0;
    }
    
    public T obtenirEtCompter() {
        compteur++;
        return element;
    }
    
    public int getCompteur() {
        return compteur;
    }
}

// Classe dérivée avec un paramètre de type différent
public class ConteneurNumerique<T extends Number> extends Conteneur<T> {
    public ConteneurNumerique(T element) {
        super(element);
    }
    
    public double obtenirDouble() {
        return element.doubleValue();
    }
}

public class TestHeritage {
    public static void main(String[] args) {
        // Conteneur simple
        Conteneur<String> conteneur = new Conteneur<>("Test");
        System.out.println(conteneur.obtenir());
        
        // Conteneur avec compteur
        ConteneurAvecCompteur<String> conteneurCompteur = new ConteneurAvecCompteur<>("Test");
        conteneurCompteur.obtenirEtCompter();
        conteneurCompteur.obtenirEtCompter();
        System.out.println("Compteur : " + conteneurCompteur.getCompteur());
        
        // Conteneur numérique
        ConteneurNumerique<Integer> conteneurNum = new ConteneurNumerique<>(42);
        System.out.println("Double : " + conteneurNum.obtenirDouble());
        
        // Important : Conteneur<String> n'est PAS une sous-classe de Conteneur<Object>
        // List<String> n'est PAS une sous-classe de List<Object>
        Conteneur<String> conteneurString = new Conteneur<>("Test");
        // Conteneur<Object> conteneurObject = conteneurString; // ❌ Erreur de compilation
        
        // Mais on peut utiliser des wildcards
        Conteneur<?> conteneurWildcard = conteneurString; // ✅ OK
    }
}
```

### Exemple 8 : Cas d'Usage Pratiques

**Exemples pratiques de génériques**

```java
import java.util.*;

// Stack générique
public class Pile<T> {
    private List<T> elements = new ArrayList<>();
    
    public void empiler(T element) {
        elements.add(element);
    }
    
    public T depiler() {
        if (elements.isEmpty()) {
            throw new RuntimeException("Pile vide");
        }
        return elements.remove(elements.size() - 1);
    }
    
    public boolean estVide() {
        return elements.isEmpty();
    }
    
    public int taille() {
        return elements.size();
    }
}

// Cache générique avec limite de taille
public class Cache<K, V> {
    private Map<K, V> cache = new HashMap<>();
    private int limite;
    
    public Cache(int limite) {
        this.limite = limite;
    }
    
    public void mettre(K cle, V valeur) {
        if (cache.size() >= limite && !cache.containsKey(cle)) {
            // Supprimer le premier élément (simple implémentation)
            K premiereCle = cache.keySet().iterator().next();
            cache.remove(premiereCle);
        }
        cache.put(cle, valeur);
    }
    
    public V obtenir(K cle) {
        return cache.get(cle);
    }
    
    public boolean contient(K cle) {
        return cache.containsKey(cle);
    }
}

// Utilitaires génériques
public class UtilitairesGeneriques {
    
    // Copier une liste
    public static <T> List<T> copierListe(List<? extends T> source) {
        return new ArrayList<>(source);
    }
    
    // Fusionner deux listes
    public static <T> List<T> fusionner(List<? extends T> liste1, List<? extends T> liste2) {
        List<T> resultat = new ArrayList<>();
        resultat.addAll(liste1);
        resultat.addAll(liste2);
        return resultat;
    }
    
    // Trouver le premier élément qui correspond à un prédicat
    public static <T> T trouverPremier(List<T> liste, java.util.function.Predicate<T> predicat) {
        for (T element : liste) {
            if (predicat.test(element)) {
                return element;
            }
        }
        return null;
    }
}

public class TestCasUsage {
    public static void main(String[] args) {
        // Utiliser la pile générique
        Pile<String> pile = new Pile<>();
        pile.empiler("Premier");
        pile.empiler("Deuxième");
        pile.empiler("Troisième");
        
        while (!pile.estVide()) {
            System.out.println("Dépilé : " + pile.depiler());
        }
        
        // Utiliser le cache générique
        Cache<String, Integer> cache = new Cache<>(3);
        cache.mettre("un", 1);
        cache.mettre("deux", 2);
        cache.mettre("trois", 3);
        System.out.println("Cache contient 'un' : " + cache.contient("un"));
        System.out.println("Valeur de 'deux' : " + cache.obtenir("deux"));
        
        // Utiliser les utilitaires
        List<String> liste1 = Arrays.asList("A", "B", "C");
        List<String> liste2 = Arrays.asList("D", "E", "F");
        List<String> fusionnee = UtilitairesGeneriques.fusionner(liste1, liste2);
        System.out.println("Liste fusionnée : " + fusionnee);
        
        // Trouver le premier élément qui commence par "B"
        String trouve = UtilitairesGeneriques.trouverPremier(liste1, s -> s.startsWith("B"));
        System.out.println("Trouvé : " + trouve);
    }
}
```

## Prérequis

- Sujet 10 : Interfaces
- Sujet 19 : Listes

## Exercices

- **exercise-01** : Créer une classe générique
- **exercise-02** : Utiliser des wildcards
- **exercise-03** : Créer des méthodes génériques

## Ressources

- [Génériques - Oracle](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
