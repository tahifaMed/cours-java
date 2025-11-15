# Exercice 3 : Smart Proxy - Cache pour Calculs Coûteux

## Objectif

Développer un Smart Proxy avec mise en cache pour optimiser des calculs récursifs coûteux.

## Contexte

Vous devez créer un système de calcul de Fibonacci où les résultats sont mis en cache. Le premier calcul d'un nombre est long, mais les calculs suivants doivent être instantanés grâce au cache.

## À Faire

1. Créer l'interface `Calculateur` avec `long fibonacci(int n)`
2. Créer `FibonacciReel` qui implémente le calcul récursif:
   - Affiche "Calcul de fibonacci([n])..."
   - Retourne le résultat
3. Créer `CalculateurProxy` qui :
   - Utilise une Map pour le cache
   - Vérifie d'abord le cache
   - Sinon calcule via FibonacciReel et met en cache
   - Affiche "Depuis le cache: [n] = [valeur]" si pris du cache

## Points Importants

- Smart Proxy améliore les performances
- Cache transparent pour l'utilisateur
- Pattern memoization

## Notes

- Très utile pour calculs récursifs
- Économise du temps CPU
- Common dans Spring avec @Cacheable

## Résultat Attendu

```
Calcul de fibonacci(10)...
Résultat: 55

Calcul de fibonacci(10)...
Depuis le cache: 10 = 55
Résultat: 55

Calcul de fibonacci(15)...
Résultat: 610

Calcul de fibonacci(10)...
Depuis le cache: 10 = 55
Résultat: 55
```
