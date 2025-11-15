# Exercice 1 : Utiliser LocalDate pour Manipuler des Dates

## Objectif

Apprendre à créer et manipuler des dates avec LocalDate, LocalTime et LocalDateTime.

## Instructions

1. Créez des dates avec LocalDate.now() et LocalDate.of()
2. Accédez aux composants d'une date (année, mois, jour)
3. Modifiez une date (ajouter/soustraire des jours, mois, années)
4. Comparez des dates

## À Faire

- Créer une date actuelle avec LocalDate.now()
- Créer une date spécifique avec LocalDate.of(2024, 12, 25)
- Afficher les composants : getYear(), getMonth(), getDayOfMonth()
- Ajouter des jours avec plusDays()
- Ajouter des mois avec plusMonths()
- Soustraire des années avec minusYears()
- Comparer des dates avec isBefore() et isAfter()

## Notes

- LocalDate = date sans heure (année-mois-jour)
- LocalTime = heure sans date
- LocalDateTime = date et heure combinées
- Les classes sont immuables : les méthodes retournent de nouveaux objets
- Toutes les classes sont dans java.time

## Résultat Attendu

```
Date actuelle : 2024-01-15
Date spécifique : 2024-12-25
Année : 2024, Mois : DECEMBER, Jour : 25
Date + 10 jours : 2025-01-04
Date + 2 mois : 2025-02-25
Date - 1 an : 2023-12-25
2024-12-25 est après 2024-01-15 : true
```

