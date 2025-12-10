# 31 - Les Bases des Threads

## Vue d'Ensemble

Les threads permettent d'exécuter plusieurs tâches simultanément dans un programme Java. Chaque thread représente un flux d'exécution indépendant qui peut partager la mémoire avec d'autres threads.

## Concepts Clés

1. **Thread class** : Étendre Thread
2. **Runnable interface** : Implémenter Runnable
3. **start() et run()** : Démarrer un thread
4. **Thread lifecycle** : États d'un thread

## Exemples

### Exemple 1 : Thread avec Runnable

```java
public class MonRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread : " + i);
        }
    }
    
    public static void main(String[] args) {
        Thread thread = new Thread(new MonRunnable());
        thread.start();
    }
}
```

## Prérequis

- Sujet 10 : Interfaces

## Exercices

- **exercise-01** : Créer un thread avec Runnable
- **exercise-02** : Créer un thread en étendant Thread
- **exercise-03** : Démarrer et gérer plusieurs threads

## Ressources

- [Threads - Oracle](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html)
