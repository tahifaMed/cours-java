# 26 - API Date et Temps

## Vue d'Ensemble

L'API Date-Time (Java 8+) remplace l'ancienne API Date/Calendar défaillante. Elle offre des classes immuables et thread-safe pour manipuler dates, heures et durées : LocalDate, LocalTime, LocalDateTime, ZonedDateTime.

## Concepts Clés

1. **LocalDate** : Représente une date (année-mois-jour)
2. **LocalTime** : Représente une heure
3. **LocalDateTime** : Date et heure combinées
4. **DateTimeFormatter** : Formater et parser les dates
5. **Period et Duration** : Calculer des durées

## Exemples

### Exemple 1 : LocalDate

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExempleDate {
    public static void main(String[] args) {
        // Date actuelle
        LocalDate aujourdhui = LocalDate.now();
        System.out.println(aujourdhui);
        
        // Date spécifique
        LocalDate date = LocalDate.of(2024, 12, 25);
        
        // Formatage
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date.format(formatter));
    }
}
```

## Prérequis

- Sujet 02 : Variables et types de données

## Exercices

- **exercise-01** : Utiliser LocalDate pour manipuler des dates
- **exercise-02** : Formater et parser des dates
- **exercise-03** : Calculer des durées avec Period et Duration

## Ressources

- [Date-Time API - Oracle](https://docs.oracle.com/javase/tutorial/datetime/index.html)
