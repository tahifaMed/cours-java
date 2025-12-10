# Exercice 3 : Calculer des Durées avec Period et Duration

## Objectif

Apprendre à calculer des durées entre dates avec Period et des durées entre heures avec Duration.

## Instructions

1. Utilisez Period.between() pour calculer la différence entre deux dates
2. Utilisez Duration.between() pour calculer la différence entre deux heures
3. Accédez aux composants (jours, mois, années, heures, minutes, secondes)

## À Faire

- Créer deux dates différentes
- Calculer Period entre deux dates avec Period.between(date1, date2)
- Afficher les composants : getYears(), getMonths(), getDays()
- Créer deux heures différentes avec LocalTime
- Calculer Duration entre deux heures avec Duration.between(time1, time2)
- Afficher la durée en heures, minutes, secondes

## Notes

- Period = durée entre deux dates (années, mois, jours)
- Duration = durée entre deux instants/heures (heures, minutes, secondes)
- Period.between(date1, date2) : date2 - date1
- Duration.between(time1, time2) : time2 - time1
- toHours(), toMinutes(), getSeconds() pour Duration

## Résultat Attendu

```
Période entre les dates : P1Y2M10D
Années : 1, Mois : 2, Jours : 10
Durée entre les heures : PT5H30M
Heures : 5, Minutes : 30
Durée en minutes : 330
```

