# 37 - Expressions Régulières

## Vue d'Ensemble

Les expressions régulières (regex) permettent de rechercher, valider et manipuler des chaînes de caractères selon des motifs. Java fournit les classes Pattern et Matcher pour travailler avec les regex.

## Concepts Clés

1. **Pattern** : Compiler une expression régulière
2. **Matcher** : Appliquer le pattern à une chaîne
3. **Syntaxe regex** : Caractères spéciaux, quantificateurs, classes de caractères
4. **Méthodes String** : matches(), replaceAll(), split()

## Exemples

### Exemple 1 : Pattern et Matcher

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExemple {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("J'ai 25 ans");
        
        if (matcher.find()) {
            System.out.println("Nombre trouvé : " + matcher.group());
        }
    }
}
```

## Prérequis

- Sujet 02 : Variables et types de données

## Exercices

- **exercise-01** : Utiliser Pattern et Matcher
- **exercise-02** : Valider des formats (email, téléphone)
- **exercise-03** : Utiliser les méthodes regex de String

## Ressources

- [Expressions régulières - Oracle](https://docs.oracle.com/javase/tutorial/essential/regex/index.html)
