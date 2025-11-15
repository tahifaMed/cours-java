# Exercice 2 : Formater et Parser des Dates

## Objectif

Apprendre à formater des dates avec DateTimeFormatter et parser des chaînes en dates.

## Instructions

1. Créez un DateTimeFormatter avec un pattern
2. Formatez une LocalDate en String avec format()
3. Parsez une String en LocalDate avec parse()
4. Utilisez des formats prédéfinis

## À Faire

- Créer un formatter avec DateTimeFormatter.ofPattern("dd/MM/yyyy")
- Formater une date avec date.format(formatter)
- Parser une chaîne avec LocalDate.parse("25/12/2024", formatter)
- Utiliser des formats prédéfinis : DateTimeFormatter.ISO_LOCAL_DATE
- Formater avec différents patterns : "yyyy-MM-dd", "dd MMM yyyy"

## Notes

- DateTimeFormatter = classe pour formater et parser les dates
- Patterns : dd (jour), MM (mois), yyyy (année), HH (heure), mm (minute)
- format() : LocalDate -> String
- parse() : String -> LocalDate
- Formats prédéfinis disponibles dans DateTimeFormatter (ISO_LOCAL_DATE, etc.)

## Résultat Attendu

```
Date formatée (dd/MM/yyyy) : 25/12/2024
Date formatée (yyyy-MM-dd) : 2024-12-25
Date formatée (dd MMM yyyy) : 25 déc. 2024
Date parsée : 2024-12-25
Format ISO : 2024-12-25
```

