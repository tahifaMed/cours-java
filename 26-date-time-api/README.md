# 26 - API Date et Temps

## Vue d'Ensemble

L'API Date-Time (Java 8+) remplace l'ancienne API Date/Calendar défaillante. Elle offre des classes immuables et thread-safe pour manipuler dates, heures et durées : LocalDate, LocalTime, LocalDateTime, ZonedDateTime.

## Concepts Clés

1. **LocalDate** : Représente une date (année-mois-jour dd/MM/yyyy)
2. **LocalTime** : Représente une heure (heure: minute hh:mm:ss.S)
3. **LocalDateTime** : Date et heure combinées (dd/MM/yyyy hh:mm:ss.S)
4. **ZonedDateTime** : Date et heure avec fuseau horaire (dd/MM/yyyy hh:mm:ss.S Z)
5. **DateTimeFormatter** : Formater et parser les dates
6. **Period et Duration** : Calculer des durées
7. **Instant** : Point dans le temps (timestamp)
8. **ZoneId** : Identifiant de fuseau horaire

## Exemples

### Exemple 1 : LocalDate

**Qu'est-ce que LocalDate ?**

`LocalDate` représente une date sans heure ni fuseau horaire, au format ISO-8601 (année-mois-jour). C'est une classe immuable et thread-safe introduite en Java 8 pour remplacer l'ancienne classe `Date`.

**Quand l'utiliser ?**

- Pour représenter des dates simples (anniversaires, dates d'événements, etc.)
- Pour des calculs de dates sans se soucier de l'heure
- Pour manipuler des dates de manière sûre et intuitive
- Pour des applications qui n'ont pas besoin de précision temporelle

**Caractéristiques principales :**

- Immuable : toutes les opérations retournent un nouvel objet
- Thread-safe : peut être utilisée en toute sécurité dans des environnements multithread
- Format ISO : `YYYY-MM-DD` (ex: 2024-12-25)
- Méthodes intuitives : `plusDays()`, `minusMonths()`, `isBefore()`, etc.

**Méthodes importantes :**

- `now()` : obtient la date actuelle
- `of(year, month, day)` : crée une date spécifique
- `parse(String)` : parse une chaîne en date
- `getYear()`, `getMonth()`, `getDayOfMonth()` : accède aux composants
- `plusDays()`, `plusMonths()`, `plusYears()` : ajoute du temps
- `minusDays()`, `minusMonths()`, `minusYears()` : soustrait du temps
- `isBefore()`, `isAfter()`, `isEqual()` : compare des dates

```java
import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class ExempleLocalDate {
    public static void main(String[] args) {
        // Date actuelle
        LocalDate aujourdhui = LocalDate.now();
        System.out.println("Date actuelle : " + aujourdhui);
        
        // Date spécifique
        LocalDate date1 = LocalDate.of(2024, 12, 25);
        LocalDate date2 = LocalDate.of(2024, Month.DECEMBER, 25);
        LocalDate date3 = LocalDate.parse("2024-12-25");
        
        // Accéder aux composants
        System.out.println("Année : " + date1.getYear());              // 2024
        System.out.println("Mois : " + date1.getMonth());              // DECEMBER
        System.out.println("Jour : " + date1.getDayOfMonth());         // 25
        System.out.println("Jour de la semaine : " + date1.getDayOfWeek()); // WEDNESDAY
        
        // Manipulation de dates (immuable - retourne un nouvel objet)
        LocalDate demain = aujourdhui.plusDays(1);
        LocalDate laSemaineProchaine = aujourdhui.plusWeeks(1);
        LocalDate leMoisProchain = aujourdhui.plusMonths(1);
        LocalDate lAnneeProchaine = aujourdhui.plusYears(1);
        
        LocalDate hier = aujourdhui.minusDays(1);
        LocalDate ilYAMois = aujourdhui.minusMonths(1);
        
        // Comparaisons
        System.out.println(date1.isAfter(date2));      // false (égales)
        System.out.println(date1.isBefore(aujourdhui)); // dépend de la date
        System.out.println(date1.isEqual(date2));      // true
        
        // Formatage
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date formatée : " + date1.format(formatter)); // 25/12/2024
        
        DateTimeFormatter formatterLong = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        System.out.println("Date longue : " + date1.format(formatterLong)); // mercredi 25 décembre 2024
    }
}
```

### Exemple 2 : LocalTime

**Qu'est-ce que LocalTime ?**

`LocalTime` représente une heure sans date ni fuseau horaire, au format 24 heures. Elle permet de manipuler des heures, minutes, secondes et nanosecondes.

**Quand l'utiliser ?**

- Pour représenter des heures d'ouverture/fermeture
- Pour des horaires de rendez-vous
- Pour des calculs d'heures sans se soucier de la date
- Pour des applications de gestion d'horaires

**Caractéristiques principales :**

- Format 24 heures : de 00:00:00 à 23:59:59.999999999
- Précision jusqu'aux nanosecondes
- Immuable et thread-safe
- Constantes utiles : `MIN` (minuit), `NOON` (midi), `MAX` (fin de journée)

**Méthodes importantes :**

- `now()` : obtient l'heure actuelle
- `of(hour, minute)` : crée une heure spécifique
- `parse(String)` : parse une chaîne en heure
- `getHour()`, `getMinute()`, `getSecond()`, `getNano()` : accède aux composants
- `plusHours()`, `plusMinutes()`, `plusSeconds()` : ajoute du temps
- `minusHours()`, `minusMinutes()`, `minusSeconds()` : soustrait du temps
- `isBefore()`, `isAfter()` : compare des heures

```java
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExempleLocalTime {
    public static void main(String[] args) {
        // Heure actuelle
        LocalTime maintenant = LocalTime.now();
        System.out.println("Heure actuelle : " + maintenant);
        
        // Heure spécifique
        LocalTime heure1 = LocalTime.of(14, 30);           // 14:30
        LocalTime heure2 = LocalTime.of(14, 30, 45);      // 14:30:45
        LocalTime heure3 = LocalTime.of(14, 30, 45, 500); // 14:30:45.500
        LocalTime heure4 = LocalTime.parse("14:30:45");
        
        // Accéder aux composants
        System.out.println("Heure : " + heure2.getHour());        // 14
        System.out.println("Minute : " + heure2.getMinute());      // 30
        System.out.println("Seconde : " + heure2.getSecond());     // 45
        System.out.println("Nano : " + heure2.getNano());          // 0
        
        // Manipulation
        LocalTime dansUneHeure = maintenant.plusHours(1);
        LocalTime dans30Minutes = maintenant.plusMinutes(30);
        LocalTime dans10Secondes = maintenant.plusSeconds(10);
        
        LocalTime ilYUneHeure = maintenant.minusHours(1);
        LocalTime ilY30Minutes = maintenant.minusMinutes(30);
        
        // Constantes utiles
        LocalTime minuit = LocalTime.MIN;        // 00:00
        LocalTime midi = LocalTime.NOON;         // 12:00
        LocalTime max = LocalTime.MAX;           // 23:59:59.999999999
        
        // Comparaisons
        System.out.println(heure1.isBefore(heure2));  // true
        System.out.println(heure1.isAfter(heure2));   // false
        
        // Formatage
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Heure formatée : " + heure2.format(formatter)); // 14:30:45
    }
}
```

### Exemple 3 : LocalDateTime

**Qu'est-ce que LocalDateTime ?**

`LocalDateTime` combine `LocalDate` et `LocalTime` pour représenter une date et une heure sans fuseau horaire. C'est l'équivalent d'une date-heure "locale" sans information de zone.

**Quand l'utiliser ?**

- Pour représenter des dates et heures combinées sans fuseau horaire
- Pour des événements locaux qui n'ont pas besoin de conversion de zone
- Pour des logs et enregistrements locaux
- Quand vous n'avez pas besoin de gérer les fuseaux horaires

**Caractéristiques principales :**

- Combinaison de date et heure
- Pas de fuseau horaire (d'où "Local")
- Format ISO : `YYYY-MM-DDTHH:mm:ss`
- Immuable et thread-safe

**Méthodes importantes :**

- `now()` : obtient la date et heure actuelles
- `of(year, month, day, hour, minute)` : crée une date-heure spécifique
- `of(LocalDate, LocalTime)` : combine une date et une heure
- `parse(String)` : parse une chaîne en date-heure
- `toLocalDate()`, `toLocalTime()` : extrait la date ou l'heure
- Toutes les méthodes de manipulation de `LocalDate` et `LocalTime`

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExempleLocalDateTime {
    public static void main(String[] args) {
        // Date et heure actuelles
        LocalDateTime maintenant = LocalDateTime.now();
        System.out.println("Maintenant : " + maintenant);
        
        // Création
        LocalDateTime dt1 = LocalDateTime.of(2024, 12, 25, 14, 30);
        LocalDateTime dt2 = LocalDateTime.of(2024, 12, 25, 14, 30, 45);
        LocalDateTime dt3 = LocalDateTime.parse("2024-12-25T14:30:45");
        
        // Combiner LocalDate et LocalTime
        LocalDateTime dt4 = LocalDate.of(2024, 12, 25)
                                     .atTime(14, 30);
        LocalDateTime dt5 = LocalTime.of(14, 30)
                                     .atDate(LocalDate.of(2024, 12, 25));
        
        // Accéder aux composants
        System.out.println("Date : " + dt1.toLocalDate());  // 2024-12-25
        System.out.println("Heure : " + dt1.toLocalTime()); // 14:30
        
        // Manipulation
        LocalDateTime dansUneHeure = maintenant.plusHours(1);
        LocalDateTime dansUnJour = maintenant.plusDays(1);
        LocalDateTime dansUnMois = maintenant.plusMonths(1);
        
        // Formatage
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formaté : " + dt2.format(formatter)); // 25/12/2024 14:30:45
    }
}
```

### Exemple 4 : ZonedDateTime (Zonage)

**Qu'est-ce que ZonedDateTime ?**

`ZonedDateTime` représente une date et heure avec un fuseau horaire complet. Elle inclut toutes les informations nécessaires pour gérer les conversions entre fuseaux horaires et les changements d'heure (heure d'été/hiver).

**Quand l'utiliser ?**

- Pour des applications internationales nécessitant la gestion des fuseaux horaires
- Pour des systèmes distribués où les utilisateurs sont dans différentes zones
- Pour des événements planifiés dans des fuseaux horaires spécifiques
- Pour convertir des heures entre différents fuseaux horaires
- Pour des applications de réservation ou de planification globale

**Caractéristiques principales :**

- Inclut un `ZoneId` (identifiant de fuseau horaire)
- Gère automatiquement les changements d'heure (DST - Daylight Saving Time)
- Permet la conversion entre fuseaux horaires
- Format : `2024-12-25T14:30:45+01:00[Europe/Paris]`
- Immuable et thread-safe

**Concepts importants :**

- **ZoneId** : identifie un fuseau horaire (ex: "Europe/Paris", "America/New_York")
- **Offset** : décalage par rapport à UTC (ex: +01:00, -05:00)
- **UTC** : Coordinated Universal Time, référence mondiale
- **Conversion** : `withZoneSameInstant()` convertit un instant vers un autre fuseau

**Méthodes importantes :**

- `now()` : obtient la date-heure actuelle dans le fuseau système
- `now(ZoneId)` : obtient la date-heure dans un fuseau spécifique
- `atZone(ZoneId)` : associe un fuseau à un `LocalDateTime`
- `withZoneSameInstant(ZoneId)` : convertit vers un autre fuseau (même instant)
- `getZone()` : obtient le fuseau horaire
- `getOffset()` : obtient le décalage par rapport à UTC

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExempleZonedDateTime {
    public static void main(String[] args) {
        // Date et heure avec fuseau horaire actuel
        ZonedDateTime maintenant = ZonedDateTime.now();
        System.out.println("Maintenant (zone actuelle) : " + maintenant);
        
        // Créer avec un fuseau horaire spécifique
        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime londres = ZonedDateTime.now(ZoneId.of("Europe/London"));
        
        System.out.println("Paris : " + paris);
        System.out.println("New York : " + newYork);
        System.out.println("Tokyo : " + tokyo);
        System.out.println("Londres : " + londres);
        
        // Créer une date/heure dans un fuseau spécifique
        LocalDateTime dateHeure = LocalDateTime.of(2024, 12, 25, 14, 30);
        ZonedDateTime parisDT = dateHeure.atZone(ZoneId.of("Europe/Paris"));
        ZonedDateTime newYorkDT = dateHeure.atZone(ZoneId.of("America/New_York"));
        
        System.out.println("25/12/2024 14:30 à Paris : " + parisDT);
        System.out.println("25/12/2024 14:30 à New York : " + newYorkDT);
        
        // Convertir entre fuseaux horaires
        ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime newYorkTime = parisTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        
        System.out.println("Même instant à Paris : " + parisTime);
        System.out.println("Même instant à New York : " + newYorkTime);
        
        // Accéder aux informations de zone
        System.out.println("Zone : " + paris.getZone());                    // Europe/Paris
        System.out.println("Offset : " + paris.getOffset());                // +01:00 ou +02:00
        
        // Lister les zones disponibles
        System.out.println("\nQuelques zones disponibles :");
        ZoneId.getAvailableZoneIds().stream()
              .filter(z -> z.contains("Europe"))
              .limit(5)
              .forEach(System.out::println);
        
        // Formatage avec zone
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
        System.out.println("\nFormaté avec zone : " + paris.format(formatter));
        
        // UTC (Coordinated Universal Time)
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC : " + utc);
        
        // Conversion vers UTC
        ZonedDateTime parisToUTC = paris.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("Paris en UTC : " + parisToUTC);
    }
}
```

### Exemple 5 : Period et Duration

**Qu'est-ce que Period ?**

`Period` représente une quantité de temps en termes d'années, mois et jours. Elle est utilisée pour mesurer des durées entre deux dates, en tenant compte des variations de longueur des mois et années.

**Quand utiliser Period ?**

- Pour calculer l'âge d'une personne
- Pour mesurer des durées entre dates (ex: "2 ans, 3 mois et 10 jours")
- Pour ajouter/soustraire des périodes à des dates
- Pour des calculs calendaires (années, mois, jours)

**Caractéristiques de Period :**

- Mesure en années, mois, jours
- Tient compte des variations de longueur des mois
- Format ISO : `P1Y2M10D` (1 an, 2 mois, 10 jours)
- Immuable

**Qu'est-ce que Duration ?**

`Duration` représente une quantité de temps en termes de secondes et nanosecondes. Elle est utilisée pour mesurer des durées précises entre deux instants ou heures.

**Quand utiliser Duration ?**

- Pour mesurer des durées entre heures (ex: "5 heures et 30 minutes")
- Pour des calculs de temps précis (secondes, millisecondes)
- Pour mesurer des durées d'exécution
- Pour des calculs temporels précis sans se soucier des dates

**Caractéristiques de Duration :**

- Mesure en heures, minutes, secondes, nanosecondes
- Précision jusqu'aux nanosecondes
- Format ISO : `PT5H30M45S` (5 heures, 30 minutes, 45 secondes)
- Immuable

**Différence entre Period et Duration :**

- **Period** : pour les durées calendaires (années, mois, jours) - longueur variable
- **Duration** : pour les durées temporelles précises (heures, minutes, secondes) - longueur fixe

**ChronoUnit :**

`ChronoUnit` permet de calculer des différences entre dates/heures dans une unité spécifique (jours, mois, heures, etc.) sans créer de `Period` ou `Duration`.

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ExemplePeriodDuration {
    public static void main(String[] args) {
        // Period : durée entre deux dates (années, mois, jours)
        LocalDate date1 = LocalDate.of(2024, 1, 15);
        LocalDate date2 = LocalDate.of(2025, 3, 25);
        
        Period period = Period.between(date1, date2);
        System.out.println("Période : " + period);  // P1Y2M10D (1 an, 2 mois, 10 jours)
        System.out.println("Années : " + period.getYears());    // 1
        System.out.println("Mois : " + period.getMonths());     // 2
        System.out.println("Jours : " + period.getDays());       // 10
        
        // Créer un Period
        Period unMois = Period.ofMonths(1);
        Period deuxSemaines = Period.ofWeeks(2);
        Period troisAns = Period.ofYears(3);
        Period complexe = Period.of(1, 2, 10); // 1 an, 2 mois, 10 jours
        
        // Ajouter/soustraire un Period à une date
        LocalDate datePlus = date1.plus(unMois);
        LocalDate dateMoins = date1.minus(deuxSemaines);
        
        // Duration : durée entre deux instants/heures (heures, minutes, secondes)
        LocalTime time1 = LocalTime.of(10, 0, 0);
        LocalTime time2 = LocalTime.of(15, 30, 45);
        
        Duration duration = Duration.between(time1, time2);
        System.out.println("\nDurée : " + duration);  // PT5H30M45S
        System.out.println("Heures : " + duration.toHours());           // 5
        System.out.println("Minutes : " + duration.toMinutes());         // 330
        System.out.println("Secondes : " + duration.getSeconds());      // 19845
        System.out.println("Nanos : " + duration.getNano());             // 0
        
        // Créer une Duration
        Duration deuxHeures = Duration.ofHours(2);
        Duration trenteMinutes = Duration.ofMinutes(30);
        Duration dixSecondes = Duration.ofSeconds(10);
        Duration uneJournee = Duration.ofDays(1);
        
        // Avec LocalDateTime
        LocalDateTime dt1 = LocalDateTime.of(2024, 1, 1, 10, 0);
        LocalDateTime dt2 = LocalDateTime.of(2024, 1, 1, 15, 30);
        Duration durationDT = Duration.between(dt1, dt2);
        System.out.println("\nDurée entre dates/heures : " + durationDT.toHours() + " heures");
        
        // ChronoUnit pour calculer des différences
        long jours = ChronoUnit.DAYS.between(date1, date2);
        long mois = ChronoUnit.MONTHS.between(date1, date2);
        long heures = ChronoUnit.HOURS.between(time1, time2);
        
        System.out.println("\nDifférence en jours : " + jours);
        System.out.println("Différence en mois : " + mois);
        System.out.println("Différence en heures : " + heures);
    }
}
```

### Exemple 6 : DateTimeFormatter

**Qu'est-ce que DateTimeFormatter ?**

`DateTimeFormatter` est utilisé pour formater (convertir une date en chaîne) et parser (convertir une chaîne en date) des objets date/heure. Il permet de contrôler précisément le format d'affichage.

**Quand l'utiliser ?**

- Pour afficher des dates dans un format spécifique (ex: "25/12/2024", "25 décembre 2024")
- Pour parser des dates depuis des chaînes de caractères
- Pour formater des dates pour l'affichage utilisateur
- Pour lire/écrire des dates dans des fichiers ou bases de données

**Caractéristiques principales :**

- Patterns personnalisables avec des lettres spéciales
- Support de la localisation (Locale)
- Formatters prédéfinis (ISO_DATE, ISO_TIME, etc.)
- Thread-safe et immuable

**Symboles de pattern courants :**

- `yyyy` : année (4 chiffres)
- `MM` : mois (2 chiffres, 01-12)
- `dd` : jour du mois (2 chiffres, 01-31)
- `HH` : heure (24h, 00-23)
- `mm` : minute (00-59)
- `ss` : seconde (00-59)
- `EEEE` : jour de la semaine complet (lundi, mardi, etc.)
- `MMMM` : mois complet (janvier, février, etc.)
- `z` : fuseau horaire (CET, PST, etc.)

**Formatters prédéfinis :**

- `ISO_DATE` : 2024-12-25
- `ISO_TIME` : 14:30:45
- `ISO_DATE_TIME` : 2024-12-25T14:30:45
- `ISO_LOCAL_DATE` : 2024-12-25
- `ISO_LOCAL_TIME` : 14:30:45

**Localisation :**

En utilisant un `Locale`, vous pouvez formater les dates dans différentes langues (français, anglais, etc.) pour les noms de mois et jours de la semaine.

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExempleFormatter {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 12, 25);
        LocalTime time = LocalTime.of(14, 30, 45);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        // Patterns personnalisés
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH);
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("dd/MM/yyyy : " + date.format(formatter1));           // 25/12/2024
        System.out.println("yyyy-MM-dd : " + date.format(formatter2));           // 2024-12-25
        System.out.println("dd MMMM yyyy : " + date.format(formatter3));         // 25 décembre 2024
        System.out.println("EEEE dd MMMM yyyy : " + date.format(formatter4));   // mercredi 25 décembre 2024
        System.out.println("HH:mm:ss : " + time.format(formatter5));            // 14:30:45
        System.out.println("dd/MM/yyyy HH:mm:ss : " + dateTime.format(formatter6)); // 25/12/2024 14:30:45
        
        // Formatters prédéfinis
        System.out.println("\nFormatters prédéfinis :");
        System.out.println("ISO_DATE : " + date.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO_TIME : " + time.format(DateTimeFormatter.ISO_TIME));
        System.out.println("ISO_DATE_TIME : " + dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        
        // Parser une chaîne en date
        String dateStr = "25/12/2024";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateParse = LocalDate.parse(dateStr, parser);
        System.out.println("\nDate parsée : " + dateParse);
        
        // Avec ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        DateTimeFormatter zdtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
        System.out.println("Avec zone : " + zdt.format(zdtFormatter));
    }
}
```

### Exemple 7 : Instant et OffsetDateTime

**Qu'est-ce que Instant ?**

`Instant` représente un point précis dans le temps, mesuré depuis l'époque Unix (1er janvier 1970, 00:00:00 UTC). C'est l'équivalent d'un timestamp, utile pour des calculs temporels précis et des comparaisons globales.

**Quand utiliser Instant ?**

- Pour stocker des timestamps dans des bases de données
- Pour des calculs temporels précis indépendants des fuseaux horaires
- Pour mesurer des durées d'exécution
- Pour des systèmes distribués nécessitant une référence temporelle unique
- Pour convertir entre différents types de dates/heures

**Caractéristiques de Instant :**

- Représente un point dans le temps absolu
- Basé sur UTC (pas de fuseau horaire)
- Précision jusqu'aux nanosecondes
- Format ISO-8601 : `2024-12-25T14:30:45.123456789Z`

**Qu'est-ce que OffsetDateTime ?**

`OffsetDateTime` représente une date et heure avec un décalage (offset) par rapport à UTC, mais sans les règles de changement d'heure d'un fuseau horaire complet. C'est plus simple que `ZonedDateTime` mais moins flexible.

**Quand utiliser OffsetDateTime ?**

- Quand vous connaissez seulement l'offset (ex: +02:00) sans les règles de zone
- Pour des systèmes qui travaillent avec des offsets fixes
- Pour des APIs qui utilisent des offsets plutôt que des zones
- Quand vous n'avez pas besoin de gérer les changements d'heure automatiques

**Différence entre ZonedDateTime et OffsetDateTime :**

- **ZonedDateTime** : utilise un `ZoneId` avec toutes les règles (heure d'été, etc.)
- **OffsetDateTime** : utilise seulement un `ZoneOffset` fixe, sans règles de zone

**Méthodes importantes :**

- `Instant.now()` : obtient l'instant actuel
- `ofEpochSecond(long)` : crée un Instant depuis un timestamp Unix
- `ofEpochMilli(long)` : crée un Instant depuis des millisecondes
- `atZone(ZoneId)` : convertit un Instant vers un ZonedDateTime
- `toInstant()` : convertit une date/heure vers un Instant

```java
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;

public class ExempleInstant {
    public static void main(String[] args) {
        // Instant : point dans le temps (timestamp Unix)
        Instant instant = Instant.now();
        System.out.println("Instant actuel : " + instant);
        
        // Créer un Instant depuis un timestamp
        Instant instant1 = Instant.ofEpochSecond(1703520000); // 25/12/2024 00:00:00 UTC
        Instant instant2 = Instant.ofEpochMilli(1703520000000L);
        
        // Convertir entre Instant et LocalDateTime
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        Instant fromLDT = ldt.toInstant(ZoneOffset.UTC);
        
        // Convertir entre Instant et ZonedDateTime
        ZonedDateTime zdt = instant.atZone(ZoneId.of("Europe/Paris"));
        Instant fromZDT = zdt.toInstant();
        
        // OffsetDateTime : date/heure avec offset (sans règles de zone)
        OffsetDateTime odt = OffsetDateTime.now();
        OffsetDateTime odtParis = OffsetDateTime.now(ZoneId.of("Europe/Paris"));
        OffsetDateTime odtUTC = OffsetDateTime.now(ZoneOffset.UTC);
        
        System.out.println("OffsetDateTime : " + odt);
        System.out.println("OffsetDateTime Paris : " + odtParis);
        System.out.println("OffsetDateTime UTC : " + odtUTC);
        
        // Créer avec offset spécifique
        OffsetDateTime odtPlus2 = OffsetDateTime.of(
            LocalDateTime.of(2024, 12, 25, 14, 30),
            ZoneOffset.of("+02:00")
        );
        System.out.println("Offset +02:00 : " + odtPlus2);
        
        // Comparer des Instants
        Instant maintenant = Instant.now();
        Instant plusTard = maintenant.plusSeconds(3600);
        System.out.println("\nMaintenant : " + maintenant);
        System.out.println("Plus tard : " + plusTard);
        System.out.println("Plus tard est après maintenant : " + plusTard.isAfter(maintenant));
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
