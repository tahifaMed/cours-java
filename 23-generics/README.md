# 23 - Génériques

## Vue d'Ensemble

Les génériques permettent de créer des classes, interfaces et méthodes qui travaillent avec des types spécifiés comme paramètres. Cela offre la sécurité de type à la compilation et évite les casts.

## Concepts Clés

1. **Paramètres de type** : Syntaxe <T>, <E>, <K,V>
2. **Classes génériques** : Classes avec paramètres de type
3. **Méthodes génériques** : Méthodes avec paramètres de type
4. **Wildcards** : ?, ? extends, ? super
5. **Bounded types** : Limiter les types acceptés

## Exemples

### Exemple 1 : Classe Générique

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
        Boite<String> boiteString = new Boite<>();
        boiteString.setContenu("Bonjour");
        
        Boite<Integer> boiteInt = new Boite<>();
        boiteInt.setContenu(42);
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
