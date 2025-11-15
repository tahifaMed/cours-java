# 13 - Polymorphisme

## Vue d'Ensemble

Le polymorphisme permet à un objet de prendre plusieurs formes. En Java, cela signifie qu'une référence de type parent peut pointer vers un objet de type enfant, et les méthodes appelées dépendent du type réel de l'objet (polymorphisme d'exécution/runtime).

## Concepts Clés

1. **Polymorphisme d'exécution** : Méthodes redéfinies appelées selon le type réel
2. **Liaison dynamique** : Résolution à l'exécution (runtime)
3. **Liaison statique** : Résolution à la compilation (compile-time)
4. **Casting** : Conversion de type entre classes parent/enfant

## Exemples

### Exemple 1 : Polymorphisme de Base

```java
class Animal {
    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }
}

class Chien extends Animal {
    @Override
    public void faireDuBruit() {
        System.out.println("Le chien aboie");
    }
}

class Chat extends Animal {
    @Override
    public void faireDuBruit() {
        System.out.println("Le chat miaule");
    }
}

public class Polymorphisme {
    public static void main(String[] args) {
        Animal animal1 = new Chien();  // Référence Animal, objet Chien
        Animal animal2 = new Chat();   // Référence Animal, objet Chat
        
        animal1.faireDuBruit();  // "Le chien aboie" (type réel)
        animal2.faireDuBruit();  // "Le chat miaule" (type réel)
    }
}
```

### Exemple 2 : Utilisation avec Tableaux et Collections

```java
public class ExempleCollection {
    public static void main(String[] args) {
        Animal[] animaux = new Animal[3];
        animaux[0] = new Chien();
        animaux[1] = new Chat();
        animaux[2] = new Animal();
        
        // Polymorphisme : chaque animal fait son propre bruit
        for (Animal animal : animaux) {
            animal.faireDuBruit();
        }
    }
}
```

## Prérequis

- Sujet 09 : Héritage
- Sujet 10 : Interfaces

## Exercices

- **exercise-01** : Utiliser le polymorphisme avec l'héritage
- **exercise-02** : Polymorphisme avec des interfaces
- **exercise-03** : Casting et instanceof

## Ressources

- [Polymorphisme - Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
