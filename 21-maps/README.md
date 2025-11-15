# 21 - Maps

## Vue d'Ensemble

Les maps stockent des paires clé-valeur. Chaque clé est unique et mappe vers une valeur. Les principales implémentations sont HashMap (accès rapide), LinkedHashMap (ordre d'insertion), et TreeMap (clés triées).

## Concepts Clés

1. **Interface Map** : Structure clé-valeur
2. **HashMap** : Accès rapide, ordre non garanti
3. **LinkedHashMap** : Conserve l'ordre d'insertion
4. **TreeMap** : Clés automatiquement triées
5. **Méthodes** : put, get, remove, containsKey, keySet, values

## Exemples

### Exemple 1 : HashMap

```java
import java.util.HashMap;
import java.util.Map;

public class ExempleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        
        // Ajout de paires clé-valeur
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);
        
        // Accès par clé
        System.out.println(ages.get("Alice"));  // 25
        
        // Vérification
        System.out.println(ages.containsKey("Bob"));  // true
        
        // Parcours
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
```

### Exemple 2 : TreeMap

```java
import java.util.TreeMap;
import java.util.Map;

public class ExempleTreeMap {
    public static void main(String[] args) {
        Map<String, String> pays = new TreeMap<>();
        pays.put("France", "Paris");
        pays.put("Espagne", "Madrid");
        pays.put("Allemagne", "Berlin");
        
        // Clés automatiquement triées
        for (String paysNom : pays.keySet()) {
            System.out.println(paysNom + " -> " + pays.get(paysNom));
        }
    }
}
```

## Prérequis

- Sujet 19 : Listes
- Sujet 20 : Sets

## Exercices

- **exercise-01** : Utiliser HashMap pour stocker des données
- **exercise-02** : Manipuler TreeMap pour des clés triées
- **exercise-03** : Parcourir et manipuler des maps

## Ressources

- [Interface Map - Oracle](https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html)
