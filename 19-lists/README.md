# 19 - Listes

## Vue d'Ensemble

Les listes sont des collections ordonnées qui permettent de stocker des éléments avec des doublons. Les principales implémentations sont ArrayList (tableau dynamique) et LinkedList (liste chaînée).

## Concepts Clés

1. **Interface List** : Contrat pour les listes
2. **ArrayList** : Implémentation avec tableau, accès rapide par index
3. **LinkedList** : Implémentation avec liste chaînée, insertion/suppression rapides
4. **Méthodes communes** : add, remove, get, size, contains

## Exemples

### Exemple 1 : ArrayList

```java
import java.util.ArrayList;
import java.util.List;

public class ExempleArrayList {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        
        // Ajout d'éléments
        liste.add("Java");
        liste.add("Python");
        liste.add("C++");
        
        // Accès par index
        System.out.println(liste.get(0));  // Java
        
        // Taille
        System.out.println(liste.size());  // 3
        
        // Parcours
        for (String langage : liste) {
            System.out.println(langage);
        }
        
        // Suppression
        liste.remove("Python");
    }
}
```

### Exemple 2 : LinkedList

```java
import java.util.LinkedList;
import java.util.List;

public class ExempleLinkedList {
    public static void main(String[] args) {
        List<Integer> nombres = new LinkedList<>();
        nombres.add(10);
        nombres.add(20);
        nombres.add(30);
        
        // Méthodes spécifiques à LinkedList
        LinkedList<Integer> ll = (LinkedList<Integer>) nombres;
        ll.addFirst(5);   // Ajoute au début
        ll.addLast(40);   // Ajoute à la fin
        ll.removeFirst(); // Supprime le premier
    }
}
```

## Prérequis

- Sujet 05 : Tableaux
- Sujet 09 : Héritage
- Sujet 10 : Interfaces

## Exercices

- **exercise-01** : Utiliser ArrayList pour stocker des éléments
- **exercise-02** : Manipuler une LinkedList
- **exercise-03** : Comparer ArrayList et LinkedList

## Ressources

- [Collections - Oracle](https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html)
