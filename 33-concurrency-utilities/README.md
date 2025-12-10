# 33 - Utilitaires de Concurrence

## Vue d'Ensemble

Le package java.util.concurrent fournit des outils avancés pour la programmation concurrente : ExecutorService pour gérer des pools de threads, Future pour les résultats asynchrones, et CompletableFuture pour la programmation asynchrone.

## Concepts Clés

1. **ExecutorService** : Gestion de pools de threads
2. **Future** : Représente un résultat asynchrone
3. **CompletableFuture** : Future avec callbacks
4. **Concurrent collections** : Collections thread-safe

## Exemples

### Exemple 1 : ExecutorService

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExemple {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println("Tâche exécutée");
            });
        }
        
        executor.shutdown();
    }
}
```

## Prérequis

- Sujet 32 : Synchronisation

## Exercices

- **exercise-01** : Utiliser ExecutorService
- **exercise-02** : Travailler avec Future
- **exercise-03** : Utiliser CompletableFuture

## Ressources

- [Concurrence - Oracle](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html)
