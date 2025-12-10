# 36 - Tests avec JUnit

## Vue d'Ensemble

JUnit est le framework de test unitaire standard pour Java. Il permet d'écrire et d'exécuter des tests automatisés pour vérifier que votre code fonctionne correctement.

## Concepts Clés

1. **Annotations JUnit** : @Test, @Before, @After
2. **Assertions** : assertEquals, assertTrue, assertNotNull
3. **Cycle de vie des tests** : Setup, test, teardown
4. **Tests paramétrés** : Tester avec plusieurs jeux de données

## Exemples

### Exemple 1 : Test Simple

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {
    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
        assertTrue(5 > 3);
    }
}
```

## Prérequis

- Sujet 06 : Classes et objets
- Sujet 07 : Méthodes

## Exercices

- **exercise-01** : Écrire un test JUnit simple
- **exercise-02** : Utiliser différentes assertions
- **exercise-03** : Utiliser @Before et @After

## Ressources

- [JUnit 5 - Documentation](https://junit.org/junit5/docs/current/user-guide/)
