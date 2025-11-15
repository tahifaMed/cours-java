# 03 - Opérateurs

## Vue d'Ensemble

Les opérateurs permettent de manipuler les valeurs des variables : effectuer des calculs, comparer des valeurs, assigner des résultats, etc. Java fournit une gamme complète d'opérateurs pour différents types d'opérations.

## Concepts Clés

1. **Opérateurs arithmétiques** : +, -, *, /, %
2. **Opérateurs d'assignation** : =, +=, -=, *=, /=
3. **Opérateurs de comparaison** : ==, !=, <, >, <=, >=
4. **Opérateurs logiques** : &&, ||, !
5. **Opérateurs d'incrémentation/décrémentation** : ++, --
6. **Opérateur ternaire** : ? :

## Explications Détaillées

### Opérateurs Arithmétiques

| Opérateur | Description | Exemple |
|-----------|-------------|---------|
| `+` | Addition | `5 + 3 = 8` |
| `-` | Soustraction | `5 - 3 = 2` |
| `*` | Multiplication | `5 * 3 = 15` |
| `/` | Division | `10 / 3 = 3` (division entière) |
| `%` | Modulo (reste) | `10 % 3 = 1` |

**Important** : Avec des entiers, la division est entière (pas de décimales).

### Opérateurs d'Assignation

```java
int x = 5;
x += 3;  // Équivalent à : x = x + 3
x -= 2;  // Équivalent à : x = x - 2
x *= 4;  // Équivalent à : x = x * 4
x /= 2;  // Équivalent à : x = x / 2
x %= 3;  // Équivalent à : x = x % 3
```

### Opérateurs de Comparaison

Retournent toujours un `boolean` (true/false) :

| Opérateur | Description | Exemple |
|-----------|-------------|---------|
| `==` | Égalité | `5 == 5` → true |
| `!=` | Inégalité | `5 != 3` → true |
| `<` | Inférieur à | `3 < 5` → true |
| `>` | Supérieur à | `5 > 3` → true |
| `<=` | Inférieur ou égal | `5 <= 5` → true |
| `>=` | Supérieur ou égal | `5 >= 3` → true |

**Attention** : `==` compare les références pour les objets, pas le contenu !

### Opérateurs Logiques

| Opérateur | Description | Exemple |
|-----------|-------------|---------|
| `&&` | ET logique | `true && false` → false |
| `||` | OU logique | `true || false` → true |
| `!` | Négation | `!true` → false |

**Évaluation paresseuse** : Avec `&&`, si le premier est false, le second n'est pas évalué. Avec `||`, si le premier est true, le second n'est pas évalué.

### Incrémentation/Décrémentation

```java
int x = 5;
x++;  // x = 6 (post-incrémentation)
++x;  // x = 7 (pré-incrémentation)

// Différence importante :
int a = 5;
int b = a++;  // b = 5, a = 6 (affecte puis incrémente)

int c = 5;
int d = ++c;  // c = 6, d = 6 (incrémente puis affecte)
```

## Exemples

### Exemple 1 : Opérateurs Arithmétiques

```java
public class Arithmetiques {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        System.out.println("Addition : " + (a + b));        // 13
        System.out.println("Soustraction : " + (a - b));    // 7
        System.out.println("Multiplication : " + (a * b));  // 30
        System.out.println("Division : " + (a / b));        // 3 (entier)
        System.out.println("Modulo : " + (a % b));          // 1
        
        // Division avec décimaux
        double x = 10.0;
        double y = 3.0;
        System.out.println("Division décimale : " + (x / y)); // 3.333...
    }
}
```

### Exemple 2 : Opérateurs d'Assignation

```java
public class Assignation {
    public static void main(String[] args) {
        int nombre = 10;
        
        nombre += 5;  // nombre = 15
        System.out.println("Après += 5 : " + nombre);
        
        nombre -= 3;  // nombre = 12
        System.out.println("Après -= 3 : " + nombre);
        
        nombre *= 2;  // nombre = 24
        System.out.println("Après *= 2 : " + nombre);
        
        nombre /= 4;  // nombre = 6
        System.out.println("Après /= 4 : " + nombre);
        
        nombre %= 4;  // nombre = 2
        System.out.println("Après %= 4 : " + nombre);
    }
}
```

### Exemple 3 : Opérateurs de Comparaison

```java
public class Comparaison {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 5;
        
        System.out.println("a == c : " + (a == c));  // true
        System.out.println("a != b : " + (a != b));  // true
        System.out.println("a < b : " + (a < b));    // true
        System.out.println("a > b : " + (a > b));    // false
        System.out.println("a <= c : " + (a <= c));  // true
        System.out.println("b >= a : " + (b >= a));  // true
        
        // Comparaison de chaînes (attention !)
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        
        System.out.println("s1 == s2 : " + (s1 == s2));        // true (référence)
        System.out.println("s1 == s3 : " + (s1 == s3));        // false (référence)
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (contenu)
    }
}
```

### Exemple 4 : Opérateurs Logiques

```java
public class Logiques {
    public static void main(String[] args) {
        boolean vrai = true;
        boolean faux = false;
        
        // ET logique
        System.out.println("vrai && faux : " + (vrai && faux));  // false
        System.out.println("vrai && vrai : " + (vrai && vrai));  // true
        
        // OU logique
        System.out.println("vrai || faux : " + (vrai || faux));  // true
        System.out.println("faux || faux : " + (faux || faux));  // false
        
        // Négation
        System.out.println("!vrai : " + (!vrai));  // false
        System.out.println("!faux : " + (!faux));  // true
        
        // Exemple pratique
        int age = 25;
        boolean majeur = age >= 18;
        boolean permis = true;
        
        if (majeur && permis) {
            System.out.println("Peut conduire");
        }
    }
}
```

### Exemple 5 : Incrémentation/Décrémentation

```java
public class Incrementation {
    public static void main(String[] args) {
        int x = 5;
        
        // Post-incrémentation
        System.out.println("x avant : " + x);      // 5
        System.out.println("x++ : " + x++);        // Affiche 5, puis x = 6
        System.out.println("x après : " + x);      // 6
        
        // Pré-incrémentation
        int y = 5;
        System.out.println("y avant : " + y);      // 5
        System.out.println("++y : " + ++y);        // y = 6, puis affiche 6
        System.out.println("y après : " + y);      // 6
        
        // Décrémentation
        int z = 10;
        z--;  // z = 9
        --z;  // z = 8
        System.out.println("z final : " + z);      // 8
    }
}
```

### Exemple 6 : Opérateur Ternaire

```java
public class Ternaire {
    public static void main(String[] args) {
        int age = 20;
        
        // Syntaxe : condition ? valeur_si_vrai : valeur_si_faux
        String statut = (age >= 18) ? "Majeur" : "Mineur";
        System.out.println(statut);  // "Majeur"
        
        // Équivalent à :
        String statut2;
        if (age >= 18) {
            statut2 = "Majeur";
        } else {
            statut2 = "Mineur";
        }
        
        // Utilisation avec nombres
        int a = 10;
        int b = 5;
        int max = (a > b) ? a : b;  // max = 10
        System.out.println("Maximum : " + max);
    }
}
```

## Ordre de Priorité des Opérateurs

Les opérateurs sont évalués dans cet ordre (de la plus haute à la plus basse priorité) :

1. `()`, `[]`, `.` (parenthèses, tableaux, accès membre)
2. `++`, `--`, `!`, `~` (unaires)
3. `*`, `/`, `%` (multiplicatifs)
4. `+`, `-` (additifs)
5. `<`, `>`, `<=`, `>=` (comparaison)
6. `==`, `!=` (égalité)
7. `&&` (ET logique)
8. `||` (OU logique)
9. `?:` (ternaire)
10. `=`, `+=`, `-=`, etc. (assignation)

Utilisez des parenthèses pour clarifier vos intentions !

## Prérequis

- Sujet 02 : Variables et types de données

## Exercices

- **exercise-01** : Effectuer des calculs arithmétiques
- **exercise-02** : Utiliser les opérateurs d'assignation
- **exercise-03** : Comparer des valeurs avec les opérateurs de comparaison
- **exercise-04** : Utiliser les opérateurs logiques dans des conditions
- **exercise-05** : Maîtriser l'incrémentation et la décrémentation
- **exercise-06** : Utiliser l'opérateur ternaire

## Ressources

- [Opérateurs Java - Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
