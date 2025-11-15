# Exercice 3 : Comprendre la Hiérarchie des Exceptions

## Objectif

Comprendre la hiérarchie des exceptions et la différence entre exceptions checked et unchecked.

## Instructions

1. Créez des exceptions de différents niveaux de la hiérarchie
2. Montrez comment les exceptions remontent dans la pile d'appels
3. Comprenez Throwable, Exception, RuntimeException

## À Faire

- Créer une méthode qui peut lever une exception
- Appeler cette méthode depuis main()
- Gérer l'exception à différents niveaux
- Afficher des informations sur l'exception (getMessage(), getClass())
- Montrer la propagation des exceptions

## Notes

- Hiérarchie : Throwable -> Exception -> RuntimeException -> ArithmeticException, etc.
- Checked exceptions : doivent être déclarées ou gérées (IOException, etc.)
- Unchecked exceptions : RuntimeException et ses sous-classes (ArithmeticException, etc.)
- Les exceptions peuvent être propagées si non gérées dans une méthode
- getMessage() retourne le message de l'exception
- getClass() retourne la classe de l'exception

## Résultat Attendu

```
Exception capturée : Division par zéro
Type d'exception : class java.lang.ArithmeticException
Hiérarchie : Throwable -> Exception -> RuntimeException -> ArithmeticException
```

